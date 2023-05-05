package hu.nye.progtech.musiccatalog.service;

import hu.nye.progtech.musiccatalog.data.model.Song;

import java.util.List;

/**
 * TODO.
 */
public interface SongService {

    /**
     * TODO.
     * @param song TODO.
     * @return TODO.
     */
    Song createSong(Song song);
    Song retrieveSongById(Long id);
    List<Song> retrieveAllSongs();
    Song updateSong(Song song);
    void deleteSongById(Long id);

}
