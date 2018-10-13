package Visitor;

/**
 * Visitor
 * Leo
 * 2018/10/13
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        ComputerPart computerPart = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
