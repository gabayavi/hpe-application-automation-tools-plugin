package com.hp.nga.integrations.dto.scm.impl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.hp.nga.integrations.dto.scm.SCMCommit;
import com.hp.nga.integrations.dto.scm.SCMData;
import com.hp.nga.integrations.dto.scm.SCMRepository;

/**
 * Created with IntelliJ IDEA.
 * User: gullery
 * Date: 12/10/14
 * Time: 22:33
 * To change this template use File | Settings | File Templates.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
class SCMDataImpl implements SCMData {
	private SCMRepository repository;
	private String builtRevId;
	private SCMCommit[] commits;

	public SCMRepository getRepository() {
		return repository;
	}

	public SCMData setRepository(SCMRepository repository) {
		this.repository = repository;
		return this;
	}

	public String getBuiltRevId() {
		return builtRevId;
	}

	public SCMData setBuiltRevId(String builtRevId) {
		this.builtRevId = builtRevId;
		return this;
	}

	public SCMCommit[] getCommits() {
		return commits;
	}

	public SCMData setCommits(SCMCommit[] commits) {
		this.commits = commits;
		return this;
	}
}
