public class BieuThucDonGian extends BieuThuc {
    private float toanHang;

    
    public BieuThucDonGian(float toanHang) {
        this.toanHang = toanHang;
    }

    public float getToanHang() {
        return toanHang;
    }

    public void setToanHang(float toanHang) {
        this.toanHang = toanHang;
    }
    
    @Override
    public float giaTri() {

        return toanHang;
    }

    @Override
    public String bieuThuc() {
        StringBuilder stringBuilder = new StringBuilder();
        return stringBuilder.append(toanHang).toString();
    }





}