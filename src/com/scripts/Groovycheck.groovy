package com.scripts;

import hudson.model.AbstractBuild;


abstract class Groovycheck extends AbstractBuild{
def n
static def getSonarQub() {
		def build = new AbstractBuild(n)
		return build.getWorkspace()
        
        }
}
