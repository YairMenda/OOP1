package Polynomials;
import Scalars.NewInteger;
import Scalars.NewRational;
import Scalars.Scalar;

import java.util.*;
public class Polynomial {
 private TreeMap<java.lang.Integer,Monomial> treeMap;

 public Polynomial(TreeMap<java.lang.Integer,Monomial> t)
 {
     this.treeMap = t;
 }

 public Polynomial(List<Monomial> l)
 {
     this.treeMap = new TreeMap<java.lang.Integer, Monomial>();
     for (Monomial m : l)
     {
         if(this.treeMap.containsKey(m.getExponent()))
         {
             this.treeMap.put(m.getExponent(),this.treeMap.get(m.getExponent()).add(m));
         }
         else
         {
            this.treeMap.put(m.getExponent() , m);
         }
     }
 }
 public static Polynomial build(String input)
 {
     TreeMap<java.lang.Integer,Monomial> tr = new TreeMap<>();
     String[] arraybulid = input.split(" ");
     for (int i = 0 ; i< arraybulid.length; i++)
     {
         if(arraybulid[i].contains("/"))
         {
             String[] rational = arraybulid[i].split("/");
             tr.put(i,new Monomial(i,new NewRational(java.lang.Integer.parseInt(rational[0]), java.lang.Integer.parseInt(rational[1]))));
         }
         else
         {
             tr.put(i,new Monomial(i,new NewInteger(java.lang.Integer.parseInt(arraybulid[i]))));
         }
     }

     return  new Polynomial(tr);
 }
 public TreeMap<java.lang.Integer, Monomial> getTreeMap()
 {
     return this.treeMap;
 }
 public Polynomial add(Polynomial p)
 {
    List<Monomial> l = new LinkedList<Monomial>();
    l.addAll(this.treeMap.values());
    l.addAll(p.treeMap.values());

    return  new Polynomial(l);
 }

 public  Polynomial mul(Polynomial p)
 {
     List<Monomial> l = new LinkedList<Monomial>();

     for (Monomial m1: this.getTreeMap().values()) {
         for (Monomial m2 : p.getTreeMap().values()) {
             l.add(m1.mul(m2));
         }
     }
     return new Polynomial(l);
 }

 public Scalar evaluate(Scalar s)
 {
     Scalar result = new NewRational(0,1);

     for (Monomial m : this.getTreeMap().values())
         result = result.scalarAdd(m.evaluate(s));

     return result;
 }
 public Polynomial derivative()
 {
     List<Monomial> l = new LinkedList<Monomial>();

     for (Monomial m : this.getTreeMap().values())
         l.add(m.derivative());

     return new Polynomial(l);

 }

 public boolean equals(Object o)
 {
     if (o instanceof Polynomial)
     {
         if (((Polynomial)o).getTreeMap().size() == this.getTreeMap().size()) {
             for (int i = 0; i < this.getTreeMap().size(); i++) {
                 if (!(this.getTreeMap().get(i).equals(((Polynomial) o).getTreeMap().get(i))))
                     return false;
             }
             return true;
         }
         else
         {
            return false;
         }
     }

     return false;
 }
 public String toString()
 {

     String res = "";

     for(Monomial m: this.getTreeMap().values())
     {
         res +=  m.toString() + " ";
     }

     return res;
 }
}
