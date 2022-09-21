public class Main {

    public static void main(String[] args) {
	String ögrenci1="Emre";
    String ögrenci2="Ayşe";
    String ögrenci3="Cemre";

        System.out.println(ögrenci1);
        System.out.println(ögrenci2);
        System.out.println(ögrenci3);
        System.out.println("--------------------");
    String[] ögrenciler = new String[3];
    ögrenciler[0] = "Emre";
    ögrenciler[1] = "Ayşe";
    ögrenciler[2] = "Cemre";

    for(int i=0 ; i<ögrenciler.length ; i++) {
        System.out.println(ögrenciler[i]);
    }
        System.out.println("--------------------");
    for (String ögrenci:ögrenciler) {
        System.out.println(ögrenci);
    }
    }
}
