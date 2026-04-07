package models.ATM;

public class Main
{
    public static void main(String[] args)
    {
        Cliente cliente1 = new Cliente("Marco","121-301299-1005C");
        Cuenta miCuenta = new Cuenta(cliente1,0,1234);

        miCuenta.AgregarMonto(5000);


        double montoActual = miCuenta.RetirarMonto(2000);


        System.out.println("el monto actual de su cuenta es " + montoActual);

//        if(montoActual == 0)
//        {
//            System.out.println("su cuenta no tiene fondos suficientes");
//        }
//        else
//        {
//            System.out.println("el monto actual de su cuenta es " + montoActual);
//        }

    }
}
