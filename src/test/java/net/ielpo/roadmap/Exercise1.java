package net.ielpo.roadmap;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class Excercise1 {

    /**
     * Return all numbers x <= n < y concatenated with "_" character
     * 
     * @param x
     * @param y
     * @return
     */
    public static String concatenate(Integer x, Integer y) {
        if (x >= y) {
            throw new IllegalArgumentException("x must be lower than y");
        }

        return x + "_" + y;
    }

    @Test
    void concatenateTest1() {
        String result = Excercise1.concatenate(1, 2);
        Assert.isTrue(result.equals("1_2"), "This must be 1_2");
    }

    @Test
    void concatenateTest2() {
        try {
            Excercise1.concatenate(1, 1);
            Assert.isTrue(false, "Must throw exception");
        } catch (Exception error) {
            Assert.isTrue(true, "");
        }
    }

    @Test
    void concatenateTest3() {
        try {
            Excercise1.concatenate(2, 1);
            Assert.isTrue(false, "Must throw exception");
        } catch (Exception error) {
            Assert.isTrue(true, "");
        }
    }
}
