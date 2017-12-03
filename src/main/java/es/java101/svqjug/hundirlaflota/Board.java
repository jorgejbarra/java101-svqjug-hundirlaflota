package es.java101.svqjug.hundirlaflota;

import java.util.LinkedList;
import java.util.List;

public class Board {
    private List<Ship> ships = new LinkedList<>();
    private int size;

    public Board(int size){
        this.size = size;
    }

    public int getSize(){
        return size;
    }

    public void addShip(Ship ship){
        ships.add(ship);
    }

    public boolean isEmptyCell(int x, int y){

        for (Ship ship : ships) {
            if(ship.getX() == x && ship.getY() == y){
                return false;
            }
        }

        return true;
    }

    public int getNumberOfShip() {
        return ships.size();
    }

    public boolean canFireInCell(int x, int y){        return false;    }

    public void fireInCell(int x, int y){    }

    public int getNumberOfShipAlive(){return 0;}

}
