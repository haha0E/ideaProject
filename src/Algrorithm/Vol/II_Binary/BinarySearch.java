package Algrorithm.Vol.II_Binary;

public class BinarySearch {
    public static void main(String[] args) {
        int[] n={1, 8, 12, 15, 16, 21, 30, 35, 39};
        int[] i=BinarySearch(n,30);
        if(i[0]!=-1)
            System.out.println("找到此元素的下标为" + i[0]);
        else
            System.out.println("无此元素");
        System.out.println();
        i=BinarySearch(n,20);
        if(i[0]!=-1)
            System.out.println("找到此元素的下标为" + i);
        else
            System.out.println("无此元素");
        System.out.println();
        i=BinarySearch(n,10);
        if(i[0]!=-1)
            System.out.println("找到此元素的下标为" + i);
        else
            System.out.println("找不到此元素"+"\n小于x的最大元素位置为 "+(i[2]+1)+"\n大于x的最小元素位置为 "+(i[1]+1));

    }
    public static int[] BinarySearch(int[] n,int index){
        int mid=(n.length-1)/2;
        int left=0;
        int right=n.length-1;
        while(left<right){
            if(n[mid]==index){
                return new int[]{mid, mid, mid};
            }
            else if(n[mid]<index){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
            mid=(left+right)/2;
        }
        return new int[]{-1, left, right};
    }

}