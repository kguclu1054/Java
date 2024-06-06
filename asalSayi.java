public class asalSayi {
    public static void main(String[] args) {
        int number = 1;
        int kalan = number % 2;
        System.out.println("kalan:"+kalan);
        boolean asalMi = true;

        if(number==1){
            System.out.println("Sayı asal değildir");
            return ;
        }
        
        if(number<1){
            System.out.println("Geçersiz sayı");
        }
        
        
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                asalMi = false;
            }
        }

        if(asalMi){
            System.out.println("Sayı asaldır");
        }else {
            System.out.println("Sayı asal değildir");
        }
    

    }
}
