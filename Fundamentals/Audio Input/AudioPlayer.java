import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;

public class AudioPlayer {
    public static void main(String[] args) throws LineUnavailableException, UnsupportedAudioFileException, IOException {
        // retrieve audio file
        File file = new File("The Lamp Is Low.wav");
        AudioInputStream audio = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        // open the file
        clip.open(audio);

        // print a welcome menu
        System.out.println(
                "\033[1;38;5;210m" + "\n▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚ Welcome to Java Jukebox! ▞▞▞▞▞▞▞▞▞▞▞▞▞▞▞▞▞▞" + "\033[0;0m");
        System.out.println(
                "\033[0;38;5;245m" + "░░░░░░░░░░░░ We only have one song, deal with it ░░░░░░░░░░░░" + "\033[0;0m");

        // print song's file name
        System.out.println("\033[1;38;0m" + "\033[1;48;5;210m" + " ♫ Chosen Song " + "\033[0;0m" + "\033[3;38;5;15m"
                + " " + file.getName() + "\033[0;0m");

        // retrieve and setup info about the audio file for gimmicks
        float sampleRate = audio.getFormat().getSampleRate();
        System.out.println("\033[1;38;0m" + "\033[1;48;5;210m" + " ♩ Sample Rate " + "\033[0;38;5;15m" + " "
                + sampleRate + " Hz" + "\033[0;0m");

        // Controls section
        System.out.println("\033[1;38;0m" + "\033[1;48;5;210m" + " ♪ Controls    " + "\033[0;38;5;15m"
                + " P - Play | S - Stop | R - Reset | Q - Quit" + "\033[0;0m");
        Scanner scanner = new Scanner(System.in);
        String response = ""; // first set the response to blank
        while (!response.equals("Q")) {
            System.out.print("\033[1;38;5;210m" + "\033[48;5;95m" + " Enter Control " + "\033[0;38;5;15m" + " ");
            response = scanner.next().toUpperCase(); // scan the next input and convert to uppercase
            // check for Controls and perform actions accordingly
            switch (response) {
                case ("P"):
                    clip.start();
                    clip.loop(Clip.LOOP_CONTINUOUSLY);
                    // foreground background reset format text color
                    System.out.println("\033[1;38;5;114m" + "\033[1;48;5;23m" + " ▶ Now Playing " + "\033[0;0m"
                            + "\033[3;38;5;114m" + " " + file.getName() + "\033[0;0m");
                    break;
                case ("S"):
                    clip.stop(); // r g b
                    System.out.println("\033[1;38;5;222m" + "\033[1;48;2;105;75;0m" + "   ❚❚ Paused   " + "\033[0;0m"
                            + "\033[3;38;5;222m" + " Song stopped." + "\033[0;0m");
                    break;
                case ("R"):
                    clip.setMicrosecondPosition(0);
                    System.out.println("\033[1;38;5;210m" + "\033[1;48;5;52m" + "    ⟲ Reset    " + "\033[0;0m"
                            + "\033[3;38;5;210m" + " Reset playhead." + "\033[0;0m");
                    break;
                case ("Q"):
                    clip.close();
                    break;
                default:
                    System.out.println("\033[1;38;5;210m" + "\033[1;48;5;95m" + " Enter Control " + "\033[0;38;5;15m"
                            + " Control doesn't exist!");
            }
        }
        scanner.close();
        System.out.println(
                "\033[1;38;5;74m" + "▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚       See you soon       ▞▞▞▞▞▞▞▞▞▞▞▞▞▞▞▞▞▞" + "\033[0;0m");
    }
}