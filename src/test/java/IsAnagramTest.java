import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ransong on 4/10/16.
 */
public class IsAnagramTest {
    @Test
    public void testIsAnagramTest() {
        IsAnagram isAnagrams = new IsAnagram();

        String s = "anagram";
        String t = "nagaram";
        assertTrue(isAnagrams.isAnagram(s,t));

        String m = "rat";
        String n = "tar";
        assertTrue(isAnagrams.isAnagram(m,n));
    }

}