package NullObject;

/**
 * NullObject
 * Leo
 * 2018/10/13
 */
public class RealCustomer extends AbstractCustomer{
    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public boolean isNil(){
        return false;
    }
}
