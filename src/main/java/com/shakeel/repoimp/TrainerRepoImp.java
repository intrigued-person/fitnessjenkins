package com.shakeel.repoimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shakeel.model.Trainer;
import com.shakeel.repo.TrainerRepo;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class TrainerRepoImp implements TrainerRepo {

	@Autowired
	EntityManager emanager;

	public void save(Trainer trn) {
		emanager.merge(trn);

	}

	public Trainer findById(int id) {
		return emanager.find(Trainer.class, id);

	}

	public List<Trainer> findAll() {
		return emanager.createQuery("from Trainer", Trainer.class).getResultList();

	}

	public void Update(Trainer trn) {
		emanager.merge(trn);

	}

	public void deleteById(int id) {
		Trainer cust = emanager.find(Trainer.class, id);
		if (cust != null) {
			emanager.remove(cust);
		}

	}

}
