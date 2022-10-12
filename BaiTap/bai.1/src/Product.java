import java.util.Scanner;

public class Product {
    private String productId;
    private String productName;
    private float price;

    public Product() {
    }

    public Product(String productId, String productName, float price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    public void inputData(Scanner scanner){
        System.out.println("Nhap ma san pham:");
        this.productId=scanner.nextLine();
        System.out.println("Nhap ten san pham:");
        this.productName=scanner.nextLine();
        System.out.println("Nhap gia san pham: ");
        this.price=Float.parseFloat(scanner.nextLine());
    }
    public void displayData(){
        System.out.printf("Ma sp:%-10s Ten San Pham:%-25s Gia San Pham:%-20f\n ",this.productId,this.productName,this.price);
    }
}
