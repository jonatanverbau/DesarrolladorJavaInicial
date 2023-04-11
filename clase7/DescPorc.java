package clase7;

public class DescPorc extends Descuento {
    @Override
    public float valorFinal(float valorInicial) {
    return valorInicial - (valorInicial * 
    this.getValorDesc()/100);
    }
    }