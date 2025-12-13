package OperationsMath.visitor;

import OperationsMath.Value;
import OperationsMath.composite.Div;
import OperationsMath.composite.Moins;
import OperationsMath.composite.Mult;
import OperationsMath.composite.Plus;

public interface VisitorOperation {

    StringBuffer visitePlus(Plus op);
    StringBuffer visiteMult(Mult op);
    StringBuffer visiteMoins(Moins op);
    StringBuffer visiteDiv(Div op);
    StringBuffer visiteValue(Value op);

}
