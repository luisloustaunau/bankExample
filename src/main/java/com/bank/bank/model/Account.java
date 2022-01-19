package com.bank.bank.model;

import javax.persistence.*;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "user_generator")
    @SequenceGenerator(name = "user_generator", sequenceName = "user_seq")
    int accountId;

    @Column
    double balance;
    @Column
    boolean checking;
    @Column
    boolean saving;
    @Column
    boolean loan;

    @OneToMany(mappedBy = "accounts")
    private Customer owner;

    public Customer getOwner() {
        return owner;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }

    public Account(double balance, boolean checking, boolean saving, boolean loan) {
        this.balance = balance;
        this.checking = checking;
        this.saving = saving;
        this.loan = loan;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isSaving() {
        return saving;
    }

    public void setSaving(boolean saving) {
        this.saving = saving;
    }
}
