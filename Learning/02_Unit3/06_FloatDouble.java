// There are two primitive data types in java to represent float point values.
// Float(32 Bits) and Double(64 Bits)

// Double is the default float point data type used by java.

/* 

PS C:\Users\12345> jshell
|  Welcome to JShell -- Version 21.0.2
|  For an introduction type: /help intro

jshell> System.out.println("Float Value Range ("+Float.MIN_VALUE+" to "+Float.MAX_VALUE+")");
Float Value Range (1.4E-45 to 3.4028235E38)

jshell> System.out.println("Double Value Range ("+Double.MIN_VALUE+" to "+Double.MAX_VALUE+")");
Double Value Range (4.9E-324 to 1.7976931348623157E308) 

*/

// Since double is the default data type for floating type number, 10.5 is double by default, to initialise a float data type, use f or F as a suffix, eg. 10.5f

/* 

jshell> int myIntVal = 5;
myIntVal ==> 5

jshell> float myFloatVal = 5;
myFloatVal ==> 5.0

jshell> double myDoubleVal = 5;
myDoubleVal ==> 5.0

jshell> myFloatVal = 5.0f;
myFloatVal ==> 5.0

jshell> myFloatVal = 5.0
|  Error:
|  incompatible types: possible lossy conversion from double to float
|  myFloatVal = 5.0
|               ^-^

jshell> myDoubleVal = 5.0d;
myDoubleVal ==> 5.0

jshell> myDoubleVal = 5.0;
myDoubleVal ==> 5.0

jshell> myFloatVal = (float) 5.0;
myFloatVal ==> 5.0

*/

// Either use casting or suffix to define the data type.