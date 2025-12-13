package OperationsMath.composite;

import OperationsMath.Element;
import OperationsMath.visitor.VisitorOperation;

public class Plus extends Operation{


    public Plus(Element a, Element b) {
        super(a, b);
    }

    @Override
    public int eval() {
        return a.eval()+b.eval();
    }

    @Override
    public void accept(VisitorOperation v) {
        v.visitePlus(this);
    }

}
