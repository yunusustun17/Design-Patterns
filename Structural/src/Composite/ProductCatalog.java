package Composite;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalog implements ICatalogComponent {
    private String name;

    private List<ICatalogComponent> catalogComponents;

    public ProductCatalog(String name) {
        this.name = name;
        this.catalogComponents = new ArrayList<ICatalogComponent>();
    }

    public void add(ICatalogComponent catalogComponent) {
        catalogComponents.add(catalogComponent);
    }

    public void remove(ICatalogComponent catalogComponent) {
        catalogComponents.remove(catalogComponent);
    }

    @Override
    public void drawHierarchy() {
        System.out.println(name);
        for (ICatalogComponent catalogComponent : catalogComponents) {
            catalogComponent.drawHierarchy();
        }
    }
}
