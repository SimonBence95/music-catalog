package hu.nye.progtech.musiccatalog.service.impl;

import hu.nye.progtech.musiccatalog.data.model.Song;
import hu.nye.progtech.musiccatalog.data.repository.Repository;
import hu.nye.progtech.musiccatalog.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultSongService implements SongService {

    private final Repository<Song, Long> songRepository;

    @Autowired
    public DefaultSongService(Repository<Song, Long> songRepository) {
        this.songRepository = songRepository;
    }

    @Override
    public Song createSong(Song song) {
        return songRepository.save(song);
    }

    @Override
    public Song retrieveSongById(Long id) {
        return songRepository.getById(id);
    }

    @Override
    public List<Song> retrieveAllSongs() {
        return songRepository.getAll();
    }

    @Override
    public Song updateSong(Song song) {
        return songRepository.update(song);
    }

    @Override
    public void deleteSongById(Long id) {
        songRepository.deleteById(id);
    }
}
