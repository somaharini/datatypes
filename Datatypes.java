public class Datatypes{
    public static void main(String[] args){
        byte byteValue = 127; 
        short shortValue = 32000; 
        int intValue = 100000;
        long longValue = 10000000000L; 
        float floatValue = 3.14f;
        double doubleValue = 3.141592653589793;
        char charValue = 'A'; 
        boolean booleanValue = true; 
        System.out.println("Demonstrating basic data types in Java:");
        System.out.println("byte value: " + byteValue);
        System.out.println("short value: " + shortValue);
        System.out.println("int value: " + intValue);
        System.out.println("long value: " + longValue);
        System.out.println("float value: " + floatValue);
        System.out.println("double value: " + doubleValue);
        System.out.println("char value: " + charValue);
        System.out.println("boolean value: " + booleanValue);
        System.out.println("\nPerforming operations:");
        System.out.println("Sum of intValue and longValue: " + (intValue + longValue));
        System.out.println("Character code of charValue: " + (int) charValue);
        System.out.println("Double to int conversion: " + (int) doubleValue);
    }
}
