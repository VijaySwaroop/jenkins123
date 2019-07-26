package com.scripts;

import hudson.model.AbstractBuild;
import com.cloudbees.plugins.credentials.CredentialsProvider;
import com.cloudbees.plugins.credentials.common.StandardUsernameCredentials;

class Groovycheck{

static def getSonarQub() {
		def build = new AbstractBuild()
		return build.getWorkspace()
        //for (credential in CredentialsProvider.lookupCredentials(StandardUsernameCredentials.class)) {
        //  return credential;
      }
		}
		}