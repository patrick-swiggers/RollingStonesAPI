package com.rsapi.rsapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity

public class Song {
    public @Id @GeneratedValue Long id;
    public String single;
    public String year;

    public Song() {}

    public Song(String single, String year) {
        this.single = single;
        this.year = year;
    }
}
