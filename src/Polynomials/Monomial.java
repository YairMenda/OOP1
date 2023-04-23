package Polynomials;

import Scalars.NewInteger;
import Scalars.NewRational;
import Scalars.NewScalar;

public class Monomial
{
    private int exponent;
    private NewScalar coefficient;
    public Monomial(int e, NewScalar s) {
        this.exponent = e;
        this.coefficient = s;
    }

    public Monomial add(Monomial m)
    {
        return new Monomial(this.exponent,this.coefficient.scalarAdd(m.getCoefficient()));
    }
/*    public Monomial add(int n, NewInteger i)
    {
        if(this.getExponent() == n)
        {
            return new Monomial(this.getExponent(), i.scalarAdd(this.getCoefficient()));
        }
        return null;
    }
    public Monomial add(int n, NewRational r)
    {
        if(this.getExponent() == n)
        {
            return new Monomial(this.getExponent(), r.scalarAdd(this.getCoefficient()));
        }
        return null;
    }*/

    public Monomial mul(Monomial m)
    {
        return new Monomial(this.getExponent()+m.getExponent(),this.getCoefficient().scalarMul(m.getCoefficient()));
    }

    public NewScalar evaluate(NewScalar s)
    {
        return this.evaluate(s);
    }
    public NewScalar evaluate(NewInteger n)
    {
        return n.scalarPower(this.getExponent()).scalarMul(this.getCoefficient());
    }
    public NewScalar evaluate(NewRational r)
    {
        return r.scalarPower(this.getExponent()).scalarMul(this.getCoefficient());
    }
    public Monomial derivative()
    {
        return new Monomial(this.getExponent()-1,this.getCoefficient().scalarMul(new NewInteger(this.getExponent())));
    }
    public int sign()
    {
        return this.getCoefficient().sign();
    }
    public boolean equals(Object o)
    {
        return this.equals(o);
    }
    public boolean equals(Monomial m)
    {
        return this.getCoefficient().equals(m.getCoefficient()) && this.getExponent() == m.getExponent();
    }

    public String toString()
    {
        return this.getCoefficient() + "X^" + this.getExponent();
    }
    public NewScalar getCoefficient() {
        return coefficient;
    }
    public int getExponent()
    {
        return this.exponent;
    }
}
