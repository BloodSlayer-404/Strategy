package org.example.strategies;

public class DendroStrategy implements HabilityStrategy {

    /**
     *
     * @return A description of the Dendro Elemental Skill
     */
    @Override
    public String elemental() {
        return "Elemental Attack: Calls the nature power, dealing dendro " +
                "damage in front of the player.";
    }

    /**
     *
     * @return A description of the Dendro Elemental Ultimate
     */
    @Override
    public String ultimate() {
        return "Ultimate: Creates a garden area, which will deal dendro " +
                "damage to the enemies inside it every 3 seconds.";
    }
}
