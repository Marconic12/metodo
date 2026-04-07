package models.ATM;

public class Cuenta
{

    private Object nombrePersona;
    private double saldoInicial;
    private int accountId;



    public Cuenta(Object nombrePersona, double saldoInicial,int accountId)
    {
        this.nombrePersona = nombrePersona;
        this.saldoInicial = saldoInicial;
        this.accountId = accountId;
    }


    public void setSaldoInicial(double saldoInicial)
    {
        this.saldoInicial = saldoInicial;
    }

    public void AgregarMonto(double monto)
    {
        this.saldoInicial +=  monto;
    }


    public double RetirarMonto(double monto)
    {

        if (this.saldoInicial > monto)
        {
            this.saldoInicial -= monto;
            return monto;
        }
        else
        {
            return 0;
        }
    }

    public String ToString()
    {
        return "el saldo de su cuenta es " + saldoInicial;
    }
}
