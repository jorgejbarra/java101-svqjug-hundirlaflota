package es.java101.svqjug.hundirlaflota;

import org.junit.Assert;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BoardGeneratorTest {


    @Test
    public void whenGenerateNewBoardThenHaveSize10(){
        //given
        BoardGenerator generator = new BoardGenerator();

        //when
        Board board = generator.generateNewBoard();

        //then
        Assert.assertEquals(10, board.getSize());
    }

    @Test
    public void whenGenerateNewBoardHave10Ship() {
        //given
        BoardGenerator generator = new BoardGenerator();

        //when
        Board board = generator.generateNewBoard();

        //then
        assertThat(board.getNumberOfShip()).isEqualTo(10);
    }

    @Test
    public void whenGenerateNewBoardHave10AliveShip() {
        //given
        BoardGenerator generator = new BoardGenerator();

        //when
        Board board = generator.generateNewBoard();

        //then
        assertThat(board.getNumberOfShipAlive()).isEqualTo(10);
    }

    @Test
    public void whenCreateNewBoardThenICanFireInAllCell() {
        //given
        BoardGenerator generator = new BoardGenerator();

        //when
        Board board = generator.generateNewBoard();

        //then
        for (int i =0;i<board.getSize();i++){
            for (int j = 0; j < board.getSize(); j++) {
                assertThat(board.canFireInCell(i,j)).isTrue();
            }
        }
    }
}