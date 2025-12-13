package OperationsMath.visitor;

import OperationsMath.Value;
import OperationsMath.composite.Div;
import OperationsMath.composite.Moins;
import OperationsMath.composite.Mult;
import OperationsMath.composite.Plus;

public interface VisitorOperation {

    public void reset();
    public String getResult();

    public void visitePlus(Plus op);
    public void visiteMult(Mult op);
    public void visiteMoins(Moins op);
    public void visiteDiv(Div op);
    public void visiteValue(Value op);

}
