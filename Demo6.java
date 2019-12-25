class Employee{
	String name;
	double salary;
	public void setData(String name, double salary){
		this.name=name;
		this.salary=salary;
	}
	public void printEmployee(){
		System.out.println(name+" - "+salary); 
	}
}

class Demo6{
	public static void incrementSalary(double salary, double rate){
		salary*=(100+rate)/100;
	}
	public static void incrementSalary(Employee e1, double rate){ //type of e1 should be sent
		e1.salary*=(100+rate)/100;
	}
	public static void main(String args[]){
		Employee e1=new Employee();
		e1.setData("Danapala",10000);
		e1.printEmployee();
		
		Demo6.incrementSalary(e1.salary,10);
		e1.printEmployee();
		
		Demo6.incrementSalary(e1,10);
		e1.printEmployee();
	}
	
}
