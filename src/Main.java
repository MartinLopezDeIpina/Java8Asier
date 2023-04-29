import java.util.List;

public class Main {
    public static void main(String[] args) {
        RegistroConcesionarios registroConcesionarios = RegistroConcesionarios.getRegistroConcesionarios();

        Motor m1 = new Motor(500);
        Motor m2 = new Motor(100);
        Motor m3 = new Motor(700);

        Concesionario c1 = new Concesionario(1, "Vitoria");
        registroConcesionarios.addConcesionario(c1);
        Concesionario c2 = new Concesionario(2, "Vitoria");
        registroConcesionarios.addConcesionario(c2);
        Concesionario c3 = new Concesionario(3, "Bilbo");
        registroConcesionarios.addConcesionario(c3);
        Concesionario c4 = new Concesionario(4, "Madrid");
        registroConcesionarios.addConcesionario(c4);
        Concesionario c5 = new Concesionario(5, "Madrid");
        registroConcesionarios.addConcesionario(c5);
        Concesionario c6 = new Concesionario(6, "Barcelona");
        registroConcesionarios.addConcesionario(c6);

        Coche coche1 = new Coche(1, "BMW", m1, 100, 10045);
        c1.addCoche(coche1);
        Coche coche2 = new Coche(1, "Mercedes", m2, 250, 200689);
        c5.addCoche(coche2);
        Coche coche3 = new Coche(1, "BMW", m2, 300, 12300);
        c3.addCoche(coche3);
        Coche coche4 = new Coche(1, "Mercedes", m1, 100, 100345);
        c1.addCoche(coche4);
        Coche coche5 = new Coche(1, "Porche", m3, 110, 14024);
        c4.addCoche(coche5);
        Coche coche6 = new Coche(1, "BMW", m1, 100, 102300);
        c6.addCoche(coche6);
        Coche coche7 = new Coche(1, "Porche", m3, 220, 154500);
        c2.addCoche(coche7);
        Coche coche8 = new Coche(1, "Mercedes", m1, 101, 14027);
        c1.addCoche(coche8);
        Coche coche9 = new Coche(1, "Porche", m3, 251, 10034);
        c3.addCoche(coche9);
        Coche coche10 = new Coche(1, "BMW", m1, 320, 200689);
        c6.addCoche(coche10);
        Coche coche11 = new Coche(1, "Porche", m3, 100, 200689);
        c3.addCoche(coche11);
        Coche coche12 = new Coche(1, "BMW", m1, 252, 10023);
        c5.addCoche(coche12);
        Coche coche13 = new Coche(1, "Mercedes", m2, 100, 14020);
        c4.addCoche(coche13);
        Coche coche14 = new Coche(1, "BMW", m3, 430, 103400);
        c2.addCoche(coche14);
        Coche coche15 = new Coche(1, "Mercedes", m1, 253, 203489);
        c4.addCoche(coche15);


    }
}