package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author liuzepeng
 */
public class NOW {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("text")
        public String info;
    }
}
