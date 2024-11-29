package BinaryTree;

public class SearchInsertPositonL35 {

    static int searchInsert(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start<=end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(arr[mid] > target){
                end = mid -1;
            }else {
                start = mid + 1;
            }
        }

        return start;
    }

    public static void main(String[] args) {
        int arr[] = {2,3,5,7,10,11,14,17};
        int target = 18;
        int ans = searchInsert(arr,target);
        System.out.println(ans);
    }
}
