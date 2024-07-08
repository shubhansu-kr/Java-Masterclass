// There are 8 primitive data types in java

/* 
    byte 
    short
    int
    long
    
    float
    double

    boolean

    char
 */

/* 
   1 : int minIntValue = Integer.MIN_VALUE;
   2 : int maxIntValue = Integer.MAX_VALUE;
   3 : int sumInt = minIntValue + maxIntValue;
   4 : System.out.println(sumInt);

 */

//  Task : Print the range of integer in a string format
// Solution: 
/* 

System.out.println("Integer Value Range ("+Integer.MIN_VALUE+" to "+Integer.MAX_VALUE+")");

or 

---> System.out.println(
---> "Integer Value Range ("
---> +
---> Integer.MIN_VALUE
---> +
---> " to "
---> +
---> Integer.MAX_VALUE
---> +
---> ")"
---> );

*/

// Here, Integer is a wrapper class, which provide basic operation and information about the data type.

// Underflow : Put a value less than the min. value of data type
// OverFlow : Put a value more than the max. value of data type

// Underflow and Overflow only happens when evaluating an expression, if we initialse a variable with incorrect value range, it will result in an error.

// int newNumber = 21_07_2021 : It is allowed in java for better readability
// int newNumber = 21,07,2021 : Error
/* 
   1 : int minIntValue = Integer.MIN_VALUE;
   2 : int maxIntValue = Integer.MAX_VALUE;
   3 : int sumInt = minIntValue + maxIntValue;
   4 : System.out.println(sumInt);
   5 : int dob = 21_07_2021;
   6 : System.out.println(dob)
 */

//  Prints 21072003

// byte short int long

// Byte : 8 bits
// System.out.println("Byte Value Range ("+Byte.MIN_VALUE+" to "+Byte.MAX_VALUE+")");
// Output: Byte Value Range (-128 to 127)

// Short : 16 bits
// System.out.println("Short Value Range ("+Short.MIN_VALUE+" to "+Short.MAX_VALUE+")");
// Short Value Range (-32768 to 32767)

// Int : 32 bits
// System.out.println("Integer Value Range ("+Integer.MIN_VALUE+" to "+Integer.MAX_VALUE+")");
// Integer Value Range (-2147483648 to 2147483647)

// Long : 64 bits
// System.out.println("Long Value Range ("+Long.MIN_VALUE+" to "+Long.MAX_VALUE+")");
// Long Value Range (-9223372036854775808 to 9223372036854775807)

// By defaut whole number are initialised as integer. Use L as a specifier to create a long variable
// long myLongNum = 210L

// When we create a number which is smaller than int max val, the number is initialised as int and then assigned to long variable. so to avoid error when initialising the varibale outside the range of int we need to put 'L' suffix. 