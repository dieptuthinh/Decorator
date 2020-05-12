public class App {
    public static void main(String[] args) throws Exception {
        BieuThuc bieuThuc = new BieuThucDonGian(7);
        bieuThuc = new Tru(bieuThuc,5);

        bieuThuc = new Nhan(bieuThuc, 5);
        bieuThuc = new Cong(bieuThuc, 5);
        bieuThuc = new Chia(bieuThuc, 5);


        System.out.println(bieuThuc.bieuThuc()+ " = "+ bieuThuc.giaTri());

                 
    }
}
