package com.csc2920.group_project.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class MemberDto {

    private String bioguideId;
    private String name;
    private String state;
    private Integer district;
    private String partyName;
    private Terms terms;
    private Depiction depiction;
    private String updateDate;

    @Data
    @NoArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Terms {
        private List<Term> item;
    }

    @Data
    @NoArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Term {
        private Integer startYear;
        private String chamber;
    }

    @Data
    @NoArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Depiction {
        private String attribution;
        private String imageUrl;
    }
}
