package ru.clevertec;

import org.apache.commons.lang3.math.NumberUtils;

public final class StringUtils {
    public static boolean isPositive(String str){
        return NumberUtils.isParsable(str) && Integer.parseInt(str) > 0;
    }
}
