# Compiler-Design-project
simple compoler design project, follow readme file:)
CSC348 Compiler Assginments
Warning:
Each of these assignments will take quite a bit of work. In addition to adding a significant amount of
new code, you will need to familiarize yourself with a very large codebase from which you will be
starting. It is paramount that you try to put some work into this every day. Make good use of our
remaining class meetings. You can always ask questions about these assignments in class. This can be
especially helpful if there is something that my code is doing that you do not understand. Waiting until
the day before an assignment is due to work on it will pretty much guarantee that you will not be able to
complete it.
Groups:
You may work in groups of at most 3 students. If you work in a group, one person should make the real
submission. That person must include the names of all members of the group in the comment box when
making the submission. Other group members, must submit a text file listing the names of the group
members and indicating who is making the “real” submission. Failure to do so will result in a 10 point
penalty.
Overview:
These assignments involve modifying a toy programming language called Malgol so that it allows the use
of functions. Currently, a Malgol program consists of a block of code that allows for variable
declarations followed by a sequence of statements such as assignment, if-then-else, while loops, print,
and skip (no-op). Your task is to modify the compiler so that a Malgol program is now a list of function
definitions. Like C, the function called main will be the function that executes when the program is
started. At a high-level, this requires 3 changes to the Malgol language:
1. A program is now a list of function definitions instead of just a block. This means you must add
function definitions to the Malgol language.
2. All functions return a value. You must add a return statement to the language that indicates
what value is returned by the function.
3. Since all functions return a value, a function call is a kind of expression. You must add function
call as a possible kind of expression. You will, of course, need to handle the order of operations
correctly.
 
Current implementation:
The code you have been given works correctly for the programs in the testsNoFunctions directory.
Assuming the project has been built already (run ant in the Malgol folder), then the malgol-compile.bat
script will invoke the compiler. The syntax is:
malgol-compile stage input-file [output-file]
The stage is a number between 1 and 5. The output-file argument is optional. If no output-file name is
provided, the result of the compilation is dumped on the screen. Below is a description of what the
stages are:
1. The input-file is parsed and an AST is generated. The AST is then printed out as C code.
2. Same as stage 1, but before the AST is printed out, a semantic analysis is performed on the AST.
This semantic analysis should report the first type error it finds (if there are any). If there are no
type errors, then again, the AST is printed out as a C program.
3. Same as stage 2, but before the AST is printed out, a transformation is made on the tree to
remove all non-linear statements. Any loops and if-then-else’s are replaced with labels and
simplified if-then-else’s where the true branch is a goto statement and the false branch is a skip
statement. (This kind of if-then-else is easily translated into an assembly conditional branch
instruction.) When the code is output as C code, the C code will also have no loops and only
simplified if statements with no else’s.
4. Same as stage 3 above but before the AST is printed out, a transformation is made on the tree
to simplify all expressions appearing in the program. A simplified expression is one that contains
as most one operation or one function call. This is done by converting a large, complex
expression into a series of assignments into temporary variables where the right side of the
assignment is a simple expression. (It contains at most one operation or function call.) The
resulting C code that is generated will also have only simple expressions.
5. This is the assembly code generation stage. The result of running all the way through stage 5 is
that the code produced by the compiler will be in x86 assembly.
Milestones:
Each milestone is its own assignment. By the end, you will have a compiler that gets through all 5
stages. However, there will be milestones that you must deliver on various dates along the way. The
due date for each assignment is firm and cannot be extended as I will be providing solutions to each
milestone at the submission deadline. This way, if you cannot successfully complete one of the stages,
you can still complete later stages by using my solution to earlier stages. The choice is entirely up to you
as to whether or not you want to use my solution to earlier stages. Note that there is no milestone for
stage 3 as the changes to get stage 3 to work are trivial. For each milestone, your compiler must
produce code that can be compiled using gcc and then executes as expected. Note: All milestones are
due at 3:00PM (before class) except the last one (stage 5) which is due by 11:59PM. 
Date Stage Code Produced
2/23 1 C code – some code may not work because of errors in the Malgol input
3/2 2 C code that always works or an error message indicating a semantic error
3/9 4 C code without loops, with restricted if-then-else, and with simple expressions
3/16 5 x86 assembly code
Testing:
The tests directory contains 20 tests. The tests named test1 through test12 are correct programs and
should produce code that runs. The 8 tests named testA through testH all have semantic errors.
Starting at stage 2, the compiler should produce an error message for each of them.
For the files test1 through test12, you should test them at the command line as follows:
malgol-compile s testn
gcc –o testn.exe testn.x
testn
Where s is the stage being tested (1, 2, 4, or 5), n is the test number (1-12) and x is the file extension (.s
for stage 5 and .c for stages 1, 2, and 4). For example, to attempt stage 1 with test5, you do the
following at the command line:
malgol-compile 1 test5
gcc –o test5.exe test5.c
test5
When using testA through testH, remember that these programs have semantic errors. At stage 1, they
will produce C code, but that code may not compile. At stages 2, 4, and 5, they should produce error
messages. To test these, you just want to run your Malgol compiler on them. For example, to try testC
at stage 2 you would type the following at the command line:
malgol-compile 2 testC
This should produce an error message indicating the error in the testC file.
Submission:
You must submit an ant submit file for each assignment. To create the submit file, run ant submit with
the stage number as follows:
ant –Dstage=n submit 
where n is the stage number (1, 2, 4, or 5). This will create a submit-yyyy-mm-dd-hh-mm-ss.zip file
similar to the submit files you had for the homework assignments. If you work in a team, one student
from your team should submit the zip file on D2L and include a comment listing all team members. The
other team members should submit a note indicating who submitted for the team and the list of team
members.
Grading:
There are a total of 20 tests, each worth 5 points. To get the points, the test must behave as expected
and the code generated by your compiler must meet the requirements for the phase in question
(simplified expressions for stage 4, assembly for stage 5, etc.). A test that hangs (does not terminate)
will be considered incorrect, even if it produces the correct output. Since semantic errors are not
detected until stage 2, you will get full credit for testA through testH in stage 1 as long as your compiler
does not crash. In stages 4 and 5, testA through testH will still behave as it did in stage 2. See the
screen shots at the end of this writeup for the expected behavior.
Stage1:
Here is an incomplete list of necessary changes to the codebase to get it to accept programs that are a
list of function definitions instead of a single block. The list only considers changes to get it to convert
the malgol program into an equivalent C program (stage 1). As such, it does not list any of the changes
you will need to do in order to do type checking or eventually code generation. Additionally, I’m only
listing a basic outline of the major changes. Each major change may in turn require you to make smaller
changes in the rest of the code.
1. To allow for functions, you will need to add some new tokens to the language. As well as new
grammar rules. Make sure your start symbol is still program.
2. With the new grammar rules, SableCC will generate new parse tree nodes. You will need to
modify the ParseTree2AST visitor to account for this.
3. You will need to add new AST nodes for the new program constructs (function definition,
function call, and return statement). Make sure the root of the AST is still a Program node.
4. New AST nodes means you need to change the definition of all ASTVisitor interface to include
visit methods for the new types of AST nodes. This will force you to modify the definitions of all
the classes the implement ASTVisitor. For now, focus on UntypedAST2CVisitor. That is the only
one that needs to be defined correctly in order to convert malgol to C. You will need to provide
“empty” visit functions in the other visitors in order to get the project to compile. You should
have all of them throw a RuntimeException until you actually define them.
5. Currently, my code assumes that the start symbol for the grammar is program and the root of
the AST is a program node. As long as you keep this the same, nothing in Main needs to change. 
Trouble with the grammar rules for argument list or parameter list?
If you cannot seem to get the parameter list or argument list to work correctly with the commas, you
can get partial credit by only handling functions with 0, 1, or 2 arguments as opposed to functions with
an arbitrary number of arguments.
Stage 2:
Here is an incomplete list of necessary changes to the codebase to get it to type check programs that
are a list of function definitions instead of a single block assuming you already have code that generates
a correct AST. Note that since the tree doesn’t really change, most of the changes you need to make to
the AST2CVisitor, you already made in the UntypedAST2CVisitor last time. I’m only listing a basic outline
of the major changes. Each major change may in turn require you to make smaller changes in the rest of
the code.
1. You will need to type check function definitions. This requires a couple of new steps.
a. You will need to type check the body of the function. This is just a block so it can be
type checked like before, except for the fact that you have a new kind of variable. The
parameters to the function are not declared inside a block, but you still need to make
sure they are used correctly inside the body of the function.
b. The function has a return type (either int or bool). You need to make sure that every
return statement in the body of the function returns a value of the correct type. (Hint:
As you traverse the body of a function you will need to remember the return type of the
function.)
2. You will also need to type check function calls. For a function call to be correct, it must have the
same number of arguments as appear in the function definition. The arguments must have the
same type as the parameters in the corresponding positions in the function definition. And
finally the return type of the function must match how it is being used. (In other words, x = f(5)
is an error if x is a variable of type int but f has return type bool.)
(Hint: Note that function names are GLOBAL identifiers. You will need to be able to look up the
type information about a function while in the body of a different function that calls it. So it
would probably be useful to have a global symbol table that holds all the functions and make
sure it is always available while doing type checking. So when type checking a program, I would
make one pass through the list of function definitions first to collect the types of all the functions,
including both argument types and return types.)
3. You would need to add cases for all of the new constructs (function definitions, function calls,
and return statements) to the AST2CVisitor. Note that you already did this for
UntypedAST2CVisitor so almost all the work is done for you already. In fact, in the solution to
stage 1 that I provide, I went ahead and copied the definitions of these cases from
UntypedAST2CVisitor for you. This will work as is, but what you might consider doing is
imitating what is already done for bool variables. After the static analysis phase, any time a bool 
variable is output, it is prefixed with “b_” to identify it as such. You might do something similar
with functions that return a bool, although this is not required.
Stage 4:
Here is an incomplete list of necessary changes to the codebase to get it to convert a list of function
definitions with structured control and complex expressions into a list of function definitions with very
simple linear control and expressions with at most one operation in them. This assumes you already
have code that generates a correct AST and that correctly type checks it. Each major change listed
below may in turn require you to make additional smaller changes in other parts of the code.
1. The RemoveStructuredControlVisitor class contains the code that removes loops and changes
arbitrary if-then-else into if then-goto else-skip. You will need to add methods for any new AST
nodes you added or changed. Presumably this means you at least need to add code for program
nodes, function definition nodes, function call nodes, and return nodes. As was stated in class,
however, there isn’t much that needs to happen at this level, as none of these new nodes
represent complex if-then-else or while loops. You need only worry about function definitions
containing structured control in their bodies.
2. The SimplifyExpressionsVisitor class contains the code the replaces complex expressions with a
list of assignment statements. Again, you will need to add cases for any new AST nodes you
defined like function definition, function call, and return.
a. The most involved one will be for function call since it is an expression while function
definition and return are not.
b. Remember that in the code given to you, every operation resulted in a new temporary
variable. As discussed in class, you should do the analogous thing and make sure that
every function call results in a new temporary variable as well.
c. Also, in the code given to you, the arguments of expressions had to be simplified. You
will need to do the same thing for function arguments.
3. When printing out the AST to C code in stage 4, a LinearExpressionAST2CVisitor is used. This
should work unchanged, although you might consider adding a case to detect complex function
calls much like the code already there detects complex expressions. This could help you in
testing and debugging your code; however, it is not necessary to get full credit.
Stage 5:
Here is an incomplete list of necessary changes to the codebase to get it to convert a “linearized”
program into an assembly language program. This assumes you have working code that can generate C
code without loops, with restricted if statements, and with expressions that contain at most one
operation or function call in them from arbitrary Malgol code. I’m only listing a basic outline of the
major changes. Each major change may in turn require you to make smaller changes in the rest of the
code. The main change is that you need to add cases for function definition, function call, and return in
the CodeGenerationVisitor. 
1. For function definition:
a. Most of the work is done by a recursive call to generate the body of the function.
However, as discussed in class, you will need to generate code to set up the call frame.
You will also need to enter the locations of the function parameters into the symbol
table before you enter the body so that the locations of those variables are known when
you process the body.
b. Note that to set up the call frame, you need to know the amount of space needed for all
local variables as well as the space needed to setup arguments for outgoing function
calls. The FrameLayoutVisitor class already provided lays out the variables appearing in
a function. While doing this work, you can keep track of the total space used too so that
you know how big to make the stack frame when it comes time to generate code.
c. You may want to compile some simple C functions into assembly to see how it is already
done in C and then try to mimic that in your compiler. If you do, make sure to use the
command line switches I indicate in the tips for assembly below.
2. For function call:
a. You will need to setup the arguments to the function call correctly at the low end of the
call frame (remember the stack grows “down” in memory) and then call the function.
b. Note that arrays are passed by reference (a pointer to the array is passed to the
function). There is a subtlety involved that I discuss briefly in the second set of tips
below.
c. Again, you may want to compile some simple C function that calls another function into
assembly to see how it is already done in C and then try to mimic that in your compiler.
3. For return:
a. Remember that the function call is an expression, so the code at the point of the call to
the function is expecting the result in the %eax register.
b. Again, compiling a simple C function into assembly and then looking at the generated
code is probably the easiest way to figure out what assembly instructions to use.
Important tips for trying to figure out assembly:
1. Compile small C functions and small C programs to assembly and look at the resulting assembly
to help you figure out what you need to do. But remember that you do not need to generate
exactly what gcc generates! You should be going for the simplest, most intuitive translation
possible even if it is unnecessarily long.
2. When compiling small C programs/functions to assembly, don’t forget the 3 switches:
a. –S to stop at assembly
b. –O0 to eliminate optimizations as much as possible
c. –fno-dwarf2-cfi-asm to remove some unnecessary assembly directives that will only
confuse you.
3. To test your compiler, you can use gcc to compile the resulting assembly. Remember to make
sure that your file name ends in .s since gcc uses the extension to decide what language it is
trying to compile. 
Important advice for the project as a whole regarding partial credit.
1. Do your project in such a way as to be able to get partial credit. It is better to have a compiler
that works on simple examples and fails on complex ones than to have a compiler where you
tried to do the whole thing but nothing works.
2. One test checks whether or not you can pass arrays as arguments to a function. Note that there
is a subtlety involved with passing pointers to arrays to a function that you will most likely not
fully appreciate until you have to struggle with it. Again, my advice is get the other tests
working first. You will still get a very good grade if everything else works fine and the only test
that fails is the one where an array is being passed as an argument to a function.
Expected Behavior:
On the pages the follow are screen shots of the expected behavior of a fully working compiler (through
stage 5). Behavior for stages 2 and 4 should be identical except for the stage number used and the
extension sued (.c instead of .s). Behavior for stage 1 should be identical for test1 through test12 but
testA through testH will not generate an error message yet. As long as your code does not crash, you
get full credit for testA through testH in stage 1.
 
• test1 – only 1 function (main) with no arrays
• test2 – only 1 function (main) with local array variable
• test3 – main calls a single 0-argument function
• test4 – main calls a single 0-argument function f and f calls a single 0-argument function g
 
• test5 – main calls a single 2-argument function
• test6 – main calls a 4-argument function which in turn calls a 2-argument function
 
• test7 – a function with a return statement that has a complex expression
• test8 – calls a function with complex expressions as arguments
 
• test9 – calls a function with an array indexing expression as an argument
• test10 – calling a function with function calls as arguments
 
• test11 – main calls a function that is defined recursively
• test12 – main calls a function that takes an array argument
 
• testA – main tries to call a function that has not been defined
• testB – a variable is being used as a function
 
• testC – A function is being used as an int variable
• testD – a function is being used as an array
 
• testE – a function call does not have the correct number of arguments.
• testF – a function argument is has the wrong type
 
• testG – print requires int expression, but the function returns a bool
• testH – an expression in a return statement has the wrong type 
