
public class Credito
{
    // Entradas:
    long montoDelCredito;
    long tasaDeInteres;
    long plazoEnMeses;
    // Salidas:
    long valorCuotaMensual;
    long valorMensualCapital;
    long valorMensualInteres;
    long gananciaTotal;
    
    void algoritmo( ){
      
      valorCuotaMensual = (montoDelCredito/plazoEnMeses)+(montoDelCredito*tasaDeInteres)/100;
      valorMensualCapital = montoDelCredito/plazoEnMeses;
      valorMensualInteres = montoDelCredito*tasaDeInteres/100;
      gananciaTotal = (valorMensualInteres*plazoEnMeses*100)/montoDelCredito;
    }//fin method
    
}//fin class Credito
