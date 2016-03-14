public class VolumeOfEarth {
	public static void main(String [] args) {
	int radius = 6400000;
	System.out.println("The volume of the earth is: ");
	System.out.println(volumeCalc(radius));
	}
	public static double volumeCalc(int r) {
		return (4/3.0)*3.14*r*r*r;
	}
}