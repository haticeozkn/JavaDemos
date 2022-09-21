public class Main {

    public static void main(String[] args) {
	    String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);
        /*System.out.println("Eleman sayısı: " + mesaj.length());
        System.out.println("5. Eleman: " + mesaj.charAt(4));
        System.out.println(mesaj.concat("Yaşasın!"));
        System.out.println(mesaj.startsWith("A"));
        System.out.println(mesaj.endsWith("."));
        char[] karakterler = new char[5];
        mesaj.getChars(0, 5, karakterler, 0); //0'dan itibaren 4'e kadar elemanları karakterlere ata ve karakterlerin 0. indeksinden aktar
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf('a')); //mesajın içinde kaçıncı karakter olduğunu, index numarasını verir
        System.out.println(mesaj.lastIndexOf('a')); //aramaya sağdan bailar*/
        String yeniMesaj = mesaj.replace(' ', '-');
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2,5));

        for(String kelime: mesaj.split(" ")){
            System.out.println(kelime);
        }
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());
    }
}
