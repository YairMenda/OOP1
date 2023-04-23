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
       return s.scalarAdd(this);
    }
    public NewScalar scalarAdd(NewInteger s)
    {
        return new NewInteger(this.getValue() + s.getValue());
    }
    public NewScalar scalarAdd(NewRational s)
    {
        return new NewRational((this.getValue() *s.getDenominator() + s.getNumerator()), s.getDenominator());
    }

    public NewScalar scalarMul(NewScalar s)
    {
        return s.scalarMul(this);
    }
    public NewScalar scalarMul(NewInteger s)
    {
        return new NewInteger(this.getValue() * s.getValue());
    }
    public NewScalar scalarMul(NewRational s)
    {
        return new NewRational((this.getValue() * s.getNumerator()),s.getDenominator());
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

    public boolean equals(Object o) {
        if (o instanceof NewInteger)
            return this.getValue() == ((NewInteger) o).getValue();
        else if (o instanceof NewRational) {
            return this.getValue() == ((NewRational) o).getValue();
        }
        return false;
    }
    public String toString()
    {
        return ""+this.getValue();
    }
}
