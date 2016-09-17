package interfaceDemo;

public interface Profile extends DisplayPhoto, Privacy{
	public boolean isProfileEditable();
	public boolean hasAddressFields();
	public int minimumAge();
}
