// Strings in Java

// String is not a primitive data type in java
// String can contain a sequence of charactes 

// String myString = "This is my first String declaration";

// Curly braces are used to execute multiple statements in jshell
/* 

PS C:\Users\12345> jshell
|  Welcome to JShell -- Version 21.0.2
|  For an introduction type: /help intro

jshell> String myString = "This is my string"
myString ==> "This is my string"

jshell> myString += " More content "
$2 ==> "This is my string More content "

jshell> System.out.println(myString
   ...> );
This is my string More content

jshell> {
   ...>     String myFirstString = "323.342";
   ...>     String mySecondString = "32.4343";
   ...>     System.out.println(myFirstString + mySecondString);
   ...> }
323.34232.4343

*/

// Expression makes up from left to right and left data type prevails 
