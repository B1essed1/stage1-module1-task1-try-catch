package com.epam.m1.exceptions;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Complete the code, parse integers, calculate the sum of numbers in the WORDS, join strings with
 * space delimiter
 */
public class ParseIntegers {
    public static final Logger logger = Logger.getLogger(ParseIntegers.class.getName());

    private static final List<String> WORDS =
            Arrays.asList(
                    "JDK 17 has released on 14 September 2021 with 10 new features, 2 feature removals and 2 feature deprecations."
                            .split(" "));

    public static void main(String[] args) {
        Iterator<String> words = WORDS.iterator();
        int sum = 0;
        StringBuilder justWords = new StringBuilder() ;
        while (words.hasNext()) {
            String next = words.next();
            try {
                sum += Integer.parseInt(next);

            } catch (NumberFormatException e){
                justWords.append(next+" ");
            }

        }
        logger.log(Level.INFO, String.valueOf("Sum is "+ sum));
        logger.log(Level.INFO, String.valueOf("Just words:" + justWords));
    }
}

