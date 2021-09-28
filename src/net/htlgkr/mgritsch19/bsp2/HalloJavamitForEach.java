/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgkr.mgritsch19.bsp2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author maxim
 */
public class HalloJavamitForEach {

    List<String> list = new ArrayList<>(Arrays.asList("string1", "string2"));

    public static void main(String[] args) {
        HalloJavamitForEach m = new HalloJavamitForEach();
        for (String string : m.list) {
            System.out.println(string);
        }
        m.list.forEach((String s) -> System.out.println(s));
    }

}
