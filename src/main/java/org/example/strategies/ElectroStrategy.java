package org.example.strategies;

public class ElectroStrategy implements HabilityStrategy {

    /**
     *
     * @return A description of the Electro Elemental Skill
     */
    @Override
    public String elemental() {
        return "Elemental Attack: Throw ahead 3 lightnings doing electro " +
                "damage to the enemies and leaving a totem in the floor, if " +
                "the character that pick up a totem, regenerates elemental" +
                "energy.";
    }

    /**
     *
     * @return A description of the Electro Elemental Ultimate
     */
    @Override
    public String ultimate() {
        return  "Ultimate: Invoke a giant lightning, and calls for the help of " +
                "of the god of thunders, what makes that every basic attack " +
                "invokes a small thunder.";
    }
}
