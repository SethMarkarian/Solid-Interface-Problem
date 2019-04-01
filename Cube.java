public class Cube implements Solid 
{
    private double x;
    public Cube(double a) {
        x = a;
    }   
    public double getVolume() {
        return Math.pow(x, 3);
    }
}