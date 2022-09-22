package com.emexo.serialization;

import java.io.Serializable;

public class Bank implements Serializable {

    public static final String BANK_NAME="ICICI";
    public static final long serialVersionUID= 12323456L;

    private int accoutNo;
    private String accoutName;
    private transient String branchName;

    public int getAccoutNo() {
        return accoutNo;
    }

    public void setAccoutNo(int accoutNo) {
        this.accoutNo = accoutNo;
    }

    public String getAccoutName() {
        return accoutName;
    }

    public void setAccoutName(String accoutName) {
        this.accoutName = accoutName;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "accoutNo=" + accoutNo +
                ", accoutName='" + accoutName + '\'' +
                ", branchName='" + branchName + '\'' +
                '}';
    }
}
