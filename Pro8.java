public class OperatorDemo {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 4;
        
        // Arithmetic Operators
        int addition = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;
        int division = num1 / num2;
        int modulus = num1 % num2;
        
        // Relational Operators
        boolean equalTo = num1 == num2;
        boolean notEqualTo = num1 != num2;
        boolean greaterThan = num1 > num2;
        boolean lessThan = num1 < num2;
        boolean greaterThanOrEqualTo = num1 >= num2;
        boolean lessThanOrEqualTo = num1 <= num2;
        
        // Logical Operators
        boolean logicalAnd = (num1 > 0) && (num2 < 10);
        boolean logicalOr = (num1 > 0) || (num2 > 10);
        boolean logicalNot = !(num1 > num2);
        
        // Bitwise Operators
        int bitwiseAnd = num1 & num2;
        int bitwiseOr = num1 | num2;
        int bitwiseXor = num1 ^ num2;
        int bitwiseComplement = ~num1;
        int leftShift = num1 << 1;
        int rightShift = num1 >> 1;
        
        // Output
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Modulus: " + modulus);
        
        System.out.println("\nRelational Operators:");
        System.out.println("Equal To: " + equalTo);
        System.out.println("Not Equal To: " + notEqualTo);
        System.out.println("Greater Than: " + greaterThan);
        System.out.println("Less Than: " + lessThan);
        System.out.println("Greater Than or Equal To: " + greaterThanOrEqualTo);
        System.out.println("Less Than or Equal To: " + lessThanOrEqualTo);
        
        System.out.println("\nLogical Operators:");
        System.out.println("Logical AND: " + logicalAnd);
        System.out.println("Logical OR: " + logicalOr);
        System.out.println("Logical NOT: " + logicalNot);
        
        System.out.println("\nBitwise Operators:");
        System.out.println("Bitwise AND: " + bitwiseAnd);
        System.out.println("Bitwise OR: " + bitwiseOr);
        System.out.println("Bitwise XOR: " + bitwiseXor);
        System.out.println("Bitwise Complement: " + bitwiseComplement);
        System.out.println("Left Shift: " + leftShift);
        System.out.println("Right Shift: " + rightShift);
    }
}
