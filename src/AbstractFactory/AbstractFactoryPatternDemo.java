package Designpattern.AbstractFactory;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {

        AbstractFactory shapeFactory= FactoryProducer.getFactory("SHAPE");
        Shape shape1 =  shapeFactory.getShape("CIRCLE");
        shape1.draw();
        Shape shape2 =  shapeFactory.getShape("RECTANGLE");
        shape2.draw();
        Shape shape3 =  shapeFactory.getShape("SQUARE");
        shape3.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Color clor1 = colorFactory.getColor("RED");
        clor1.fill();
        Color clor2 = colorFactory.getColor("GREEN");
        clor2.fill();
        Color clor3 = colorFactory.getColor("BLUE");
        clor3.fill();

    }
}
