public class cajero {
    //atributos
    private double saldo;
    private String Banco;
        
    //metodos
    cajero(){
        this.saldo = 100000;
        this.Banco = "*****";
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getBanco() {
        return Banco;
    }

    public void setBanco(String banco) {
        Banco = banco;
    }
    
    // metodos adicionales.

    public void deposito(double monto){
        setSaldo(getSaldo()+monto);
       // this.saldo = this.saldo+monto; 
    }

    public void retiro(double monto){
        setSaldo(getSaldo()-monto);
    }

    public void printDatos(){
        System.out.println("banco: "+getBanco()+ ", saldo: "+getSaldo());
    }


}
