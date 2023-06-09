/*
DescendantToken
limitedTokens = LITERAL_NATIVE
minimumDepth = (default)0
maximumDepth = (default)2147483647
minimumNumber = (default)0
maximumNumber = 0
sumTokenCounts = (default)false
minimumMessage = (default)null
maximumMessage = (default)null
tokens = LITERAL_NATIVE


*/

package com.puppycrawl.tools.checkstyle.checks.descendanttoken;

public class InputDescendantTokenIllegalTokens2
{
    public void methodWithPreviouslyIllegalTokens()
    {
        int i = 0;
        switch (i)
        {
            default:
                i--;
                i++;
                break;
        }
    }
    // violation below 'Count of 1 for 'LITERAL_NATIVE' descendant 'LITERAL_NATIVE' exceeds .* 0.'
    public native void nativeMethod();
}
