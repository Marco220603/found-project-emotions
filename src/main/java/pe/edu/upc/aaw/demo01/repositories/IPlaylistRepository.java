package pe.edu.upc.aaw.demo01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.demo01.entities.Playlist;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IPlaylistRepository extends JpaRepository<Playlist,Integer> {
    List<Playlist>findByNameCancion(String cancion);

}
