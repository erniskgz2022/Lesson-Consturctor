package Practice_Conctructor.Practice_Task3;

import java.time.LocalDate;

public class Group {
    String groupName;
    LocalDate starDate;
    String mentor;

    public  Group (){

    }
    public Group (String groupName, LocalDate starDate, String mentor){
        this.groupName = groupName;
        this.starDate  = starDate;
        this.mentor = mentor;
    }
}
