package RVCE;
import CSE.*;
//import CSE.Thirdsem;
class Cse_dept extends Thirdsem
{
    public void welcomeMsg()
    {
        System.out.println("welcome to CSE dept- 3rd sem young budding Engineers");

    }
    private  void methodPrivate(int n)
    {
        System.out.println("private method overloading");

    }
    protected void methodProtected()
    {
        System.out.println("protected method overridden");
    }
    void methodDefault()
    {
        System.out.println("default method overridden");
    }
    public  void display()
    {
        System.out.println("inside display method calling private");
        methodPrivate(2);
    }


}

public class Main {
    public static void main(String[] args) {
        Cse_dept cse = new Cse_dept();
        Thirdsem thsem=new Thirdsem();

        cse.welcomeMsg();
        cse.methodProtected();
        cse.methodDefault();
        cse.display();
        thsem.welcomeMsg();
    }
}
