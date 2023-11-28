package net.ielpo.roadmap;

import java.math.BigDecimal;

public class Exercise5 {
    public static void DecimalTest() {
        // Using new BigDecimal(0.01) calls public BigDecimal(double val) and we fall
        // once again in the storage problems of doubles
        BigDecimal a = new BigDecimal("0.01");
        BigDecimal b = new BigDecimal("0.05");
        BigDecimal c = new BigDecimal("0.06");

        System.out.println(a.add(b).equals(c));
    }
}
