package BusinessDelegate;

/**
 * BusinessDelegate
 * Leo
 * 2018/10/13
 */
public class EJBService implements BusinessService{
    @Override
    public void doProcessing(){
        System.out.println("Processing task by invoking EJB Service");
    }
}
