package com.scripts;

import hudson.model.AbstractBuild;

def n
public abstract class Groovycheck extends AbstractBuild{

static def getSonarQub() {
		def build = new Groovycheck(n)
		return build.getWorkspace()
        
        }
}
