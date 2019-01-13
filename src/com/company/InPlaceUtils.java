package com.company;

public class InPlaceUtils
{
    public static void swapDouble(double[] arr, int x, int y)
    {
        double temp;
        temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    public static void swapString(String[] arr, int x, int y)
    {
        String temp;
        temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    public static int[] randIntArray(int count)
    {
        int arr[] = new int[count];
        for(int i = 0; i < count; i++)
        {
            arr[i] = (int)(Math.random()*count+1);
        }
        return arr;
    }
    public static double[] randDoubleArray(int count)
    {
        double arr[] = new double[count];
        for(int i = 0; i < count; i++)
        {
            arr[i] = (int)(Math.random()*count+1);
        }
        return arr;
    }
    public static String[] randStringArray(int num, int length)
    {
        String[] arr = new String[num];
        while (num > 0)
        {
            int i = 0;
            String s = "";
            while (i < length)
            {
                char c = (char)((Math.random()*26)+97);
                s = s + c;
                i++;
            }
            num--;
            arr[num] = s;
        }
        return arr;
    }
    public static int minimumIndex(double[] arr, int ind)
    {
        int minInd = ind;
        for(int i = ind; i < arr.length; i++)
        {
            if(arr[i] < arr[minInd])
            {
                minInd = i;
            }
        }
        return minInd;
    }
    public static boolean isSortedInt(int[] arr)
    {
        for(int i = 0; i < (arr.length-1); i++)
        {
            if (arr[i] > arr[i+1])
            {
                return false;
            }
        }
        return true;
    }
    public static boolean isSortedDouble(double[] arr)
    {
        for(int i = 0; i < (arr.length-1); i++)
        {
            if (arr[i] > arr[i+1])
            {
                return false;
            }
        }
        return true;
    }
    public static boolean isSortedString(String[] arr)
    {
        for(int i = 0; i < (arr.length-1); i++)
        {
            if (arr[i].compareTo(arr[i+1]) > 0)
            {
                return false;
            }
        }
        return true;
    }
    public static boolean checkSumInt(int[] before, int[] after)
    {
        int beforeSum = 0;
        int afterSum = 0;
        for(int i = 0; i < before.length; i++)
        {
            before[i] += beforeSum;
        }
        for(int i = 0; i < after.length; i++)
        {
            after[i] += afterSum;
        }
        if(beforeSum != afterSum)
        {
            return false;
        }
        return true;
    }
    public static boolean checkSumDouble(double[] before, double[] after)
    {
        int beforeSum = 0;
        int afterSum = 0;
        for(int i = 0; i < before.length; i++)
        {
            before[i] += beforeSum;
        }
        for(int i = 0; i < after.length; i++)
        {
            after[i] += afterSum;
        }
        if(beforeSum != afterSum)
        {
            return false;
        }
        return true;
    }
    public static boolean checkSumString(String[] before, String[] after)
    {
        int beforeSum = 0;
        int afterSum = 0;
        for(int i = 0; i < before.length; i++)
        {
            before[i] += beforeSum;
        }
        for(int i = 0; i < after.length; i++)
        {
            after[i] += afterSum;
        }
        if(beforeSum != afterSum)
        {
            return false;
        }
        return true;
    }
}
