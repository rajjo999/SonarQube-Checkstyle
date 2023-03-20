/*
ImportOrder
option = bottom
groups = org, java
ordered = (default)true
separated = (default)false
separatedStaticGroups = (default)false
caseSensitive = (default)true
staticGroups = (default)
sortStaticImportsAlphabetically = true
useContainerOrderingForStatic = (default)false
tokens = (default)STATIC_IMPORT


*/

package com.puppycrawl.tools.checkstyle.checks.imports.importorder;

import org.antlr.v4.runtime.*; // ok

import java.util.Set; // violation 'Extra separation in import group before 'java.util.Set''

import static java.lang.Math.*; // violation 'Extra separation in import group before 'java.lang.Math.*''
import static org.antlr.v4.runtime.CommonToken.*; // ok

public class InputImportOrderStaticOnDemandGroupOrderBottom2
{

}
