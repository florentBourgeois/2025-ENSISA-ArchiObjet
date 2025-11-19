package OperationsMath;

public class Moins extends Operation{


    public Moins(Element a, Element b) {
        super(a, b);
    }

    @Override
    public int eval() {
        return a.eval()-b.eval();
    }


}
