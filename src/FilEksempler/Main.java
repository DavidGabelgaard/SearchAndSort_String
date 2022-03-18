package FilEksempler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        String[] stringArray = {"Hej", "Torben", "Sofus", "Tumpe", "aaaa", "Søren", "Lol", "kill_Me", "Enig", "Nej", "Hjem"};


        // SelectionSort.selectionSort((stringArray));

        // InsertionSort.insertionSort(stringArray);

        // BubbleSort.bubbleSort(stringArray);

        // MergeSort.mergeSort(stringArray);

        // QuickSort.quickSort(stringArray);

        // HeapSort.heapSort(stringArray);

        // System.out.println( LinearSearch.linearSearch(stringArray , "aaaa"));

        /*

         Person ps = new Person(4 , "David" , "Gab" , 4.4f);
         Person ps1 = new Person(7 , "Juli" , "Tub" , 5.1f);
         Person ps2 = new Person(3, "Kill" , "Me" , 2.3f );


       //  Person[] list = new Person[] {ps , ps1 , ps2};

        ArrayList<Person> list = new ArrayList<>();
        list.add(ps);
        list.add(ps1);
        list.add(ps2);

        // HeapSort.heapSort(list);

        list.sort(new gennemsnitComparator());

        for (Person person : list) {
            System.out.print(person);
        }

        */

        // String tekst = "Hej mit navn er Julie og jeg er træt";

        // String[] ord = tekst.split(" ");


        // SelectionSort.selectionSort((ord));

        // InsertionSort.insertionSort(ord);

        // BubbleSort.bubbleSort(ord);

        // MergeSort.mergeSort(ord);

        // QuickSort.quickSort(ord);

        // HeapSort.heapSort(ord);

        // WordCount.wordCount(ord);

        try {
            File myObj = new File("src/FilEksempler/Text");
            Scanner scanner = new Scanner(myObj);

            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                String[] ord = data.split(" ");
                WordCount.wordCount(ord);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
