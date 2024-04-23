package models;

import generics.GenericEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import java.util.Objects;

/**
 *
 * @author dougl
 */

@Entity
@Table(name = "company")
public class Company extends GenericEntity {
    @Id
    @SequenceGenerator(sequenceName = "seq_company", name = "seq_company")
    @GeneratedValue(generator = "seq_company", strategy = GenerationType.SEQUENCE)
    private Long idCompany;
    
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    
    private int cnpj;
    @OneToOne(cascade = CascadeType.ALL)
    
    @Column(nullable = false)
    private Address address;
    
    @OneToOne(cascade = CascadeType.ALL)
    @Column(nullable = false)
    private Contact contact;

    public Company() {
    }

    public Long getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(Long idCompany) {
        this.idCompany = idCompany;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.idCompany);
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + this.cnpj;
        hash = 41 * hash + Objects.hashCode(this.address);
        hash = 41 * hash + Objects.hashCode(this.contact);
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
        final Company other = (Company) obj;
        if (this.cnpj != other.cnpj) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.idCompany, other.idCompany)) {
            return false;
        }
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        return Objects.equals(this.contact, other.contact);
    }
    
    
    
}
