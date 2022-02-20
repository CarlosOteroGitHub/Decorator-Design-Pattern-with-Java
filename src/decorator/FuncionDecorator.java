package decorator;

public class FuncionDecorator extends Decorator {
    
    public FuncionDecorator(ICuenta cuentaDecorator){
        super(cuentaDecorator);
    }
    
    @Override
    public void abrirCuenta(Cuenta c){
        cuentaDecorator.abrirCuenta(c);
        
        agregarFuncionalidadAdicional(c);
    }
    
    public void agregarFuncionalidadAdicional(Cuenta c){
        System.out.println("Se agrego servicio/funcionalidad adicional a la cuenta de usuario: " + c.getNombre_usuario());
    }
}