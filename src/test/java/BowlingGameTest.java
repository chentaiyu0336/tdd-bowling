import javafx.beans.binding.When;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {
    @Test
    void should_not_once_strike_or_spare() {
        //Given
        BowlingGame bowlingGame=new BowlingGame();
        List<Integer> notOnceStrikeOrSpare= Arrays.asList(2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2);
        //when
        Integer point=bowlingGame.cal_points(notOnceStrikeOrSpare);
        //Then
        assertEquals("40",point.toString());
    }

    @Test
    void should_have_strike_or_spare() {
        //Given
        BowlingGame bowlingGame=new BowlingGame();
        List<Integer> haveStrikeOrSpare= Arrays.asList(10,2,3,2,4,10,10,10,8,2,10,10,2,2);
        //When
        Integer point=bowlingGame.cal_points(haveStrikeOrSpare);
        //Then
        assertEquals("164",point.toString());
    }
    
    @Test
    void should_have_strike_last_round() {
        //Given
        BowlingGame bowlingGame=new BowlingGame();
        List<Integer> strikeLastRound= Arrays.asList(1,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,10,5,2);
        //When
        Integer point=bowlingGame.cal_points(strikeLastRound);
        //Then
        assertEquals("20",point.toString());
    }
}
