public class Main {

    public static void main(String[] args) {
        //for
	for(int i=2 ; i<10 ; i+=2) {
        System.out.println(i);
    }
        System.out.println("For döngüsü bitti");

        //while döngüsünde şart sağlanmazsa while döngüsüne girmez.
        int i=2;
        while (i<10){
            System.out.println(i);
            i+=2;
        }
        System.out.println("While döngüsü bitti.");

        //do-while döngüsünde önce do çalışır j yi yazdırır, şart uymasa bile 1 kere çalışır.
        int j =1;
        do{
            System.out.println(j);
            j+=2;
        } while (j<10);
        System.out.println("Do-while döngüsü bitti.");
    }


}
