package com.shakeel.service;

import java.util.List;

import com.shakeel.model.Trainer;

public interface TrainerService {

	public void addTrainer(Trainer trn);

	public Trainer getTrainer(int id);

	public List<Trainer> getAllTrainers();

	public void updateTrainer(Trainer trn);

	public void deleteTrainer(int id);

}
