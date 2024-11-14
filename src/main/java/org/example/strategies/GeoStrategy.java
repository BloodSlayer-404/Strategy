package org.example.strategies;

public class GeoStrategy implements HabilityStrategy {

    /**
     *
     * @return A description of the Geo Elemental Skill
     */
    @Override
    public String elemental() {
        return "Elemental Attack: Creates a falling rock in the middle " +
                "of the arena and do Geo Damage to the enemies.";
    }

    /**
     *
     * @return A description of the Geo Elemental Ultimate
     */
    @Override
    public String ultimate() {
        return  "Ultimate: Creates stone pegs in the floor " +
                "that do Geo damage to the enemies in the area of effect.";
    }
}
