package com.example.android.sunshine.app.data;

import android.provider.BaseColumns;

import com.example.android.sunshine.app.SettingsActivity;

/**
 * Created by kashif on 01/12/14.
 */
public class WeatherContract {
    // Inner class that defines table contents of location table
    public static final class LocationEntry implements BaseColumns {

        // Table name
        public static final String TABLE_NAME = "location";

        // Location setting string that will be sent to open weather map as location query
        public static final String COLUMN_LOCATION_SETTING = "location_setting";

        // Human readable location string, provided by API
        public static final String COLUMN_CITY_NAME = "city_name";

        // latitude and longitude as returned by open street map
        public static final String COLUMN_COORD_LAT = "coord_lat";
        public static final String COLUMN_COORD_LONG = "coord_long";
    }

    // Inner class that defines table contents of weather table
    public static final class WeatherEntry implements BaseColumns {

        // Table name
        public static final String TABLE_NAME = "weather";

        // Column with the foreign key into the location table.
        public static final String COLUMN_LOC_KEY = "location_id";
        // Date stored as text with format yyyy-MM-dd
        public static final String COLUMN_DATETEXT = "date";
        // Weather id as returned by api
        public static final String COLUMN_WEATHER_ID = "weather_id";

        // Short description
        public static final String COLUMN_SHORT_DESC = "short_desc";
        public static final String COLUMN_LONG_DESC = "long_desc";

        // Min and max temperatures of the day (stored as float)
        public static final String COLUMN_MIN_TEMP = "min";
        public static final String COLUMN_MAX_TEMP = "max";

        // Humidity stored as float representing percentage
        public static final String COLUMN_HUMIDITY = "humidity";

        // Pressure stored as float representing percentage
        public static final String COLUMN_PRESSURE = "pressure";

        // Wind speed stored as float representing speed mph
        public static final String COLUMN_WIND_SPEED = "wind";

        // Degrees are meteorological degrees (e.g. 0 is north, 180 is south). Stored as float
        public static final String COLUMN_DEGREES = "degrees";
    }
}
