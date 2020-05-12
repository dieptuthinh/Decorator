public abstract class  BieuThucDecorator extends BieuThuc{
    public BieuThuc bieuThuc;

    public BieuThucDecorator(BieuThuc bieuThuc) {
        this.bieuThuc = bieuThuc;
    }
    
    @Override
    public float giaTri() {
        return bieuThuc.giaTri();
    }
    @Override
    public String bieuThuc() {
        return bieuThuc.bieuThuc();
    }
}