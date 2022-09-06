import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("input sentence");
        String sen=in.nextLine();
        String[] arr=sen.split(" ");
        System.out.println("the words in the statements are");
        for(String st : arr)
            System.out.println(st);
    }
}
