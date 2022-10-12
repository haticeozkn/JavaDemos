public abstract class GameCalculator {
    public abstract void hesapla(); //kim implement ediyorsa hesaplayı içermek ve override etmek zorunda, yani kendi hesaplasını yazmalı

    public final void gameOver(){ //bunu  kim kullanıyorsa böyle kullanmak zorunda
         System.out.println("Oyun bitti");
        }


}
