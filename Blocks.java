import java.util.*;
public class Blocks
{
    private List<Solid> shapes;
    public Blocks(int n) {
        shapes = new ArrayList <Solid>();
        Solid s;
        for(int i = 0; i < n; i++) {
            if(Math.random() < 0.5) {
                s = new Cylinder((Math.random() * 10), (Math.random() * 10));
            }
            else {
               double number = Math.random() * 10;
               s = new Cube(number); 
            }
            shapes.add(s);
        }
    }
    
    public double getTotalVolume() {
        int total = 0;
        for(Solid s : shapes) {
            total += s.getVolume();
        }
        return total;
    }
}