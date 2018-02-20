import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = -2269281555359599708L;

	private String firstName;
	private String lastName;
	private int age;
	private String city;
	transient private double salary;
	static String companyId="INFY";

	/* static String companyId = "INFY101"; */

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static String getCompanyId() {
		return companyId;
	}

	public static void setCompanyId(String companyId) {
		Employee.companyId = companyId;
	}

}
