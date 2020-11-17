import java.io.IOException;
import java.util.Scanner;

public class Main {

public static void main(String[] args) {
     double a,b,c;
     Scanner input = new Scanner(System.in);
     a = input.nextDouble();
     b = input.nextDouble();
     c = (a * 3.5 + b * 7.5) / 11;
     System.out.printf("MEDIA = %.5f\n", c);
    }
}
