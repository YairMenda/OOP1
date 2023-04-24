package Polynomials;

import Scalars.NewInteger;
import Scalars.Scalar;

public class Monomial
{
    private int exponent;
    private Scalar coefficient;
    public Monomial(int e, Scalar s) {
        this.exponent = e;
        this.coefficient = s;
    }

    public Monomial add(Monomial m)
    {
        if(this.getExponent() == m.getExponent())
           return new Monomial(this.exponent,this.coefficient.scalarAdd(m.getCoefficient()));
        return null;
    }

    public Monomial mul(Monomial m)
    {
        return new Monomial(this.getExponent()+m.getExponent(),this.coefficient.scalarMul(m.getCoefficient()));
    }

    public Scalar evaluate(Scalar s)
    {
        return s.scalarPower(this.getExponent()).scalarMul(this.getCoefficient());
    }
    public Monomial derivative()
    {
        if (this.getExponent() == 0)
            return new Monomial(this.getExponent(),new NewInteger(0));

        return new Monomial(this.getExponent()-1,this.getCoefficient().scalarMul(new NewInteger(this.getExponent())));
    }
    public int sign()
    {
        return this.getCoefficient().sign();
    }
    public boolean equals(Object o)
    {
        if (o instanceof Monomial) {
            return (this.getExponent() == ((Monomial)o).getExponent() &&
                    this.getCoefficient().equals(((Monomial)o).getCoefficient()));
        }

        return false;
    }
    public String toString()
    {
        if(this.getCoefficient().equals(new NewInteger(0)))
        {
            return "";
        }
        if(this.getCoefficient().equals(new NewInteger(1)))
        {
            if(this.getExponent() == 1)
                return "X";
            else if(this.getExponent() == 0)
            {
                return this.getCoefficient().toString();
            }
            else
                return "X^" + this.getExponent();
        }
        if(this.getCoefficient().equals(new NewInteger(-1)))
        {
            if(this.getExponent() == 1)
                return "-X";
            else if(this.getExponent() == 0)
            {
                return this.getCoefficient().toString();
            }
            else
                return "-X^" + this.getExponent();
        }
        if(this.getExponent() == 0)
            return this.getCoefficient().toString();
        if(this.getExponent() == 1)
            return this.getCoefficient() + "X";

        return this.getCoefficient().toString() + "X^" + this.getExponent();
    }
    public Scalar getCoefficient() {
        return coefficient;
    }
    public int getExponent()
    {
        return this.exponent;
    }
}
