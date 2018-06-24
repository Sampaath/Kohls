package com.kohls.dely.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kohls.dely.entity.AstDely;
import com.kohls.dely.repository.AstDelyRepository;
import com.kohls.dely.service.AstService;

@Service
public class AstDelyServiceImpl implements AstService {

	
	@Autowired
	private AstDelyRepository astDelyRepository;
	
	@Override
	public AstDely findByDelyId(Long dely_Id) {
		
		return astDelyRepository.findById(dely_Id).get();
	}

}
