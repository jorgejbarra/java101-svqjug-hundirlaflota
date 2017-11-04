package es.java101.svqjug.hundirlaflota;

import org.junit.Assert;
import org.junit.Test;

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


}