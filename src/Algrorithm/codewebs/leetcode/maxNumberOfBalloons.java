package Algrorithm.codewebs.leetcode;

public class maxNumberOfBalloons {
    public static void main(String[] args) {

    }

    public int maxNumberOfBalloons(String text) {
        char[] x = text.toCharArray();
        int n = x.length;
        int[] balloon = new int[5];
        for (int i = 0; i < n; i++) {
            switch (x[i]) {
                case 'b' :
                    balloon[0]++;
                    break;
                case 'a' :
                    balloon[1]++;
                    break;
                case 'l':
                    balloon[2]++;
                    break;
                case 'o':
                    balloon[3]++;
                    break;
                case 'n':
                    balloon[4]++;
                    break;
            }
        }
        balloon[2]/=2;
        balloon[3]/=2;
        int ans=Integer.MAX_VALUE;
        for (int temp:
                balloon) {
            if(temp<ans){
                ans=temp;
            }
        }
        return ans;
    }
}
