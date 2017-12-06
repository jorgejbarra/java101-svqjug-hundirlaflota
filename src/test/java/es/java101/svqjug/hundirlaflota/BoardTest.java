package es.java101.svqjug.hundirlaflota;

import org.junit.Assert;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BoardTest {

   private static final Ship SAMPLE_SHIP = new Ship(5,5);

    @Test
    public void whenCreateABoardThenBoardHave0Ship(){
        //when
        Board board = new Board(10);

        //then
        Assert.assertEquals(0, board.getNumberOfShip());
    }

    @Test
    public void whenAddShipThenTheBoardHaveOneMoreShip(){
        //given
        Board board = new Board(10);

        //when
        board.addShip(new Ship(1,1));

        //then
        Assert.assertEquals(1, board.getNumberOfShip());
    }

    @Test
    public void whenAddShipInCellThenTheCellIsNotEmpty(){
        //given
        Board board = new Board(10);

        //when
        board.addShip(new Ship(1,1));

        //then
        Assert.assertEquals(false, board.isEmptyCell(1, 1));
    }

    @Test
    public void whenAddShipInNoEmptyCellThenNoAddShip(){
        //given
        Board board = getSampleBoard();
        int numberOfShipBeforeAdd = board.getNumberOfShip();

        //when
        board.addShip(SAMPLE_SHIP);

        //then
        assertThat(board.getNumberOfShip()).isEqualTo(numberOfShipBeforeAdd);
    }

    @Test
    public void whenCreateNewBoardThenNumberOfAliveShipIs0() {
        //given
        Board board = new Board(10);        

        //then
        assertThat(board.getNumberOfShipAlive()).isEqualTo(0);
    }

    @Test
    public void whenAddShipToNewBoardThenNumberOfAliveShipIs1() {
        //given
        Board board = new Board(10);

        //when
        board.addShip(new Ship(1,1));

        //then
        assertThat(board.getNumberOfShipAlive()).isEqualTo(1);
    }

    @Test
    public void whenAddShipToBoardThenNumberOfAliveShipAdd1() {
        //given
        Board board = getRandomBoard();
        int numberOfShipBeforeAdd = board.getNumberOfShip();

        //when
        board.addShip(new Ship(1,1));

        //then
        assertThat(board.getNumberOfShipAlive()).isEqualTo(numberOfShipBeforeAdd +1);
    }

    @Test
    public void whenCreateNewBoardThenICanFireInAllCell() {

        //when
        Board board = new Board(10);

        //then
        for (int i =0;i<10;i++){
            for (int j = 0; j < 10; j++) {
                assertThat(board.canFireInCell(i,j)).isTrue();
            }
        }
    }

    @Test
    public void whenFireInCellThenICanNotFireAgain() {
        //given
        Board board = getRandomBoard();

        //when
        board.fireInCell(1,2);

        //then
        assertThat(board.canFireInCell(1,2)).isFalse();
    }

    @Test
    public void whenFireInCellWithShipThenAliveShipSubtracting1() {
        //given
        Board board = getSampleBoard();
        int numberOfShipAliveBeforeFire = board.getNumberOfShipAlive();

        //when
        board.fireInCell(SAMPLE_SHIP.getX(),SAMPLE_SHIP.getY());

        //then
        assertThat(board.getNumberOfShipAlive()).isEqualTo(numberOfShipAliveBeforeFire-1);
    }

    private Board getRandomBoard() {
        return new BoardGenerator().generateNewBoard();
    }

    private Board getSampleBoard() {
        Board sampleBoard = new Board(10);
        sampleBoard.addShip(SAMPLE_SHIP);

        return sampleBoard;
    }
}