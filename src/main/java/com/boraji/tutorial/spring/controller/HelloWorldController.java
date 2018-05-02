package com.boraji.tutorial.spring.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author imssbora
 */
@Controller
public class HelloWorldController {
   
   @RequestMapping(path={"/"},method=RequestMethod.GET)
   public String sayHello(Model model) {
<<<<<<< HEAD
      model.addAttribute("message","Hello vijaya bhaskar vayyavuru Spring MVC!");
=======
      model.addAttribute("message","Hello vijaya bhaskar Spring MVC!");
>>>>>>> master
     
      //Java 8 LocalDate
      DateTimeFormatter formatter=DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
      LocalDate date=LocalDate.now();
      model.addAttribute("date", date.format(formatter));
      
      return "index";
   }
}
