package lessonthree;

public class Main {

    Sorter s = new Sorter();
    Searcher se = new Searcher();

    int nums[] = new int[10000];
    int nums2[] = new int[10000];



    public Main(){

        int high = nums.length;

        for (int i = 0; i < nums.length; i ++){
            nums[i] = (int) Math.random() * 100000;
            nums2[i] = (int) Math.random() * 100000;
        }

        System.out.println("quicksort");
        s.quickSort(nums, 0, high - 1);
        System.out.println("------------------------------------------");
        s.bubbleSort(nums);



    }


    private void printArray(int[] arr){
        for (int i = 0; i < arr.length; i ++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("----------------------------------");
    }

    public static void main(String[] args) {
        Main m = new Main();
    }
}
