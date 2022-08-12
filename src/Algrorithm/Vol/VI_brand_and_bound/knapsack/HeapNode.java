package Algrorithm.Vol.VI_brand_and_bound.knapsack;

public class HeapNode {
    BBnode liveNode;
    double upperProfit;
    double profit;
    double weight;
    int level;
    public HeapNode(BBnode liveNode, double upperProfit, double profit, double weight, int level) {
        this.liveNode = liveNode;
        this.upperProfit = upperProfit;
        this.profit = profit;
        this.weight = weight;
        this.level = level;
    }
    public int compareTo(Object x){
        double xup=((HeapNode) x).upperProfit;
        if(upperProfit<xup)return -1;
        if(upperProfit==xup)return 0;
        return 1;
    }
}
