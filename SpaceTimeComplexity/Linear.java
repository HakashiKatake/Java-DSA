public class Linear {
    public static void main(String[] args) {
        int[]arr = new int[]{1,2,3,4,5};

        //add 10 to the first element

        arr[0] = arr[0] + 10; //O(1) T.c

        for (int i = 0; i < arr.length; i++) { //O(n) time C
            System.out.println(arr[i]); 
        
        }

        System.out.println(arr[0]); // t.c O(1)


        int[] newArr = new int[arr.length]; //t.c O(1) | sp c. O(n)
        for(int i = 0; i<arr.length; i++) { //t.c O(n) | s.p O(1)
            newArr[i] = arr[i]; 
        }

        for (int i : newArr) { //t.c O(n) | s.c O(1)
            System.out.println(i);
        }



        //total time c. - O(1) + O(n) = O(2+n)
        //overall 
        //t.c - O(n)
        // space - O(n)
    }
}
