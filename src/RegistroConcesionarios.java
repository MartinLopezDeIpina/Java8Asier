import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static java.util.Comparator.comparing;
import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.*;

public class RegistroConcesionarios {
    private static final RegistroConcesionarios registroConcesionarios = new RegistroConcesionarios();
    private final List<Concesionario> listaConcesionarios;
    private RegistroConcesionarios(){listaConcesionarios = new ArrayList<>();}
    public static RegistroConcesionarios getRegistroConcesionarios(){return registroConcesionarios;}
    public void addConcesionario(Concesionario concesionario){this.listaConcesionarios.add(concesionario);}
    public List<Concesionario> getListaConcesionarios(){return this.listaConcesionarios;}
    public Map<Integer, Double> getMediaVisitasPorConcesionarios(){
        //TODO mediaVisitasPorConcesionario HECHO
        return listaConcesionarios.stream().collect(groupingBy(Concesionario::getIdConcesionario, averagingDouble(Concesionario::getNumVisitasTotales)));
    }
    public Map<Integer, Integer> numCochesPorConcesionarioMarcaInt(String marca){
        //TODO numCochesPorConcesionario
        return null;
    }
    public Map<Integer, Long> numCochesPorConcesionarioMarcaLong(String marca){
        //TODO numCochesPorConcesionario
        return null;
    }
    public List<Concesionario> listaConcesionariosOrdenadosVisitas(){
        //TODO concesionariosOrdenadosVisitas HECHO
        return listaConcesionarios.stream().sorted(comparing(Concesionario::getNumVisitasTotales).reversed()).toList();
    }
    public Map<String, Integer> numConcesionariosPorLocalidadInt(){
        //TODO numConcesionariosLocalidad HECHO
        return listaConcesionarios.stream().collect(groupingBy(Concesionario::getLocalidad, summingInt(c->1)));
    }
    public Map<String, Long> numConcesionariosPorLocalidadLong(){
        //TODO numConcesionariosLocalidad HECHO
        return listaConcesionarios.stream().collect(groupingBy(Concesionario::getLocalidad, counting()));
    }
    public Concesionario concesionarioCocheMasKm(){
        //TODO concesionarioCocheMasKm HECHO
        return listaConcesionarios.stream().max(comparingInt(Concesionario::kmMasAlto)).orElse(null);
    }
    public Concesionario concesionarioCocheMenosKm(){
        //TODO concesionarioCocheMenosKm HECHO
        return listaConcesionarios.stream().min(comparingInt(Concesionario::kmMasBajo)).orElse(null);
    }
    public Coche cocheMasKm(){
        //TODO cocheMasKm ERROR: getNumKm tiene que ser estático
        return listaConcesionarios.stream().map(Concesionario::elCocheKmMasAlto).max(comparing(Coche::getNumKm)).orElse(null);
    }
    public Coche cocheMenosKm(){
        //TODO cocheMenosKm ERROR: getNumKm tiene que ser estático
        return listaConcesionarios.stream().map(Concesionario::elCocheKmMasBajo).min(comparing(Coche::getNumKm)).orElse(null);
    }
}
