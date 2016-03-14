public class Demonstrate {
	public static void main(String [] args) {
		int script=6, acting=9, direction=8; 
		double doubleScript = 6.0, doubleActing = 9.0, doubleDirection = 8.0; 
		Movie.displayMovieRating(script,acting,direction);
		displayMovieRating(doubleScript, doubleActing, doubleDirection); 
	}
	public static void displayMovieRating (double s, double a, double d) { 
  	System.out.print("The floating-point rating of the movie is ");  
  	System.out.println(s + a + d);  
  	return; 
 }  
}