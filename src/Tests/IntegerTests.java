package Tests;

import Scalars.NewInteger;
import Scalars.NewRational;
import Scalars.Scalar;

public class IntegerTests {
    private NewInteger obj;
    //Before
    public void initTest(int value)
    {
        obj = new NewInteger(value);
    }
    //Test
    public void addTestInteger()
    {
        Scalar toadd = new NewInteger(7);
        System.out.println("should print 7 + " + obj.getValue() + " equals ? " + obj.scalarAdd(toadd));
    }
    //Test
    public void mulTestInteger()
    {
        Scalar tomul = new NewRational(1 , 2);
        System.out.println("should print 1/2  * " + obj.getValue() + " equals ? " + obj.scalarMul(tomul));
    }

    //Test
    public void negTestInteger()
    {
        System.out.println("should print -" + obj.getValue() + "  equals ? " + obj.scalarNeg());
    }

    //Test
    public void powerTestInteger(int exponent)
    {
        System.out.println("should print  " + obj.getValue() +"^"+ exponent +" equals ? " + obj.scalarPower(exponent));
    }

    //Test
    public void signTestInteger(int exponent)
    {
        System.out.println("should print 1 if positive 0 if 0 -1 is negative " + " equals ? " + obj.sign());
    }
    //Test
    public void equalsTestInteger(int value)
    {
        System.out.println("should print true if " + obj.getValue() + " equals  " + value + obj.equals(new NewInteger(value)));
    }

    //NO NEED FOR AFTER
}
