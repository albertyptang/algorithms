package io.github.albertyptang.algorithms.interviewbit.level_3.strings;

import java.util.ArrayList;

/**
 * Pretty print a json object using proper indentation.
 * <p>
 * Every inner brace should increase one indentation to the following lines.
 * Every close brace should decrease one indentation to the same line and the following lines.
 * The indents can be increased with an additional ‘\t’
 * Example 1:
 * <p>
 * Input : {A:"B",C:{D:"E",F:{G:"H",I:"J"}}}
 * Output :
 * {
 *   A:"B",
 *   C:
 *   {
 *       D:"E",
 *       F:
 *       {
 *           G:"H",
 *           I:"J"
 *       }
 *   }
 * }
 * <p>
 * Example 2:
 * <p>
 * Input : ["foo", {"bar":["baz",null,1.0,2]}]
 * Output :
 * [
 *     "foo",
 *     {
 *         "bar":
 *         [
 *             "baz",
 *             null,
 *             1.0,
 *             2
 *         ]
 *     }
 * ]
 * <p>
 * [] and {} are only acceptable braces in this case.
 * <p>
 * Assume for this problem that space characters can be done away with.
 * <p>
 * Your solution should return a list of strings, where each entry corresponds to a single line.
 * The strings should not have “\n” character in them.
 *
 * @author atang
 */
public class PrettyJson {

    public static ArrayList<String> prettyJSON(String a) {
        // assume the json is valid.
        final ArrayList<String> json = new ArrayList<>();
        boolean escaped = false;
        int indents = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < a.length(); i++) {
            final char c = a.charAt(i);
            if (c == '\"') {
                escaped = !escaped;
            }
            if (!escaped) {
                if (c == '{' || c == '[') {
                    final String string = sb.toString();
                    if (!sb.toString().isEmpty()) {
                        json.add(createLine(indents, string));
                    }
                    json.add(createLine(indents, c));
                    indents++;
                    sb = new StringBuilder();
                } else if (c == '}' || c == ']') {
                    final String string = sb.toString();
                    if (!sb.toString().isEmpty()) {
                        json.add(createLine(indents, string));
                    }
                    indents--;
                    json.add(createLine(indents, c));
                    sb = new StringBuilder();
                } else if (c == ',') {
                    if (json.get(json.size() - 1).endsWith("]") || json.get(json.size() - 1).endsWith("}")) {
                        final String previousString = json.remove(json.size() - 1);
                        json.add(previousString + ',');
                    } else {
                        sb.append(c);
                        json.add(createLine(indents, sb.toString()));
                    }
                    sb = new StringBuilder();
                } else if (!Character.isWhitespace(c)) {
                    sb.append(c);
                }
            } else if (!Character.isWhitespace(c)) {
                sb.append(c);
            }
        }
        return json;
    }

    private static String createLine(final int indents, final Object object) {
        final StringBuilder lineSb = new StringBuilder();
        for (int j = indents; j > 0; j--) {
            lineSb.append('\t');
        }
        return lineSb.append(object).toString();
    }
}