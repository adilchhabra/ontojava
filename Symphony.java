public class Symphony extends Attraction implements RatingInterface { 
 	public int music, playing, conducting;
 	public Symphony (int m) {
 		super(m);	
 	} 
 	public Symphony(int m, int p, int c) {            
  		music = m; playing = p; conducting = c;        
 	}   
 	public int rating () { 
  		return music + playing + conducting; 
 	}	 
} 