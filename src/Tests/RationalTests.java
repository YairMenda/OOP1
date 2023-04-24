package Tests;

import Scalars.NewInteger;
import Scalars.NewRational;
import Scalars.Scalar;

public class RationalTests {
    private NewRational obj;
    //Before
    public void initTest(int value1, int value2)
    {
        obj = new NewRational(value1 , value2);
    }
    //Test
    public void addTestRational()
    {
        Scalar toadd = new NewInteger(7);
        System.out.println("should print 7 + " + obj.getValue() + " equals ? " + obj.scalarAdd(toadd));
    }
    //Test
    public void mulTestRational()
    {
        Scalar tomul = new NewRational(1 , 2);
        System.out.println("should print 1/2  * " + obj.getValue() + " equals ? " + obj.scalarMul(tomul));
    }

    //Test
    public void negTestRational()
    {
        System.out.println("should print -" + obj.getValue() + "  equals ? " + obj.scalarNeg());
    }

    //Test
    public void powerTestRational(int exponent)
    {
        System.out.println("should print  " + obj.getValue() +"^"+ exponent +" equals ? " + obj.scalarPower(exponent));
    }

    //Test
    public void signTestRational(int exponent)
    {
        System.out.println("should print 1 if positive 0 if 0 -1 is negative " + " equals ? " + obj.sign());
    }
    //Test
    public void equalsTestRational(int value1 , int value2)
    {
        System.out.println("should print true if " + obj.getValue() + " equals  " + value1 +"/" + value2 + obj.equals(new NewRational(value1 , value2)));
    }
}
