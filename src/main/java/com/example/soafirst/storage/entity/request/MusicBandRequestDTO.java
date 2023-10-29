package com.example.soafirst.storage.entity.request;

import com.example.soafirst.storage.entity.MusicGenre;
import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotNull;
@Data
public class MusicBandRequestDTO {
    @NotNull
    private String name;
    @NotNull
    private CoordinatesRequestDTO coordinates;
    private Long numberOfParticipants;
    private MusicGenre musicGenre;
    @NotNull
    private StudioRequestDTO studio;


    @Data
    public static class CoordinatesRequestDTO {
        @NotNull
        private Float x;
        @NotNull
        private Long y;
    }

    @Data
    @ToString
    public static class StudioRequestDTO {
        private String name;
    }
}
