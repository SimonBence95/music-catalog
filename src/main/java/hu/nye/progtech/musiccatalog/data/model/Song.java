package hu.nye.progtech.musiccatalog.data.model;

import java.util.Objects;

/**
 * Model class for songs.
 */
public class Song {

    private Long id;
    private String title;
    private String artist;
    private String album;
    private Genre genre;

    public Song() {
    }

    public Song(Long id, String title, String artist, String album, Genre genre) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.genre = genre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return Objects.equals(id, song.id) && Objects.equals(title, song.title) && Objects.equals(artist, song.artist) && Objects.equals(album, song.album) && genre == song.genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, artist, album, genre);
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", album='" + album + '\'' +
                ", genre=" + genre +
                '}';
    }
}
