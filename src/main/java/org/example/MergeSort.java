package org.example;

public class MergeSort {

    public void mergeArray(int array[], int firstIndex, int middle, int lastIndex) {
        int l1 = middle - firstIndex + 1;
        int r1 = lastIndex - middle;

        int L[] = new int [l1];
        int R[] = new int [r1];

        for (int i = 0; i < l1; ++i)
            L[i] = array[firstIndex + i];
        for (int j = 0; j < r1; ++j)
            R[j] = array[middle + 1+ j];

        int i = 0, j = 0;

        int k = firstIndex;
        while (i < l1 && j < r1)
        {
            if (L[i] <= R[j])
            {
                array[k] = L[i];
                i++;
            }
            else
            {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < l1)
        {
            array[k] = L[i];
            i++;
            k++;
        }

        while (j < r1)
        {
            array[k] = R[j];
            j++;
            k++;
        }
    }

    void sortArray(int array[], int firstIndex, int lastIndex)
    {
        if (firstIndex < lastIndex)
        {
            int middle = (firstIndex+lastIndex)/2;

            sortArray(array, firstIndex, middle);
            sortArray(array , middle+1, lastIndex);

            mergeArray(array, firstIndex, middle, lastIndex);
        }
    }

    public void printArray(int array[])
    {
        int n = array.length;
        for (int i = 0; i < n; ++i)
            System.out.print(array[i] + " ");
        System.out.println();
    }
}