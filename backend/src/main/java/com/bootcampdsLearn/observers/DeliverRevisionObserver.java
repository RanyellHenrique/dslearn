package com.bootcampdsLearn.observers;

import com.bootcampdsLearn.entities.Deliver;

public interface DeliverRevisionObserver {
	
	void onSaveRevision(Deliver deliver);
}
