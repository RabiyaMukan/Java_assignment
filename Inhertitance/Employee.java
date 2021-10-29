package InheritanceDemo;

public class Employee extends HumanBeing {

	private int id;
	private double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		Employee e1=new Employee();
//		e1.setName("Robin");
//		e1.setId(001);
//		e1.setSalary(45000.00);
//		System.out.println("Employee Details:");
//		System.out.println(e1.getId()+" "+e1.getName()+" "+e1.getSalary());
//	}

}
