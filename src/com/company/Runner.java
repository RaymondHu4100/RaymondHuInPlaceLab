package com.company;

public class Runner
{
    public static void main(String[] args)
    {
        System.out.println("Insertion Sort:");
        int[] testArr = InPlaceUtils.randIntArray(10);
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
        System.out.println("");
        System.out.println("Selection Sort:");
        double[] testArr1 = InPlaceUtils.randDoubleArray(10);
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
        System.out.println("");
        System.out.println("Bubble Sort:");
        String[] testArr2 = InPlaceUtils.randStringArray(10, 5);
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
    }
}
