package searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3,4,1,7,5};

        int element = 7;
        int index = linearSerach(arr,element);
        if (index == -1){
            System.out.println("Element is not present ");
        }else {
            System.out.println("Element is present at index :"+index);
        }
    }
    private static int linearSerach(int[] arr, int element){
        for (int i=0; i<arr.length; i++){
            if (arr[i]==element){
                return i;
            }
        }
        return -1;
    }
}
