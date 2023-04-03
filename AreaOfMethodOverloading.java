package Assessment;
import java.util.Scanner;

class Area{
	double PI = Math.PI;
	public void areaOf(double r) {
		double value = PI * r * r;
        System.out.println("Area of the circle is :" + value);
	}
	 public void areaOf(int a, int b)
	    {
	        System.out.println("Area of the rectangle: " + a * b);
	    }
	 public void areaOf(double w,double hei)
	    {
		 double area=(w*hei)/2;
	      System.out.println("Area of Triangle is: " + area);  
	    }
	 public void areaOf(float c, float d) {
		 float area = (22*c*(c+d))/7;  
		 System.out.println("Area of Cylinder is: "+area);
	 }
	public void areaInfo() {
		 Scanner s= new Scanner(System.in);
		 
		 //Area of Circle = PI * r * r;
		 System.out.print("Enter radius of circle : ");
		 double r = s.nextDouble();
		 areaOf(r);
		 
		 //Area of rectangle = b*h
		 System.out.println("Enter base of the rectangle : ");
		 int b = s.nextInt();
		 System.out.println("Enter height of the rectangle : ");
		 int h = s.nextInt();
		 areaOf(b,h);
		 
		//Area of Triangle = (width*height)/2
		 System.out.print("Enter the width of the Triangle:");
         double w= s.nextDouble();
         System.out.print("Enter the height of the Triangle:");
         double hei= s.nextDouble();
         areaOf(w,hei);
         
         //area of cylinder = (22*a*(a+b))/7;
         System.out.println("Enter the 2 parameter : ");
         float c = s.nextInt();
		 float d = s.nextInt();
		 
		 areaOf(c,d);
	 }
	
}

public class MethodOverloading {

	public static void main(String[] args) {
		Area ar = new Area();
		
		ar.areaInfo();
		

	}

}
