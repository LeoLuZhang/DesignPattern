package InterceptingFilter;

/**
 * InterceptingFilter
 * Leo
 * 2018/10/14
 */
public class Target {
    public void execute(String request){
        System.out.println("Executing request: " + request);
    }
}
