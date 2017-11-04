package es.java101.svqjug.hundirlaflota;

import java.util.LinkedList;
import java.util.List;

public class Board {
    private List<Boat> boats = new LinkedList<Boat>();
    private int size;

    public Board(int size){
        this.size = size;
    }

    public int getSize(){
        return size;
    }

    public void addBoat(Boat boat){
        boats.add(boat);
    }

    public boolean isEmpty(int x, int y){

        for (Boat boat : boats) {
            if(boat.getX() == x && boat.getY() == y){
                return false;
            }
        }

        return true;
    }

    public int getNumberOfBoat() {
        return boats.size();
    }
}
