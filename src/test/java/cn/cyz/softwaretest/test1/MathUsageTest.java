package cn.cyz.softwaretest.test1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class MathUsageTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void isPass1() {
        double[] values = new double[] {3.59, 4.01,3.69, 4.26, 2.95, 3.26, 3.56, 3.46, 3.58, 3.17, 3.59, 0.66 };
        MathUsage mathusage = new MathUsage();
        int result = mathusage.isPass(values);
        assertEquals(1, result);
    }

    @Test
    void isPass2() {
        double[] values = new double[] {3.59, 4.01,3.69, 4.26, 2.95, 3.26, 3.56, 3.46, 3.58, 3.17, 3.59, 3.56 };
        MathUsage mathusage = new MathUsage();
        int result = mathusage.isPass(values);
        assertEquals(0, result);
    }

    @Test
    void isPass3() {
        double[] values = new double[] {0.95, 0.74,0.62, 0.85, 0.18, 0.326, 0.22, 0.94, 0.68, 0.17, 0.59, 0.66 };
        MathUsage mathusage = new MathUsage();
        int result = mathusage.isPass(values);
        assertEquals(12, result);
    }
}