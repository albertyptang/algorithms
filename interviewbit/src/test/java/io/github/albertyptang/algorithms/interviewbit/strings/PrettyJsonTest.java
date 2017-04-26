package io.github.albertyptang.algorithms.interviewbit.strings;

import org.junit.Test;

import java.util.ArrayList;

/**
 * note : this test simply prints out the result.
 * @author atang
 */
public class PrettyJsonTest {

    @Test
    public void prettyJSON() throws Exception {
        final ArrayList<String> thing = PrettyJson.prettyJSON("[\"foo\", {\"bar\":[\"baz\",null,1.0,2]}]");
        for (final String s : thing) {
            System.out.println(s);
        }
        final ArrayList<String> thing2 = PrettyJson.prettyJSON("{A:\"B\",C:{D:\"E\",F:{G:\"H\",I:\"J\"}}}");
        for (final String s : thing2) {
            System.out.println(s);
        }
        final ArrayList<String> thing3 = PrettyJson.prettyJSON("{\"attributes\":[{\"nm\":\"ACCOUNT\",\"lv\":[{\"v\":{\"Id\":null,\"State\":null},\"vt\":\"java.util.Map\",\"cn\":1}],\"vt\":\"java.util.Map\",\"status\":\"SUCCESS\",\"lmd\":13585},{\"nm\":\"PROFILE\",\"lv\":[{\"v\":{\"Party\":null,\"Ads\":null},\"vt\":\"java.util.Map\",\"cn\":2}],\"vt\":\"java.util.Map\",\"status\":\"SUCCESS\",\"lmd\":41962}]}");
        for (final String s : thing3) {
            System.out.println(s);
        }
    }
}