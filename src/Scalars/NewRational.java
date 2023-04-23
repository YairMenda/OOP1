package Scalars;

import java.sql.SQLOutput;

public class NewRational implements NewScalar
{
    private int numerator;
    private int denominator;
    public NewRational(int n , int d)
    {
        numerator = n;
        denominator = d;
    }
    public int getNumerator()
    {
        return this.numerator;
    }

    public int getDenominator()
    {
        return  this.denominator;
    }
    public double getValue()
    {
        return this.getNumerator()/this.getDenominator();
    }
    public NewRational scalarAdd(NewScalar s)
    {
        return this.scalarAdd(s);
    }
    public NewRational scalarAdd(NewInteger s)
    {
        return new NewRational(this.getNumerator()+(this.getDenominator()*s.getValue()),this.getDenominator());
    }
    public NewRational scalarAdd(NewRational s)
    {
        return new NewRational(this.getNumerator()*s.getDenominator()+this.getDenominator()*s.getNumerator(),this.getDenominator()*s.getDenominator());
    }
    public NewRational scalarMul(NewScalar s)
    {
        return this.scalarMul(s);
    }
    public NewRational scalarMul(NewInteger s)
    {
        return new NewRational(this.getNumerator()*s.getValue(),this.getDenominator());
    }
    public NewRational scalarMul(NewRational s)
    {
        return new NewRational(this.getNumerator()*s.getNumerator(),this.getDenominator()*s.getDenominator());
    }
    public NewRational scalerNeg()
    {
        return new NewRational(this.getNumerator()*(-1),this.getDenominator());
    }
    public NewRational scalarPower(int exponent)
    {
        return new NewRational((int)Math.pow(this.getNumerator(),exponent),(int)Math.pow(this.getDenominator(),exponent));
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
        return this.equals(o);
    }
    public boolean equals(NewInteger o)
    {
        return (this.getValue() == (double)o.getValue());
    }
    public boolean equals(NewRational o)
    {
        return this.getValue() == o.getValue();
    }

    public int gcd(int m , int n)
    {
        int r = m%n;
        while(r != 0)
        {
            m = n;
            n = r;
            r = m%n;
        }
        return Math.abs(n);
    }
    public NewRational rationalReduce()
    {
        int gcd = gcd(this.getNumerator(),this.getDenominator());
        return new NewRational(this.getNumerator() / gcd, this.getDenominator() / gcd);
    }
    public String toString()
    {
        NewRational res = this.rationalReduce();
        if(res.getDenominator() == 1)
        {
            return res.getNumerator()+"";
        }
        if(res.getDenominator() == -1)
        {
            return (-1)*res.getNumerator()+"";
        }
        return res.getNumerator() + "/" + res.getDenominator();
    }
}
