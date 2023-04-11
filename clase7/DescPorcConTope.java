package clase7;

public class DescPorcConTope extends Descuento {
    private float tope;
    public float getTope() {
        return tope;
    }

    public void setTope(float tope) {
        this.tope = tope;
    }

    @Override
    public float valorFinal(float valorInicial) {
        if (valorInicial *
        this.getValorDesc() / 100>=tope){
            return valorInicial - tope;
        }else{

        return valorInicial - (valorInicial *
                this.getValorDesc() / 100);
    }
    }
}