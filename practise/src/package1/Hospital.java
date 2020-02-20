package package1;

public class Hospital {

	String DoctorName;
	String PatientName;
	String NurseName;
	
	
	public Hospital() {
		System.out.println("default constructor"); 
			
	}
	
	
	
	public Hospital(String DoctorName,String PatientName,String NurseName) {
		this.DoctorName=DoctorName;
		this.NurseName=NurseName;
		this.PatientName=PatientName;
			
	}
	
	
	
	

	
	
	
	public static void main(String[] args) {
	
		Hospital hp1=new Hospital();
		
		Hospital hp=new Hospital("puneet","raghu","a");
		System.out.println(hp.DoctorName);
		System.out.println(hp.NurseName);
		System.out.println(hp.PatientName);
		
		Hospital hp2=hp;
		System.out.println(hp.DoctorName); 
		System.out.println(hp2.DoctorName="rahul");

	}

}
