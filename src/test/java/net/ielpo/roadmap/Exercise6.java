package net.ielpo.roadmap;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exercise6 {
    public ArrayList<Integer> getLeaders(ArrayList<Integer> numbers, Integer startIndex) {
        if (numbers.size() - startIndex == 1) {
            var leaders = new ArrayList<Integer>();
            leaders.add(numbers.get(numbers.size() - 1));
            return leaders;
        }

        var currentNumber = numbers.get(startIndex);
        var leaders = getLeaders(numbers, startIndex + 1);

        if (currentNumber > leaders.get(0)) {
            leaders.add(0, currentNumber);
        }

        return leaders;
    }

    @Test
    void leaderTest1() {
        var numbers = new ArrayList<Integer>(Arrays.asList(10, 8, 14, 23, 15, 0, 9));
        var result = getLeaders(numbers, 0);
        Assertions.assertArrayEquals(new Integer[] { 23, 15, 9 }, result.toArray());
    }
}
