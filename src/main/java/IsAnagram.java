/**
 * Created by ransong on 4/10/16.
 */
public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        boolean result = true;
        if (s.trim().length() == t.trim().length()) {
            String n = s.trim();
            for (int i =0; i < n.length(); i++) {
                if (charExistNum(s, n.charAt(i)) != charExistNum(t, n.charAt(i))) {
                    result = false;
                }
            }

        } else {
            result = false;
        }

        return result;
    }

    private int charExistNum(String m, Character a) {
        int j = 0;
        for (int i=0; i < m.length(); i++) {
            if (m.charAt(i) == a) {
                j++;
            }
        }

        return j;
    }
}
