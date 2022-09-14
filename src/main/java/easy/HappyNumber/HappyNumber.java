package easy.HappyNumber;

public class HappyNumber {

    public static void main(String arg[]) {
        assert HappyNumber.isHappy(19);
    }

    private static boolean isHappy(int n) {

        int sum=0;
        int rem;

        if(n==1) {
            return true;
        }
        if(n==7) {
            return true;
        }else if(n<10) {
            return false;
        }
        while(n!=0){
            rem=n%10;
            sum+=rem*rem;
            n= n/10;
        }
        return isHappy(sum);
    }
}
