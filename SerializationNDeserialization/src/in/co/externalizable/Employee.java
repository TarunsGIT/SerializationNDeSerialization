package in.co.externalizable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable {
	private String firstName;
	private String lastName;
	private int age;
	private String city;
	transient private double salary;
	private static String companyId="infy";

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

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(firstName);
		out.writeObject(lastName);
		out.writeInt(age);
		out.writeObject(city);
		out.writeDouble(salary);
		out.writeObject(companyId);

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		firstName = (String) in.readObject();
		lastName = (String) in.readObject();
		age = in.readInt();
		city = (String) in.readObject();
		salary = in.readDouble();
		companyId = (String) in.readObject();

	}

}
