package java_assignmnet_13_arraylist.arraylist_randomaccess_sequentialaccess;

// Write a program that compares the performance of different operations on ArrayLists with different capacities and data access patterns (random access vs. sequential access)

import java.util.ArrayList;
import java.util.Random;

// I Don't Know about this concept. So first i refer some websites and chatgpt too. Then i get to know about this process.Then Tried to implement
public class ArrayListOperationCompare {

    public static void main(String[] args) {
        int[] capacities = {1000, 10000, 100000};
        int[] accessPatternSizes = {1000, 10000, 100000};
        Random random = new Random();

        System.out.println("Capacity \t Access Pattern \t Random Access Add - ms \t Random Access Get - ms \t Sequential Access Add - ms \t Sequential Access Get - ms \t Remove Random - ms \t Remove Sequential - ms");

        for (int capacity : capacities) {
            for (int accessPatternSize : accessPatternSizes) {
                ArrayList<Integer> arrayList = new ArrayList<>(capacity);

                // Adding random numbers
                for (int i = 0; i < capacity; i++) {
                    arrayList.add(random.nextInt());
                }

                //This is Random Access
                long randomAddStartTime = System.currentTimeMillis();
                for (int i = 0; i < accessPatternSize; i++) {
                    arrayList.add(random.nextInt());
                }
                long randomAddElapsedTime = System.currentTimeMillis() - randomAddStartTime;

                long randomGetStartTime = System.currentTimeMillis();
                for (int i = 0; i < accessPatternSize; i++) {
                    int index = random.nextInt(capacity);
                    arrayList.get(index);
                }
                long randomGetElapsedTime = System.currentTimeMillis() - randomGetStartTime;

                //This is Sequential Access
                long sequentialAddStartTime = System.currentTimeMillis();
                for (int i = 0; i < accessPatternSize; i++) {
                    arrayList.add(i);
                }
                long sequentialAddElapsedTime = System.currentTimeMillis() - sequentialAddStartTime;

                long sequentialGetStartTime = System.currentTimeMillis();
                for (int i = 0; i < accessPatternSize; i++) {
                    arrayList.get(i);
                }
                long sequentialGetElapsedTime = System.currentTimeMillis() - sequentialGetStartTime;

                // Remove Operation
                long randomRemoveStartTime = System.currentTimeMillis();
                for (int i = 0; i < accessPatternSize; i++) {
                    int index = random.nextInt(arrayList.size());
                    arrayList.remove(index);
                }
                long randomRemoveElapsedTime = System.currentTimeMillis() - randomRemoveStartTime;

                long removeStartTime = System.currentTimeMillis();
                for (int i = 0; i < accessPatternSize; i++) {
                    arrayList.remove(0);
                }
                long removeElapsedTime = System.currentTimeMillis() - removeStartTime;


                System.out.println(capacity + "\t\t" + accessPatternSize + "\t\t" + randomAddElapsedTime + "\t\t\t\t" +
                        randomGetElapsedTime + "\t\t\t" + sequentialAddElapsedTime + "\t\t\t" + sequentialGetElapsedTime + "\t\t\t" + randomRemoveElapsedTime + "\t\t\t" + removeElapsedTime);
            }
        }
    }
}