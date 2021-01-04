package io.countrysidesoftwares.ppmtool.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.countrysidesoftwares.ppmtool.domain.Project;
import io.countrysidesoftwares.ppmtool.repositories.ProjectRepository;

@Service
public class ProjectService {
	
	@Autowired
	private ProjectRepository projectRepository;
	
	public Project saveOrUpdateProject(Project project) {
		//TODO logic
		
		return projectRepository.save(project);
	}

}
