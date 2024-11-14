package org.example;

import org.example.strategies.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TravellerTest {

    Traveller traveller = new Traveller();

    /**
     * Test the correct functionally of the Anemo Strategy
     */
    @Test
    void anemoStrategyTest(){

        traveller.setElement( new AnemoStrategy());

        assertEquals("Elemental Attack: Charge the wind power in your hand" +
                        "and liberates a condensed gust of wind dealing Anemo damage " +
                        "to the enemies",
                traveller.elementalSkill());

        assertEquals("Ultimate: Creates a tornado that do Anemo damaga to " +
                        "the enemies and attract them to its center",
                traveller.elementalUltimate());
    }

    /**
     * Test the correct functionally of the Geo Strategy
     */
    @Test
    void geoStrategyTest(){

        traveller.setElement( new GeoStrategy());

        assertEquals("Elemental Attack: Creates a falling rock in the middle " +
                        "of the arena and do Geo Damage to the enemies.",
                traveller.elementalSkill());

        assertEquals("Ultimate: Creates stone pegs in the floor " +
                        "that do Geo damage to the enemies in the area of effect.",
                traveller.elementalUltimate());
    }

    /**
     * Test the correct functionally of the Electro Strategy
     */
    @Test
    void electroStrategyTest(){

        traveller.setElement( new ElectroStrategy());

        assertEquals("Elemental Attack: Throw ahead 3 lightnings doing electro " +
                        "damage to the enemies and leaving a totem in the floor, if " +
                        "the character that pick up a totem, regenerates elemental" +
                        "energy.",
                traveller.elementalSkill());

        assertEquals("Ultimate: Invoke a giant lightning, and calls for the help of " +
                        "of the god of thunders, what makes that every basic attack " +
                        "invokes a small thunder.",
                traveller.elementalUltimate());
    }

    /**
     * Test the correct functionally of the Dendro Strategy
     */
    @Test
    void dendroStrategyTest(){

        traveller.setElement( new DendroStrategy());

        assertEquals("Elemental Attack: Calls the nature power, dealing dendro " +
                        "damage in front of the player.",
                traveller.elementalSkill());

        assertEquals("Ultimate: Creates a garden area, which will deal dendro " +
                        "damage to the enemies inside it every 3 seconds.",
                traveller.elementalUltimate());
    }

    /**
     * Test the correct functionally of the Hydro Strategy
     */
    @Test
    void hydroStrategyTest(){

        traveller.setElement( new HydroStrategy());

        assertEquals("Elemental Attack: Charges the hydro power in your hand to " +
                        "throw water balls to the enemies.",
                traveller.elementalSkill());

        assertEquals("Ultimate: Gather the hydro elemental power to invoke a giant " +
                        "water ball that can trap small enemies inside it, dealing " +
                        "hydro damage every 5 seconds.",
                traveller.elementalUltimate());
    }

}