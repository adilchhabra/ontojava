public class Symphony extends Attraction { 
 	public int music, playing, conducting;
 	public Symphony (int m) {
 		super(m);
 	} 
 	public int rating () { 
  		return music + playing + conducting; 
 	}	 
} 