import java.util.List;

public class BowlingGame {
    public Integer cal_points(List<Integer> notOnceStrikeOrSpare) {
        Integer sumPoint=0;
        for(Integer i:notOnceStrikeOrSpare) {
            sumPoint+=i;
        }
        return sumPoint;
    }
}
