package net.ielpo.roadmap;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class RoadmapApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void checkNumber() {
        Integer a = 10;
        Assert.isTrue(5 + 5 == a, "This must be a");

        Integer b = 11;
        Assert.isTrue(5 + 5 != b, "This must not be b");
    }

}
