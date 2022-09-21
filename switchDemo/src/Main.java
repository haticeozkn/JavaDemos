public class Main {

    public static void main(String[] args) {
        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("Dersi mükemmel geçtiniz.");
                break;
            case 'B':
                System.out.println("Dersi çok iyi geçtiniz.");
                break;
            case 'C':
                System.out.println("Dersi iyi geçtiniz.");
                break;
            case 'D':
                System.out.println("Dersi geçtiniz.");
                break;
            case 'F':
                System.out.println("Dersten kaldınız.");
                break;
            default:
                System.out.println("Geçersiz not girdiniz.");
        }
    }
}
