package com.scripts;

import hudson.model.AbstractBuild;


class Groovycheck{

static def getSonarQub() {
		def build = new Build()
		return build.getWorkspace()
        
        }
}
