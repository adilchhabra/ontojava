public class Demonstrate {
	public static void main(String [] args) {
		int script=6, acting=9, direction=8; 
		System.out.println("The Rating of the movie is: "); 
		System.out.println(movieRating(6,9,8));
	}

	public static int movieRating (int s, int a, int d) { 
  	return s + a + d; 
 	} 
}