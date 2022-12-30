package org.example;

public class Main {

    public static void main(String args[])
    {
        int array[] = {72, 1, 25, 15, 66, 97, 22, 49, 33};

        MergeSort mergeSort = new MergeSort();

        System.out.println("Array before sorting:");
        mergeSort.printArray(array);
        mergeSort.sortArray(array, 0, array.length-1);
        System.out.println("Array after sorting: ");
        mergeSort.printArray(array);
    }
}