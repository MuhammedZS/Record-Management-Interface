package ca.sheridancollege.siddiq73.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ca.sheridancollege.siddiq73.beans.Tickets;


@Controller
public class Home_Controller {
	
	@GetMapping("/")
	public String Root(Model model) {
		return "root.html";
	}
	
	@GetMapping("/add")
	public String addPage(Model model) {

		model.addAttribute("ticket", new Tickets());
		return "addPage.html";
	}
	
	@PostMapping("/add")
	public String processAddPage(Model model, @ModelAttribute Tickets ticket){
		
		System.out.println(ticket.toString());
		
		ticketList.add(ticket);
		return "redirect:/add";
	}
	
	public static ArrayList<Tickets> ticketList = new ArrayList<Tickets>();
	
	@GetMapping("/view")
	public String viewSandwiches(Model model) {
		model.addAttribute("take", ticketList);
		return "viewPage.html";
	}
	
}