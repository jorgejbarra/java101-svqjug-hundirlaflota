package es.java101.svqjug.hundirlaflota;

import org.junit.Assert;
import org.junit.Test;

public class BoardTest {

    @Test
    public void whenCreateABoardThenBoardHave0Boat(){
        //when
        Board board = new Board(10);

        //then
        Assert.assertEquals(0, board.getNumberOfBoat());
    }

    @Test
    public void whenAddBoatThenTheBoardHaveOneMoreBoat(){
        //given
        Board board = new Board(10);

        //when
        board.addBoat(new Boat(1,1));

        //then
        Assert.assertEquals(1, board.getNumberOfBoat());
    }

    @Test
    public void whenAddBoatInCellThenTheCellIsNotEmpty(){
        //given
        Board board = new Board(10);

        //when
        board.addBoat(new Boat(1,1));

        //then
        Assert.assertEquals(false, board.isEmpty(1, 1));
    }

}