package com.shakeel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shakeel.model.Trainer;
import com.shakeel.serviceimp.TrainerServiceImp;

@RestController
@RequestMapping("/trainer")
@CrossOrigin("*")
public class TrainerController {

	@Autowired
	TrainerServiceImp service;

	@PostMapping
	public String insertTrainer(@RequestBody Trainer trn) {
		String msg = "";

		try {
			service.addTrainer(trn);
			msg = "Trainer added";

		} catch (Exception e) {

			e.printStackTrace();
			msg = "Failed to add trainer";
		}
		return msg;
	}

	@GetMapping("{id}")
	public Trainer readTrainer(@PathVariable("id") int id) {

		return service.getTrainer(id);
	}

	@GetMapping("/all")
	public List<Trainer> getTrainer() {

		return service.getAllTrainers();
	}

	@PutMapping
	public String updateTrainer(@RequestBody Trainer trn) {
		String msg = "";

		try {
			service.updateTrainer(trn);
			msg = "updated trainer details";

		} catch (Exception e) {

			e.printStackTrace();
			msg = "not updated";
		}
		return msg;
	}

	@DeleteMapping("{id}")
	public String deleteTrainer(@PathVariable("id") int id) {

		String msg = "";

		try {
			service.deleteTrainer(id);
			msg = "deleted trainer details";

		} catch (Exception e) {

			e.printStackTrace();
			msg = "deletion failed";
		}

		return msg;

	}

}
