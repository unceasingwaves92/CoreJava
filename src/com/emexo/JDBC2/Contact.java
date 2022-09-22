package com.emexo.JDBC2;

public class Contact {

        public String ContactFirstName;
        public String ContactLastName;
        public String ContactEmail;
        public int ContactPhnNum;

        public String getContactFirstName() {
            return ContactFirstName;
        }

        public void setContactFirstName(String contactFirstName) {
            ContactFirstName = contactFirstName;
        }

        public String getContactLastName() {
            return ContactLastName;
        }

        public void setContactLastName(String contactLastName) {
            ContactLastName = contactLastName;
        }

        public String getContactEmail() {
            return ContactEmail;
        }

        public void setContactEmail(String contactEmail) {
            ContactEmail = contactEmail;
        }

        public int getContactPhnNum() {
            return ContactPhnNum;
        }

        public void setContactPhnNum(int contactPhnNum) {
            ContactPhnNum = contactPhnNum;
        }

        @Override
        public String toString() {
            return "Contact{" +
                    "ContactFirstName='" + ContactFirstName + '\'' +
                    ", ContactLastName='" + ContactLastName + '\'' +
                    ", ContactEmail='" + ContactEmail + '\'' +
                    ", ContactPhnNum='" + ContactPhnNum + '\'' +
                    '}';
        }
    }




