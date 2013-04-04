package vik.example.springrest.controller;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import vik.example.springrest.bean.Saying;


@Controller
@RequestMapping("/")
public class SpringRestController{
	
	@Autowired
	private Jaxb2Marshaller jaxb2Mashaller;
	
	@RequestMapping(method=RequestMethod.PUT)
	public ModelAndView put(@RequestBody String body) {
		ObjectMapper mapper = new ObjectMapper();
		Saying saying = null;
		try {
			saying = mapper.readValue(body, Saying.class);
		} catch (JsonParseException e) {
			e.printStackTrace();
		}catch(JsonMappingException me){
			me.printStackTrace();
		}
		catch(IOException ie){
			ie.printStackTrace();
		}
		return new ModelAndView("xmlView", "saying", saying);
	}
	
}
