package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author liuzepeng
 */
public class Forecast {
    public String date;

    @SerializedName("temp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {
        public String max;
        public String min;
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }
}
