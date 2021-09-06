import java.io.Console;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input User name");
        String name=scanner.next();
        String encodedTetx="";
        char [] chars=name.toCharArray();
        for( char c : chars){
            c+=5;
            String encodedFinal=encodedTetx+c;
            System.out.print(encodedFinal);
        }

        System.out.println("Your encrypted name is  ");
    }
}
