package OperationsMath.visitor;

import OperationsMath.Value;
import OperationsMath.composite.Div;
import OperationsMath.composite.Moins;
import OperationsMath.composite.Mult;
import OperationsMath.composite.Plus;

public class VisitorLaTeX implements VisitorOperation{

    private StringBuffer result;

    public VisitorLaTeX(){
        this.result = new StringBuffer();
    }

    public void reset() {
        this.result = new StringBuffer();
    }

    public String getResult() {
        return this.result.toString();
    }

    public void visitePlus(Plus op){
        result.append("\\left( ");
        op.a.accept(this);
        result.append(" + ");
        op.b.accept(this);
        result.append("\\right) ");
    }

    public void visiteMult(Mult op) {
        result.append("\\left( ");
        op.a.accept(this);
        result.append(" \\times ");
        op.b.accept(this);
        result.append("\\right) ");
    }

    public void visiteMoins(Moins op) {
        result.append("\\left( ");
        op.a.accept(this);
        result.append(" - ");
        op.b.accept(this);
        result.append("\\right) ");
    }

    public void visiteDiv(Div op) {
        result.append("\\left( ");
        op.a.accept(this);
        result.append(" / ");
        op.b.accept(this);
        result.append("\\right) ");
    }

    public void visiteValue(Value op) {
        result.append(op.eval());
    }
}
