package com.scripts;

import hudson.model.AbstractBuild;


public abstract class Groovycheck extends AbstractBuild{

static def getSonarQub() {
		def build = new Groovycheck()
		return build.getWorkspace()
        
        }
}
