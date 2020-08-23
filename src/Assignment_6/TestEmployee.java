package Assignment_6;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		e1.getEmpData(101,"sireesha",10000,"software tester");
		e2.getEmpData(102,"christina",25000,"database developer");
		e3.getEmpData(103,"robert",40000,"technical developer");
		e1.displayEmpData();
		e2.displayEmpData();
		e3.displayEmpData();

	}


}
