package com.kohls.dely.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kohls.dely.entity.AstDely;
import com.kohls.dely.service.AstService;

@Controller
@RequestMapping("/ast")
public class AstController {

	@Autowired
	private AstService astService;

	@RequestMapping(value = "/{dely_Id}", method = RequestMethod.GET)
	@ResponseBody
	public AstDely findCrewById(@PathVariable("dely_Id") Long dely_Id) {

		return astService.findByDelyId(dely_Id);
	}
	
	
	
}
