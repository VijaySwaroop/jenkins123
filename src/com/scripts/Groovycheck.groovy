package com.scripts;

import hudson.model.Build;


class Groovycheck{

static def getSonarQub() {
		def build = new Build()
		return build.getWorkspace()
        
        }
}
