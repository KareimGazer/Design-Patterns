import java.util.*;
public class Playlist implements IComponent{

    public String playlistName;
    public ArrayList<IComponent> playlist = new ArrayList();

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
    }

    // Your code goes here!
    public void play(){
        for(IComponent song : playlist){
            song.play();
        }
    }

    @Override
    public void setPlaybackSpeed(float speed) {
        for(IComponent song : playlist){
            song.setPlaybackSpeed(speed);
        }
    }

    public String getName(){
        return playlistName;
    }

    public void add(IComponent component){
        this.playlist.add(component);
    }

    public void remove(IComponent component){
        this.playlist.remove(component);
    }
}
