import java.util.*;
class DemonetizationException extends Exception
{
    float amount;
    DemonetizationException(float amount)
    {
        this.amount=amount;
    }
    public String toString()
    {
        return "Deposit of Old Currency of (Rs."+ amount + ")crosses Rs.5000 and cannot be deposited";
    }
}

class Account
{
    float balance;
    Account()
    {
        balance=500;
    }
    void deposit(float amount,String cur_type)
    {
      try
      {
          if(cur_type.equals("old") && amount>5000)
          {
              throw new DemonetizationException(amount);
          }
          balance=balance+amount;
      }
      catch (DemonetizationException e)
      {
          System.out.println(e);
      }
    }
    void withDraw(float amount)
    {
        if(amount<(balance) )
        {
            balance=balance-amount;
            System.out.println("rs "+amount+" is withdrawn");
        }
        if(balance<500)
            System.out.println("no min balance fine may applied");
        else
        {
            System.out.println("no sufficient balance");
        }
    }
    void checkBalance()
    {
        System.out.println("your account balance is Rs "+balance);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Account acc=new Account();
        System.out.println("enter \n1.deposit\n2.withdraw\n3.check balance\n4.exit");
        int ch=0;
//        System.out.println("enter the choice");
//        ch=in.nextInt();
        while(ch!=4)
        {
            System.out.println("enter the choice");
            ch=in.nextInt();
            switch (ch)
            {
                case 1 :
                    System.out.println("enter the amt and currency type to be deposited");
                    float amt=in.nextFloat();
                    in.nextLine();
                    String temp=in.nextLine();
                    acc.deposit(amt,temp);
                    break;
                case 2 :
                    System.out.println("enter the amt to be withdrawn");
                    float tamt=in.nextFloat();
                    acc.withDraw(tamt);
                    break;
                case 3 :
                    acc.checkBalance();
                    break;
                case 4 :
                    System.exit(0);

            }


        }
    }
}
