///////////////////////////////////////////////////////////////////////////////////////////////
// checkstyle: Checks Java source code and other text files for adherence to a set of rules.
// Copyright (C) 2001-2023 the original author or authors.
//
// This library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 2.1 of the License, or (at your option) any later version.
//
// This library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
// Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public
// License along with this library; if not, write to the Free Software
// Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
///////////////////////////////////////////////////////////////////////////////////////////////

package com.puppycrawl.tools.checkstyle.checks.imports;

import static com.google.common.truth.Truth.assertWithMessage;

import org.junit.jupiter.api.Test;

public class AccessResultTest {

    /* Additional test for jacoco, since valueOf()
     * is generated by javac and jacoco reports that
     * valueOf() is uncovered.
     */
    @Test
    public void testAccessResultValueOf() {
        final AccessResult result = AccessResult.valueOf("ALLOWED");
        assertWithMessage("Invalid access result")
            .that(result)
            .isEqualTo(AccessResult.ALLOWED);
    }

    /* Additional test for jacoco, since values()
     * is generated by javac and jacoco reports that
     * values() is uncovered.
     */
    @Test
    public void testAccessResultValues() {
        final AccessResult[] actual = AccessResult.values();
        final AccessResult[] expected = {
            AccessResult.ALLOWED,
            AccessResult.DISALLOWED,
            AccessResult.UNKNOWN,
        };
        assertWithMessage("Invalid access result values")
            .that(actual)
            .isEqualTo(expected);
    }

}