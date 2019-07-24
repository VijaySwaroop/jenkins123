package com.scripts;

class Groovycheck{

static def getSonarQubeAuth() {
        def creds = com.cloudbees.plugins.credentials.CredentialsProvider.lookupCredentials(
                org.jenkinsci.plugins.plaincredentials.StringCredentials.class, jenkins.model.Jenkins.instance
        )
	echo $creds
		}
		}

