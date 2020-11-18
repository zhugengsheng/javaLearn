package javaCode.eleven;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*! Here's a block of text  to use as input to the regular expression matcher. Note that we'll first extract the block of text by looking.!*/
public class TheReplacements {
    public static void main(String[] args) {
        String s = " Here's a block of text  to use as input to the regular expression matcher. Note that we'll first extract the block of text by looking.";
        s = s.replaceAll(" {2,}"," ");
        s = s.replaceAll(" {2,}"," ");
        s = s.replaceAll("(?m)^ +","");
        System.out.println(s);
        s = s.replaceFirst("[aeiou]","(VOWEL1)");
        StringBuffer subf = new StringBuffer();
        Pattern p = Pattern.compile("[aeiou]");
        Matcher m = p.matcher(s);
        while (m.find())
            m.appendReplacement(subf, m.group().toUpperCase());
        m.appendTail(subf);
        System.out.println(subf);
    }
}
