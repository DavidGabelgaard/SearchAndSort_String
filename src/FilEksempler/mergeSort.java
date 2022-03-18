package FilEksempler;

import java.util.Arrays;

class MergeSort {
    /** The method for sorting the numbers */
    public static void mergeSort(int[] list) {
        if (list.length > 1) {
            // Merge sort the first half
            int[] firstHalf = new int[list.length / 2];
            System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
            mergeSort(firstHalf);

            // Merge sort the second half
            int secondHalfLength = list.length - list.length / 2;
            int[] secondHalf = new int[secondHalfLength];
            System.arraycopy(list, list.length / 2,
                    secondHalf, 0, secondHalfLength);
            mergeSort(secondHalf);

            // Merge firstHalf with secondHalf into list
            merge(firstHalf, secondHalf, list);
        }
    }

    /** Merge two sorted lists */
    public static void merge(int[] list1, int[] list2, int[] temp) {
        int current1 = 0; // Current index in list1
        int current2 = 0; // Current index in list2
        int current3 = 0; // Current index in temp

        while (current1 < list1.length && current2 < list2.length) {
            if (list1[current1] < list2[current2])
                temp[current3++] = list1[current1++];
            else
                temp[current3++] = list2[current2++];
        }

        while (current1 < list1.length)
            temp[current3++] = list1[current1++];

        while (current2 < list2.length)
            temp[current3++] = list2[current2++];
    }

    public static void mergeSort(String[] list ) {
        if (list.length > 1) {
            String[] firstHalf = new String[list.length / 2];
            System.arraycopy(list , 0 , firstHalf, 0 , list.length / 2 );
            mergeSort(firstHalf);

            int secondHalfLength = list.length - (list.length / 2);
            String[] secondHalf = new String[secondHalfLength];
            System.arraycopy(list, list.length / 2 , secondHalf , 0 , secondHalfLength);
            mergeSort(secondHalf);

            merge(firstHalf , secondHalf , list);
        }
        System.out.println(Arrays.toString(list));
    }

    public static void merge(String[] list1 , String[] list2 , String[] temp ) {
        int curr1 = 0;
        int curr2 = 0;
        int curr3 = 0;

        while (curr1 < list1.length && curr2 < list2.length) {
            if (list1[curr1].compareToIgnoreCase(list2[curr2] ) < 0) {
                temp[curr3++] = list1[curr1++];
            } else {
                temp[curr3++] = list2[curr2++];
            }


            while (curr1 < list1.length)
                temp[curr3++] = list1[curr1++];

            while (curr2 < list2.length)
                temp[curr3++] = list2[curr2++];

        }



    }



    /** A test method */
    public static void main(String[] args) {
        int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        mergeSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
