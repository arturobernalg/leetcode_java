package easy.ClimbingStairs;

public class ClimbingStairs {

    public static void main(String arg[]) {
            ClimbingStairs.climbStairs(2);
    }

    public static int climbStairs(int n) {

        int n1=0,n2=1,n3=0;
        if(n>0){
            for (int i = 0; i < n; i++) {
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
            }
        }
        return n3;

       /* if (n <= 0) {
            return 0;
        }
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];*/


    }
}
