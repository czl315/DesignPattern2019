package com.czl.jvm.classstructure;

/**
 * czl
 * createTime:2019/11/17
 */
public class JavapAdd {
    public static void main(String[] args) {
        int a=1;
        int b = 200;
        int c = a+b;
        System.out.println(c);
    }
    /**
     * {
     *   public com.czl.jvm.classstructure.JavapAdd();
     *     descriptor: ()V
     *     flags: ACC_PUBLIC
     *     Code:
     *       stack=1, locals=1, args_size=1
     *          0: aload_0
     *          1: invokespecial #1                  // Method java/lang/Object."<init>":()V
     *          4: return
     *       LineNumberTable:
     *         line 7: 0
     *       LocalVariableTable:
     *         Start  Length  Slot  Name   Signature
     *             0       5     0  this   Lcom/czl/jvm/classstructure/JavapAdd;
     *
     *   public static void main(java.lang.String[]);
     *     descriptor: ([Ljava/lang/String;)V
     *     flags: ACC_PUBLIC, ACC_STATIC
     *     Code:
     *       stack=2, locals=4, args_size=1
     *          0: iconst_1
     *          1: istore_1
     *          2: sipush        200
     *          5: istore_2
     *          6: iload_1
     *          7: iload_2
     *          8: iadd
     *          9: istore_3
     *         10: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
     *         13: iload_3
     *         14: invokevirtual #3                  // Method java/io/PrintStream.println:(I)V
     *         17: return
     *       LineNumberTable:
     *         line 9: 0
     *         line 10: 2
     *         line 11: 6
     *         line 12: 10
     *         line 13: 17
     *       LocalVariableTable:
     *         Start  Length  Slot  Name   Signature
     *             0      18     0  args   [Ljava/lang/String;
     *             2      16     1     a   I
     *             6      12     2     b   I
     *            10       8     3     c   I
     *     MethodParameters:
     *       Name                           Flags
     *       args
     * }
     * SourceFile: "JavapAdd.java"
     *
     */
}
