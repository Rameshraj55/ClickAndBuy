package com.trailblazer.ClickAndBuy.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Past;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

    /*
    * USE VALIDATIONS
    * USE PATTERN MATCHING : Reg-ex
    * USE JACKSON LIBRARY: Json validations
    *
    *
    */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer customerId;

    private String firstName;

    private String lastName;

    @Column(unique = true)
    private String mobileNumber;

    @Column(unique = true)
    private String email;

    private String password;

    @Past
    private LocalDate dateOfBirth;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime accountCreatedDate;

    @UpdateTimestamp
    @Column(nullable = false)
    private LocalDateTime accountUpdatedDate;

    @OneToOne(cascade = CascadeType.ALL) // One Customer to Many Address
    private Address address;

    @OneToOne(cascade = CascadeType.ALL) // One Customer to Many Cart and its CartItems(Child)
    private Cart cart;

    @OneToMany(cascade = CascadeType.ALL) // One Customer to Many Orders and its items(child)
    private List<Order> listOfOrders = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL) // One Customer to Many CancelOrderRequest and its items(child)
    private List<CancelOrderRequest> listOfCancelOrders = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL) // One Customer to Many ReplaceOrderRequest and its items(child)
    private List<ReplaceOrderRequest> listOfReplaceOrders = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL) // One Customer to Many RefundOrderRequest and its items(child)
    private List<RefundOrderRequest> listOfRefunds = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL) // One Customer to Many Review
    private List<Review> listOfReviews = new ArrayList<>();

    /*
        * DevNote: Role and user pending - HIGH PRIORITY
        *
    */



}
