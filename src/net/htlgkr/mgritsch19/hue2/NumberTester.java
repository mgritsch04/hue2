/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgkr.mgritsch19.hue2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author maxim
 */
public class NumberTester {

    private NumberTest oddTester;
    private NumberTest primeTester;
    private NumberTest palindromeTester;
    private final String filepath;

    public static void main(String[] args) {
        NumberTester nTester = new NumberTester("file");

        NumberTest oddTester = (a) -> (a % 2) == 0;
        nTester.setOddEvenTester(oddTester);

        NumberTest setPrimeTester = (a) -> {
            boolean isPrime = false;
            for (int i = 2; i < a; i++) {
                if (i != 1 && i != a && a % i == 0) {
                    isPrime = false;
                } else {
                    isPrime = true;
                }

            }
            return isPrime;
        };
        nTester.setPrimeTester(setPrimeTester);

        NumberTest setPalindormeTester = (a) -> {
            String numberS = String.valueOf(a);
            String palindorm = "";
            for (int i = numberS.length(); i >= 0; i--) {
                palindorm += numberS.charAt(i);
            }
            return numberS.equals(palindorm);
        };
        nTester.setPalindormeTester(setPalindormeTester);
    }

    public NumberTester(String fileName) {
        this.filepath = fileName;
    }

    public void setOddEvenTester(NumberTest oddTester) {
        this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTest primeTester) {
        this.primeTester = primeTester;
    }

    public void setPalindormeTester(NumberTest palindromeTester) {
        this.palindromeTester = palindromeTester;
    }

    public void testFile() throws IOException {
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(filepath));
            String zeile = null;
            while ((zeile = in.readLine()) != null) {
                String[] parts = zeile.split("\\s+");

                switch (parts[0]) {
                    case "1":
                        if (oddTester.testNumber(Integer.parseInt(parts[1])) == true) {
                            System.out.println("EVEN");
                        } else {
                            System.out.println("ODD");
                        }
                        break;
                    case "2":
                        if (primeTester.testNumber(Integer.parseInt(parts[1])) == true) {
                            System.out.println("PRIME");
                        } else {
                            System.out.println("NO PRIME");
                        }
                        break;
                    case "3":
                        if (palindromeTester.testNumber(Integer.parseInt(parts[1])) == true) {
                            System.out.println("PALINDRME");
                        } else {
                            System.out.println("NO PALINDROME");
                        }
                        break;
                }
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(NumberTester.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public interface NumberTest {

        boolean testNumber(int number);
    }
}
