package pl.dmcs.gpsapp.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String acc;

    @Column(nullable = false)
    private String alt;

    @Column(nullable = false)
    private int bea;

    @Column(nullable = false)
    private String lat;

    @Column(nullable = false)
    private String lon;

    @Column(nullable = false)
    private String prov;

    @Column(nullable = false)
    private int spd;

    @Column(nullable = false)
    private int sat;

    @Column(nullable = false)
    private long timestamp;

    @Column(nullable = false)
    private String serial;

    @Column(nullable = false)
    private String tid;

    @Column(nullable = false)
    private String plat;

    @Column(nullable = false)
    private String platVersion;

    @Column(nullable = false)
    private int bat;
}
