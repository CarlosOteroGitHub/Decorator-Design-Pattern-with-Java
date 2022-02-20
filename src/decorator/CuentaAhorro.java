package decorator;

public class CuentaAhorro implements ICuenta {
    
    @Override
    public void abrirCuenta(Cuenta c){
        System.out.println("Se aperturó la cuenta de ahorro, del usuario: " + c.getNombre_usuario());
    }
}