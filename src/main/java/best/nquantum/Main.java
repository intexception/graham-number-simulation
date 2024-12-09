package best.nquantum;

import best.nquantum.repository.SimulatorRepository;
import best.nquantum.simulator.impl.GrahamsNumberSimulator;

public class Main {
    public static void main(final String[] args) {
        final SimulatorRepository simulatorRepository = new SimulatorRepository();

        simulatorRepository.add(new GrahamsNumberSimulator());

        simulatorRepository.runAll();
    }
}
