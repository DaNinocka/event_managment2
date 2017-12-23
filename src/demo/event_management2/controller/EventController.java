package demo.event_management2.controller;

import demo.event_management2.model.Event;
import demo.event_management2.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EventController {

    private EventService eventService;

    @Autowired
    @Qualifier(value = "eventService")
    public void setEventService (EventService eveS){
        this.eventService = eveS;
    }
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String listEvents(Model model){
        model.addAttribute("event",new Event());
        model.addAttribute("listEvents",this.eventService.listEvents());
        return "event";
    }
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String addEvent (@ModelAttribute("event") Event event){

        if(event.getId() == 0){
            this.eventService.addEvent(event);
        }else{
            this.eventService.updateEvent(event);
        }
        return "redirect:/";
    }

    @RequestMapping("/edit/{id}")
    public String updateEvent(@PathVariable("id") int id, Model model){
        model.addAttribute("event",this.eventService.getEventById(id));
        model.addAttribute("listEvents",this.eventService.listEvents());
        return "event";
    }
    @RequestMapping("/remove/{id}")
    public String removeEvent(@PathVariable("id") int id){
        this.eventService.removeEvent(id);
        return "redirect:/";

}}
