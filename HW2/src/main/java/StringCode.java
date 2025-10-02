import java.util.HashSet;
import java.util.Set;

// CS108 HW1 -- String static methods

public class StringCode {

	/**
	 * Given a string, returns the length of the largest run.
	 * A a run is a series of adajcent chars that are the same.
	 * @param str
	 * @return max run length
	 */
	public static int maxRun(String str) {
        int cnt = 1;
        int mx_cnt = 0;
        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == str.charAt(i - 1)) {
                cnt++;
            }
            else {
                mx_cnt = Integer.max(mx_cnt, cnt);
            }
        }
        return mx_cnt;
	}

	
	/**
	 * Given a string, for each digit in the original string,
	 * replaces the digit with that many occurrences of the character
	 * following. So the string "a3tx2z" yields "attttxzzz".
	 * @param str
	 * @return blown up string
	 */
	public static String blowup(String str) {
        StringBuilder sb = new StringBuilder();
        for  (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i))) {
                sb.append(str.charAt(i));
            }
            else {
                if (i != str.length() - 1) {
                    for (int j = 0; j < str.charAt(i) - '0'; j++) {
                        sb.append(str.charAt(i + 1));
                    }
                }
            }
        }
        return sb.toString();
	}
	
	/**
	 * Given 2 strings, consider all the substrings within them
	 * of length len. Returns true if there are any such substrings
	 * which appear in both strings.
	 * Compute this in linear time using a HashSet. Len will be 1 or more.
	 */
	public static boolean stringIntersect(String a, String b, int len) {
        HashSet<String> sub_strs = new HashSet<>();
        for(int i = 0; i < a.length(); i++) {
            String tmp = a.substring(i, i + len);
            sub_strs.add(tmp);
        }
        for(int i = 0; i < b.length(); i++) {
            String actual = b.substring(i, i + len);
            if(sub_strs.contains(actual)) {
                return true;
            }
        }
        return false; // YOUR CODE HERE
	}
}
