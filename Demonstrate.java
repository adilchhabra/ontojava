public class Demonstrate {
	public static void main(String [] args) {
	Movie m1 = new Movie();                       
  	Movie m2 = new Movie(8, 9, 6);                
  	System.out.println("The first movie rating is " + m1.rating()); 
  	System.out.println("The second movie rating is " + m2.rating());
	}
	
}