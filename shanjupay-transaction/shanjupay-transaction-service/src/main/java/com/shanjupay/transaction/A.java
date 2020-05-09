package com.shanjupay.transaction;


import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class A {

    public static final String DATETEMPLATE_1 = "yyyyMMdd";

    public static final String DATETEMPLATE_2 = "yyyy/MM/dd";

    public  static void main(String [] args){
        Integer date=20100520;
        final SimpleDateFormat formatter = new SimpleDateFormat(DATETEMPLATE_1);
        final ParsePosition pos       = new ParsePosition(0);// 用来标明解析开始位
        final Date strtodate = formatter.parse(date.toString(), pos);
        System.out.println(strtodate);
        final SimpleDateFormat formatter1 = new SimpleDateFormat(DATETEMPLATE_2);
        String str = formatter1.format(strtodate);

        System.out.println(str);
    }
}
