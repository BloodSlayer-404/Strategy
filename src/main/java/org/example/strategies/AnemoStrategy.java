package org.example.strategies;

public class AnemoStrategy implements HabilityStrategy {

    /**
     *
     * @return A description of the Anemo Elemental Skill
     */
    @Override
    public String elemental() {
        return "Elemental Attack: Charge the wind power in your hand" +
                "and liberates a condensed gust of wind dealing Anemo damage " +
                "to the enemies";
    }

    /**
     *
     * @return A description of the Anemo Elemental Ultimate
     */
    @Override
    public String ultimate() {
        return  "Ultimate: Creates a tornado that do Anemo damaga to " +
                "the enemies and attract them to its center";
    }
}
