public class Constant {
    public static void main(String[] args) {
        int[]arr = new int[]{1,2,3,4,5};

        //add 10 to the first element of an array
        arr[0] = arr[0] + 10; //time c. -> O(1)
        int num = arr[arr.length - 1]; // s.c - int 4bytes. O(4)

        System.out.println(arr[0]);

        //O(1) + O(1) = O(2) == O(1) //constant time complexity
        // O(4bytes) = O(1) //const space complexity
    }
}
