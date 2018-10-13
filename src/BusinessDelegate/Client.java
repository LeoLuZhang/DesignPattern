package BusinessDelegate;

/**
 * BusinessDelegate
 * Leo
 * 2018/10/13
 */
public class Client {
    BusinessDelegate businessService;

    public Client(BusinessDelegate businessService) {
        this.businessService = businessService;
    }

    public void doTask(){
        businessService.doTask();
    }
}
