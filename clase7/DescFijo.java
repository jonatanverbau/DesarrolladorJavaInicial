package clase7;

public class DescFijo extends Descuento {
    @Override
public float valorFinal(float valorInicial) {
return valorInicial - this.getValorDesc();
}
}
