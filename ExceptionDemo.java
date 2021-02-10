package codingPractiseTest;

class Employee1 {
	private String firstname;
	private String lastname;

	public Employee1(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}

	void validation() {

		if (firstname == null || lastname == null)
			throw new NullPointerException("Entery Missing");
		else if (firstname.length() < 3 || lastname.length() < 3)
			throw new ArithmeticException("Name should be minimum 3 character ");

	}
}

public class ExceptionDemo {

	public static void main(String[] args) {
		Employee1 e1 = new Employee1(null, null);
		e1.validation();
		// Below is a Example of minimum 3 character exception in comments


		/* Employee1 e2=new Employee1("aj", "p"); e2.validation(); */


	}

}
