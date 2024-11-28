package BinaryTree;

public class ImplementationOfBS {

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return arr[mid];
            }

            if(arr[mid] < target) {
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,5,8,10,12,14,15,17};
        int target = 15;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }
}
