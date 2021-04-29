package com.rsapi.rsapi.model;

import java.net.URISyntaxException;
import java.util.Collection;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
class SongsController {    
    private SongRepository songRepository;

    public SongsController(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    @GetMapping("/songs")
    Collection<Song> songs() {
        return (Collection<Song>) songRepository.findAll();
    }

    @PostMapping("/songs")
    ResponseEntity<Song> createSong(@RequestBody Song song) throws URISyntaxException {
        Song result = songRepository.save(song);
        return ResponseEntity.ok().body(result);
    }
}