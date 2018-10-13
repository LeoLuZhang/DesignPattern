package NullObject;

/**
 * NullObject
 * Leo
 * 2018/10/13
 */
public class NullCustomer extends AbstractCustomer{
    @Override
    public String getName(){
        return "Not Available in Customer Database";
    }
    @Override
    public boolean isNil(){
        return true;
    }
}
