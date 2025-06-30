import java.time.LocalDate;
import java.time.ZoneId;

public class Num10699 {
    public static void main(String[] args) {
        ZoneId zone = ZoneId.of("Asia/Seoul");
        LocalDate todayInSeoul = LocalDate.now(zone);
        System.out.println("서울의 오늘 날짜 : " + todayInSeoul);
    }
}
