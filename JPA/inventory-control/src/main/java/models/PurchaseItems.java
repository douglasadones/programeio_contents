package models;

import generics.GenericEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author dougl
 */

@Entity
@Table(name = "purchaseItems")
public class PurchaseItems extends GenericEntity {
    
    @Id
    @SequenceGenerator(sequenceName = "seq_purchaseItems", name = "seq_purchaseItems")
    @GeneratedValue(generator = "seq_purchaseItems")
    private Long idPurchaseItems;
    
    @OneToMany(cascade = CascadeType.ALL) 
    private List<Product> products;

    public PurchaseItems() {
    }

    public Long getIdPurchaseItems() {
        return idPurchaseItems;
    }

    public void setIdPurchaseItems(Long idPurchaseItems) {
        this.idPurchaseItems = idPurchaseItems;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.idPurchaseItems);
        hash = 73 * hash + Objects.hashCode(this.products);
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
        final PurchaseItems other = (PurchaseItems) obj;
        if (!Objects.equals(this.idPurchaseItems, other.idPurchaseItems)) {
            return false;
        }
        return Objects.equals(this.products, other.products);
    }

    
}
