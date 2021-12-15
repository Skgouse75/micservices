package polymorphism;

public class Objectcreation {
	public Guest getobject(String obj) {
		
		if (obj.equals("man")) {
			return new Man();
		}
		else if (obj.equals("fish")) {
			return new Fish();
			
		}
		else{
			return new Bird();
		}
		
		
	}

}
