package com.scripts;

import hudson.model.AbstractBuild;


class Groovycheck extends AbstractBuild{

static def getSonarQub() {
		def build = new Groovycheck()
		return build.getWorkspace()
        
        }
}
