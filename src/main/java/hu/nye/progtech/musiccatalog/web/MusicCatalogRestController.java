package hu.nye.progtech.musiccatalog.web;

import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import hu.nye.progtech.musiccatalog.data.model.Song;
import hu.nye.progtech.musiccatalog.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/song")
public class MusicCatalogRestController {

    private final SongService songService;

    @Autowired
    public MusicCatalogRestController(SongService songService) {
        this.songService = songService;
    }

    @GetMapping("/{id}")
    public Song getSongById(@PathVariable Long id){
        return songService.retrieveSongById(id);
    }

    @GetMapping
    public List<Song> getAllSongs(){
        return songService.retrieveAllSongs();
    }

    @PostMapping
    public Song createSong(@RequestBody Song song){
        return songService.createSong(song);
    }

    @PutMapping
    public Song updateSong(@RequestBody Song song){
        return songService.updateSong(song);
    }

    @DeleteMapping("/{id}")
    public void deleteSongById(@PathVariable Long id){
        songService.deleteSongById(id);
    }
}
