package test;

import implementation.NonRepeatingChar;
import junit.framework.TestCase;

public class NonRepeatingCharTest extends TestCase {

    public void testNonRepeatingChar() {
        assertEquals(NonRepeatingChar.nonRepeating("abcab"), new Character('c'));
        assertEquals(NonRepeatingChar.nonRepeating("abab"), null);
        assertEquals(NonRepeatingChar.nonRepeating("aabbbc"), new Character('c'));
        assertEquals(NonRepeatingChar.nonRepeating("aabbdbc"), new Character('d'));
    }
}