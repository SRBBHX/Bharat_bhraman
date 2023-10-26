
import java.io.IOException;
        import java.net.URL;
        import java.nio.channels.Channels;
        import java.nio.channels.ReadableByteChannel;

public class YouTubeDownloader {
    public static void main(String[] args) throws IOException {
        String videoUrl = "https://youtu.be/fwkJ9CZMCj8";

        URL website = new URL(videoUrl);
        ReadableByteChannel rbc = Channels.newChannel(website.openStream());

        String fileName = "video.mp4";
        java.nio.file.Path path = java.nio.file.Paths.get(fileName);
        java.nio.file.Files.copy(rbc, path);
    }
}
