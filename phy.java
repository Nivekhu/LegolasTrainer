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
        double angleX = 0;	  // Angle of deviation for aiming at the target, 0 is at the target, + is to the right, - is to the left.
		double angleY = 0;	  // Angle of deviation for aiming at the target, 0 is at the target, + is above, - is below.
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
        

        //Grabs the given inputs: Distance, weight, spring constant, maybe starting height.
        System.out.print("Please enter the distance from the target(meters): ");
        distance = Double.parseDouble(s.nextLine());
        System.out.println(distance + " m");

        System.out.print("Enter the weight of the arrow(grams): ");
        weight = Double.parseDouble(s.nextLine());
        System.out.println(weight + " g");

        System.out.print("Enter the spring Constant of the Bow(Newtons/Meter)(420): ");
        springC = Double.parseDouble(s.nextLine());
        System.out.println(springC + " N/M");        

        //Grabs the variable inputs, angleX, angleY, drawDis
        System.out.print("Enter the draw distance(meters): ");
        drawDis = Double.parseDouble(s.nextLine());
        System.out.println(drawDis + " m");
        
        //Testing arrow methods
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
    */
}
