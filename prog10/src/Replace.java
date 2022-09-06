import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input sentence");
        String sen=in.nextLine();
        sen=sen.replace("python","#");
        sen=sen.replace("java","python");
        sen=sen.replace("#","java");
        System.out.println(sen);
    }
}
