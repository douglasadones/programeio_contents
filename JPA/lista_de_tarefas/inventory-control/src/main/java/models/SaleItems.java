package models;

import generics.GenericEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author dougl
 */

@Entity
@Table(name = "saleItems")
public class SaleItems extends GenericEntity {  
    
    @Id
    @SequenceGenerator(sequenceName = "seq_saleItems", name = "seq_saleItems")
    @GeneratedValue(generator = "seq_saleItems", strategy = GenerationType.SEQUENCE)
    private Long idSaleItems;
    
    @OneToMany(cascade = CascadeType.ALL)
    private ArrayList<Product> products;

    public SaleItems() {
    }

    public Long getIdSaleItems() {
        return idSaleItems;
    }

    public void setIdSaleItems(Long idSaleItems) {
        this.idSaleItems = idSaleItems;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.idSaleItems);
        hash = 97 * hash + Objects.hashCode(this.products);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SaleItems other = (SaleItems) obj;
        if (!Objects.equals(this.idSaleItems, other.idSaleItems)) {
            return false;
        }
        return Objects.equals(this.products, other.products);
    }
    
    
}
