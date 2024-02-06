package com.java.gowtham.DemoProject.models.customer;

import com.java.gowtham.DemoProject.models.permission.Permission;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 250)
    private String name;
    @Column(length = 250)
    private String organisation;
    @Column(length = 250)
    private String country;
    @Column(length = 250)
    private String state;
    @Column(length = 250)
    private String description;
    @Column(length = 20)
    private String tradeMark;
/*    @OneToMany(targetEntity = Permission.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "CustomerPermission", referencedColumnName = "id")
    private List<Permission> permissions;*/
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "Customer_Permission_Table",
            joinColumns = {
                    @JoinColumn(name = "customer_Id", referencedColumnName = "id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "Permission_Id", referencedColumnName = "id")
            }
    )
    private List<Permission> permissions;

    public Customer() {
    }

    public Customer(Long id, String name, String organisation, String country, String state, String description,
                    String tradeMark, List<Permission> permissions) {
        this.id = id;
        this.name = name;
        this.organisation = organisation;
        this.country = country;
        this.state = state;
        this.description = description;
        this.tradeMark = tradeMark;
        this.permissions = permissions;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrganisation() {
        return organisation;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTradeMark() {
        return tradeMark;
    }

    public void setTradeMark(String tradeMark) {
        this.tradeMark = tradeMark;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }
}