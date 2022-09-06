import java.util.*;
class Circle
{
    double rad;
    String colour;
    Circle(double rad)
    {
        this.rad=rad;
    }
    Circle(double rad,String colour)
    {
        this.rad=rad;
        this.colour=colour;
    }
    public double getRad()
    {
        return rad;
    }
    public double getArea()
    {
        return Math.PI*rad*rad;
    }

}
class  Cylinder extends Circle
{
    double h;
    String colour;
    Cylinder(double rad,double h){
        super(rad);
        this.h = h;
    }
    Cylinder(double rad,double h,String colour)
    {
        super(rad,colour);
        this.h=h;
        //this.colour=colour;
    }
    public double getArea()
    {
        return Math.PI*2*rad*h;
    }
    public double getVol()
    {
        return Math.PI*rad*rad*h;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double tr,th;
        String tc;
        System.out.println("enter radious hight and colour of 1st cylinder");
        tr=in.nextDouble();
        th=in.nextDouble();
        in.nextLine();
        tc=in.nextLine();
        Cylinder c1=new Cylinder(tr,th,tc);
        System.out.println("enter radious hight and colour of 2st cylinder");
        tr=in.nextDouble();
        th=in.nextDouble();
        in.nextLine();
        tc=in.nextLine();
        Cylinder c2=new Cylinder(tr,th,tc);
        if(c1.getArea()==c2.getArea() && c1.getVol()==c2.getVol() && c1.colour.equals(c2.colour))
            System.out.println("Cylinders are equal");
        else
            System.out.println("Cylinders are not equal ");
    }
}
