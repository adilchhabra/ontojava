public class Movie extends Attraction{
 	public int script, acting, direction;
 	public Movie(){
 		script = 5; acting = 5; direction = 5;        
 	} 
 	 public Movie(int s, int a, int d) {            
  		script = s; acting = a; direction = d;        
 	}   
 	 public Movie(int s, int a, int d, int m) {            
  		script = s; acting = a; direction = d;   
  		minutes=m;     
 	}     
 	public static int rating () { 
  		return script + acting + direction; 
 	} 
} 