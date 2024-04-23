import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
int r;
double pi = 3.14;
double alfa;

Scanner input = new Scanner(System.in);
        System.out.print("Dairenin Merkez Açı Ölçüsünü Giriniz: ");
        alfa= input.nextInt();
        System.out.print("Dairenin Yarıçapını Giriniz: ");
        r= input.nextInt();

        double alan = (pi * (r*r) * alfa) / 360;

        System.out.println("Dairenin Alanı: " + alan );

    }
}