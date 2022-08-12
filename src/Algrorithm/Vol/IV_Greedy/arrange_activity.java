package Algrorithm.Vol.IV_Greedy;

public class arrange_activity {
    public static void main(String[] args) {
        int[] s= {0,2,1,6,7,11,6,4,14,10,18,16,7};
        int[] e= {0,4,5,9,10,14,15,16,17,19,22,23,25};
        boolean[] a=new boolean[13];
        ActivitySelection(s,e,a);
        System.out.println("最优解为");
        for(int i=1;i<a.length;i++){
            if(a[i])
                System.out.print(i+" ");
        }
    }

    /**
     * 贪心解决
     * @param s 活动i的起始时间是s[i]
     * @param e 活动i的结束时间是e[i]
     * @param a 活动i有没有被安排上，安排上a[i]为true，否则为false
     */
    public static void ActivitySelection(int[] s,int[] e,boolean[] a){
        int n= e.length;
        int i=1;
        int j=0;
        a[0]=true;
        int count=1;//计数，可以之后通过对数组a的遍历代替
        for(;i<n;i++){
            if(s[i]<e[j]){
                a[i]=false;
            }else{
                a[i]=true;
                j=i;
                count++;
            }
        }
    }
}