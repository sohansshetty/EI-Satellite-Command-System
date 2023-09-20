package command;
import satellite.Satellite;

// CollectDataCommand class implements the Command interface to collect data (if solar panels are active).
public class CollectDataCommand implements Command {
    @Override
    public void execute(Satellite satellite) {
        satellite.collectData();
    }
}