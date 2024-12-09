package best.nquantum.simulator.impl;

import best.nquantum.simulator.ISimulator;
import best.nquantum.util.Formatter;
import best.nquantum.util.KnuthUpArrowCalculator;

import java.math.BigInteger;

public class GrahamsNumberSimulator implements ISimulator {

    @Override
    public void run() {

        // G(1)
        final BigInteger g1 = KnuthUpArrowCalculator.compute(3, 3, 4);
        System.out.println("G(1) computed (approx): " + Formatter.formatLargeNumber(g1));

        System.out.println("Moving to G(2)...");

        // 64 is the sufficiently large upper bound considering the Ramsey theory problem
        for (int i = 2; i <= 64; i++)
            System.out.println("Simulating G(" + i + ")... (symbolically represented)");

    }

}
