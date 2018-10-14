package FrontController;

/**
 * FrontController
 * Leo
 * 2018/10/14
 */
public class FrontControllerPatternDemo {
    public static void main(String[] args) {

        FrontController frontController = new FrontController();
        frontController.dispatcherRequest("HOME");
        frontController.dispatcherRequest("STUDENT");

    }
}
