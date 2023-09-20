package command;
import satellite.Satellite;

// RotateCommand class implements the Command interface to perform a rotation action on the satellite.
public class RotateCommand implements Command {
    private String direction;

    public RotateCommand(String direction) {
        this.direction = direction;
    }

    @Override
    public void execute(Satellite satellite) {
        satellite.setOrientation(direction);
    }
}