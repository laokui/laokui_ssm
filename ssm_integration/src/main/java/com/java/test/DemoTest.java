package com.java.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName DemoTest
 * @Description:
 * @Author :lmk
 * @Date 2021/5/24
 * @Version V1.0
 **/
public class DemoTest {
    public static void main(String[] args) {
        List<Integer> ls=new ArrayList<Integer>();
        for(int i=10;i<15;i++){
            ls.add(i);
        }
        System.out.println(ls);
    }
}