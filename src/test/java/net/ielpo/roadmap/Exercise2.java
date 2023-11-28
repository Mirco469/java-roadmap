package net.ielpo.roadmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Exercise2 {
    public static void snippet() {
        List<String> data = new ArrayList<String>(Arrays.asList("testData1", "testData2", "testData2", "testData3"));

        System.out.println(data);

        /*
         * for (String d : data) {
         * if (d.equals("testData2")) {
         * data.remove(d);
         * }
         * }
         */
        data.removeAll(Arrays.asList(new String[] { "testData2" }));

        System.out.println(data);
    }

    @Test
    void concatenateTest1() {
        Exercise2.snippet();
    }
}
