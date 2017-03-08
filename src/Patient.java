

public class Patient {

	private String name;
	private String surname;
	private int priority;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		if (priority >= 1 && priority <= 5) {
			this.priority = priority;
		} else {
			this.priority = 1;
		}

	}

	

	public Patient(String name, String surname, int priority) {
		super();
		this.name = name;
		this.surname = surname;
		setPriority(priority);
	}

	public Patient() {

	}

	@Override
	public String toString() {
		return "Patient [name=" + name + ", surname=" + surname + ", priority=" + priority + "]";
	}

}
