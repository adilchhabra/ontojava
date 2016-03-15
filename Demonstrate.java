public class Demonstrate {
	public static void main(String [] args) {
		Movie m = new Movie(); 
		m.script=6, m.acting=9, m.direction=8; 
		Symphony s = new Symphony(); 
  		s.music = 7; s.playing = 8; s.conducting = 5; 
  		System.out.println("The rating of the movie is " + m.rating()); 
  		System.out.println("The rating of the symphony is " + s.rating()); 
	}
	
}