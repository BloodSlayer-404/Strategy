package org.example.strategies;

public class HydroStrategy implements HabilityStrategy {

    /**
     *
     * @return A description of the Hydro Elemental Skill
     */
    @Override
    public String elemental() {
        return "Elemental Attack: Charges the hydro power in your hand to " +
                "throw water balls to the enemies.";
    }

    /**
     *
     * @return A description of the Hydro Elemental Ultimate
     */
    @Override
    public String ultimate() {
        return "Ultimate: Gather the hydro elemental power to invoke a giant " +
                "water ball that can trap small enemies inside it, dealing " +
                "hydro damage every 5 seconds.";
    }
}
