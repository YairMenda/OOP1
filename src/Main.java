import Polynomials.Monomial;
import Scalars.NewInteger;
import Scalars.NewRational;
import Scalars.NewScalar;

public class Main {
    public static void main(String[] args)
    {
        NewInteger n1 = new NewInteger(5);
        NewRational n2 = new NewRational(12,-4);
/*        System.out.println(n1.scalarAdd(n2));
        System.out.println(n1.scalarMul(n2));
        System.out.println(n1.scalerNeg());
        System.out.println(n2.scalarPower(3));
        System.out.println(n1.sign());
        System.out.println(n2.equals(new NewInteger(3)));
        System.out.println(n2.scalerNeg());
        System.out.println(n2);
        System.out.println(n2.equals(new NewInteger(-3)));*/

        Monomial m1 = new Monomial(2,n1);
        Monomial m2 = new Monomial(2,n2);
/*        System.out.println(m1.add(m2));
        System.out.println(m1.mul(m2));
        System.out.println(m1.evaluate(new NewInteger(3)));
        System.out.println(m2.evaluate(new NewRational(3,1)));
        System.out.println(m2.derivative());
        System.out.println(m1.derivative());
        System.out.println(m1.equals(m2));
        System.out.println(m1);
        System.out.println(m2);*/
    }
}