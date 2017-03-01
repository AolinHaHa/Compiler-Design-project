                    .data
   _printf_string:
                    .ascii    "%d\n\0"
                    .text
                    .global _main

             _max:
                    pushl     %ebp
                    movl      %esp, %ebp
                    subl      $12, %esp
                    movl      12(%ebp), %eax
                    movl      %eax, %ecx
                    movl      8(%ebp), %eax
                    cmpl      %ecx, %eax
                    setge     %al
                    movzbl    %al, %eax
                    movl      %eax, %ecx
                    leal      -4(%ebp), %eax
                    movl      %ecx, (%eax)
                    movl      -4(%ebp), %eax
                    cmpl      $0, %eax
                    jne       L_if_true1
                    jmp       L_if_false2
       L_if_true1:
                    movl      8(%ebp), %eax
                    leave
                    ret
                    jmp       L_if_end3
      L_if_false2:
                    movl      12(%ebp), %eax
                    leave
                    ret
        L_if_end3:
                    nop

            _main:
                    pushl     %ebp
                    movl      %esp, %ebp
                    subl      $40, %esp
                    movl      $1, %eax
                    movl      %eax, %ecx
                    leal      -4(%ebp), %eax
                    movl      %ecx, (%eax)
                    movl      $100, %eax
                    movl      %eax, %ecx
                    leal      -8(%ebp), %eax
                    movl      %ecx, (%eax)
     L_loop_test4:
                    movl      $10, %eax
                    movl      %eax, %ecx
                    movl      -4(%ebp), %eax
                    cmpl      %ecx, %eax
                    setl      %al
                    movzbl    %al, %eax
                    movl      %eax, %ecx
                    leal      -12(%ebp), %eax
                    movl      %ecx, (%eax)
                    movl      -12(%ebp), %eax
                    cmpl      $0, %eax
                    jne       L_loop_body5
                    jmp       L_loop_exit6
     L_loop_body5:
                    movl      $20, %eax
                    movl      %eax, %ecx
                    movl      -4(%ebp), %eax
                    imull     %ecx, %eax
                    movl      %eax, %ecx
                    leal      -16(%ebp), %eax
                    movl      %ecx, (%eax)
                    movl      -16(%ebp), %eax
                    movl      %eax, 0(%esp)
                    movl      -8(%ebp), %eax
                    movl      %eax, 4(%esp)
                    call      _max
                    movl      %eax, %ecx
                    leal      -20(%ebp), %eax
                    movl      %ecx, (%eax)
                    movl      $1000, %eax
                    movl      %eax, %ecx
                    movl      -20(%ebp), %eax
                    addl      %ecx, %eax
                    movl      %eax, %ecx
                    leal      -24(%ebp), %eax
                    movl      %ecx, (%eax)
                    movl      -24(%ebp), %eax
                    movl      %eax, 4(%esp)
                    movl      $_printf_string, (%esp)
                    call      _printf
                    movl      $1, %eax
                    movl      %eax, %ecx
                    movl      -4(%ebp), %eax
                    addl      %ecx, %eax
                    movl      %eax, %ecx
                    leal      -28(%ebp), %eax
                    movl      %ecx, (%eax)
                    movl      -28(%ebp), %eax
                    movl      %eax, %ecx
                    leal      -4(%ebp), %eax
                    movl      %ecx, (%eax)
                    movl      $5, %eax
                    movl      %eax, %ecx
                    movl      -8(%ebp), %eax
                    addl      %ecx, %eax
                    movl      %eax, %ecx
                    leal      -32(%ebp), %eax
                    movl      %ecx, (%eax)
                    movl      -32(%ebp), %eax
                    movl      %eax, %ecx
                    leal      -8(%ebp), %eax
                    movl      %ecx, (%eax)
                    jmp       L_loop_test4
     L_loop_exit6:
                    nop
                    movl      $0, %eax
                    leave
                    ret


