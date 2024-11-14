package org.example.strategies;

public interface HabilityStrategy {

    /**
     * The description of the effect of the Elemental Skill to the corresponding element
     * @return A description of the Elemental Skill corresponding to each element
     */
    String elemental();

    /**
     * The description of the effect of the Ultimate to the corresponding element
     * @return A description of the Elemental Ultimate corresponding to each element
     */
    String ultimate();
}
