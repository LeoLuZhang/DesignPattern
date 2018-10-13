package Visitor;

/**
 * Visitor
 * Leo
 * 2018/10/13
 */
public class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor){
        computerPartVisitor.visit(this);
    }
}
