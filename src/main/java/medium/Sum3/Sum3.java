package medium.Sum3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sum3 {


    public static void main(String arg[]) {
        //  Sum3.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        //   Sum3.threeSum(new int[]{3,-2,1,0});
        Sum3.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        // Sum3.threeSum(new int[]{3,-2,1,0});
        //   Sum3.threeSum(new int[]{0,0,0});
        //Sum3.threeSum(new int[]{-1, 0, 1, 2, -1, -4, -2, -3, 3, 0, 4});
    }

    public static List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        Set<List<Integer>> threeSum = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                int count = nums[left] + nums[right] + nums[i];
                if (count == 0) {
                    threeSum.add(Arrays.asList(nums[left], nums[right], nums[i]));
                    left++;
                    right--;
                } else if (count < 0) {
                    left++;
                } else {
                    right--;
                }

            }

        }
        return new ArrayList<>(threeSum);
    }

   /* public static List<List<Integer>> threeSum(int[] nums) {

        Set <List<Integer>> exit = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                for (int k = 0; k < nums.length; k++) {

                    int one = nums[i];
                    int two = nums[j];
                    int tree = nums[k];

                    if (one + two + tree == 0 && (i !=j && i!=k && j!=k)){
                        List<Integer> list = Arrays.asList(one, two, tree);
                        Collections.sort(list);
                        exit.add(list);

                    }
                }

            }

        }
        return new ArrayList<>(exit);


    }*/

//    public static List<List<Integer>> threeSum(int[] nums) {
//
//        Arrays.sort(nums);
//        Set<List<Integer>> threeSum = new HashSet<>();
//
//        for(int i = 0; i < nums.length - 2; i++){
//            int j = i + 1;
//            int k = nums.length - 1;
//            while(j < k){
//                int sum = nums[i] + nums[j] + nums[k];
//
//                if(sum == 0){
//                    List<Integer> temp = new ArrayList<>();
//                    temp.add(nums[i]);
//                    temp.add(nums[j]);
//                    temp.add(nums[k]);
//                    threeSum.add(temp);
//                    j++;
//                    k--;
//                }else if(sum > 0){
//                    k--;
//                }else{
//                    j++;
//                }
//            }
//        }
//
//        return new ArrayList<>(threeSum);
//    }

}
