package Tests;

import Polynomials.Polynomial;
import Scalars.NewInteger;
import Scalars.NewRational;
import Scalars.Scalar;

public class PolynomialTests
{
    private Polynomial p;
    public void initTest()
    {
        p = Polynomial.build("8 1 2");
    }
    public void addPolTest()
    {
        Polynomial polToAdd = Polynomial.build("2 2 -1");
        Polynomial polToAdd2 = Polynomial.build("4 2/3 -4");
        System.out.println("(" + p.toString() + ")" + " + " + "(" + polToAdd.toString() + ")" + " = " + p.add(polToAdd));
        System.out.println("(" + p.toString() + ")" + " + " + "(" + polToAdd2.toString() + ")" + " = " + p.add(polToAdd2));
    }

    public void mulPolTest()
    {
        Polynomial polToMul = Polynomial.build("2 2 -1");
        Polynomial polToMul2 = Polynomial.build("3/4 4 -4");
        System.out.println("(" + p.toString() + ")" + " * " + "(" + polToMul.toString() + ")" + " = " + p.mul(polToMul));
        System.out.println("(" + p.toString() + ")" + " * " + "(" + polToMul2.toString() + ")" + " = " + p.mul(polToMul2));
    }

    public void scalarEvaluateTest()
    {
        Scalar s1 = new NewInteger(2);
        Scalar s2 = new NewRational(3,4);
        System.out.println("Evaluating polynom " + p.toString() + " with " + s1.toString() + " = " + p.evaluate(s1));
        System.out.println("Evaluating polynom " + p.toString() + " with " + s2.toString() + " = " + p.evaluate(s2));
    }

    public void derivativeTest()
    {
        Polynomial p1 = Polynomial.build("18 6 7 2 -9 3");
        System.out.println("derivativing " + p.toString() + " = " + p.derivative());
        System.out.println("derivativing " + p1.toString() + " = " + p1.derivative());
    }

    public void equalsTest()
    {
        Polynomial p1 = Polynomial.build("18 6 7 2 -9 2");
        Polynomial p2 = Polynomial.build("36/2 18/3 14/2 2 -9 6/3");
        System.out.println(p.toString() + " equals " + p1.toString() + " ? " + p.equals(p1));
        System.out.println(p1.toString() + " equals " + p2.toString() + " ? " + p1.equals(p2));
    }

    public void toStringTest()
    {
        Polynomial p1 = Polynomial.build("-9/2 -18/2 19 4");
        Polynomial p2 = Polynomial.build("8 -7 2 5 28/5");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p.toString());
    }
}
