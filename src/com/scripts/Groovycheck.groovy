package com.scripts;

import com.cloudbees.plugins.credentials.CredentialsProvider;
import com.cloudbees.plugins.credentials.common.StandardUsernameCredentials;

class Groovycheck{

static def getSonarQub() {
        def creds = com.cloudbees.plugins.credentials.CredentialsProvider.lookupCredentials(
                org.jenkinsci.plugins.plaincredentials.StringCredentials.class, jenkins.model.Jenkins.instance
        )
	return creds
		}
		}

