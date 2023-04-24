import Polynomials.Monomial;
import Polynomials.Polynomial;
import Scalars.NewInteger;
import Scalars.NewRational;
import Scalars.Scalar;
import Tests.IntegerTests;
import Tests.MonomialTests;
import Tests.PolynomialTests;
import Tests.RationalTests;

public class Main {
    public static void main(String[] args)
    {
/*        Scalar n1 = new NewInteger(2);
        Scalar n2 = new NewRational(12,-4);
        System.out.println(n1.scalarAdd(n2));
        System.out.println(n1.scalarMul(n2));
        System.out.println(n1.scalarNeg());
        System.out.println(n2.scalarPower(3));
        System.out.println(n1.sign());
        System.out.println(n2.equals(new NewInteger(3)));
        System.out.println(n2.scalarNeg());
        System.out.println(n2);
        System.out.println(n2.equals(new NewInteger(-3)));

        Monomial m1 = new Monomial(2,n1);
        Monomial m2 = new Monomial(2,n2);
        System.out.println(m1.add(m2));
        System.out.println(m1.mul(m2));
        System.out.println(m1.evaluate(new NewInteger(3)));
        System.out.println(m2.evaluate(new NewRational(3,1)));
        System.out.println(m2.derivative());
        System.out.println(m1.derivative());
        System.out.println(m1.equals(m2));
        System.out.println(m1);
        System.out.println(m2);

        Polynomial p1 = Polynomial.build("5 2 -1 2");
        Polynomial p2 = Polynomial.build("3 4 2");
        System.out.println(p1.add(p2));
        System.out.println(p1.mul(p2));
        System.out.println(p1.evaluate(n1));
        System.out.println(p1.derivative());
        System.out.println(p2.derivative());
        System.out.println(p2);
        System.out.println(p1.equals(p2));
        System.out.println(p1);
        System.out.println(p2);
        p2 = Polynomial.build("5 2 -1 2");
        System.out.println(p1.equals(p2));
        System.out.println(p1);
        System.out.println(p2);*/

        IntegerTests it = new IntegerTests();
        MonomialTests mt = new MonomialTests();
        PolynomialTests pt = new PolynomialTests();
        RationalTests rt = new RationalTests();

        it.initTest(5);
        mt.initTest(3, new NewInteger(2));
        pt.initTest();
        rt.initTest(2,4);

        it.addTestInteger();
        it.mulTestInteger();
        it.negTestInteger();
        it.powerTestInteger();
        it.equalsTestInteger();
        it.signTestInteger();

        mt.addTestMonomial();
        mt.mulTestMonomial();
        mt.derivativeTestMonomial();
        mt.evaluateTestMonomial();
        mt.equalsTestMonomial();

        pt.addPolTest();
        pt.mulPolTest();
        pt.scalarEvaluateTest();
        pt.derivativeTest();
        pt.equalsTest();
        pt.toStringTest();

        rt.addTestRational();
        rt.mulTestRational();
        rt.negTestRational();
        rt.powerTestRational();
        rt.signTestRational();
        rt.equalsTestRational();
    }
}