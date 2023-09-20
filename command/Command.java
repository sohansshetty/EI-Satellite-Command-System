package command;
import satellite.Satellite;

// Command interface represents an action that can be executed on the satellite.
public interface Command {
    void execute(Satellite satellite);
}
