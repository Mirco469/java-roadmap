package net.ielpo.roadmap;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AddToListTask implements Callable<ArrayList<Integer>> {
    ArrayList<Integer> list;
    Integer maxNumber;

    public AddToListTask(ArrayList<Integer> list, Integer maxNumber) {
        this.list = list;
        this.maxNumber = maxNumber;
    }

    @Override
    public ArrayList<Integer> call() {
        for (Integer i = 0; i < maxNumber; i++) {
            list.add(i);
        }
        return this.list;
    }
}

public class Exercise8 {
    /**
     * This function creates a new "List" of Integers, and adds to it a range of
     * numbers included between 0 and "maxNumber".
     * "threadNumber" describes the number of threads which will perform this task
     * at the same time (each one should insert a range).
     * If threadNumber is more than 1, insertion order is not guaranteed.
     * 
     * Examples
     * List<Integer> res = addToList(10, 1); //[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
     * List<Integer> res = addToList(10, 2); //[0, 1, 2, 3, 4, 5, 6, 7, 8, 0, 9, 1,
     * 2, 3, 4, 5, 6, 7, 8, 9]
     * 
     * @param maxNumber
     * @param threadNumber
     * @return
     * @throws Exception
     */
    private static List<Integer> addToList(int maxNumber, int threadNumber) throws Exception {
        var list = new ArrayList<Integer>();

        ExecutorService executorService = Executors.newFixedThreadPool(threadNumber);
        List<Callable<ArrayList<Integer>>> callableTasks = new ArrayList<>();

        for (Integer i = 0; i < threadNumber; i++) {
            callableTasks.add(new AddToListTask(list, maxNumber));
        }

        executorService.invokeAll(callableTasks);

        return list;
    }

    @Test
    void addToListTest() {
        try {
            int maxNumber = 10;
            int threadNumber = 1;
            long start = System.currentTimeMillis();
            List<Integer> res = addToList(maxNumber, threadNumber);
            long end = System.currentTimeMillis();
            System.out.println("Total time: " + (end - start) + "ms");
            System.out.println(res);
            Assertions.assertArrayEquals(new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }, res.toArray());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
