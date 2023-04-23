package Scalars;

public interface NewScalar
{
    public NewScalar scalarAdd(NewScalar s);
    public NewScalar scalarMul(NewScalar s);
    public NewScalar scalerNeg();
    public NewScalar scalarPower(int exponent);
    public int sign();

    public boolean equals(Object o);

}
