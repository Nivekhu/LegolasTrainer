//Kevin Hu
//8/22/2017
//Ok fuck let's actually code this thing

import java.util.Scanner;

public class phy
{
	public static void main(String[] args)
	{
        double distance;  // Distance the shooter is from the target.	
       	double weight;    // The weight of the arrow, Grams		
        double targetX = 0;	  // Target X position, Not sure what to use for this? I assume +/- meters from a centerpoint.
		double targetY = 0;	  // Target Y position, Ok I've though about it a bit, I think we'll do the x/y of the shooter as 0
        double springC;   // Spring constant, Newtons/Meter
		double drawDis;   // Distance the string is drawn back, Meters
	
		//These are variables that are a conmbination of the previous variables
		double bowForce;  // This will be drawDis * SpringC. Represents the amount of force the bow applies to the arrow, Newtons
		double arrAccel;  // This will be bowForce/weight. Represents the acceleration of the arrow horizontally, Meters/Second^2
		double arrDrop;   // This will be weight * 9.8m/s. Represents the acceleration of the arrow vertically, Meters/Second^2
        
        //These variables need to be moved up but I'm bad at vim
        double arrVector; // This is currently a placeholder for the vector, I'm considering making this it's own class.
        double initVel;   // This is the initial velocity, Meters/Second
        
        Scanner s = new Scanner(System.in);

        System.out.print("Please enter the distance from the target(meters): ");
        distance = Double.parseDouble(s.nextLine());
        System.out.println(distance + " m");

        System.out.print("Enter the weight of the arrow(grams): ");
        weight = Double.parseDouble(s.nextLine());
        System.out.println(weight + " g");

        System.out.print("Enter the spring Constant of the Bow(Newtons/Meter)(420): ");
        springC = Double.parseDouble(s.nextLine());
        System.out.println(springC + " N/M");

        System.out.print("Enter the draw distance(meters): ");
        drawDis = Double.parseDouble(s.nextLine());
        System.out.println(drawDis + " m");

        arrAccel = calcAccel(drawDis, springC, weight);
        System.out.println(arrAccel + " m/s2");
	
	}
   
    public static double calcAccel(double drawDis, double springC, double weight)
    {
        double force;
        double accel;
        force = springC * drawDis;
        accel = force/weight;
        return accel;
    }

    /*
    public double calcDrop(double dist, double arrDrop, double initVel, double arrAccel)
    {
        //This will calculate the overall drop of the arrow given the distance away, accelerating force of gravity, initial
        //velocity and acceleration towards the target.       
    }

    public double deviationX()
    {
        //Not too sure how I should do this one, but I do need it here.
    }

    public double deviationY()
    {
        //This one is actually pretty easy, I might rename calcDrop to DeviationY
    }
    */
}
