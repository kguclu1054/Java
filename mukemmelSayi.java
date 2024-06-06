public class mukemmelSayi {
    public static void main(String[] args){
         int number=0;
         int total=0;

         if(number<1){
            System.out.println("Sayı geçersizdir");
            return;
         }
         
         for(int i=1; i<number; i++){
            if(number % i ==0){
                total = total+i;
            }
         }

         if(total==number){
            System.out.println("Sayı mükemmel sayıdır");
         }else{
            System.out.println("Sayı mükemmel sayı değildirr");
         }
    }
}
