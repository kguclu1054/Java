package interfaces;

public class main {
    public static void main(String[] args){
       CustomerManager customerManager = new CustomerManager();
       customerManager.customerDal = new OracleCustomerDal();
       customerManager.add();
    }
}
