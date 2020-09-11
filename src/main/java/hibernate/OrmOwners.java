package hibernate;

import javax.persistence.*;

@Entity
@Table(name = "owners")
public class OrmOwners {
    @Id
    private String id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "surname")
    private String surname;
    @Column(name = "role")
    private String role;
    @Column(name = "email")
    private String email;
    @Column(name = "company_id")
    private String companyId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }
}
