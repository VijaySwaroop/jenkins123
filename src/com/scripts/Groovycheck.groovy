package com.scripts;

import com.cloudbees.plugins.credentials.CredentialsProvider;
import com.cloudbees.plugins.credentials.common.StandardUsernameCredentials;

class Groovycheck{

static def getSonarQub() {
        for (credential in CredentialsProvider.lookupCredentials(StandardUsernameCredentials.class)) {
          return credential;
      }
		}
		}