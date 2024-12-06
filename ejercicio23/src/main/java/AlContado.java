public class AlContado implements FormaPago{

    @Override
    public double costoTotal(double monto) {
        return monto;
    }

}
