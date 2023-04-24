package Scalars;

public class NewInteger implements Scalar
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

    public Scalar scalarAdd(Scalar s)
    {
       return s.scalarAdd(this);
    }
    public Scalar scalarAdd(NewInteger s)
    {
        return new NewInteger(this.getValue() + s.getValue());
    }
    public Scalar scalarAdd(NewRational s)
    {
        return new NewRational((this.getValue() *s.getDenominator() + s.getNumerator()), s.getDenominator());
    }

    public Scalar scalarMul(Scalar s)
    {
        return s.scalarMul(this);
    }
    public Scalar scalarMul(NewInteger s)
    {
        return new NewInteger(this.getValue() * s.getValue());
    }
    public Scalar scalarMul(NewRational s)
    {
        return new NewRational((this.getValue() * s.getNumerator()),s.getDenominator());
    }
    public NewInteger scalarNeg()
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
