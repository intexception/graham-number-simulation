package best.nquantum.util;

import java.math.BigInteger;

public final class Formatter {

    public static String formatLargeNumber(final BigInteger number) {
        final String numStr = number.toString();
        if (numStr.length() > 20)
            return numStr.substring(0, 10) + "..." + numStr.substring(numStr.length() - 10) +
                    " (length: " + numStr.length() + ")";
        else
            return numStr;
    }

}