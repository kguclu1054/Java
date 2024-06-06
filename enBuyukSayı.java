public class enBuyukSayı {
    public static void main(String[] args){
        int sayi1=20;
        int sayi2=30;
        int sayi3=40;

        int enBuyuk=sayi3;

        if(enBuyuk<sayi1){
            enBuyuk = sayi1;
        }

        if(enBuyuk<sayi2){
            enBuyuk = sayi2;
        }

        
        System.out.println("en büyük:"+ enBuyuk);
    }
}
