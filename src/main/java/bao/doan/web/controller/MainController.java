package bao.doan.web.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import bao.doan.web.model.People;
import bao.doan.web.service.PeopleService;

@Controller
public class MainController {

  @Autowired
  PeopleService peopleService;


  @RequestMapping(value = "/home", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
  @ResponseBody
  public String helloWorld() {

    List<People> list = peopleService.getAll();
    Iterator<People> it = list.iterator();
    JsonArray arr = new JsonArray();
    while (it.hasNext()) {
      People people = it.next();
      JsonObject obj = new JsonObject();
      obj.addProperty("name", people.getName());
      obj.addProperty("age", people.getAge());
      arr.add(obj);
    }

    return arr.toString();
  }

  @RequestMapping(value = "/test", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
  @ResponseBody
  public String test() { 
    JsonObject obj = new JsonObject();
    obj.addProperty("test", "test"); 
    return obj.toString();
  }
}
