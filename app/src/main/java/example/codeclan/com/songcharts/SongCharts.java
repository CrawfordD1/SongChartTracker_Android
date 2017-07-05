package example.codeclan.com.songcharts;

import java.util.ArrayList;

/**
 * Created by user on 05/07/2017.
 */

public class SongCharts {

    private ArrayList<Song> list;

    public SongCharts() {
        list = new ArrayList<Song>();
        list.add(new Song(1, "All My Best Friends Are MetalHeads", "Less Than Jake", "http://i.imgur.com/1L6smXA.jpg"));
        list.add(new Song(2, "Justice", "Astroid Boys", "http://i.imgur.com/BZFrpyb.jpg"));
        list.add(new Song(3, "Two Weeks", "All That Remains", "http://i.imgur.com/whk0rGY.jpg"));
        list.add(new Song(4, "Congratulations", "Post Malone", "http://i.imgur.com/xGxtYwV.jpg"));
        list.add(new Song(5, "Ultimate", "Denzel Curry", "http://i.imgur.com/4cLp65O.jpg"));
        list.add(new Song(6, "Plato's Tripartite", "Protest The Hero", "http://i.imgur.com/PoCg7Rg.jpg"));
        list.add(new Song(7, "Standard", "Stormzy", "http://i.imgur.com/pIUIHHK.jpg"));
        list.add(new Song(8, "A Walk", "Tycho", "http://i.imgur.com/IOhXibH.jpg"));
        list.add(new Song(9, "Feel.", "Kendrick Lamar", "http://i.imgur.com/QzvqxEb.jpg"));
        list.add(new Song(10, "The Weekend", "Michael Gray", "http://i.imgur.com/OV42ZHF.png"));
        list.add(new Song(11, "Receipt", "The Black Dahlia Murder", "http://i.imgur.com/ik9V9WF.jpg"));
        list.add(new Song(12, "Alpha", "Periphery", "http://i.imgur.com/ePKRLpe.png"));
        list.add(new Song(13, "GigaWatt", "Zombie HyperDrive", "http://i.imgur.com/DuTkzOK.jpg"));
        list.add(new Song(14, "Infused", "Rings of Saturn", "http://i.imgur.com/JTeLDIR.jpg"));
        list.add(new Song(15, "Canned Heat", "Jamiroquai", "http://i.imgur.com/yAU7zTP.jpg"));
    }

    public ArrayList<Song> getList() {
        return new ArrayList<Song>(list);
    }



}


