package polymorphismDemo;

import java.util.logging.Logger;

public class main {
    public static void main(String[] args){
        //BaseLogger [] loggers= new BaseLogger[]{ new FileLogger(), new DatabaseLogger(), new ConsoleLogger()};
        //for (BaseLogger logger:loggers){
            //logger.Log("Log mesajı");
        //}
          
        CostumerManager costumerManager = new CostumerManager(new DatabaseLogger());
        costumerManager.Add();
    }
}
