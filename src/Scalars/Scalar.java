package Scalars;

public interface Scalar
{
    Scalar scalarAdd(Scalar s);
    Scalar scalarAdd(NewInteger s);
    Scalar scalarAdd(NewRational s);
    Scalar scalarMul(Scalar s);
    Scalar scalarMul(NewInteger s);
    Scalar scalarMul(NewRational s);
    Scalar scalarNeg();
    Scalar scalarPower(int exponent);
    int sign();

    boolean equals(Object o);

}
