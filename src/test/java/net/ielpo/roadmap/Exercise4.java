package net.ielpo.roadmap;

public class Exercise4 {
    public static void LongTest() {
        Long test1 = Long.valueOf(113L);
        Long check1 = Long.valueOf(113L);

        Long test2 = Long.valueOf(2500L);
        Long check2 = Long.valueOf(2500L);

        // if (test1 == check1) {
        if (test1.equals(check1)) {
            System.out.println("OK");
        } else {
            System.out.println("KO!");
        }

        // if (test2 == check2) {
        if (test2.equals(check2)) {
            System.out.println("OK");
        } else {
            System.out.println("KO!");
        }
    }
}
