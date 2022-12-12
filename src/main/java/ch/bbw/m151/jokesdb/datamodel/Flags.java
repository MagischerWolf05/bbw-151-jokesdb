package ch.bbw.m151.jokesdb.datamodel;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Flags {
    @JsonProperty("nsfw")
    boolean nsfw;

    @JsonProperty("religious")
    boolean religious;

    @JsonProperty("political")
    boolean political;

    @JsonProperty("racist")
    boolean racist;

    @JsonProperty("sexist")
    boolean sexist;

    @JsonProperty("explicit")
    boolean explicit;
}
