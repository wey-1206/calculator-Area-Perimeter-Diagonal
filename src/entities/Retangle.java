package entities;

public class Retangle {
	public double width;
	public double height;
	
	public double Area () {
		return width * height;
	}
	
	public double Perimeter() {
		return 2 * (width + height);
	}
	public double Diagonal() {
		double D2 = (width * width) + (height * height);
		double d1 = Math.sqrt(D2);
		return d1;
	}
	
	public String data() {
		return "AREA =  " + String.format("%.2f", Area()) +
				"\nPERIMETER = "+ String.format ("%.2f", Perimeter()) +
				"\nDIAGONAL = " + String.format ("%.2f", Diagonal());
	}
	

}
