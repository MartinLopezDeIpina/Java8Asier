import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.max;
import static java.util.Comparator.comparing;
import static java.util.Comparator.comparingInt;

public class Concesionario {
    private List<Coche> listaCoches;
    private int idConcesionario;
    private String localidad;
    public Concesionario(int id, String locaclidad){
        this.listaCoches = new ArrayList<>();
        this.idConcesionario = id;
        this.localidad=locaclidad;
    }
    public int getIdConcesionario(){return this.idConcesionario;}
    public int getNumVisitasTotales(){return 0;}
    public String getLocalidad(){return this.localidad;}
    public void addCoche(Coche coche){listaCoches.add(coche);}
    public long getNumCochesMarcaLong(String marca){
        //TODO getNumCochesMarcaLong HECHO
        return listaCoches.stream().filter(C -> C.getMarca()==marca).count();
    }
    public int getNumCochesMarcaInt(String marca){
        //TODO getNumCochesMarcaInt HECHO
        return (int)listaCoches.stream().filter(C -> C.getMarca()==marca).count();
    }
    public List<Coche> cochesOrdenadosPorKm(){
        //TODO cochesOrdenadosPorKm HECHO
        return listaCoches.stream().sorted(comparing(Coche::getNumKm).reversed()).toList();
    }
    public List<Coche> cochesOrdenadosPorPotencia(){
        //TODO cochesOrdenadosPorPotencia HECHO
        return listaCoches.stream().sorted(comparing(Coche::getPotencia).reversed()).toList();
    }
    public int kmMasAlto(){
        //TODO kmMasAlto HECHO
        //FORMA 1:
        //return listaCoches.stream().sorted(comparing(Coche::getNumKm).reversed()).toList().get(0).getNumKm();
        //FORMA 2:
        return listaCoches.stream().mapToInt(Coche::getNumKm).max().orElse(-1);
    }
    public int kmMasBajo(){
        //TODO kmMasBajo HECHO
        //FORMA 1:
        //return listaCoches.stream().sorted(comparing(Coche::getNumKm)).toList().get(0).getNumKm();
        //FORMA 2:
        return listaCoches.stream().mapToInt(Coche::getNumKm).min().orElse(-1);
    }
    public int cocheKmMasAlto(){
        //TODO cocheKmMasAlto HECHO
        //FORMA 1:
        //return listaCoches.stream().sorted(comparing(Coche::getNumKm).reversed()).toList().get(0);
        //FORMA 2:
        return listaCoches.stream().max(comparing(Coche::getNumKm)).orElse(null).getId();
    }
    public int cocheKmMasBajo(){
        //TODO cocheKmMasBajo HECHO
        //FORMA 1:
        //return listaCoches.stream().sorted(comparing(Coche::getNumKm)).toList().get(0);
        //FORMA 2:
        return listaCoches.stream().min(comparing(Coche::getNumKm)).orElse(null).getId();
    }
    public Coche getCoche(int idCoche){
        return listaCoches.stream().filter(c->c.getId()==idCoche).findFirst().orElse(null);
    }
}
