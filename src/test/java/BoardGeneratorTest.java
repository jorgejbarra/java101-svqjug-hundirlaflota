import org.junit.Test;

import static org.junit.Assert.*;

public class BoardGeneratorTest {


    @Test
    public void whenGenerateNewBoardThenHaveSize10(){
        //given
        BoardGenerator generator = new BoardGenerator();

        //when
        Board board = generator.generateNewBoard();

        //then
        assertEquals(10,board.getSize());
    }




}