package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));

    }
    @Test
    public void backwardsBracketsReturnFalse() {
        assertFalse (BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void justOpeningReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void justClosingReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void balancedBracketsWithNonBracketCharactersReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void twoSetsOfBalancedBracketsWithNonBracketCharactersReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch][code]");
    }
    @Test
    public void twoNestedSetsOfBalancedBracketsWithNonBracketCharactersReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Laun[ch]code]");
    }

    @Test
    public void misNestedSetsOfBalancedBracketsWithNonBracketCharactersReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch]code]");
    }

    @Test
    public void extraOpeningBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch[code]");
    }

    @Test
    public void extraClosingBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch]code]");
    }

    @Test
    public void twoSetsMisNestedBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]Launch[Code"))
    }
}
