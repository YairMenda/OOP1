package Scalars;
import static java.lang.Math.*;
public class NewInteger implements NewScalar
{
    private int number;

    public NewInteger(int n)
    {
        this.number = n;
    }
    public int getValue()
    {
        return this.number;
    }

    public NewScalar scalarAdd(NewScalar s)
    {
       return this.scalarAdd(s);
    }

    public NewInteger scalarAdd(NewInteger s)
    {
        return new NewInteger(this.getValue() + s.getValue());
    }
    public NewInteger scalarAdd(NewRational s)
    {
        return new NewInteger((this.getValue()*s.getDenominator() + s.getNumerator())/s.getDenominator());
    }

    public NewInteger scalarMul(NewScalar s)
    {
        return this.scalarMul(s);
    }
    public NewInteger scalarMul(NewInteger s)
    {
        return new NewInteger(this.getValue() * s.getValue());
    }
    public NewInteger scalarMul(NewRational s)
    {
        return new NewInteger((this.getValue() * s.getNumerator())/s.getDenominator());
    }
    public NewInteger scalerNeg()
    {
        return new NewInteger(this.getValue()*(-1));
    }

    public NewInteger scalarPower(int exponent)
    {
        return new NewInteger((int)Math.pow(this.getValue(),exponent));
    }
    public int sign()
    {
        if(this.getValue() > 0)
            return 1;
        if(this.getValue() < 0)
            return -1;
        return 0;
    }

    public boolean equals(Object o)
    {
        return o.equals(this);
    }
    public boolean equals(NewInteger n)
    {
        return this.getValue() == n.getValue();
    }
    public boolean equals(NewRational r)
    {
        return (double)this.getValue() == (double)(r.getNumerator()/r.getDenominator());
    }
    public String toString()
    {
        return ""+this.getValue();
    }
}
