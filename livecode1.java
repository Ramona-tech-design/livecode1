import java.util.Scanner;
public class livecode1{
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n; 
    int x;

    System.out.println("Masukkan sebuah bilangan bulat untuk menampilkan perkalian");
    n = in.nextInt();

        for(x =1 ; x <=10; x++){
        int hasil = n*x;
            System.out.println(x +" X "+ n +" = "+ hasil );

        }
    }
}