// Precision in Float Point

/* 

PS C:\Users\12345> jshell
|  Welcome to JShell -- Version 21.0.2
|  For an introduction type: /help intro

jshell> int myIntVal = 5; float myFloatVal = 5; double myDoubleVal = 5;
myIntVal ==> 5
myFloatVal ==> 5.0
myDoubleVal ==> 5.0

jshell> myIntVal = 5/2;
myIntVal ==> 2

jshell> myFloatVal
myFloatVal ==> 5.0

jshell> myFloatVal = 5 / 2;
myFloatVal ==> 2.0

jshell> myFloatVal = 5f / 2f;
myFloatVal ==> 2.5

jshell> myDoubleVal = 5d / 2d;
myDoubleVal ==> 2.5

jshell> myIntVal = 3/2;
myIntVal ==> 1

jshell> myFloatVal = 3f / 2f;
myFloatVal ==> 1.5

jshell> myFloatVal = 5f / 3f;
myFloatVal ==> 1.6666666

jshell> myDoubleVal = 5d / 3d;
myDoubleVal ==> 1.6666666666666667

*/

// Task : Convert pounds to kilograms
// 1 pound = 0.45359237 Kg

// Solution: 
/* 

PS C:\Users\12345> jshell
|  Welcome to JShell -- Version 21.0.2
|  For an introduction type: /help intro

jshell> double pounds = 42314.45453;
pounds ==> 42314.45453

jshell> double converter = 0.45359237;
converter ==> 0.45359237

jshell> double kilogram = pounds * converter;
kilogram ==> 19193.513715519937

 */

// Underscores are allowed in floating point, just as integers
// double myNum = 32_323_43_324.42_421_43;

/* 
jshell>  double myNum = 32_323_43_324.42_421_43
myNum ==> 3.2323433244242144E9
*/

