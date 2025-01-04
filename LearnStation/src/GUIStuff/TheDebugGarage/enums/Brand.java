package GUIStuff.TheDebugGarage.enums;

/**
 * @author besic
 */
public enum Brand {

    MAZDA(new String[]{"EZ-6", "CX-3", "CX-30", "CX-5"}),
    MERCEDES(new String[]{"C-Class", "E-Class", "S-Class", "GLC", "GLE"}),
    HONDA(new String[]{"Civic", "Accord", "CR-V", "Pilot"}),
    AUDI(new String[]{"A3", "A4", "A5 Coupe", "Q5", "Q7", "e-tron"}),
    TESLA(new String[]{"Model S", "Model 3", "Model X", "Model Y",
        "Cybertruck"});

    private final String[] models;

    Brand(String[] models) {
        this.models = models;
    }

    public String[] getModels() {
        return models;
    }
}
