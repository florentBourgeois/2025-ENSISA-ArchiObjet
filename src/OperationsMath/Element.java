package OperationsMath;

import OperationsMath.visitor.VisitorOperation;

public interface Element {

    public int eval();

    public void accept(VisitorOperation v);

}
