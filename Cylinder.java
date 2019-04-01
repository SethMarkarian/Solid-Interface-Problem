public class Cylinder implements Solid
{
   private double r, h;
   
   public Cylinder(double a, double b) {
       r = a;
       h = b;;
   }
   
   public double getVolume() {
       return (double) (Math.PI * Math.pow(r, 2) * h);
    }
}
