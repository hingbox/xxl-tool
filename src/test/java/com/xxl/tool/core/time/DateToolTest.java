package com.xxl.tool.core.time;

import java.util.Date;

public class DateToolTest {

    public static void main(String[] args) {
        System.out.println(DateTool.formatDateTime(new Date()));
        System.out.println(DateTool.formatDateTime(DateTool.addYears(new Date(), 1)));
    }

}
