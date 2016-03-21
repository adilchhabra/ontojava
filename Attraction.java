public abstract class Attraction { 
 // Define instance variable: 
 private int minutes; 
 // Define zero-parameter constructor: 
 public Attraction () { 
  System.out.println("Calling zero-parameter Attraction constructor"); 
  minutes = 75; 
 } 
 public Attraction (int m) {
 	minutes = m;
 } 
 public int getMinutes () {
 	return minutes;
 } 
 public void setMinutes (int m) {
 	minutes = m;
 } 
 public abstract int rating () ;
} 
