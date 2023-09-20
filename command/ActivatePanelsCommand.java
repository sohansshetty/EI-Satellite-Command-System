package command;
import satellite.Satellite;

// ActivatePanelsCommand class implements the Command interface to activate the solar panels.
public class ActivatePanelsCommand implements Command {
    @Override
    public void execute(Satellite satellite) {
        satellite.activatePanels();
    }
}