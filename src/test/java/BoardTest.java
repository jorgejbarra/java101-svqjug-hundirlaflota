import org.junit.Test;

import static org.junit.Assert.*;

public class BoardTest {

    @Test
    public void whenCreateABoardThenBoardHave0Boat(){
        //when
        Board board = new Board(10);

        //then
        assertEquals(0,board.getNumberOfBoat());
    }

    @Test
    public void whenAddBoatThenTheBoardHaveOneMoreBoat(){
        //given
        Board board = new Board(10);

        //when
        board.addBoat(new Boat(1,1));

        //then
        assertEquals(1,board.getNumberOfBoat());
    }

    @Test
    public void whenAddBoatInCellThenTheCellIsNotEmpty(){
        //given
        Board board = new Board(10);

        //when
        board.addBoat(new Boat(1,1));

        //then
        assertEquals(false,board.isEmpty(1,1));
    }

}