package com.liuning.bytecode.asm;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;

import java.io.File;
import java.io.FileOutputStream;

/**
 * @author liuning
 * @description Generator
 * @since 2020-08-17 21:40
 */
public class Generator {

    public static void main(String[] args) throws Exception {
        //读取
        ClassReader classReader = new ClassReader("com/liuning/bytecode/Base");
        ClassWriter classWriter = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        //处理
        ClassVisitor classVisitor = new MyClassVisitor(classWriter);
        classReader.accept(classVisitor, ClassReader.SKIP_DEBUG);
        byte[] data = classWriter.toByteArray();
        //输出
        File f = new File("/Users/liuning/Documents/JetBrains/IdeaProjects/java-tutorial/build/classes/com/liuning/bytecode/asm/Base.class");
        FileOutputStream fout = new FileOutputStream(f);
        fout.write(data);
        fout.close();
        System.out.println("now generator cc success!!!!!");
    }
}
