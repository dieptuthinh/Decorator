public class Tru extends BieuThucDecorator {

    private float toanHang;


    @Override
    public float giaTri() {
        
        return super.giaTri() - toanHang;
    }

    @Override
    public String bieuThuc() {
        
        return super.bieuThuc()+ "-" + toanHang;
    }

    public Tru(BieuThuc bieuThuc,float toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    
}