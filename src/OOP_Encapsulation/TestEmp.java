package OOP_Encapsulation;

public class TestEmp {

	public static void main(String[] args) {
//		Employee e1 = new Employee();
//		e1.name="margi";
//		e1.setSalary(12.33);
//		System.out.println(e1.getSalary());
		
		Employee e1 = new Employee("Margi",12.33,20);

		System.out.println(e1.name +" Directly printing");
		System.out.println(e1.getName() +" Printing by getter");
		System.out.println(e1.getSalary() +" Printing by getter");
		System.out.println(e1.getShares() +" Printing by getter");

	}
}
