package com.csc2920.group_project.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "members")
public class MemberEntity {

    @Id
    @Column(name = "bioguide_id", nullable = false, length = 20)
    private String bioguideId;

    @Column(name = "name", nullable = false, length = 150)
    private String name;

    @Column(name = "party_name", length = 50)
    private String partyName;

    @Column(name = "state", length = 50)
    private String state;

    @Column(name = "district")
    private Integer district;

    @Column(name = "chamber", length = 200)
    private String chamber;

    @Column(name = "start_year")
    private Integer startYear;

    @Column(name = "image_url", length = 500)
    private String imageUrl;

    @Column(name = "update_date", length = 50)
    private String updateDate;
}
