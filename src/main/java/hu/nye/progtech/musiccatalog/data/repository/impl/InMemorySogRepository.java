package hu.nye.progtech.musiccatalog.data.repository.impl;

import hu.nye.progtech.musiccatalog.data.model.Song;
import hu.nye.progtech.musiccatalog.data.repository.Repository;

import java.util.HashMap;
import java.util.List;

/**
 * TODO.
 */
@org.springframework.stereotype.Repository
public class InMemorySogRepository implements Repository<Song, Long> {

    private static final HashMap<Long,Song> STORAGE = new HashMap<>();

    @Override
    public Song save(Song song) {
        Long id = STORAGE.size()+1L;
        song.setId(id);
        STORAGE.put(id, song);
        return STORAGE.get(song);
    }

    @Override
    public Song getById(Long id) {
        return STORAGE.get(id);
    }

    @Override
    public List<Song> getAll() {
        return STORAGE.values().stream().toList();
    }

    @Override
    public Song update(Song song) {
        Long id = song.getId();
        STORAGE.put(id,song);
        return STORAGE.get(id);
    }

    @Override
    public void deleteById(Long id) {
        STORAGE.remove(id);
    }
}
