public class DoesNotContain {
    /**
     * This method checks if the array does not contain the target value.
     * If the target is found, return false; if the loop finishes and the target
     * is not found, return true.
     *
     * @param arr the array to be manipulated.
     * @param target the value we are searching for.
     * @return true if arr does not contain target, false otherwise.
     */
    public boolean arrayDoesNotContain(int[] arr, int target){
        // Loop through each element in the array
        for (int i = 0; i < arr.length; i++) {
            // If a match is found, return false (target is in the array)
            if (arr[i] == target) {
                return false;
            }
        }
        
        // If the loop finishes and no match is found, return true
        return true;
    }
}
