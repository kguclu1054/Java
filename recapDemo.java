public class recapDemo {
    public static void main(String[] args) {
        double[] benimListem = { 1.2, 1.3, 4.3, 5.6 };

        double toplam=0;

        double max=benimListem[0];

        for (double numara : benimListem) {
            if(max < numara){
                max = numara;
            }
            toplam= toplam + numara;
            System.out.println(numara);

        }
        System.out.println(toplam);

        System.out.println("en büyük"+max);
    }

}
