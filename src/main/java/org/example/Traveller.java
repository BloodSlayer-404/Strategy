package org.example;

import lombok.Setter;
import org.example.strategies.HabilityStrategy;

public class Traveller {

    @Setter
    private HabilityStrategy element;

    /**
     * The Traveller use his Elemental Skill
     * @return The Elemental Skill for the Element (Strategy) that
     * the traveller has right now
     */
    public String elementalSkill() {
        return element.elemental();
    }

    /**
     * The Traveller use his Elemental Ultimate
     * @return The Elemental Ultimate for the Element (Strategy) that
     * the traveller has right now
     */
    public String elementalUltimate() {
        return element.ultimate();
    }
}
