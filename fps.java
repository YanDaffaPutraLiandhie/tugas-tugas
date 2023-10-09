import java.util.Scanner;
public class fps{
    public static void main(String[] args) {
        Scanner jarak1 = new Scanner (System.in);
        int jarak;
        System.out.print("masukkan jarak :");
        jarak = jarak1.nextInt();

        if (jarak <= 5){
        System.out.print("melle weapon");
        } else;
        System.out.println("ranged weapon");
        
    }
}