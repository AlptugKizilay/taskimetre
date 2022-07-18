import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar, km, acılısUcreti = 10;
        double perKm = 2.20;

        Scanner inp = new Scanner(System.in);

        System.out.print("Gidilen km: ");
        km = inp.nextDouble();



        tutar = (km * perKm) + acılısUcreti;
        tutar = (tutar < 20) ? 20 : tutar;

        System.out.println("Tutar: "+ tutar);



































        //Taksimetre KM başına 2.20 TL tutmaktadır.
        //Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        //Taksimetre açılış ücreti 10 TL'dir.

    }
}