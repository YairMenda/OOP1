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
        System.out.println("should print 7^2 + " + obj + " equals ? " + obj.add(toadd));
    }
    //Test
    public void mulTestMonomial()
    {
        Scalar tomul = new NewRational(1 , 2);
        System.out.println("should print 1/2  * " + obj.getValue() + " equals ? " + obj.scalarMul(tomul));
    }

    //Test
    public void negTestMonomial()
    {
        System.out.println("should print -" + obj.getValue() + "  equals ? " + obj.scalarNeg());
    }

    //Test
    public void powerTestMonomial(int exponent)
    {
        System.out.println("should print  " + obj.getValue() +"^"+ exponent +" equals ? " + obj.scalarPower(exponent));
    }

    //Test
    public void signTestMonomial(int exponent)
    {
        System.out.println("should print 1 if positive 0 if 0 -1 is negative " + " equals ? " + obj.sign());
    }
    //Test
    public void equalsTestMonomial(int value)
    {
        System.out.println("should print true if " + obj.getValue() + " equals  " + value + obj.equals(new NewInteger(value)));
    }

    //NO NEED FOR AFTER
}
