import java.util.*;
class Array
{
    ArrayList<String> list=new ArrayList<>();
    ArrayList<String > rev_list=new ArrayList<>();
    public void add(String colour)
    {
        list.add(colour);
    }
    public void display()
    {
        if(list.size()==0)
        {
            System.out.println("empty list");
        }
        else {
            System.out.println("the items in list are :\n"+list);
        }
    }
    public void reverseList()
    {
        //ArrayList<String> trev = new ArrayList<>();
        if(list.size()==0)
        {
            System.out.println("empty list");
        }
        else {
            for(int i=list.size()-1;i>=0;i--)
            {
                rev_list.add(list.get(i));
            }
        }
        System.out.println("the reversed list is :\n"+rev_list);
    }
    public void getSubList(int start,int end)
    {
        if(list.size()==0)
        {
            System.out.println("empty list");
        }
        else {
            ArrayList<String> subList=new ArrayList<>(list.subList(start,end));
            System.out.println("the sub list is :\n"+subList);
        }
    }
    public void sortArray()
    {
        if(list.size()==0)
        {
            System.out.println("empty list");
        }
        else {
            Collections.sort(list);
            System.out.println("the sorted list is:\n"+list);
        }
    }
    public void cloneArray
    {
        if(list.size()==0)
        {
            System.out.println("empty list");
        }
        else {
            ArrayList<String> clone_list=new ArrayList<>();
            list.clone();
            System.out.println("the cloned listv is:\n"+clone_list);
        }
    }

}
public class Main {
}
