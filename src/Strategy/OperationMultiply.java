package Strategy;

/**
 * Strategy
 * Leo
 * 2018/10/13
 */
public class OperationMultiply implements Strategy{
    @Override
    public int doOperation(int num1,int num2){
        return num1 * num2;
    }
}
