package FrontController;

/**
 * FrontController
 * Leo
 * 2018/10/14
 */
public class FrontController {
    private Dispatcher dispatcher;

    public FrontController(){
        dispatcher = new Dispatcher();
    }

    private boolean isAuthenticUser(){
        System.out.println("User is authenticated successfully.");
        return true;
    }

    private void trackReqeuest(String request){
        System.out.println("Page requested: " + request);
    }

    public void dispatcherRequest(String request){
        trackReqeuest(request);
        if (isAuthenticUser()){
            dispatcher.dispatch(request);
        }
    }
}
