package com.company;

import java.util.Scanner;

public class IsJavaKeyword {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("enter word");
        String word = myScanner.nextLine().toLowerCase();
         String[] keys = {"abstract", "continue", "for", "new", "switch",
                "assert", "default", "goto", "package", "synchronized"
                , "boolean", "do", "if", "private", "this",
                "break", "double", "implements", "protected", "throw",
                "byte", "else", "import", "public", "throws",
                "case", "enum", "instanceof", "return", "transient",
                "catch", "extends", "int", "short", "try",
                "char", "final", "interface", "static", "void"
                , "class", "finally", "long", "strictfp", "volatile",
                "const", "float", "native", "super", "while"};


        for (String s : keys) {
            if (s.equals(word)) {
                System.out.println("is a java keyword");
                break;
            } else {
                System.out.println("not a java keyword");
                continue;
            }
        }
    }
}
