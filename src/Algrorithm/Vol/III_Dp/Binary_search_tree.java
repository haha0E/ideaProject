package Algrorithm.Vol.III_Dp;

public class Binary_search_tree {
    public static void main(String[] args) {
        //存取概率分布
        float[] a={2, 3, 1, 1, 1};
        float[] b={0, 3, 3, 1, 1};
        int na=a.length;
        int nb=b.length;
        int[][] s=new int[na+1][nb+1];
        float[][] m=new float[na+1][nb+1];
        float[][] w=new float[na+1][nb+1];
        int sum=16;//a0+b1+a1+...+bn+an
        /**
         * 求出存取概率
         */
        for(int i=0;i<na;i++){
            a[i]/=sum;
        }
        for(int i=0;i<nb;i++){
            b[i]/=sum;
        }
        bst(a,b,m,s,w);//找出最优二叉搜索树，结果存在数组s中
        //通过数组s输出树
        System.out.println("最优二叉搜索树的前序遍历：");
        beforeout(s,1,na-1);
        System.out.println();
        System.out.println("最优二叉搜索树的中序遍历：");
        midout(s,1,na-1);
    }

    /**
     * 找出最优二叉搜索树
     * @param a 叶结点存取概率分布
     * @param b 内部结点存取概率分布
     * @param m
     * @param s 最优结果
     * @param w a_0+b_1+……+b_n+a_n
     */
    public static void bst(float[] a,float[] b,float [][] m,int [][] s,float[][] w){
        int n=a.length-1;
        //边界条件
        for(int i=0;i<=n;i++){
            w[i+1][i]=a[i];
            m[i+1][i]=0;
        }
        //按状态转移方程自顶向下计算
        for(int r=0;r<n;r++){
            for(int i=1;i<=n-r;i++){
                int j=i+r;
                w[i][j]=w[i][j-1]+a[j]+b[j];
                m[i][j]=m[i+1][j];
                s[i][j]=i;
                for(int k=i+1;k<=j;k++){
                    float t=m[i][k-1]+m[k+1][j];
                    if(t<m[i][j]){
                        m[i][j]=t;
                        s[i][j]=k;
                    }
                    m[i][j]+=w[i][j];
                }
            }
        }
    }

    /**
     * 前序遍历搜索树
     * @param s
     * @param i
     * @param j
     */
    public static void beforeout(int[][] s,int i,int j){
        if(i<=j){
            int r=s[i][j];
            System.out.print("X"+r+" ");
            beforeout(s, i, r-1);
            beforeout(s,r+1,j);
        }
    }

    /**
     * 中序遍历搜索树
     * @param s
     * @param i
     * @param j
     */
    public static void midout(int[][] s,int i,int j){
        if(i<=j){
            int r=s[i][j];
            midout(s, i, r-1);
            System.out.print("X"+r+" ");
            midout(s,r+1,j);
        }
    }
}