import java.util.*;
import java.util.concurrent.ScheduledFuture;

class Adress
{
    int stno;
    String city,state,country;
    static Adress takeAdress()
    {
        Scanner in = new Scanner(System.in);
        Adress ad=new Adress();
        System.out.println("enter the street no");
        ad.stno=in.nextInt();
        in.nextLine();
        System.out.println("enter the city");
        ad.city=in.nextLine();
        System.out.println("enter the state");
        ad.state=in.nextLine();
        System.out.println("enter the country");
        ad.country=in.nextLine();
        return ad;
    }
}
class Student
{
    String name,usn;
    Adress adress;
    Student(String name,String usn,Adress adress)
    {
        this.name=name;
        this.usn=usn;
        this.adress=adress;
    }
}
class College
{
        String name;
        Adress adress;
        College(String name,Adress adress)
        {
        this.name=name;
        this.adress=adress;
        }
}
class Employe
{
    String name,id;
    Adress adress;
    Employe(String name,String id,Adress adress)
    {
        this.name=name;
        this.id=id;
        this.adress=adress;
    }
}
public class Main {
    public static void main(String[] args) {
        String tname,tusn,tid;
        Adress add;
        System.out.println("enter no of students,colleges,employes");
        Scanner a =new Scanner(System.in);
        int ns=a.nextInt();
        int nc=a.nextInt();
        int ne=a.nextInt();
        Student[] s= new Student[ns];
        College[] c=new College[nc];
        Employe[] e=new Employe[ne];
        for(int i=0;i<ns;i++)
        {
            System.out.printf("enter the name and usn of %d student",i+1);
            tname=a.nextLine();
            tusn=a.nextLine();
            add=Adress.takeAdress();
            s[i]=new Student(tname,tusn,add);
        }
        for(int i=0;i<nc;i++)
        {
            System.out.printf("enter the name the %d college",i+1);
            tname=a.nextLine();
            add=Adress.takeAdress();
            c[i]=new College(tname,add);
        }
        for(int i=0;i<ne;i++)
        {
            System.out.printf("enter the name and id of %d employee",i+1);
            tname=a.nextLine();
            tid=a.nextLine();
            add=Adress.takeAdress();
            e[i]=new Employe(tname,tid,add);
        }
        System.out.printf("student details :\n%15s%15s%15s%15s%15s","name","usn","street no","city","state","country");
        for(Student st  :  s)
        {
            System.out.printf("\n%15s%15s%15s%15s%15s",st.name,st.usn,st.adress.stno,st.adress.city,st.adress.country);
        }
    }
}
