public class Symphony extends Attraction { 
 	public int music, playing, conducting;
 	public Symphony (int m) {
 		minutes = m;
 	} 
 	public int rating () { 
  		return music + playing + conducting; 
 	}	 
} 