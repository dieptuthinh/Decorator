public class Chia extends BieuThucDecorator {
    private int toanHang;


    @Override
    public float giaTri() {
        
        return bieuThuc.giaTri() / toanHang;
    }

    @Override
    public String bieuThuc() {
        
        return super.bieuThuc() + " / " + toanHang;
    }

    public Chia(BieuThuc bieuThuc, int toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    
}