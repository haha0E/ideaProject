package Algrorithm.Vol.VI_brand_and_bound.knapsack;

public class BBnode {
    BBnode parent;
    boolean leftchild;
    public BBnode(BBnode parent,boolean leftchild){
        this.leftchild=leftchild;
        this.parent=parent;
    }
}
