import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double perKgPear = 2.14, perKgApple = 3.67, perKgTomato = 1.11, perKgBanana = 0.95, perKgAubergine = 5.00, totalPrice;
        int kgPear, kgApple, kgTomato, kgBanana, kgAubergine;

        Scanner input = new Scanner(System.in);

        System.out.println("Kaç kilo armut aldığınızı giriniz: ");
        kgPear = input.nextInt();
        System.out.println("Kaç kilo elma aldığınızı giriniz: ");
        kgApple = input.nextInt();
        System.out.println("Kaç kilo domates aldığınızı giriniz: ");
        kgTomato = input.nextInt();
        System.out.println("Kaç kilo muz aldığınızı giriniz: ");
        kgBanana = input.nextInt();
        System.out.println("Kaç kilo patlıcan aldığınızı giriniz: ");
        kgAubergine = input.nextInt();

        totalPrice = (kgPear * perKgPear) + (kgApple * perKgPear) + (kgTomato * perKgTomato) + (kgBanana * perKgBanana) + (kgAubergine * perKgAubergine);

        System.out.println("Ödenmesi gereken toplam miktar: " + totalPrice + "TL");
    }
}
