public class Cong extends BieuThucDecorator {

    private float toanHang;


    @Override
    public float giaTri() {
        
        return super.giaTri() + toanHang;
    }

    @Override
    public String bieuThuc() {
        
        return super.bieuThuc() + " + " + toanHang;
    }

    public Cong(BieuThuc bieuThuc, float toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    

   
    
}