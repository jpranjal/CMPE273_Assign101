package interfaceDemo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class WebsiteTest {
    public FriendsBook myInterface;

    public WebsiteTest(FriendsBook myInterface) {
        this.myInterface = myInterface;
    }

    @Test
    public final void testMyMethod_True() {
        assertTrue(myInterface.hidePIIData(true));
    }

    @Test
    public final void testMyMethod_False() {
        assertFalse(myInterface.isProfileEditable());
    }

    @Parameterized.Parameters
    public static Collection<Object[]> instancesToTest() {
        return Arrays.asList(
                    new Object[]{new FriendsBook()},
                    new Object[]{new MailBook()}
        );
    }
}