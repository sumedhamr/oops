import java.util.*;
class Complex{
    Complex()
    {
// THis is a constructor
    }
    int real,img;
    Complex(int t1,int t2)
    {
        this.real=t1;
        this.img=t2;
    }
    static Complex add(Complex no1,Complex no2)
    {
        Complex no3=new Complex();
        no3.real=no1.real+no2.real;
        no3.img=no1.img+no2.img;
        return no3;
    }
    static Complex sub(Complex no1,Complex no2)
    {
        Complex no4=new Complex();
        no4.real=no1.real-no2.real;
        no4.img=no1.img-no2.img;
        return no4;
    }
    
}
public class Main {
    static void display(Complex no)
    {
        System.out.println(no.real+"+"+no.img+"i");
    }
    public static void main(String[] args)
        {
        
        Scanner in =new Scanner(System.in);
        System.out.println("enter the real and img part of  1st complex no");
        int temp1=in.nextInt();
        int temp2=in.nextInt();
        Complex c1=new Complex(temp1,temp2);
        System.out.println("enter the real and img part of  2st complex no");
        int temp3=in.nextInt();
        int temp4=in.nextInt();
        Complex c2=new Complex(temp3,temp4);
        display(Complex.add(c1,c2));
        display(Complex.sub(c1,c2));
    }
}
