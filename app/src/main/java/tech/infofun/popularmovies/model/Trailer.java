package tech.infofun.popularmovies.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by tfbarbosa on 07/05/17.
 */
public class Trailer {

    private static final String YOU_URL = "https://www.youtube.com/watch?v=";
    private static final String YOU_APP = "vnd.youtube:";

    @SerializedName("key")
    private String key;

    public Trailer(){}

    public String getKey(){
        return key;
    }

    public void setKey(String key){
        this.key = key;
    }

    public static String getYouUrl(){
        return YOU_URL;
    }

    public static String getYouApp(){
        return YOU_APP;
    }

    public static class TrailerResult{
        private List<Trailer> results;

        public List<Trailer> getResults(){
            return results;
        }
    }
}
