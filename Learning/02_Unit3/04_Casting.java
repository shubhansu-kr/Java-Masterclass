// Start Jshell
// PS C:\Users\12345> jshell
// |  Welcome to JShell -- Version 21.0.2
// |  For an introduction type: /help intro


/* 

jshell> int minIntVal = Integer.MIN_VALUE; byte minByteVal = Byte.MIN_VALUE;
minIntVal ==> -2147483648
minByteVal ==> -128

jshell> int newIntVal = minIntVal / 2;
newIntVal ==> -1073741824

jshell> byte newByteVal = minByteVal / 2;
|  Error:
|  incompatible types: possible lossy conversion from int to byte
|  byte newByteVal = minByteVal / 2; 

*/

// We did not get error while initialising newIntVal but got one in newByteVal
// In java, expressions involving variables are not auto resolved for data types, they are treated as integer expressions. So when the expression is evaluated, and assigned to a byte variable, the int is being put in byte which results in loss of data, thus we get an lossy conversion error. 
// The same is not the case when we dont use variables. 
/* 

jshell> byte newByteVal = -128 / 2;
newByteVal ==> -64

 */
// No error in above code because variables are not involved;

// This behavior is resolved using explicit casting of variables. 
/* 
jshell> newByteVal = (byte)(minByteVal / 2);
newByteVal ==> -64 
*/