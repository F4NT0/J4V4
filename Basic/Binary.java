public class Binary {
    public static void main(String[] args) {
        
        
        int[] binary = {0,1,0,0};
        int decimalValue = 0;
        int index = 0;

        while (index < binary.length) {
            decimalValue += binary[index] * Math.pow(2,index);
            index++;
        }

        System.out.print("Binary: ");
        
        for (int bit : binary) {
            System.out.print(bit); // 0100
        }

        System.out.println("\nDecimal Number: " + decimalValue); //2
    }

    // Table test
    // index | binary.length |binary[index] | decimalValue
    //   0   |       4       |      0       |   0 + (0 * 2^0) = 0
    //   1   |       4       |      1       |   0 + (1 * 2^1) = 0 + 2 = 2
    //   2   |       4       |      0       |   2 + (0 * 2^2) = 2 + 0 = 2
    //   3   |       4       |      0       |   2 + (0 * 2^3) = 2 + 0 = 2
    // Result: 2
    
}
