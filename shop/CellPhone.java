package shop;

public class CellPhone extends Product {
    private String carrier;

    public CellPhone(String pName, int price, String carrier) {
        super(pName, price);
        this.carrier = carrier;
    }

    // 통신사 정보(carrier)

    @Override
    void printExtra() {
        // 통신사 정보
        System.out.println("통신사 정보 : " + carrier);
    }

}
