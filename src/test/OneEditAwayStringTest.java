package test;

import implementation.OneEditAwayString;
import junit.framework.TestCase;

public class OneEditAwayStringTest extends TestCase {

    public void testOneAwayEdit() {
        assertTrue(OneEditAwayString.isOneEditAway("abcde", "abcd"));
        assertTrue(OneEditAwayString.isOneEditAway("abde", "abcde"));
        assertTrue(OneEditAwayString.isOneEditAway("a", "a"));
        assertTrue(OneEditAwayString.isOneEditAway("abcdef", "abqdef"));
        assertTrue(OneEditAwayString.isOneEditAway("abcdef", "abccef"));
        assertTrue(OneEditAwayString.isOneEditAway("abcdef", "abcde"));
        assertTrue(!OneEditAwayString.isOneEditAway("aaa", "abc"));
        assertTrue(!OneEditAwayString.isOneEditAway("abcde", "abc"));
        assertTrue(!OneEditAwayString.isOneEditAway("abc", "abcde"));
        assertTrue(!OneEditAwayString.isOneEditAway("abc", "bcc"));
    }
}