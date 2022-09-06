

interface Animal
{
    public void eat();
    public void sound();
}
interface TiredAnimal extends Animal
{
    boolean isTired();
}
class Lion implements Animal
{
    public void eat()
    {
        System.out.println("loin is hunting");
    }
    public void sound()
    {
        System.out.println("lion is roaring");
    }
}
class Snake implements TiredAnimal
{
    public  void eat()
    {
        System.out.println("snake is eating rat");
    }
    public void sound()
    {
        System.out.println("snake is hissing");
    }
    public boolean isTired()
    {
        return true;
    }
}
public class Main {
    public static void main(String[] args) {
        Lion l=new Lion();
        l.eat();
        l.sound();
        Snake s = new Snake();
        s.eat();
        s.sound();
        if(s.isTired())
            System.out.println("Snake is tiredd can't hunt");
        else
            System.out.println("Snake can hunt");
    }
}
