package pe.edu.upc.aaw.demo01.entities;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name="Playlist")
public class Playlist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPlaylist;
    @Column(name = "namePlaylist", nullable = false, length = 40)
    private String namePlaylist;
    @Column(name = "generoPlaylist", nullable = false, length = 50)
    private String generoPlaylist;
    @Column(name = "CancionIDPlaylist", nullable = false)
    private String cancionIDPlaylist;

    public Playlist() {
    }

    //Constructor
    public Playlist(int idPlaylist, String namePlaylist, String generoPlaylist, String cancionIDPlaylist) {
        this.idPlaylist = idPlaylist;
        this.namePlaylist = namePlaylist;
        this.generoPlaylist = generoPlaylist;
        this.cancionIDPlaylist = cancionIDPlaylist;
    }


    //Getter and Setter
    public int getIdPlaylist() {
        return idPlaylist;
    }

    public void setIdPlaylist(int idPlaylist) {
        this.idPlaylist = idPlaylist;
    }

    public String getNamePlaylist() {
        return namePlaylist;
    }

    public void setNamePlaylist(String namePlaylist) {
        this.namePlaylist = namePlaylist;
    }

    public String getGeneroPlaylist() {
        return generoPlaylist;
    }

    public void setGeneroPlaylist(String generoPlaylist) {
        this.generoPlaylist = generoPlaylist;
    }

    public String getCancionIDPlaylist() {
        return cancionIDPlaylist;
    }

    public void setCancionIDPlaylist(String cancionIDPlaylist) {
        this.cancionIDPlaylist = cancionIDPlaylist;
    }
}
