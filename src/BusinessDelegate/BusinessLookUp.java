package BusinessDelegate;

/**
 * BusinessDelegate
 * Leo
 * 2018/10/13
 */
public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType){
        if (serviceType.equalsIgnoreCase("EJB")){
            return new EJBService();
        }else{
            return new JMSService();
        }
    }
}
