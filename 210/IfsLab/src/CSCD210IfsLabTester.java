import java.io.*;

public class CSCD210IfsLabTester {
    public static void main(String[] args) throws IOException {
        // Prepare test cases
        String[] testInputs = {
                "444400003\n444401350\nr\n", // Residential customer, simple case
                "999999997\n5\nr\n",        // Residential customer, meter rollover
                "444400003\n444409003\nb\n",  // Business customer, usage under 999.9 gallons
                "999999997\n5\nb\n",        // Business customer, meter rollover, usage under 999.9 gallons
                "444400000\n444500000\nb\n"   // Business customer, usage above 999.9 gallons
        };

        String[] expectedOutputs = {
                "Customer Code: r\nBeginning Meter Reading: 444400003\nEnding Meter Reading: 444401350\nGallons of Water Used: 134.7\nAmount Billed: $25.04",
                "Customer Code: r\nBeginning Meter Reading: 999999997\nEnding Meter Reading: 5\nGallons of Water Used: 0.8\nAmount Billed: $25.00",
                "Customer Code: b\nBeginning Meter Reading: 444400003\nEnding Meter Reading: 444409003\nGallons of Water Used: 900.0\nAmount Billed: $1500.02",
                "Customer Code: b\nBeginning Meter Reading: 999999997\nEnding Meter Reading: 5\nGallons of Water Used: 0.8\nAmount Billed: $1500.00",
                "Customer Code: b\nBeginning Meter Reading: 444400000\nEnding Meter Reading: 444500000\nGallons of Water Used: 10000.0\nAmount Billed: $1500.11"
        };

        // Redirect System.in and System.out for testing
        for (int i = 0; i < testInputs.length; i++) {
            InputStream originalIn = System.in;
            PrintStream originalOut = System.out;

            try (ByteArrayInputStream testIn = new ByteArrayInputStream(testInputs[i].getBytes());
                 ByteArrayOutputStream testOut = new ByteArrayOutputStream()) {
                System.setIn(testIn);
                System.setOut(new PrintStream(testOut));

                // Run the student's code
                CSCD210IfsLab.main(null);

                // Get the actual output
                String actualOutput = testOut.toString().trim();

                // Print expected and actual results
                System.setOut(originalOut);
                System.out.println("Test Case " + (i + 1) + ":");
                System.out.println("Expected Output:");
                System.out.println(expectedOutputs[i]);
                System.out.println();
                System.out.println("Actual Output:");
                System.out.println(actualOutput);
                System.out.println("-----------------------------------\n");
            } finally {
                System.setIn(originalIn);
                System.setOut(originalOut);
            }
        }
    }
}