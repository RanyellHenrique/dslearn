package com.bootcampdsLearn.services;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcampdsLearn.dto.DeliverRevisionDTO;
import com.bootcampdsLearn.entities.Deliver;
import com.bootcampdsLearn.observers.DeliverRevisionObserver;
import com.bootcampdsLearn.repositories.DeliverRepository;

@Service
public class DeliverService {
	
	@Autowired
	private DeliverRepository repository;
	
	private Set<DeliverRevisionObserver> deliverRevisionObservers = new LinkedHashSet<>();
	
	
	@Transactional
	public void SaveRevision(Long id, DeliverRevisionDTO dto) {
		Deliver deliver = repository.getOne(id);
		deliver.setStatus(dto.getStatus());
		deliver.setFeedback(dto.getFeedback());
		deliver.setCorrectCount(dto.getCorrectCount());
		repository.save(deliver);
		
		deliverRevisionObservers.forEach(observer -> observer.onSaveRevision(deliver));
	}
	
	public void subscribeDeliverRevisionObservers(DeliverRevisionObserver observer) {
		deliverRevisionObservers.add(observer);
	}

}
