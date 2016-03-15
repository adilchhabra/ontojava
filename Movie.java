public class Movie {
 	public int script, acting, direction;
 	public Movie(){
 		script = 5; acting = 5; direction = 5;        
 	} 
 	public static int rating () { 
  		return script + acting + direction; 
 } 
} 