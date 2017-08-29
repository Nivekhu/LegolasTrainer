//Kevin Hu
//8/22/2017
//Ok fuck let's actually code this thing

public class phy
{
	public static void main(String[] args)
	{
		double targetX;	  // Target X position, Not sure what to use for this? I assume +/- meters from a centerpoint.
		double targetY;	  // Target Y position, Ok I've though about it a bit, I think we'll do the x/y of the shooter as 0
		double distance;  // Distance the shooter is from the target, Meters
		double weight;    // The weight of the arrow, Grams
		double springC;   // Spring constant, Newtons/Meter
		double drawDis;   // Distance the string is drawn back, Meters
	
		//These are variables that are a conmbination of the previous variables
		double bowForce;  // This will be drawDis * SpringC. Represents the amount of force the bow applies to the arrow, Newtons
		double arrAccel;  // This will be bowForce/weight. Represents the acceleration of the arrow horizontally, Meters/Second^2
		double arrDrop;   // This will be weight * 9.8m/s. Represents the acceleration of the arrow vertically, Meters/Second^2
        
        //These variables need to be moved up but I'm bad at vim
        double arrVector; // This is currently a placeholder for the vector, I'm considering making this it's own class.
        double initVel;   // This is the initial velocity, Meters/Second
	
	}
    
    public double calcForce(double drawDis, double springC, double weight)
    {
        //This will calculate the force the arrow is traveling at. We take into account the draw distance, string constant,
        //weight of the arrow.
    }

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
    
}
