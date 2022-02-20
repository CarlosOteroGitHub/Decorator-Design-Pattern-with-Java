package decorator;

public class NewClass {
    
    public static void main(String[] args){
        Cuenta c = new Cuenta(1, "CarlosOteroProgramer", "Pass123");
        
        ICuenta cuenta = new CuentaAhorro();
        ICuenta cuentaFuncionDecorator = new FuncionDecorator(cuenta);
        
        cuentaFuncionDecorator.abrirCuenta(c);
    }
}