package com.company;

public class Runner
{
    public static void main(String[] args)
    {
        System.out.println("Insertion Sort:");
        long time = System.nanoTime();
        int[] testArr = InPlaceUtils.randIntArray(10);
        time = System.nanoTime() - time;
        System.out.print("Before: ");
        for (int num:testArr)
        {
            System.out.print(num+" ");
        }
        System.out.println();
        InPlaceSorts.insertionSort(testArr);
        System.out.print("After: ");
        for (int num:testArr)
        {
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println("Time Taken: " + time);
        System.out.println("The array is sorted: " + InPlaceUtils.isSortedInt(testArr));
        System.out.println("");
        System.out.println("Selection Sort:");
        long time1 = System.nanoTime();
        double[] testArr1 = InPlaceUtils.randDoubleArray(10);
        time1 = System.nanoTime() - time1;
        System.out.print("Before: ");
        for (double num:testArr1)
        {
            System.out.print(num+" ");
        }
        System.out.println();
        InPlaceSorts.selectionSort(testArr1);
        System.out.print("After: ");
        for (double num:testArr1)
        {
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println("Time Taken: " + time1);
        System.out.println("The array is sorted: " + InPlaceUtils.isSortedDouble(testArr1));
        System.out.println("");
        System.out.println("Bubble Sort:");
        long time2 = System.nanoTime();
        String[] testArr2 = InPlaceUtils.randStringArray(10, 5);
        time2 = System.nanoTime() - time2;
        System.out.print("Before: ");
        for (String num:testArr2)
        {
            System.out.print(num+" ");
        }
        System.out.println();
        InPlaceSorts.bubbleSort(testArr2);
        System.out.print("After: ");
        for (String num:testArr2)
        {
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println("Time Taken: " + time2);
        System.out.println("The array is sorted: " + InPlaceUtils.isSortedString(testArr2));
    }
}
