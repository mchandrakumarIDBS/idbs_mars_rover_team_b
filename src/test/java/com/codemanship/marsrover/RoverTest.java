package com.codemanship.marsrover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RoverTest {

    @Test
    void testRoverCanBeDropped(){
        Rover rover = new Rover(5, 4, "N");
        assertEquals(4, rover.getY());
        assertEquals(5, rover.getX());
    }

    @Test
    void testRoverDirection(){
        Rover rover = new Rover(5, 6, "N");
        assertEquals("N",rover.getDirection());
    }

    @Test
    void moveRoverRight(){
        Rover rover = new Rover(5,6, "N");
        assertEquals("E", rover.turnRight());
    }
}
