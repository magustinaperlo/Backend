
package com.portfolio.maa.Service;

/**
 *
 * @author magus
 */
import com.portfolio.maa.Entity.Proyectos;
import com.portfolio.maa.Repository.IProyectos;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SProyectos {
     @Autowired
     IProyectos iProyectos;
     
     public List<Proyectos> list(){
         return iProyectos.findAll();
     }
     
     public Optional<Proyectos> getOne(int id){
         return iProyectos.findById(id);
     }
     
     public Optional<Proyectos> getByNombreP(String nombreP){
         return iProyectos.findByNombreP(nombreP);
     }
     
     public void save(Proyectos proy){
         iProyectos.save(proy);
     }
     
     public void delete(int id){
         iProyectos.deleteById(id);
     }
     
     public boolean existsById(int id){
         return iProyectos.existsById(id);
     }
     
     public boolean existsByNombreP(String nombreP){
         return iProyectos.existsByNombreP(nombreP);
     }
}
