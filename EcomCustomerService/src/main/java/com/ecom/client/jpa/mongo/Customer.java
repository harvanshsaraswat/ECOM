package com.ecom.client.jpa.mongo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "customers")
public class Customer {

    @Id
    private String custId;
    
    private String custName;
    private String custAdd;
    private String custContact;

    // Default constructor
    public Customer() {}

    // Parameterized constructor
    public Customer(String custId, String custName, String custAdd, String custContact) {
        this.custId = custId;
        this.custName = custName;
        this.custAdd = custAdd;
        this.custContact = custContact;
    }

    // Getters and Setters
    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustAdd() {
        return custAdd;
    }

    public void setCustAdd(String custAdd) {
        this.custAdd = custAdd;
    }

    public String getCustContact() {
        return custContact;
    }

    public void setCustContact(String custContact) {
        this.custContact = custContact;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custId='" + custId + '\'' +
                ", custName='" + custName + '\'' +
                ", custAdd='" + custAdd + '\'' +
                ", custContact='" + custContact + '\'' +
                '}';
    }
}
