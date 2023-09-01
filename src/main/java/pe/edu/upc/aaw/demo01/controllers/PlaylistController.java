package pe.edu.upc.aaw.demo01.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.demo01.dtos.PlaylistDTO;
import pe.edu.upc.aaw.demo01.entities.Playlist;
import pe.edu.upc.aaw.demo01.servicesinterfaces.IPlaylistService;

//import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/playlists")
public class PlaylistController {

    @Autowired
    private IPlaylistService cS;

    @PostMapping
    public void registrar(@RequestBody PlaylistDTO dto){
        ModelMapper m=new ModelMapper();
        Playlist c=m.map(dto, Playlist.class);
        cS.insert(c);
    }
    @GetMapping
    public List<PlaylistDTO> listar(){
        return cS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, PlaylistDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        cS.delete(id);
    }
    @GetMapping("/{id}")
    public PlaylistDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        PlaylistDTO dto=m.map(cS.listId(id), PlaylistDTO.class);
        return dto;
    }

    @PostMapping("/buscar")
    public List<PlaylistDTO> buscar(@RequestBody String cancion){
        return cS.findByNameCancion(cancion).stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, PlaylistDTO.class);
        }).collect(Collectors.toList());
    }

}
