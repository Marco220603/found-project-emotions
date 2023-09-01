package pe.edu.upc.aaw.demo01.servicesinterfaces;

import pe.edu.upc.aaw.demo01.entities.Playlist;
import java.time.LocalDate;
import java.util.List;
public interface IPlaylistService {
    public void insert(Playlist playlist);
    public List<Playlist> list();
    public void delete(int idplaylist);
    public Playlist listId(int idplaylist);
    List<Playlist> findByNameCancion(String cancion);

}
