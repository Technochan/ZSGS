package java_assignmnet_13_arraylist.arraylist_randomaccess_sequentialaccess;

import java.util.ArrayList;
import java.util.Random;

// I Don't Know about this concept. So first i refer some websites and chatgpt too. Then i get to know about this process.Then Tried to implement
public class ArrayListOperationCompare {

    public static void main(String[] args) {
        int[] capacities = {1000, 10000, 100000};
        int[] accessPatternSizes = {1000, 10000, 100000};
        Random random = new Random();

        System.out.println("Capacity \t Access Pattern \t Add - ms \tGet - ms \t Remove - ms");

        for (int capacity : capacities) {
            for (int accessPatternSize : accessPatternSizes) {
                ArrayList<Integer> arrayList = new ArrayList<>(capacity);

                //Here I Adding the Random Numbers
                for (int i = 0; i < capacity; i++) {
                    arrayList.add(random.nextInt());
                }

                //Here I Measuring the time for the add operation
                long addStartTime = System.nanoTime();
                for (int i = 0; i < accessPatternSize; i++) {
                    arrayList.add(random.nextInt());
                }
                long addElapsedTime = (System.nanoTime() - addStartTime) / 1000000;

                //Here I  Measuring the time for the get operation in random access
                long getRandomStartTime = System.nanoTime();
                for (int i = 0; i < accessPatternSize; i++) {
                    int index = random.nextInt(capacity);
                    arrayList.get(index);
                }
                long getRandomElapsedTime = (System.nanoTime() - getRandomStartTime) / 1000000;

                //Here I  Measuring the time for the Remove operation
                long removeStartTime = System.nanoTime();
                for (int i = 0; i < accessPatternSize; i++) {
                    arrayList.remove(0);
                }
                long removeElapsedTime = (System.nanoTime() - removeStartTime) / 1000000;

                System.out.println(capacity + "\t\t\t" + accessPatternSize + "\t\t\t" + addElapsedTime + "\t\t\t" +
                        getRandomElapsedTime + "\t\t\t" + removeElapsedTime);
            }
        }
    }
}
