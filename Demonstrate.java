public class Demonstrate {
	public static void main(String [] args) {
	Movie m1 = new Movie();                       
  	Movie m2 = new Movie(8, 9, 6);                
  	System.out.println("The first movie rating is " + m1.rating()); 
  	System.out.println("The second movie rating is " + m2.rating());
  	RatinInterface x = new Movie (7, 7, 7); 
    System.out.println("The movie's rating is " + x.rating()); 
    x = new Symphony(7, 5, 5);
    System.out.println("The symphony's rating is " + x.rating()); 

	}
	
}