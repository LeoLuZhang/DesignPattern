package Designpattern.Builder;

//04.创建扩展了 Burger的实体类。
public class ChickenBurger extends Burger {
    @Override
    public float price(){
        return 50.5f;
    }
    @Override
    public String name(){
        return "Chicken Burger";
    }
}
