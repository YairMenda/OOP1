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

    public Monomial mul(Monomial m)
    {
        return new Monomial(this.getExponent()+m.getExponent(),this.coefficient.scalarMul(m.getCoefficient()));
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
        if (o instanceof Monomial) {
            return (this.getExponent() == ((Monomial)o).getExponent() &&
                    this.getCoefficient().equals(((Monomial)o).getCoefficient()));
        }

        return false;
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
