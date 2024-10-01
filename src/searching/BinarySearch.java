package searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,3,4,10,40};
        int length = arr.length;
        int element = 40;
        int index = binarySearchAlgo(arr,0,length-1,element);
        if (index == -1){
            System.out.println("Element is not present");
        }else{
            System.out.println("Element is present at "+index);
        }
    }
    private static int binarySearchAlgo(int[] arr,int left, int right, int element){
        while (left <= right){
            int mid = (left+right)/2;
            if (arr[mid] == element){
                return mid;
            } else if (arr[mid] > element) {
                right = mid -1;
            }else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
