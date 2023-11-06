package co.tylermaxwell.songs.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "artists")
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    // @OneToMany(mappedBy="artist", fetch = FetchType.LAZY)
    // List<Song> songs;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "songs_artists",
        joinColumns = @JoinColumn(name = "artist_id"),
        inverseJoinColumns = @JoinColumn(name = "song_id")
    )
    private List<Song> songs;


    public Artist() {
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }




    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<Song> getSongs() {
        return this.songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    


    
}
