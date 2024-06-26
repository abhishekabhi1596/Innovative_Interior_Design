package com.Innovative.Entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Getter
@Setter
@Table(name = "Records")
public class Records {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    @Column(name = "Name")
    public String name;
    @Column(name = "modeOfPayment")
    public String modeOfPayment;
    @Column(name = "paidTo")
    public String paidTo;
    @Column(name = "paidAmount")
    public String paidAmount;
    public String description;

    public Records(String expenseName, String methodOfPayment, String paidTo, String amountPaid, String description) {
        this.name = expenseName;
        this.modeOfPayment = methodOfPayment;
        this.paidTo = paidTo;
        this.paidAmount = amountPaid;
        this.description = description;
    }
}
