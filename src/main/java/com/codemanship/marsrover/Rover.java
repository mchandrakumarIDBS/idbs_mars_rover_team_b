package com.codemanship.marsrover;

public class Rover {
    private final int y;
    private String direction;
    private final int x;

    public Rover(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getDirection()
    {
        return direction;
    }

    public String turnRight()
    {
        if(direction.equals("N")){
            direction = "E";
        }
        return direction;
    }
}
