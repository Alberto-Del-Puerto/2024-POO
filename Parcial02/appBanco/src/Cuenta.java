public class Cuenta {
    // atributos
    private String numCuenta;
    private double saldo;
    private Cliente cliente;
    private String nip;



    public Cuenta(String numCuenta, double saldo, Cliente cliente, String nip) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.cliente = cliente;
        this.nip = nip;
    }



    public String getNumCuenta() {
        return numCuenta;
    }



    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }



    public double getSaldo() {
        return saldo;
    }



    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }



    public Cliente getCliente() {
        return cliente;
    }



    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }



    public String getNip() {
        return nip;
    }



    public void setNip(String nip) {
        this.nip = nip;
    }

    // metodos adicionales 

    public void deposito(double monto){
        this.saldo += monto;
        System.out.println("Deposito exitoso, nuevo saldo: "+getSaldo());
    }

    public void retiro(double monto){
        if(this.saldo >= monto){
            this.saldo -= monto;
            System.out.println("Retiro exitoso, nuevo saldo: "+this.getSaldo());
        }else{
            System.out.println("Saldo insuficiente");
        }
    }


    public void tranferencia(Cuenta cuentaDestino, double monto){
        if(this.saldo>=monto){
            this.saldo -= monto;
            cuentaDestino.setSaldo(cuentaDestino.getSaldo()+monto);
           // cuentaDestino.deposito(monto);
           System.out.println("transferencia exitosa, nuevo saldo: "+this.saldo);
        }else{
            System.out.println("Saldo insuficiente");
        }
    }





    public void printDatos(){
        System.out.println(cliente.getNombre() +", num cuenta:"+ this.numCuenta +" , saldo: "+this.saldo );
    }
    

    
}
