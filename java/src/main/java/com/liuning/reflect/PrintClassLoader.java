package com.liuning.reflect;

//import com.sun.javafx.util.Logging;

import javax.sql.DataSource;
import java.util.ArrayList;

/**
 * 类加载器测试
 *
 * @author liuning
 * @see java.lang.ClassLoader
 * @see sun.misc.Launcher.ExtClassLoader
 * @see sun.misc.Launcher.AppClassLoader
 * @see jdk.internal.loader.ClassLoaders.PlatformClassLoader
 * @see jdk.internal.loader.ClassLoaders.AppClassLoader
 * @since 2021-03-20 17:36
 */
public class PrintClassLoader {

    public static void main(String[] args) throws ClassNotFoundException {

        PrintClassLoader classLoader = new PrintClassLoader();
        classLoader.printClassLoaders();
    }

    public void printClassLoaders() throws ClassNotFoundException {

        //应用类加载器application classloader
        System.out.println("Classloader of this class:"
                + PrintClassLoader.class.getClassLoader());

        //扩展类加载器extendsion classloader
        System.out.println("Classloader of Logging:"
                + DataSource.class.getClassLoader());

        //启动类加载器bootstrap classloader打印出来是null
        //This is because the bootstrap class loader is written in native code,
        // not Java – so it doesn't show up as a Java class
        System.out.println("Classloader of ArrayList:"
                + ArrayList.class.getClassLoader());
    }

}
