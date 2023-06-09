/*
JavadocType
scope = (default)private
excludeScope = (default)null
authorFormat = (default)null
versionFormat = \\$Revision.*\\$
allowMissingParamTags = (default)false
allowUnknownTags = (default)false
allowedAnnotations = (default)Generated
tokens = (default)INTERFACE_DEF, CLASS_DEF, ENUM_DEF, ANNOTATION_DEF, RECORD_DEF


*/

package com.puppycrawl.tools.checkstyle.checks.javadoc.javadoctype;

/**
 * Testing author and version tag patterns
 ****    @author Oliver Burn
 * @version 1.0
 */
class InputJavadocTypeJavadoc_2 // violation 'tag @version must match pattern'
{
}

/**
 * Testing author and version tag patterns (there are not tags :)
 * SomeText @author Oliver Burn
 * *@version 1.0
 */
class InputJavadocTypeJavadoc_12 // violation 'missing @version tag'
{
}

/**
 * Testing author and version tag patterns.
 * tags are multi line ones
 * @author Oliver Burn
 * @version 1.0 */
class InputJavadocTypeJavadoc_22 // violation 'tag @version must match pattern'
{
}

//Testing tag on first comment line
/**
* @author ABC
* @version 1.1
*/
class InputJavadocType_2 // violation 'tag @version must match pattern'
{
}

/**
 * Testing author and version tag patterns
 ****    @author Oliver Burn
 * @version 1.0
 */
enum InputJavadocTypeEnum_2 // violation 'tag @version must match pattern'
{
}

/**
 * Testing author and version tag patterns (there are not tags :)
 * SomeText @author Oliver Burn
 * *@version 1.0
 */
enum InputJavadocTypeEnum_12 // violation 'missing @version tag.'
{
}

/**
 * Testing author and version tag patterns.
 * tags are multi line ones
 * @author Oliver Burn
 * @version 1.0 */
enum InputJavadocTypeEnum_22 // violation 'tag @version must match pattern'
{
}

//Testing tag on first comment line
/**
* @author ABC
* @version 1.1
*/
@interface InputJavadocInterfaceType_2 // violation 'tag @version must match pattern'
{
}

/**
 * Testing author and version tag patterns
 ****    @author Oliver Burn
 * @version 1.0
 */
@interface InputJavadocInterface_2 // violation 'tag @version must match pattern'
{
}

/**
 * Testing author and version tag patterns (there are not tags :)
 * SomeText @author Oliver Burn
 * *@version 1.0
 */
@interface InputJavadocInterface_12 // violation 'missing @version tag.'
{
}

/**
 * Testing author and version tag patterns.
 * tags are multi line ones
 * @author Oliver Burn
 * @version 1.0 */
@interface InputJavadocInterface_22 // violation 'tag @version must match pattern'
{
}

//Testing tag on first comment line
/**
* @author ABC
* @version 1.1
*/
@interface InputJavadocInterfaceType_12 // violation 'tag @version must match pattern'
{
}
