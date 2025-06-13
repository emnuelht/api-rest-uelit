package org.emnuelht.Enum;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public enum Config {
    TIME;

    public final int TIME_5MIN = 60 * 15;
    public final String TIME_NOW = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
}
