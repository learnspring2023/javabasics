class MyPoint {
	private int x;
	private int y;
	
	public MyPoint() {
		this.x=0;
		this.y=0;
		System.out.println("Object created with Default values");		
	}

	public MyPoint(int x, int y) {
		this.x=x;
		this.y=y;
		System.out.println("Object created with given values");		
	}

	public void setXY(int x, int y) {
		this.x=x;
		this.y=y;
		System.out.println("Values updated");		
	}
	
	public int[] getXY() {
		int[] points = { this.x,  this.y };
		return points;		
	}
	
	public String toString() {
		return "("+this.x+","+this.y+")";
	}
	
}

public class TestMyPoint {
 public static void main(String[] args) {
	MyPoint redPoint = new MyPoint(2,3);
	System.out.println(redPoint); //(0,0)
//	MyPoint greenPoint = new MyPoint(2,2);
//	greenPoint.setXY(3, 2);
//	int[] points = greenPoint.getXY();
//	System.out.println(points[0]+","+points[1]);
//	points = redPoint.getXY();
//	System.out.println(points[0]+","+points[1]);	
 }
}



