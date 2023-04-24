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
    public void powerTestRational()
    {
        System.out.println("should print  " + obj.getValue() +"^"+ 2 +" equals ? " + obj.scalarPower(2));
    }

    //Test
    public void signTestRational()
    {
        System.out.println("should print 1 if positive 0 if 0 -1 is negative " + " equals ? " + obj.sign());
    }
    //Test
    public void equalsTestRational()
    {
        System.out.println("should print true if " + obj.getValue() + " equals  " + 3 +"/" + 4 + obj.equals(new NewRational(3 ,4)));
    }
}
