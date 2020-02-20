package practise;

import java.util.ArrayList;
import java.util.Iterator;

public class DcotorData {

	public static void main(String[] args) {
		
		
		
		ArrayList<Technicians> a=new ArrayList<Technicians>(); 
		Technicians tech1=new Technicians("rahul",24);
		Technicians tech2=new Technicians("raj",22);
		Technicians tech3=new Technicians("amit",25);
		Technicians tech4=new Technicians("kunal",26);
		a.add(tech1);
		a.add(tech2);
		a.add(tech3);
		a.add(tech4);
		
		 
		Iterator<Technicians> it=a.iterator(); 
		while(it.hasNext()){
			Technicians tech=it.next();
			 System.out.println(tech.techname);
			 System.out.println(tech.age);
			
		}
		
		 
	}

}
