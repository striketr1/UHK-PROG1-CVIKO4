package pro1;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class Tools2
{
    public static Instant czechDateTimeStringToUTC(String string)
    {
        // Krok 1: převod ze stringu na wall-clock čas (LocalDateTime)
        LocalDateTime localDateTime =
                LocalDateTime.parse(
                        string,
                        DateTimeFormatter.ofPattern("d. M. yyyy HH:mm:ss"));
        // Krok 2: převod z wall-clock času (LocalDateTime) na časovou značku (Instant)
        Instant utc = localDateTime
                .atZone(ZoneId.of("Europe/Prague"))
                .toInstant();

        return utc;
    }
}
