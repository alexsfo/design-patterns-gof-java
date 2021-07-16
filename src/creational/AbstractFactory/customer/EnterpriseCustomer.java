package creational.AbstractFactory.customer;

import creational.AbstractFactory.interfaces.Customer;

public class EnterpriseCustomer extends Customer {

    private String name;

    public EnterpriseCustomer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
