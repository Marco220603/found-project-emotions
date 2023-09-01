package pe.edu.upc.aaw.demo01.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.demo01.entities.Playlist;
import pe.edu.upc.aaw.demo01.repositories.IPlaylistRepository;
import pe.edu.upc.aaw.demo01.servicesinterfaces.IPlaylistService;

import java.time.LocalDate;
import java.util.List;

@Service
public class PlaylistServiceImplemet implements IPlaylistService {
    @Autowired
    private IPlaylistRepository cR;

    @Override
    public void insert(Playlist club) {
        cR.save(club);
    }

    @Override
    public List<Playlist> list() {
        return cR.findAll();
    }

    @Override
    public void delete(int idClub) {
        cR.deleteById(idClub);
    }

    @Override
    public Playlist listId(int idClub) {
        return cR.findById(idClub).orElse(new Playlist());
    }

    @Override
    public List<Playlist> findByNameCancion(String cancion) {
        return cR.findByNameCancion(cancion);
    }


}
