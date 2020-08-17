package com.liuning.bytecode.javaassist;

import com.liuning.bytecode.Base;
import javassist.*;

import java.io.IOException;

/**
 * @author liuning
 * @description JavassistTest
 * @since 2020-08-17 21:30
 */
public class JavassistDemo {

    public static void main(String[] args) throws NotFoundException, CannotCompileException, IllegalAccessException, InstantiationException, IOException {
        ClassPool cp = ClassPool.getDefault();
        CtClass cc = cp.get("com.liuning.bytecode.Base");
        CtMethod m = cc.getDeclaredMethod("process");
        m.insertBefore("{ System.out.println(\"start\"); }");
        m.insertAfter("{ System.out.println(\"end\"); }");
        Class<?> c = cc.toClass();
        cc.writeFile("/Users/liuning/Documents");
        Base h = (Base)c.newInstance();
        h.process();
    }
}
