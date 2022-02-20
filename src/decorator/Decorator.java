package decorator;

public abstract class Decorator implements ICuenta {
    
    protected ICuenta cuentaDecorator;
    
    public Decorator(ICuenta cuentaDecorator){
        this.cuentaDecorator = cuentaDecorator;
    }
    
    @Override
    public void abrirCuenta(Cuenta c){
        this.cuentaDecorator.abrirCuenta(c);
    }
}