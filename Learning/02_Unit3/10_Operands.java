// Operators are specific symbols which perform specific task on variables.

// int result = 1 + 2;
// Here, 1 and 2 are operands and '+' is the operator.

// Char is a subset of Integer class, so expression involving char are executed in integer form.

// char firstChar = 'A';
// char secondChar = 'B';

// char thirdChar = firstChar + secondChar;

/* 
PS C:\Users\12345> jshell
|  Welcome to JShell -- Version 21.0.2
|  For an introduction type: /help intro

jshell> {
   ...>     char firstChar = 'A';
   ...>     char secondChar = 'B';
   ...>
   ...>     char thirdChar = firstChar + secondChar;
   ...> }
|  Error:
|  incompatible types: possible lossy conversion from int to char
|      char thirdChar = firstChar + secondChar;
|                       ^--------------------^

jshell> {
   ...>     char firstChar = 'A';
   ...>     char secondChar = 'B';
   ...>
   ...>     System.out.println(firstChar + secondChar);
   ...> }
131

jshell> {
   ...>     char firstChar = 'A';
   ...>     char secondChar = 'B';
   ...>
   ...>     char thirdChar = (char)(firstChar + secondChar);
   ...> }

jshell> {
   ...>     char firstChar = 'A';
   ...>     char secondChar = 'B';
   ...>
   ...>     char thirdChar = (char)(firstChar + secondChar);
   ...> }

jshell> {
   ...>     char firstChar = 'A';
   ...>     char secondChar = 'B';
   ...>
   ...>     char thirdChar = (char)(firstChar + secondChar);
   ...> }

jshell> System.out.println(thirdChar);
|  Error:
|  cannot find symbol
|    symbol:   variable thirdChar
|  System.out.println(thirdChar);
|                     ^-------^
 */