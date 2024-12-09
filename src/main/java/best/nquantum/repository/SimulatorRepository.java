package best.nquantum.repository;

import best.nquantum.simulator.ISimulator;

import java.util.ArrayList;
import java.util.List;

public class SimulatorRepository {
    private final List<ISimulator> simulators = new ArrayList<>();

    public List<ISimulator> add(final ISimulator simulator) {
        this.simulators.add(simulator);
        return getSimulators();
    }

    public ISimulator getSimulatorByClass(final Class<? extends ISimulator> simulatorClass) {
        for (final ISimulator simulator : simulators) {
            if (simulator.getClass().equals(simulatorClass))
                return simulator;
        }
        return null;
    }

    public void runAll() {
        simulators.forEach(ISimulator::run);
    }

    private List<ISimulator> getSimulators() {
        return this.simulators;
    }
}
