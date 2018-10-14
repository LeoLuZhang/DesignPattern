package InterceptingFilter;

/**
 * InterceptingFilter
 * Leo
 * 2018/10/14
 */
public class DebugFilter implements Filter {

    @Override
    public void execute(String request){
        System.out.println("Request log: " + request);
    }
}
