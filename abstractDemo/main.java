package abstractDemo;

public class main {
    public static void main (String[] args){
        CustomerManager customerManager = new CustomerManager();
        customerManager.database = new MySqlDatabase();
        customerManager.getCustomers();
    }
}
