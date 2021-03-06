public class Movie extends Attraction implements RatingInterface{
 	public int script, acting, direction;
 	public Movie(){
 		script = 5; acting = 5; direction = 5;        
 	} 
 	 public Movie(int s, int a, int d) {            
  		script = s; acting = a; direction = d;        
 	}   
 	 public Movie(int s, int a, int d, int m) {            
  		this(s,a,d);   
  		this.setMinutes(m);     
 	}     
 	public Movie (int m) {
 		super(m);
 	}
 	public int rating () { 
  		return script + acting + direction; 
 	} 
} 