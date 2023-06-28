package paquete2;


public class PasajeUniversitario extends PasajeUrbano {
    
    public PasajeUniversitario(double pasaje, Persona p){
        super(pasaje, p);
    }
    
    @Override
    public void establecerValorPasaje(){
        valorPasaje = valorFijo - (valorFijo * 0.30);
    }
    
       
    @Override
    public String toString(){
        return String.format("Tipo de pasaje: Universitario\n"
                + "%s",
                super.toString()
                );
    }
}