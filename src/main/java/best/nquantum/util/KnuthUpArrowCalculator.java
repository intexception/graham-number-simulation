package best.nquantum.util;

import java.math.BigInteger;

public class KnuthUpArrowCalculator {

    public static BigInteger compute(final int base, final int exponent, final int arrows) {
        if (arrows == 1)
            return BigInteger.valueOf(base).pow(exponent);
        else {
            // Handle exponentiation
            BigInteger result = BigInteger.valueOf(base);
            for (int i = 1; i < exponent; i++) {
                // Next power
                result = compute(base, result.intValue(), arrows - 1);
                // Check if the result is getting too large to handle
                if (result.bitLength() > 1024) { // 1024-bit size as an arbitrary threshold
                    System.out.println("Too large to compute explicitly, returning symbolic representation.");
                    return BigInteger.valueOf(-1); // Return a symbolic value to indicate overflow
                }
            }
            return result;
        }
    }

}
