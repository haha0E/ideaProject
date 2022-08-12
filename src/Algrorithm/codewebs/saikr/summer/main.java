package Algrorithm.codewebs.saikr.summer;

import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.exit;

public class main {
    private static int N = 1_000_005;
    private static int n,m;
    private static int ans = 0;
    private static int[] size = new int[N];
    private static int[] fa = new int[N];//b[i]表示二进制下的第i位
    private static int find(int x){
        if(fa[x]==x)return fa[x];
        fa[x]=find(fa[x]);
        size[fa[x]]+=size[x];
        size[x]=0;
        return fa[x];
    }
    private static void merge(int x,int y){
        int fx=find(x),fy=find(y);
        if(fx!=fy){
            size[fx]+=size[fy];size[fy]=0;
            fa[fy]=fx;
        }
    }
    //以上是并查集
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        ans = 0;
        for (int i = 1; i <= 2 * n; i++) fa[i] = i;
        for (int i = 1; i <= n; i++) size[i] = 0;
        for (int i = 1 + n; i <= 2 * n; i++) size[i] = 1;//预处理
        for (int i = 1; i <= m; i++) {
            int x = scanner.nextInt(), y = scanner.nextInt();
            int fx = find(x), fy = find(y), fxn = find(x + n), fyn = find(y + n);//假定x,y表示坏人，x+n,y+n表示好人
            String ch;
            ch = scanner.next();

            if (ch.equals("good")) {

                merge(fxn,fyn);
                merge(fx,fy);//如果x说y是好人，则x,y要么同时是好人，要么同时是坏人
            } else {
                merge(fx,fyn);
                merge(fxn,fy);//如果x说y是坏人，则x,y一定有一好一坏的情况
            }
        }
        for (int i = 1; i <= n; i++) {
            if (find(i)==find(i+n)) {
                System.out.println(-1);
                exit(0);
            }//如果出现了i既是好人又是坏人的情况，则无解
        }
        for (int i = 1; i <= n; i++) {
            ans += Math.max(size[find(i+n)], size[find(i)]);//统计答案 ,取max是因为贪心取最大就好，因为两个不同条件的成立带来的影响是不一样的
            size[find(i)] = size[find(i + n)] = 0;//注意清0，因为之前已经统计过答案了
        }
        System.out.println(ans);
    }
}
