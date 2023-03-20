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

package org.checkstyle.suppressionxpathfilter;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.puppycrawl.tools.checkstyle.DefaultConfiguration;
import com.puppycrawl.tools.checkstyle.checks.metrics.CyclomaticComplexityCheck;

public class XpathRegressionCyclomaticComplexityTest extends AbstractXpathTestSupport {

    private final String checkName = CyclomaticComplexityCheck.class.getSimpleName();

    @Override
    protected String getCheckName() {
        return checkName;
    }

    @Test
    public void testOne() throws Exception {

        final File fileToProcess =
                new File(getPath("SuppressionXpathRegressionCyclomaticComplexityOne.java"));

        final DefaultConfiguration moduleConfig =
                createModuleConfig(CyclomaticComplexityCheck.class);
        moduleConfig.addProperty("max", "0");

        final String[] expectedViolation = {
            "4:5: " + getCheckMessage(CyclomaticComplexityCheck.class,
                    CyclomaticComplexityCheck.MSG_KEY, 2, 0),
        };

        final List<String> expectedXpathQueries = Arrays.asList(
            "/COMPILATION_UNIT/CLASS_DEF"
                + "[./IDENT[@text='SuppressionXpathRegressionCyclomaticComplexityOne']]"
                + "/OBJBLOCK/METHOD_DEF[./IDENT[@text='test']]",
            "/COMPILATION_UNIT/CLASS_DEF"
                + "[./IDENT[@text='SuppressionXpathRegressionCyclomaticComplexityOne']]"
                + "/OBJBLOCK/METHOD_DEF[./IDENT[@text='test']]/MODIFIERS",
            "/COMPILATION_UNIT/CLASS_DEF"
                + "[./IDENT[@text='SuppressionXpathRegressionCyclomaticComplexityOne']]"
                + "/OBJBLOCK/METHOD_DEF[./IDENT[@text='test']]/MODIFIERS/LITERAL_PUBLIC"
                );

        runVerifications(moduleConfig, fileToProcess, expectedViolation,
                expectedXpathQueries);
    }

    @Test
    public void testTwo() throws Exception {
        final File fileToProcess =
                new File(getPath("SuppressionXpathRegressionCyclomaticComplexityTwo.java"));

        final DefaultConfiguration moduleConfig =
                createModuleConfig(CyclomaticComplexityCheck.class);
        moduleConfig.addProperty("max", "0");

        final String[] expectedViolation = {
            "6:5: " + getCheckMessage(CyclomaticComplexityCheck.class,
                    CyclomaticComplexityCheck.MSG_KEY, 5, 0),
        };

        final List<String> expectedXpathQueries = Arrays.asList(
            "/COMPILATION_UNIT/CLASS_DEF"
                    + "[./IDENT[@text='SuppressionXpathRegressionCyclomaticComplexityTwo']]"
                    + "/OBJBLOCK/METHOD_DEF[./IDENT[@text='foo2']]",
            "/COMPILATION_UNIT/CLASS_DEF"
                    + "[./IDENT[@text='SuppressionXpathRegressionCyclomaticComplexityTwo']]"
                    + "/OBJBLOCK/METHOD_DEF[./IDENT[@text='foo2']]/MODIFIERS",
            "/COMPILATION_UNIT/CLASS_DEF"
                    + "[./IDENT[@text='SuppressionXpathRegressionCyclomaticComplexityTwo']]"
                    + "/OBJBLOCK/METHOD_DEF[./IDENT[@text='foo2']]/MODIFIERS/LITERAL_PUBLIC"
        );

        runVerifications(moduleConfig, fileToProcess, expectedViolation,
                expectedXpathQueries);
    }
}
