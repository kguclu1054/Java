package polymorphismDemo;
  
public class CostumerManager {
    private BaseLogger logger;

    public CostumerManager(BaseLogger logger){
       this.logger= logger;
    }
    public void Add(){
        System.out.println("Müşteri eklendi");
        this.logger.Log("log mesajı");
    }
}
