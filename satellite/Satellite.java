package satellite;

// Satellite class represents the state and behavior of the satellite.
public class Satellite {
    private String orientation;
    private boolean solarPanelsActive;
    private int dataCollected;

    // Constructor to initialize the satellite's attributes.
    public Satellite() {
        this.orientation = "north";
        this.solarPanelsActive = false;
        this.dataCollected = 0;
    }

    // Getter method for retrieving the orientation.
    public String getOrientation() {
        return orientation;
    }

    // Setter method to set the orientation.
    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    // Getter method to check if solar panels are active.
    public boolean areSolarPanelsActive() {
        return solarPanelsActive;
    }

    // Method to activate solar panels.
    public void activatePanels() {
        this.solarPanelsActive = true;
    }

    // Method to deactivate solar panels.
    public void deactivatePanels() {
        this.solarPanelsActive = false;
    }

    // Getter method to retrieve the amount of data collected.
    public int getDataCollected() {
        return dataCollected;
    }

    // Method to collect data (if solar panels are active).
    public void collectData() {
        if (solarPanelsActive) {
            this.dataCollected += 10;
        } else {
            System.out.println("Solar panel must be active to collect data!!");
        }
    }
}

