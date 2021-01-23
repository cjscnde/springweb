package org.zerock.controller;

@RequestMapping(value = "/basic", method = {RequestMethod.GET,
		RequestMethod.POST})
	public void basicGet() {
	
	log.info("basic get.......");
	
	}

	@GetMapping("/basicOnlyGet")
	public void basicGet2() {
		log.info("basic get only get.....");
	}