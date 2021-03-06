import java.awt.Graphics;

public class Tail {

    private Tail next;
    private int posX;
    private int posY;
    private int dir;
    private char[][] map;
    private char color;
    private int powerup;
    
    public Tail(Tail next, int dir, int posX, int posY, char[][] map) {
        this.map = map;
        this.next = next;
        this.dir = dir;
        this.posX = posX;
        this.posY = posY;
        color = 'G';
        powerup = -1;
    }

    public Tail(Tail next, int dir, int posX, int posY, char[][] map, char color, int powerup) {
        this.map = map;
        this.next = next;
        this.dir = dir;
        this.posX = posX;
        this.posY = posY;
        this.color = color;
        this.powerup = powerup;
    }

    public void move() {
        if(dir == -1) {
            posX = next.getX();
            posY = next.getY();
        } else {
            //move head according to dir
            if(dir == 1) {
                posX--;
            } else if(dir == 2) {
                posX++;
            } else if(dir == 3) {
                posY--;
            } else {
                posY++;
            }
        }
    }

    public Tail next() {return next;}
    public int getX() {return posX;}
    public int getY() {return posY;}
    public int getDir() {return dir;}
    public void setNext(Tail next) {this.next = next;}
    public void setColor(char color) {this.color = color;}
    public int getPowerUp() {return powerup;}
    public char getColor() {return color;}
    public void setDir(int dir) {this.dir = dir;}

}