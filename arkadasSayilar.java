public class arkadasSayilar {
    public static void main(String[] args){
        int sayi1= 210;
        int sayi2=284;
        int toplam1=0;
        int toplam2=0;

        for(int i=1; i<sayi1; i++){
            if(sayi1 % i ==0){
                toplam1= toplam1+i;
            }
        }

        for(int i=1; i<sayi2; i++){
            if(sayi2 % i ==0){
                toplam2= toplam2+i;
            }
        }

        if(sayi1==toplam2 || sayi2==toplam1){
             System.out.println("Arkadaş Sayıdır");
        }else{
            System.out.println("Arkadaş Sayı Değildir");
        }
    }
}
