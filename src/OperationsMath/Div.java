package OperationsMath;

public class Div extends Operation{


    public Div(Element a, Element b) {
        super(a, b);
    }

    @Override
    public int eval() {
        return a.eval()/b.eval();
    }


}
