package Algrorithm.Vol.VI_brand_and_bound;
import java.util.LinkedList;
import java.util.Queue;

public class Loading {
    static int n;
    static int bestw;
    static  int c;
    static int[] w;
    static Queue<QNode> queue;
    static int[] bestx;
    static QNode bestE;
    static int wt=0;
    static int[] bestrest;

    private static class QNode {
        QNode parent;
        boolean leftchild;
        int weight;
        QNode(QNode Parent,boolean Leftchild, int Weight){
            parent=Parent;
            leftchild=Leftchild;
            weight=Weight;
        }

    }
    public static void enQueue(int wt, int i, QNode parent, boolean leftchild){
        if(i==n){
            if(wt==bestw){
                bestE=parent;
                bestx[n]=(leftchild)?1:0;
            }
            return;
        }
        QNode b=new QNode(parent,leftchild,wt);
        queue.add(b);
    }
    public Loading(int n, int w[], int c){
        this.n=n;
        this.c =c;
        this.w=w;
        this.bestx=new int[n+1];
        this.bestrest=new int[n+1];
    }
    static void maxLoading(){
        //初始化
        int n=w.length-1;
        QNode A=new QNode(null, true, 0);
        QNode e=A;
        bestw=0;
        queue=new LinkedList<QNode>();
        queue.add(null);
        int res=0;//剩余集装箱重量
        for (int i = 0; i < n; i++) {
            res+=w[i];
        }
        int ew=0;
        int label=1;
        while(true){
            wt=ew+w[label];
            if(wt<=c){
                if(wt>bestw){
                    bestw=wt;
                }
                enQueue(wt,label, e, true);
            }
            if (ew+res>bestw)
                enQueue(ew,label,e,false);
            e= queue.remove();
            if(e==null){
                if(queue.isEmpty())break;
                queue.add(null);
                e=queue.remove();
                label++;
                res-=w[label];
            }
            ew=e.weight;
        }
        for (int j = n - 1; j > 0; j--) {
            bestx[j] = (bestE.leftchild) ? 1 : 0;
            bestE = bestE.parent;
        }
        for (int j = n - 1; j > 0; j--) {
            bestrest[j] = (bestx[j]==1) ? 0 : 1;
        }
    }
    public static  void main(String args[]){
        int n=5;
        int c=120;//船1承载重量
        int[] w= {0,60,40,10,30,50};//集中箱i的重量
        Loading loading=new Loading(n,w,c);
        loading.maxLoading();
        System.out.println("船1最优装载量："+Loading.bestw);
        System.out.println("船一载货情况：");
        for(int i=1;i<=n;i++)
            System.out.println("货物"+i+"的装载量为："+Loading.bestx[i]);
        System.out.println("船二载货情况：");
        for(int i=1;i<=n;i++)
            System.out.println("货物"+i+"的装载量为："+Loading.bestrest[i]);
    }
}
