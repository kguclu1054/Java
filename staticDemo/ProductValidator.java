package staticDemo;

public class ProductValidator {
    
    public ProductValidator(){
        System.out.println("Yapıcı blok çalıştı");
    }
    
    public boolean isValid(Product product) {
        if (product.price > 0 && !product.name.isEmpty()) {
            return true;
        } else {
            return false;
        }


    }
    public void bisey(){

    }
}
