package io.memit.utils;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;

public final class DateTimeUtils {
	
	private DateTimeUtils(){}

	private static Clock clock = Clock.systemDefaultZone();
    private static ZoneId zoneId = ZoneId.systemDefault();
    
    public static LocalDateTime localNow() {
        return LocalDateTime.now(getClock());
    }
    
    public static OffsetDateTime now() {
        return OffsetDateTime.now(getClock());
    }

    public static void useFixedClockAt(LocalDateTime date){
        clock = Clock.fixed(date.atZone(zoneId).toInstant(), zoneId);
    }

    public static void useSystemDefaultZoneClock(){
        clock = Clock.systemDefaultZone();
    }

    private static Clock getClock() {
        return clock ;
    }
}
