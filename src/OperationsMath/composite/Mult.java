package OperationsMath.composite;

import OperationsMath.Element;

public class Mult extends Operation{


    public Mult(Element a, Element b) {
        super(a, b);
    }

    @Override
    public int eval() {
        return a.eval()*b.eval();
    }


}
