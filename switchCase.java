public class switchCase {
    public static void main(String[] args) {
        char seviye = 'A';

        switch (seviye) {
            case 'A':
                System.out.println("Mükemmel Geçtiniz");
                break;

            case 'B':
                System.out.println("Çok Güzel Geçtiniz");
                break;

            case 'C':
                System.out.println("İyi Geçtiniz");
                break;

            case 'D':
                System.out.println("Fena değil Geçtiniz");
                break;

            case 'F':
                System.out.println("KALDINIZ");
                break;

            default:
                System.out.println("Geçersiz not girdiniz");
        }
    }
}
