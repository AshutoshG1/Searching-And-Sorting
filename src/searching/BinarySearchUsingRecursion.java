package searching;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {2,3,4,10,40};
        int length = arr.length;
        int element = 2;
        int index = binarySearchUsingRecursion(arr,0,length-1,element);
        if (index == -1){
            System.out.println("Element is not present");
        }else{
            System.out.println("Element is present at "+index);
        }
    }
    private static int binarySearchUsingRecursion(int[] arr, int left, int right, int element){
        if (right >= 1){
            int mid = (left+right)/2;
            if (arr[mid] == element){
                return mid;
            }
            if (arr[mid] > element){
                return binarySearchUsingRecursion(arr,left,mid-1,element);
            }
            return binarySearchUsingRecursion(arr,mid+1,right,element);
        }
        return -1;
    }
}
