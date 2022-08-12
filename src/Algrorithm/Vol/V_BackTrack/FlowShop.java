package Algrorithm.Vol.V_BackTrack;


public class FlowShop {
    static int n,
            f1,
            f,
            bestf;
    static int[][] m;
    static int[] x,
            bestx,
            f2;

    public static void backtrack(int i) {
        if (i > n) {
            for (int j = 1; j <= n; j++)
                bestx[j] = x[j];
            bestf = f;
        } else {
            for (int j = i; j <= n; j++) {
                f1 += m[x[j]][1];
                f2[i] = (Math.max(f2[i - 1], f1)) + m[x[j]][2];
                f += f2[i];
                if (f < bestf) {
                    swap(x, i, j);
                    backtrack(i + 1);
                    swap(x, i, j);
                }
                f1 -= m[x[j]][1];
                f -= f2[i];
            }
        }
    }

    //交换元素的值
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[][] m1 = {
                {0, 0, 0},
                {0, 3, 5},
                {0, 6, 1},
                {0, 5, 2},
                {0, 4, 4},
                {0, 3, 2},
        };
        n = m1.length - 1;
        m = m1;
        x = new int[m1.length];
        bestx = new int[m1.length];
        f2 = new int[m1.length];
        f1 = 0;
        bestf = 9999;//尽量大，因为后面要递归赋实际值，如果不初始化执行不了
        f = 0;
        //初始化x[i]为递增排序
        for (int i = 1; i <= n; i++) {
            x[i] = i;
        }
        backtrack(1);
        System.out.println("最优批处理作业调度顺序为：");
        for (int i = 1; i <= n; i++) {
            System.out.print(bestx[i] + " ");
        }
        System.out.println();
        System.out.println("最优调度所需的最短时间为：" + bestf);
    }
}
