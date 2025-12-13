package OperationsMath;

import OperationsMath.composite.Moins;
import OperationsMath.composite.Mult;
import OperationsMath.composite.Plus;
import OperationsMath.visitor.VisitorLaTeX;
import OperationsMath.visitor.VisitorMathInfixe;
import OperationsMath.visitor.VisitorMathPrefixe;
import OperationsMath.visitor.VisitorOperation;

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

        // ATTENTION BOUCLE
        //Operation mult2 = new Mult(mult, v3);
        //mult2.b = mult2;

        System.out.print("Affichage de mult : " + mult.eval());


        VisitorOperation v = new VisitorMathInfixe();
        v.reset();
        mult.accept(v);
        System.out.println("\nL'opération infixee est : " + v.getResult());

        v = new VisitorMathPrefixe();
        v.reset();
        mult.accept(v);
        System.out.println("L'opération prefixee est : " + v.getResult());

        v = new VisitorLaTeX();
        v.reset();
        mult.accept(v);
        System.out.println("L'opération LaTeX est : " + v.getResult());
    }

}
