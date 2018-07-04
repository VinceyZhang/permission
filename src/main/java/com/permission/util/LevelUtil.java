package com.permission.util;

import org.apache.commons.lang3.StringUtils;

public class LevelUtil {
    public final static String SEPATOR = ".";

    public final static String ROOT = "0";

    public static String calculateLevel(String parentLeve,int parentId) {
    if(StringUtils.isBlank(parentLeve)){
        return ROOT;
    }else{
        return StringUtils.join(parentLeve,SEPATOR);
    }
    }
}
