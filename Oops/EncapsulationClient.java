package Oops;

public class EncapsulationClient {
	 public static void main(String[] args) {
	        
	        Encapsulationdemo employee1 = new Encapsulationdemo(101,"Satish");
	        
	        System.out.println(employee1.getId());
	        
	        
	        employee1.setName("Rupesh Singh");
	        
	        System.out.println(employee1.getName());

	    }

}
