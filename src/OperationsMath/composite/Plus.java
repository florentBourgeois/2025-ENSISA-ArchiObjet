package OperationsMath.composite;

import OperationsMath.Element;

public class Plus extends Operation{


    public Plus(Element a, Element b) {
        super(a, b);
    }

    @Override
    public int eval() {
        return a.eval()+b.eval();
    }


}
