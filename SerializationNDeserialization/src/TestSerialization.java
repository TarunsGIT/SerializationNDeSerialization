import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestSerialization {
	public static void main(String[] args) throws IOException,
			InstantiationException, IllegalAccessException,
			ClassNotFoundException {
		FileOutputStream fileOut = new FileOutputStream(
				"C:/Users/TARUN/Desktop/Employee.ser");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);

		Employee e = (Employee) Class.forName("Employee").newInstance();
		e.setFirstName("Dhvani");
		e.setLastName("Bhanushali");
		e.setAge(25);
		e.setCity("Indore");
		e.setSalary(50000);
		e.setCompanyId("INFY100");
		out.writeObject(e);
		if(out!=null){
			System.out.println("Serialized");
		}

	}

}
