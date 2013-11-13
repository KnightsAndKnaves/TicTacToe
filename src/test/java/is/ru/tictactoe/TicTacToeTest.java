package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;

import org.junit.Test

public class WorldTest{


        @Test
        public void greetResultInHello(){
                TicTacToe test = new TicTacToe();
                assertEquals("Hello World!", test.greet());
        }
}
