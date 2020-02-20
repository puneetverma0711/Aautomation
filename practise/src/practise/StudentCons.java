package practise;

public class StudentCons {

	  
	int studentno;
	String studentname;
	int studentage;

	public StudentCons(int studentno,String studentname,int studentage){
	this.studentno= studentno;
	this.studentname= studentname;
	this.studentage= studentage;

	}
	
	public StudentCons() {
		
		
		System.out.println("default cons");
	}
	
	
	
	
	public static void main(String[] args) {
		
		StudentCons st1=new StudentCons(21,"puneet", 31);
		StudentCons st2=new StudentCons();
		
		System.out.println(st1.studentname);
		System.out.println(st1.studentno);
		System.out.println(st1.studentage);
	
	}

}
