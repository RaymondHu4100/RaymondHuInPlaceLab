package com.company;

public class InPlaceSorts
{
    public static void bubbleSort(String []arr)
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
        {
            for (int j = 0; j < n - i - 1; j++)
            {
                if (arr[j].compareTo(arr[j+1]) > 0)
                {
                    InPlaceUtils.swapString(arr, j+1, j);
                }
            }
        }
    }
    public static void selectionSort(double []arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            InPlaceUtils.swapDouble(arr, i, (InPlaceUtils.minimumIndex(arr, i)));
        }
    }
    public static void insertionSort(int[] arr)
    {
        int n = arr.length;
        for (int i = 1; i < n; i++)
        {
            int insert = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > insert)
            {
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = insert;
        }
    }
}
