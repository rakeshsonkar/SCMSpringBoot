package com.scm.entities;
import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Contact {
    @Id
    private String id;
    private String name;
    private String email;
    private String phoneNumber;
    private String picture;
    @Column(length =10000)
    private String description;
    private boolean favorite=false;
    private String websiteLink;
    private String linkedInLink;
   // private List<String> socialLinks= new ArrayList<>();

   @ManyToOne
   private User user;

   @OneToMany(mappedBy = "contact",cascade = CascadeType.ALL,fetch = FetchType.EAGER,orphanRemoval = true)
   private List<SocialLink> links = new ArrayList<>();
}
