import java.util.List;

public class BowlingGame {
    static final Integer FULL_POINT = 10;
    public Integer cal_points(List<Integer> listShot) {
        Integer sumPoint=0;
//        for(Integer i:notOnceStrikeOrSpare) {
//            sumPoint+=i;
//        }
        Integer roundTimes=0; // 轮数
        for(int i=0;i<listShot.size();i++) {
            Integer shotPointSingleCur=listShot.get(i);
            Integer shotPointSingleNext=listShot.get(i+1);
            if(shotPointSingleCur==FULL_POINT) { // 全中
                sumPoint+=(FULL_POINT+shotPointSingleNext+listShot.get(i+2));
            }
            else if((shotPointSingleCur+shotPointSingleNext)==FULL_POINT) { // 补中
                sumPoint+=(FULL_POINT+listShot.get(i+2));
                i++;
            }
            else {
                sumPoint+=(shotPointSingleCur+shotPointSingleNext);
                i++;
            }
            roundTimes++;
            if(roundTimes==10) {
                break;
            }
        }
        return sumPoint;
    }
}
