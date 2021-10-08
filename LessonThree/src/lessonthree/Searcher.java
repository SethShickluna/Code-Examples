package lessonthree;

public class Searcher {

    public Searcher(){

    }

    /**
     * use this on unsorted list
     * @param arr array being searched
     * @param value value being searched for
     * @return index
     */
    public int linearSearch(int[] arr, int value){
        int index = -1; //default value

        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == value) {
                return i;
            }
        }
        return index; //returns -1 if the value is not found
    }

    /**
     * we can use this when the list is sorted
     * @param arr array that we are searching
     * @param value value we are searching for
     * @param left
     * @param right
     * @return index of searched value in arr
     */
    public int binarySearch(int[] arr, int value, int left, int right){

        if(right >= left) {
            int middle = left + (right - 1) / 2;

            if(arr[middle] == value){
                return middle;
            }

            if(value > arr[middle]) {
                return binarySearch(arr, value, middle + 1, right);
            }

            return binarySearch(arr, value, left, middle - 1);

        }


        return -1;
    }
}
