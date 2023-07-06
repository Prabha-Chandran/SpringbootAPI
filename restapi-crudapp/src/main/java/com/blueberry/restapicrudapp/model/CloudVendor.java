package com.blueberry.restapicrudapp.model;

public class CloudVendor {
    private String vendorID;
    private String vendorName;
    private String vendorAdrress;
    private String vendorPhoneNumber;


    // gettter and setter of variables
    public String getVendorID() {
        return vendorID;
    }
    public void setVendorID(String vendorID) {
        this.vendorID = vendorID;
    }
    public String getVendorName() {
        return vendorName;
    }
    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }
    public String getVendorAdrress() {
        return vendorAdrress;
    }
    public void setVendorAdrress(String vendorAdrress) {
        this.vendorAdrress = vendorAdrress;
    }
    public String getVendorPhoneNumber() {
        return vendorPhoneNumber;
    }
    public void setVendorPhoneNumber(String vendorPhoneNumber) {
        this.vendorPhoneNumber = vendorPhoneNumber;
    }

    //constructors
    public CloudVendor(String vendorID, String vendorName, String vendorAdrress, String vendorPhoneNumber) {
        this.vendorID = vendorID;
        this.vendorName = vendorName;
        this.vendorAdrress = vendorAdrress;
        this.vendorPhoneNumber = vendorPhoneNumber;
    }    
}