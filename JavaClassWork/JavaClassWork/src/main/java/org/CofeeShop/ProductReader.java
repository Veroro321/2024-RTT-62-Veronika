//package org.CofeeShop;
//
//import java.io.BufferedReader;
//
//public class ProductReader {
//    public static void main(String[] args) {
//
//        List<Product> product = new ArrayList<>();
//
//        try{
//            File file = new File("products.csv");
//            FilerReader filereader = new fileReader(file);
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//            String header = bufferedReader.readline();
//            String product = bufferedReader.readline();
//
//
//            System.out.println(header);
//            System.out.println(product);
//
//        } catch ( Exception e){
//            e.printStackTrace();
//        }
//
//        return products;
//    }
//
//    public static void main(String[] args) {
//        ProductReader pr = new ProductReader();
//        pr.readProducts();
//
//    }
//
//}
