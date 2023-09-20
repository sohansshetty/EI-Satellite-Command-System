package command;
import satellite.Satellite;

// DeactivatePanelsCommand class implements the Command interface to deactivate the solar panels.
public class DeactivatePanelsCommand implements Command {
    @Override
    public void execute(Satellite satellite) {
        satellite.deactivatePanels();
    }
}