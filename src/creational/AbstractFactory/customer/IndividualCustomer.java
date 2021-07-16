package creational.AbstractFactory.customer;

import creational.AbstractFactory.interfaces.Customer;

public class IndividualCustomer extends Customer {

    public IndividualCustomer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
