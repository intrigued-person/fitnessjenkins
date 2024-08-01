package com.shakeel.repo;

import java.util.List;

import com.shakeel.model.Trainer;

public interface TrainerRepo {

	public void save(Trainer trn);

	public Trainer findById(int id);

	public List<Trainer> findAll();

	public void update(Trainer trn);

	public void deleteById(int id);

}
