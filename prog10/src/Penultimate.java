import java.util.Scanner;

public class Penultimate {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("input a sentence");
        String sen=in.nextLine();
        String[] sentence=sen.split(" ");
        System.out.println("the penultimate word is\n"+sentence[sentence.length-2]);
    }
}
