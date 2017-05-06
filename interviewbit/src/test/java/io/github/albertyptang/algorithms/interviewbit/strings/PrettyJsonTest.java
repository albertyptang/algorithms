package io.github.albertyptang.algorithms.interviewbit.strings;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * note : this test simply prints out the result.
 *
 * @author atang
 */
public class PrettyJsonTest {

    @Test
    public void prettyJSON() throws Exception {
        final ArrayList<String> result = PrettyJson.prettyJSON("[\"foo\", {\"bar\":[\"baz\",null,1.0,2]}]");
        final ArrayList<String> testResult = new ArrayList<>(Arrays.asList(
            "[",
            "\t\"foo\",",
            "\t{",
            "\t\t\"bar\":",
            "\t\t[",
            "\t\t\t\"baz\",",
            "\t\t\tnull,",
            "\t\t\t1.0,",
            "\t\t\t2",
            "\t\t]",
            "\t}",
            "]"));
        assertEquals(testResult, result);

        final ArrayList<String> testResult2 = new ArrayList<>(Arrays.asList(
            "{",
            "\tA:\"B\",",
            "\tC:",
            "\t{",
            "\t\tD:\"E\",",
            "\t\tF:",
            "\t\t{",
            "\t\t\tG:\"H\",",
            "\t\t\tI:\"J\"",
            "\t\t}",
            "\t}",
            "}"));
        final ArrayList<String> result2 = PrettyJson.prettyJSON("{A:\"B\",C:{D:\"E\",F:{G:\"H\",I:\"J\"}}}");
        assertEquals(testResult2, result2);

        final ArrayList<String> result3 = PrettyJson.prettyJSON("{\"attributes\":[{\"nm\":\"ACCOUNT\",\"lv\":[{\"v\":{\"Id\":null,\"State\":null},\"vt\":\"java.util.Map\",\"cn\":1}],\"vt\":\"java.util.Map\",\"status\":\"SUCCESS\",\"lmd\":13585},{\"nm\":\"PROFILE\",\"lv\":[{\"v\":{\"Party\":null,\"Ads\":null},\"vt\":\"java.util.Map\",\"cn\":2}],\"vt\":\"java.util.Map\",\"status\":\"SUCCESS\",\"lmd\":41962}]}");
        final ArrayList<String> testResult3 = new ArrayList<>(Arrays.asList(
            "{",
            "\t\"attributes\":",
            "\t[",
            "\t\t{",
            "\t\t\t\"nm\":\"ACCOUNT\",",
            "\t\t\t\"lv\":",
            "\t\t\t[",
            "\t\t\t\t{",
            "\t\t\t\t\t\"v\":",
            "\t\t\t\t\t{",
            "\t\t\t\t\t\t\"Id\":null,",
            "\t\t\t\t\t\t\"State\":null",
            "\t\t\t\t\t},",
            "\t\t\t\t\t\"vt\":\"java.util.Map\",",
            "\t\t\t\t\t\"cn\":1",
            "\t\t\t\t}",
            "\t\t\t],",
            "\t\t\t\"vt\":\"java.util.Map\",",
            "\t\t\t\"status\":\"SUCCESS\",",
            "\t\t\t\"lmd\":13585",
            "\t\t},",
            "\t\t{",
            "\t\t\t\"nm\":\"PROFILE\",",
            "\t\t\t\"lv\":",
            "\t\t\t[",
            "\t\t\t\t{",
            "\t\t\t\t\t\"v\":",
            "\t\t\t\t\t{",
            "\t\t\t\t\t\t\"Party\":null,",
            "\t\t\t\t\t\t\"Ads\":null",
            "\t\t\t\t\t},",
            "\t\t\t\t\t\"vt\":\"java.util.Map\",",
            "\t\t\t\t\t\"cn\":2",
            "\t\t\t\t}",
            "\t\t\t],",
            "\t\t\t\"vt\":\"java.util.Map\",",
            "\t\t\t\"status\":\"SUCCESS\",",
            "\t\t\t\"lmd\":41962",
            "\t\t}",
            "\t]",
            "}"));
        assertEquals(testResult3, result3);
    }
}