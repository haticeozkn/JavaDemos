public class Main {

    public static void main(String[] args) {
	int sayi1 = 10;
    int sayi2 = 20;
    int sayi3 = 30;
    int enBüyük = sayi1;

    if (enBüyük<sayi2) {
        enBüyük = sayi2;
    }
    if (enBüyük<sayi3) {
        enBüyük = sayi3;
    }
        System.out.println("En büyük sayı: " + enBüyük);
    }
}
