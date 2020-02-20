package practise;

public class OfficeTest {

	public static void main(String[] args) {
		QaDept qa=new QaDept();
		qa.leave();
		qa.salary();
		qa.benefits();
		qa.employees();
		qa.orgname();
		qa.orglocation();
		
		
	
		
		//dynamic polymorphism
		Company c=new QaDept();
		c.leave();
		c.salary();
		c.benefits();
		c.employees();
		
	}

}
