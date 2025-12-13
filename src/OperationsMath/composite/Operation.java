package OperationsMath.composite;

import OperationsMath.Element;

public abstract class Operation implements Element {

    public Element a,b;

    public Operation(Element a, Element b) {
        this.a = a;
        this.b = b;
    }

    public void setA(Element a) {
        this.a = a;
    }

    public void setB(Element b) {
        this.b = b;
    }
}
