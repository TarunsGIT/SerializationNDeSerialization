package in.co.externalizable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestExternalizable {
	
	public static void main(String[] args) throws InstantiationException,
			IllegalAccessException, ClassNotFoundException {

		Employee emp = (Employee) Class
				.forName("in.co.externalizable.Employee").newInstance();
		emp.setFirstName("Dhvani");
		emp.setLastName("Bhanusali");
		emp.setAge(25);
		emp.setCity("Indore");
		emp.setSalary(500000.0);
		emp.setCompanyId("CAPG:IND:PUN:01");
		
		/**************************SERILAZATION*******************************************/

		FileOutputStream fOut = null;
		ObjectOutputStream Out = null;

		try {

			fOut = new FileOutputStream("C:/Users/TARUN/Desktop/Employee.ser");
			Out = new ObjectOutputStream(fOut);
			Out.writeObject(emp);
			if (Out != null) {
				System.out.println("SERIALIZED");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fOut.close();
				Out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		/**************************DE-SERILAZATION*******************************************/

		FileInputStream fIn = null;
		ObjectInputStream In = null;

		try {
			fIn = new FileInputStream("C:/Users/TARUN/Desktop/Employee.ser");
			In = new ObjectInputStream(fIn);
			emp = (Employee) In.readObject();
			if (emp != null) {
				System.out.println("Deserialized");
				System.out.println(emp.getFirstName());
				System.out.println(emp.getLastName());
				System.out.println(emp.getAge());
				System.out.println(emp.getCity());
				System.out.println(emp.getSalary());
				
				System.out.println(emp.getCompanyId());
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fIn.close();
				In.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
