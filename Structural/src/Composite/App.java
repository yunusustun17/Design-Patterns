package Composite;

public class App {
    public static void main(String[] args) {
        ProductCatalog items = new ProductCatalog("Ürünler");

        ProductCatalog phones = new ProductCatalog("Telefonlar");

        ProductCatalog iPhone = new ProductCatalog("iPhone Telefonlar");
        ProductCatalog samsung = new ProductCatalog("Samsung Telefonlar");

        Product iphone5Item = new Product("iPhone 5 Telefon");
        Product samsungGalaxyItem = new Product("Samsung Galaxy Telefon");

        items.add(phones);

        phones.add(iPhone);
        phones.add(samsung);

        iPhone.add(iphone5Item);

        samsung.add(samsungGalaxyItem);

        items.drawHierarchy();
    }
}
