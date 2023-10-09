import java.util.Scanner;
import java.util.scanner;
public class bilanganpecahan{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        double d,x1,x2;

        System.out.println("masukkan nilai a :");
        a = input.nextInt();
        System.out.println("masukkan nilai b :");
        b = input.nextInt();
        System.out.println("masukkan nilai c :");
        c = input.nextInt();

        d = b*b - 4*a*c;

        if(a>0){
            x1 = ((-b + Math.sqrt(d))/(2*a));
            x2 = ((-b - Math.sqrt(d))/(2*a));
            System.out.println("nilai x1 =" + x1 + "nilai x2 =" + x2);
        }else if (a==0){
        System.out.print("eror");
        } else if (a < 0){
            System.out.println("imaginer");
        } 

    }
}