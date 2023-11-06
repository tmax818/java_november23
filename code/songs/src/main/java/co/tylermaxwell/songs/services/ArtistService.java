package co.tylermaxwell.songs.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.tylermaxwell.songs.models.Artist;
import co.tylermaxwell.songs.repositories.ArtistRepository;

@Service
public class ArtistService {

    @Autowired
    ArtistRepository artistRepository;

    public List<Artist> getAllArtists() {
        return artistRepository.findAll();
    }

    public void addArtist(Artist artist) {
        artistRepository.save(artist);
    }
    
}
