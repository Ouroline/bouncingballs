/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bouncingballs;

/**
 *
 * @author Mike Daniel
 */
public class Bouncingballs {
    private float x;
    private float xdelta;
    private float y;
    private float ydelta;
    private int radius;

    public float getX() {
        return x;
    }

    public float getXdelta() {
        return xdelta;
    }

    public float getY() {
        return y;
    }

    public float getYdelta() {
        return ydelta;
    }

    public int getRadius() {
        return radius;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setXdelta(float xdelta) {
        this.xdelta = xdelta;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setYdelta(float ydelta) {
        this.ydelta = ydelta;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Bouncingballs(float x, float xdelta, float y, float ydelta, int radius) {
        this.x = x;
        this.xdelta = xdelta;
        this.y = y;
        this.ydelta = ydelta;
        this.radius = radius;
    }

    void move() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
