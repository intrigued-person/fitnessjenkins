package com.shakeel.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shakeel.model.Trainer;
import com.shakeel.repoimp.TrainerRepoImp;
import com.shakeel.service.TrainerService;

@Service
public class TrainerServiceImp implements TrainerService {

	@Autowired
	TrainerRepoImp repo;

	@Override
	public void addTrainer(Trainer trn) {
		repo.save(trn);

	}

	@Override
	public Trainer getTrainer(int id) {
		return repo.findById(id);
	}

	@Override
	public List<Trainer> getAllTrainers() {
		return repo.findAll();
	}

	@Override
	public void updateTrainer(Trainer trn) {
		repo.update(trn);

	}

	@Override
	public void deleteTrainer(int id) {
		repo.deleteById(id);
	}

}
