
class MainCredito
{
public static void main(String [] args)
{
    // Crear objeto
    Credito credito1 = new Credito();
    // Crear consola
    Consola c = new Consola();
    //leer datos
    credito1.montoDelCredito= c.leerEntero("Monto del Credito");
    credito1.tasaDeInteres= c.leerEntero("Tasa de Interes");
    credito1.plazoEnMeses= c.leerEntero("Plazo en Meses");
    //Ejecutar algoritmo
    credito1.algoritmo();
    //Imprimir datos
    c.imprimir("Valor Cuota Mensual    : " + credito1.valorCuotaMensual);
    c.imprimir("Valor Mensual Capital  : " + credito1.valorMensualCapital);
    c.imprimir("Valor Mensual Interes  : " + credito1.valorMensualInteres);
    c.imprimir("Ganancia Total         : " + credito1.gananciaTotal + "%");
    
}//fin class MainCredito
}