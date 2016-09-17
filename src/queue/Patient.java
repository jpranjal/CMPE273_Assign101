package queue;

public class Patient implements Comparable<Patient>{

  private int id;

  private String name;

  private boolean emergencyCase;

  public Patient(int id, String name, boolean emergencyCase) {
    this.id = id;
    this.name = name;
    this.emergencyCase = emergencyCase;
 }

/**
 * @return the id
 */
public int getId() {
    return id;
}

/**
 * @param id the id to set
 */
public void setId(int id) {
    this.id = id;
}

/**
 * @return the name
 */
public String getName() {
    return name;
}

/**
 * @return the emergencyCase
 */
public boolean isEmergencyCase() {
    return emergencyCase;
}

/**
 * @param emergencyCase the emergencyCase to set
 */
 public void setEmergencyCase(boolean emergencyCase) {
    this.emergencyCase = emergencyCase;
 }
 

@Override
public int compareTo(Patient patient2) {
	return (this.isEmergencyCase() == patient2.isEmergencyCase()) ? (Integer.valueOf(this.getId()).compareTo(patient2.getId()))
            : (this.isEmergencyCase() ? -1 : 1);
}

public boolean equals(Patient other) {
	  return (this.getId() == other.getId() && this.getName() == other.getName() && this.isEmergencyCase() ==other.isEmergencyCase());
	}

}