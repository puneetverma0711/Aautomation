package practise;

public class QaDept extends Company implements Organisation{

	
	@Override
	public void leave() {
		System.out.println("here are your leaves");
		
	}

	@Override
	public void salary() {
		System.out.println("here are your salary");
		
	}

	@Override
	public void benefits() {
		
		System.out.println("here are your benefits");
	}

	@Override
	public void orgname() {
		System.out.println("here are your org name");
		
	}

	@Override
	public void orglocation() {
		System.out.println("here are your org location");
		
	}

}
