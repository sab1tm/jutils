package com.github.sab1tm.jutils;

public class StringUtil {

    public static String concat(String delimiter, String... strings) {
        StringBuilder builder = new StringBuilder();
        for (String string : strings) {
            builder.append(string);
            builder.append(delimiter);
        }
        return builder.toString();
    }
}
