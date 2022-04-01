/**
 * @author Ryan Juelsgaard - rjuelsgaard
 * CIS175 - Spring 2022
 * Mar 31, 2022
 */
package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.Player;
import dmacc.repository.PlayerRepository;

@Controller
public class WebController {
	@Autowired
	PlayerRepository repo;

	@GetMapping({"/", "viewAll"})
	public String viewAllPlayers(Model model) {
		if (repo.findAll().isEmpty()){
			return addNewPlayer(model);
		}
		model.addAttribute("players", repo.findAll());
		return "results";
	}

	@GetMapping("/inputPlayer")
	public String addNewPlayer(Model model) {
		Player c = new Player();
		model.addAttribute("newPlayer", c);
		return "input";
	}

	@PostMapping("/inputPlayer")
	public String addNewPlayer(@ModelAttribute Player p, Model model) {
		repo.save(p);
		return viewAllPlayers(model);
	}

	@GetMapping("/edit/{id}")
	public String showUpdatePlayer(@PathVariable("id") long id, Model model) {
		Player c = repo.findById(id).orElse(null);
		model.addAttribute("newContact", c);
		return "input";
	}

	@PostMapping("/update/{id}")
	public String reviseContact(Player c, Model model) {
		repo.save(c);
		return viewAllPlayers(model);
	}
	
	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") long id, Model model) {
		Player c = repo.findById(id).orElse(null);
		repo.delete(c);
		return viewAllPlayers(model);
	}
}
