package Task10;

import java.util.Arrays;

public class Main {
    public static void describeClass(String className) {
        try {
            System.out.println("\n***************  " + className + "  ***************");
            Class<?> clazz = Class.forName(className);
            System.out.println("Fields: " + Arrays.toString(clazz.getDeclaredFields()));
            System.out.println("Methods: " + Arrays.toString(clazz.getDeclaredMethods()));
            System.out.println("Implements: " + ": " + Arrays.toString(clazz.getAnnotatedInterfaces()));

            Class<?> basicBread = clazz.getSuperclass();
            if(basicBread != null){
                System.out.println("Extends: " + basicBread.getName());
                if(!basicBread.getName().equals("java.lang.Object")) {
                    describeClass(basicBread.getName());
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
//        describeClass("com.company.classes.Interface");
//        describeClass("com.company.classes.Base");
        describeClass("Task10.ComplexBread");
    }
}

