// Task: Create 4 variables of different data type and write an expression.
// Solution: 
/* 

PS C:\Users\12345> jshell
|  Welcome to JShell -- Version 21.0.2
|  For an introduction type: /help intro

jshell> byte myByteNum = 21;
myByteNum ==> 21

jshell> short myShortNum = 212;
myShortNum ==> 212

jshell> int myIntNum = 21212121;
myIntNum ==> 21212121

jshell> long myLongNum = 32423543242345L;
myLongNum ==> 32423543242345

jshell> myLongNum = (long)(myLongNum - (myByteNum + myShortNum + myIntNum));
myLongNum ==> 32423522029991

*/