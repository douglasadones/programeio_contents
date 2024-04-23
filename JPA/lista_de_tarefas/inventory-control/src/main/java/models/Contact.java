package models;

import generics.GenericEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
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
@Table(name = "contact")
public class Contact extends GenericEntity {
    @Id
    @SequenceGenerator(sequenceName = "seq_contact", name = "seq_contact")
    @GeneratedValue(generator = "seq_contact", strategy = GenerationType.SEQUENCE)
    private Long IdContact;
    
    @OneToMany(cascade = CascadeType.ALL)
    @Column(nullable = false)
    private ArrayList<Integer> number;
    
    @Column(nullable = false)
    private String email;

    public Contact() {
    }

    public Long getIdContact() {
        return IdContact;
    }

    public void setIdContact(Long IdContact) {
        this.IdContact = IdContact;
    }

    public ArrayList<Integer> getNumber() {
        return number;
    }

    public void setNumber(ArrayList<Integer> number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.IdContact);
        hash = 31 * hash + Objects.hashCode(this.number);
        hash = 31 * hash + Objects.hashCode(this.email);
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
        final Contact other = (Contact) obj;
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.IdContact, other.IdContact)) {
            return false;
        }
        return Objects.equals(this.number, other.number);
    }
    
}
