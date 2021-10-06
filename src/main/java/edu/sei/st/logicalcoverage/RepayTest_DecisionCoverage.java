package edu.sei.st.logicalcoverage;

import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;

// 判定覆盖
class RepayTest_DecisionCoverage {

    @org.junit.jupiter.api.Test
    void doRepay_DecisionCoverage1() {
        Repay rp = new Repay(true, true, new BigDecimal("1000.11"), true, false, new BigDecimal("100.11"));
        assertEquals("success", rp.doRepay());
    }

    @org.junit.jupiter.api.Test
    void doRepay_DecisionCoverage2() {
        Repay rp = new Repay(true, true, new BigDecimal("1000.11"), false, true, new BigDecimal("1.11"));
        assertEquals("not enough balance ", rp.doRepay());
    }

    @org.junit.jupiter.api.Test
    void doRepay_DecisionCoverage3() {
        Repay rp = new Repay(true, true, new BigDecimal("1000.11"), false, false, new BigDecimal("100.11"));
        assertEquals("return", rp.doRepay());
    }

    @org.junit.jupiter.api.Test
    void doRepay_DecisionCoverage4() {
        Repay rp = new Repay(false, false, new BigDecimal("-1000.11"), false, false, new BigDecimal("100.11"));
        assertEquals("card invalid or name invalid or balance <=0 ", rp.doRepay());
    }
}