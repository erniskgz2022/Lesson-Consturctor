package Practice_Conctructor.Practice_Task3;

import java.time.LocalDate;

public class Company {
    String companyName;
    String country;
    LocalDate yearOfFoundation;
    String founder;
    Group [] groups;

    public Company () {

    }

    public  Company (String companyName, String country, LocalDate yearOfFoundation, String founder, Group [] groups){
        this.companyName = companyName;
        this.country = country;
        this.yearOfFoundation = yearOfFoundation;
        this.founder = founder;
        this.groups = groups;
    }

}


