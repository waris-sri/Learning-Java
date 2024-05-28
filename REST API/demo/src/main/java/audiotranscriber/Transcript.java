package audiotranscriber;

public class Transcript {
    // prepare variables for the transcription
    private String audio_url;
    private String id;
    private String status;
    private String text;

    // get them...
    public String getAudio_url() {
        return audio_url;
    }

    public String getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public String getText() {
        return text;
    }

    // ... then set them to the provided values
    public void setAudio_url(String audio_url) {
        this.audio_url = audio_url;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setText(String text) {
        this.text = text;
    }
}
