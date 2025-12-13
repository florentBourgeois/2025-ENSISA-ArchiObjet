package OperationsMath.composite;

import OperationsMath.Element;
import OperationsMath.visitor.VisitorOperation;

public class Moins extends Operation{


    public Moins(Element a, Element b) {
        super(a, b);
    }

    @Override
    public int eval() {
        return a.eval()-b.eval();
    }

    @Override
    public void accept(VisitorOperation v) {
        v.visiteMoins(this);
    }

}
