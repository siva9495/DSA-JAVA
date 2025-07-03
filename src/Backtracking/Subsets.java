package Backtracking;

import java.util.*;

public class Subsets {

    static List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> resultList = new ArrayList<>();
        dfs(resultList,new ArrayList<>(),nums,0);
        return resultList;
    }

    static void dfs(List<List<Integer>> resultList, List<Integer> tempList, int[] nums, int start){
        resultList.add(new ArrayList<>(tempList));
        for (int i = start; i < nums.length; i++) {
            tempList.add(nums[i]);
            dfs(resultList,tempList,nums,i+1);
            tempList.remove(tempList.size() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        List<List<Integer>> answer = subsets(nums);
        for(List<Integer> subsets : answer){
            System.out.println(subsets);
        }
    }
}
