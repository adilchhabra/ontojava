public class Demonstrate {
	public static void main(String [] args) {
		int script=6, acting=9, direction=8; 
		displayMovieRating(script,acting,direction);
	}

	public static void displayMovieRating (int s, int a, int d) { 
  	System.out.println("The rating of the movie is: ");
  	System.out.println(s+a+d);
 	} 
}