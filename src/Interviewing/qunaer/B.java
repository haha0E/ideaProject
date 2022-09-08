package Interviewing.qunaer;

public class B {
    public static void main(String[] args) {
        System.out.println(Decrypt(4296,1601,4757));
    }
    public static int Decrypt(int encryptedNumber,int decryption,int number){
        int ans=qmi(encryptedNumber,decryption);
        ans=ans%number;
        return ans;
    }
    static int qmi(int a, int k) {
        int res = 1;
        while (k>0) {
            int x=k&1;
            if (x>0) res = res * a;
            k >>= 1;
            a = a * a;
        }
        return res;
    }
}
