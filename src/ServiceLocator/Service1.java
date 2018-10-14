package ServiceLocator;

/**
 * ServiceLocator
 * Leo
 * 2018/10/14
 */
public class Service1 implements Service{
    @Override
    public void execute(){
        System.out.println("Executing Service1");
    }
    @Override
    public String getName(){
        return "Service1";
    }
}
