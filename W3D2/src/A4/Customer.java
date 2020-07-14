package A4;

import java.util.ArrayList;

public class Customer {
    private String name;
    private String surname;
    private String eMail;
    private int accNumber;
    private String phoneNumber;
    private ArrayList<Invoice> invoices;

    public Customer(String name, String surname, String eMail, int accNumber, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.eMail = eMail;
        this.accNumber = accNumber;
        this.phoneNumber = phoneNumber;
        //addInvoice(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void addInvoice(Invoice invoice){

        if(this.invoices.size()>2){
            System.out.println("Sorry, you cant add more than 3 invoices");
        } else {
            this.invoices.add(invoice);
        }
    }
/*    public void printInvoices(){
        System.out.println("Invoices for: " + this.name + this.surname);
        for(int i = 0; i< this.invoices.size(); i++) {
            System.out.println("Invoice " + i);
            invoices.get(i).print();
        }
        }*/
    }

