package pe.edu.upc.aaw.demo01.dtos;

import java.time.LocalDate;

public class PlaylistDTO {
    private int idPlaylist;
    private String namePlaylist;
    private String generoPlaylist;
    private String cancionIDPlaylist;

    public int getIdPlaylist() {
        return idPlaylist;
    }

    public void setIdPlaylist(int idPlaylist1) {
        this.idPlaylist = idPlaylist1;
    }

    public String getNamePlaylist() {
        return namePlaylist;
    }

    public void setNamePlaylist(String namePlaylist1) {
        this.namePlaylist = namePlaylist1;
    }

    public String getGeneroPlaylist() {
        return generoPlaylist;
    }

    public void setGeneroPlaylist(String generoPlaylist1) {
        this.generoPlaylist = generoPlaylist1;
    }

    public String getCancionIDPlaylist() {return cancionIDPlaylist;}

    public void setCancionIDPlaylist(String cancionIDPlaylist1 ) {
        this.cancionIDPlaylist = cancionIDPlaylist1;
    }

}
