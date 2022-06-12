package model;

public enum TipoMascota {
    PERRO("Perro"),
    GATO("Gato"),
    LORO("Loro"),
    HAMSTER("Hamster");
    
    private String especie;

    private TipoMascota(String especie) {
        this.especie = especie;
    }

    @Override
    public String toString() {
        return  especie;
    }
       
}
