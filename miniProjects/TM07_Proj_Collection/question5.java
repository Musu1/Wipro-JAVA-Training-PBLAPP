import java.util.*;

public class question6{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Box> set = new TreeSet<>();
		
		System.out.println("Enter the number of Box");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			Box box = new Box();
			System.out.println("Enter the Box " + i + " details");
			
			System.out.println("Enter Length");
			box.setLength(sc.nextDouble());
			System.out.println("Enter Width");
			box.setWidth(sc.nextDouble());
			System.out.println("Enter Height");
			box.setHeight(sc.nextDouble());
			
			set.add(box);
		}
		
		System.out.println("Unique Boxes in the Set are");
		for (Box box : set)
			System.out.println(box);

		sc.close();
	}

}


class Box implements Comparable<Box>{
	private double length;
	private double width;
	private double height;

	public void setLength(double length) {
		this.length = length;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String toString() {
		double volume = (length * width * height);
		String str = String.format("length = " + length + ", width = " + width + 
				", height = " + height + ", Volume = %.2f", volume);
	
		return str;
	}

	public int compareTo(Box that) {
		double thisVol = this.length * this.width * this.height;
		double thatVol = that.length * that.width * that.height;
		
		if (thisVol > thatVol) return 1;
		else if (thisVol < thatVol) return -1;
		else return 0;
	}
	
	
	public int hashCode() {
		double thisVol = this.length * this.width * this.height;
		String str = String.valueOf(thisVol);
		return str.hashCode();
	}
	
	public boolean equals(Object obj) {
		Box that = (Box) obj;
		
		double thisVol = this.length * this.width * this.height;
		double thatVol = that.length * that.width * that.height;
		
		if (thisVol == thatVol) return true;
		else return false;
	}


}

