package com.codemanship.marsrover;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

public class RoverTest {

    @Test
    void testRoverCanBeDropped(){
        Rover rover = new Rover(5, 4);
        assertEquals(4, rover.getY());
        assertEquals(5, rover.getX());
    }
}
