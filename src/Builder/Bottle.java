package Designpattern.Builder;

//02.创建实现接口的实体类
public class Bottle implements Packing{
    @Override
    public String pack(){
        return "Bottle";
    }
}
