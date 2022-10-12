import java.util.*;

public class MainProduct {
    static List<Product> myProductList = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("*********MENU************");
            System.out.println("1.Them san pham");
            System.out.println("2.Sua thong tin san pham theo ma san pham");
            System.out.println("3.Xoa san pham theo ma san pham");
            System.out.println("4.Hien thi danh sach san pham");
            System.out.println("5.Tim kiem san pham theo ten");
            System.out.println("6.Sap xep san pham tang dan, giam dan theo gia");
            System.out.println("7.Thoat");
            System.out.print("Su lua chon cua ban: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    MainProduct.inputDataProduct(scanner);
                    break;
                case 2:
                    MainProduct.fixProduct(scanner);
                    break;
                case 3:
                    MainProduct.deleteProduct(scanner);
                    break;
                case 4:
                    System.out.println("***********************San Pham Co Trong Cua Hang CHANH*************************");
                    for (Product productDisplay : myProductList) {
                        productDisplay.displayData();
                    }
                    break;
                case 5:
                    MainProduct.searchProductName(scanner);
                    break;
                case 6:
                    MainProduct.xapXep();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.err.println("Vui long nhap tu 1-7!");
            }
        } while (true);
    }

    public static void inputDataProduct(Scanner scanner) {
        System.out.println("Ban muon nhap bao nhieu san pham:");
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < number; i++) {
            Product product1 = new Product();
            product1.inputData(scanner);
            myProductList.add(product1);
        }
    }

    public static void fixProduct(Scanner scanner) {
        System.out.println("Nhap ma sp ban muon sua");
        String productIdNew = scanner.nextLine();
        for (int i = 0; i < myProductList.size(); i++) {
            if (myProductList.get(i).getProductId().equals(productIdNew)) {
                myProductList.get(i).getProductId();
                System.out.println("Nhap ten san pham:");
                String productName = scanner.nextLine();
                if (productName != "" && productName.length() != 0) {
                    myProductList.get(i).setProductName(productName);
                }
                System.out.println("Nhap gia san pham: ");
                Float price = Float.parseFloat(scanner.nextLine());
                myProductList.get(i).setPrice(price);
            }
        }

    }

    public static void deleteProduct(Scanner scanner) {
        System.out.println("Nhap ma san pham ban muon xoa:");
        String deleteProductId = scanner.nextLine();
        for (int i = 0; i < myProductList.size(); i++) {
            if (myProductList.get(i).getProductId().equals(deleteProductId)) {
                myProductList.remove(i);
            } else {
                System.out.println("San pham khong co trong danh sach");
            }
        }
        System.out.println("Da xoa xong san pham");


    }

    public static void searchProductName(Scanner scanner) {
        System.out.println("Nhap ten san pham muon tim kiem:");
        String productNameSeach = scanner.nextLine();
        for (int i = 0; i < myProductList.size(); i++) {
            if (myProductList.get(i).getProductName().contains(productNameSeach)) {
                System.out.println("San pham ban muon tim la: ");
                myProductList.get(i).displayData();
            }
        }

    }

    public static void xapXep() {
        Collections.sort(myProductList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) o1.getPrice() - (int) o2.getPrice();
            }
        });
        System.out.println("Da sap xep xong theo gia ban tang dan tang dan");
    }
}



