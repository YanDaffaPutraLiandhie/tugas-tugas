import java.util.Scanner;
public class pasword{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String username = "1234567";
        String password = "123456";

        System.out.print("masukkan password :");
        username = input.nextLine();
        System.out.print("masukkan password :");
        password = input.nextLine();

        if (username.equals("1234567") && password.equals("123456")){
        System.out.println("selamat anda berhasil login"); 
        } else {
        System.out.println("gagal login (password/ussername salah)");
        System.out.println("password atau ussername yang anda masukkan salah");
        }
    }

}