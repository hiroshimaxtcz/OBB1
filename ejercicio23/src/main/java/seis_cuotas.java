public class seis_cuotas implements FormaPago{


    @Override
    public double costoTotal(double monto) {
        return monto + (monto *0.2);
    }
}
