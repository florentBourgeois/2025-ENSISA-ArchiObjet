package OperationsMath;

import OperationsMath.visitor.VisitorOperation;

public class Value implements  Element{

    public int valeur;

    public Value(int valeur) {
        this.valeur = valeur;
    }

    @Override
    public int eval() {
        return valeur;
    }

    @Override
    public void accept(VisitorOperation v) {
        v.visiteValue(this);
    }

    public static void main(String[] args) {
        Element e = new Value(5);
        System.out.println(e.eval());
    }

}
