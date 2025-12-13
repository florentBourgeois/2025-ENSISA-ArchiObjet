package OperationsMath;

import OperationsMath.composite.Moins;
import OperationsMath.composite.Mult;
import OperationsMath.composite.Operation;
import OperationsMath.composite.Plus;

public class Main {

    public static void main(String[] args) {
        Element v3 = new Value(3);
        Element v2 = new Value(2);
        Element v5 = new Value(5);
        Element v6 = new Value(6);

        Element plus = new Plus(v3, v2);
        Element plus2 = new Plus(v5, v6);

        Element moins = new Moins(plus,plus2);

        Element mult = new Mult(new Value(3), moins);

        Operation mult2 = new Mult(mult, v3);
        mult2.b = mult2;

        System.out.print("Affichage de mult : " + mult2.eval());


    }

}
