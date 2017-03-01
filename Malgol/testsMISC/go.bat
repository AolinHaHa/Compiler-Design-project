@del *.c
@del *.s
@del *.exe
@set CP=%CUP_JAR%
@set CP=%CP%;..\build\bin
dir *.c *.s *.exe
java -ea -cp %CP% malgol.Driver test > test.s
java -ea -cp %CP% malgol.Driver recursion > recursion.s
java -ea -cp %CP% malgol.Driver choose > choose.s


