public class Coche {
    private int id;
    private String marca;
    private Motor motor;
    private int numVisitas;
    private int km;
    public Coche(int id, String marca, Motor m, int nV, int km){
        this.id=id;
        this.marca=marca;
        this.motor=m;
        this.numVisitas=nV;
        this.km=km;
    }
    public int getPotencia(){return this.motor.getPotencia();}
    public String getMarca(){return this.marca;}
    public int getNumKm(){return km;}
    public int getId(){return this.id;}
    public int getNumVisitas(){return this.numVisitas;}
}
