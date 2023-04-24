package Tests;

import Polynomials.Monomial;
import Scalars.NewInteger;
import Scalars.NewRational;
import Scalars.Scalar;

public class MonomialTests
{
    private Monomial obj;
    //Before
    public void initTest(int exponent, Scalar s)
    {
        obj = new Monomial( exponent , s );
    }
    //Test
    public void addTestMonomial()
    {
        Monomial toadd = new Monomial(2 ,new NewInteger(7));
        System.out.println("should print 7X^2 + " + obj + " equals ? " + obj.add(toadd));
    }
    //Test
    public void mulTestMonomial()
    {
        Monomial tomul = new Monomial(2, new NewInteger(7));
        System.out.println("should print 7X^2 * " + obj + " equals ? " + obj.mul(tomul));
    }

    //Test
    public void derivativeTestMonomial()
    {
        System.out.println("should print the exponent * " + obj +  " equals ? " + obj.derivative());
    }

    //Test
    public void evaluateTestMonomial()
    {
        System.out.println("should print the obj while set 4 to  " + obj.evaluate(new NewInteger(4)));
    }
    public void equalsTestMonomial()
    {
        Monomial isEqual = new Monomial(2 , new NewInteger(5));
        System.out.println("should print true if the to Monomials are equals " + obj.equals(isEqual));
    }

    //NO NEED FOR AFTER
}
