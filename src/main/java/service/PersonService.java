package service;


import entity.Person;
import entity.Roomtime;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import repository.RoomTimeRepository;

public class PersonService {
    private final RoomTimeRepository roomTimeRepository;

    public PersonService(RoomTimeRepository roomTimeRepository) {
        this.roomTimeRepository = roomTimeRepository;
    }

    public String appointmentInsert(Roomtime roomtime) { //uso il data binding
        roomTimeRepository.save(roomtime);
        return "home";
    }

    @RequestMapping(value="appointmentView", method= RequestMethod.POST)
    public String appointmentView() { //uso il data binding
        return "";
    }

}