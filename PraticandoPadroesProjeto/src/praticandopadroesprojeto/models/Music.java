/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praticandopadroesprojeto.models;

/**
 *
 * @author bruno
 */
public class Music {
    
    private String music_name;
    private String music_desc;
    private int music_duration_per_seconds;
    private String music_author;
    private boolean music_free;

    public Music(String music_name, String music_desc, int music_duration_per_seconds, String music_author, boolean music_free) {
        this.music_name = music_name;
        this.music_desc = music_desc;
        this.music_duration_per_seconds = music_duration_per_seconds;
        this.music_author = music_author;
        this.music_free = music_free;
    }

    public String getMusic_name() {
        return music_name;
    }

    public void setMusic_name(String music_name) {
        this.music_name = music_name;
    }

    public String getMusic_desc() {
        return music_desc;
    }

    public void setMusic_desc(String music_desc) {
        this.music_desc = music_desc;
    }

    public int getMusic_duration_per_seconds() {
        return music_duration_per_seconds;
    }

    public void setMusic_duration_per_seconds(int music_duration_per_seconds) {
        this.music_duration_per_seconds = music_duration_per_seconds;
    }

    public String getMusic_author() {
        return music_author;
    }

    public void setMusic_author(String music_author) {
        this.music_author = music_author;
    }

    public boolean isMusic_free() {
        return music_free;
    }

    public void setMusic_free(boolean music_free) {
        this.music_free = music_free;
    }

    
    
    
    
}
