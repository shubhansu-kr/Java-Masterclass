// We are using Jshell for this section 

// Jshell is a kindoff sandbox used to execute java instructions in shell itself.

// Run 'jshell' in windows command prompt
// This will take you to the jshell prompt in the terminal

// Type the following in the jshell prompt and hit enter
// System.out.println("Hello World")

// OutPut: Hello World.

// There you go, your first hello world using java through jshell.

// Exercise : Print "Hello <yourname>" in jshell
// Solution: System.out.print("Hello Shuvh");

// If you do not add semicolon(;) at the end of the instruction, jshell adds it automatically.

// Jshell helps us complete our code instruction - If we forget to type close parenthesis and hit enter, jshell will start a new line for the code for us to complete the instruction rather than treating it as a prompt with incorrect syntax. Jshell is not always this forgiving and gives an error log if we do any mistake like missing a double quote closing or something of that sort.

// System.out.println("Hello Shuvh);
// Output: 
// |  Error:
// |  unclosed string literal
// |  System.out.print("Hello shuvh);
// |

// We encountered an error because we forgot a double quote closing.

// In java singlequote is not used for literals or string. Double quote is used for strings whereas single quote is used for character data types.

// /help /exit