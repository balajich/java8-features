package data.model;

import java.util.ArrayList;
import java.util.List;

public class ClassRoomRepo {
    public static List<ClassRoom> getAllClassRooms(){
       List<ClassRoom> allClassRooms= new ArrayList<>();
        allClassRooms.add(new ClassRoom(1,"Grade1", StudentRepo.getGrade1Students()));
        allClassRooms.add(new ClassRoom(2,"Grade2",StudentRepo.getGrade2Students()));
        return allClassRooms;
    }

}
