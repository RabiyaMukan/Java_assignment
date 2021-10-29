package InheritanceDemo;

public class Engineer extends Employee {
	private String designation;
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engineer e1=new Engineer();
		e1.setName("Alice");
		e1.setId(2);
		e1.setSalary(50000.00);
		e1.setDesignation("Full Stack Developer");
		System.out.println("Engineer Details: ");
		System.out.println(e1.getId()+" "+e1.getName()+" "+e1.getDesignation()+" "+e1.getSalary());
	}

}
