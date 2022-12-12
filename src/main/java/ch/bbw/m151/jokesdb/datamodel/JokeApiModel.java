package ch.bbw.m151.jokesdb.datamodel;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JokeApiModel {
    @JsonProperty("error")
    boolean error;

    @JsonProperty("category")
    String category;

    @JsonProperty("type")
    String type;

    @JsonProperty("setup")
    String setup;

    @JsonProperty("delivery")
    String delivery;

    @JsonProperty("flags")

    Flags flags;

    @JsonProperty("id")

    int id;

    @JsonProperty("safe")
      boolean safe;

    @JsonProperty("lang")


    String lang;
}


