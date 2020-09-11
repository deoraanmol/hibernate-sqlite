package hibernate;

import javax.persistence.*;

@Entity
@Table(name = "companies")
public class OrmCompanies {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "abn_number")
    private String abn_number;
    @Column(name = "url")
    private String url;
    @Column(name = "address")
    private String address;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbn_number() {
        return abn_number;
    }

    public void setAbn_number(String abn_number) {
        this.abn_number = abn_number;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
