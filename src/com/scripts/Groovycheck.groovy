package com.scripts;

import hudson.model.AbstractBuild;


public abstact class Groovycheck extends AbstractBuild{

static def getSonarQub() {
		def build = new Groovycheck()
		return build.getWorkspace()
        
        }
}
