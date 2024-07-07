package com.shivintech.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shivintech.dao.PatientDataAccess;
import com.shivintech.model.Patient;

@Controller
public class PatientController 
{
 @RequestMapping(value = "patient" ,params ="reg")
 public ModelAndView RegisterPatient()
 {
	    ModelAndView mv = new ModelAndView();
	    mv.setViewName("PatientRegistration.jsp");
		return mv;
 }
 
 
 @RequestMapping("insertpatient")
 public ModelAndView insertPatient(HttpServletRequest request)
 {
     
     ModelAndView mv = new ModelAndView();

     String name  = request.getParameter("name");
     String email = request.getParameter("email");
     String pass  = request.getParameter("password");
     String gen   = request.getParameter("gender"); // Assuming gender is a String
     
       Patient p = new Patient(name,email,pass,gen);
	   PatientDataAccess.insertPatientDetail(p);
	    // we are sending data from Backend to FrontEnd so we nee to use addObject() method.
//	   mv.addObject("done","inserted");
        mv.setViewName("PatientRegistration.jsp");// after adding data redirecting user to same page
	    return mv;
     
 }
}
