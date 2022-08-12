package Algrorithm.Vol.VI_brand_and_bound.knapsack;

public class Element implements Comparable{
    int id;
    double d;
    public Element(int id, double d) {
        this.id = id;
        this.d = d;
    }
    @Override
    public int compareTo(Object x) {
        double xd=((Element)x).d;
        if(d<xd)return -1;
        if(d==xd)return 0;
        return 1;
    }
    public  boolean equals(Object x){
        return d==((Element)x).d;
    }
}
