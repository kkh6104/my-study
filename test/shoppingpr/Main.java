package shoppingpr;

public class Main {
    public static void main(String[] args) {
        // 다형성을 활용하여 Deliverable 배열로 묶기
        Deliverable[] orderList = new Deliverable[3];
        
        orderList[0] = new GeneralProduct("자바 책", 28000); // 배송비 3000원 대상
        orderList[1] = new GeneralProduct("키보드", 45000);   // 배송비 0원 대상
        orderList[2] = new FreshFood("생연어", 22000);       // 무조건 배송비 5000원

        for (Deliverable item : orderList) {
            item.prepareDelivery();
            System.out.println("배송비: " + item.calculateDeliveryFee() + "원");
            System.out.println("----------------------------------------");
        }
    }
}