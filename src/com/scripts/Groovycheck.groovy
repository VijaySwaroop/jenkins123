package com.scripts;

import hudson.model.AbstractBuild;

def n
abstract class Groovycheck extends AbstractBuild{

static def getSonarQub() {
		def build = new AbstractBuild(n)
		return build.getWorkspace()
        
        }
}
