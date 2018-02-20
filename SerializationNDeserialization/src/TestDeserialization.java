import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestDeserialization {
	public static void main(String[] args) throws IOException,
			ClassNotFoundException {
		FileInputStream fIn = new FileInputStream(
				"C:/Users/TARUN/Desktop/Employee.ser");
		ObjectInputStream in = new ObjectInputStream(fIn);
		Employee e = (Employee) in.readObject();

		System.out.println(e.getFirstName());
		System.out.println(e.getLastName());
		System.out.println(e.getAge());
		System.out.println(e.getCity());
		System.out.println(e.getSalary());
		System.out.println(e.getCompanyId());

	}

}
