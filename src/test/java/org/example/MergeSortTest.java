package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MergeSortTest {

    @Test
    public void sortedArrayLengthDoesNotChanged(){
        int [] array1 = {13, 1, 44, 20, 80, 50};
        MergeSort mergeSort = new MergeSort();
        int [] sortedArray = mergeSort.sortArray(array1, 0, array1.length - 1);
        Assertions.assertTrue(array1.length == sortedArray.length);
    }

    @Test
    public void sortedArrayEachNextNumberIsBiggerThanPrevious(){
        int [] array1 = {57, 1, 13, 93, 20, 47, 99};
        MergeSort mergeSort = new MergeSort();

        int firstIndex = 0;
        int [] sortedArray = mergeSort.sortArray(array1, firstIndex, array1.length - 1);
        int count = 0;
        for(int i = 1; i < sortedArray.length; i++){
            if(sortedArray[firstIndex] < sortedArray[firstIndex + 1]){
                firstIndex = firstIndex + 1;
                count++;
            }
        }
        Assertions.assertTrue(count == sortedArray.length - 1);
    }
}