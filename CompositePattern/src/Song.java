public class Song implements IComponent{
    public String songName;
    public String artist;
    public float speed = 1; // Default playback speed

    public Song(String songName, String artist ) {
        this.songName = songName;
        this.artist = artist;
    }

    // Your code goes here!
    public void play(){
        System.out.println("Playing Song! : " + songName + ", playing at speed x" + speed);
    }

    public void setPlaybackSpeed(float speed){
        this.speed = speed;
    }

    public String getName(){
        return this.songName;
    }

    public String getArtist(){
        return this.artist;
    }
}
