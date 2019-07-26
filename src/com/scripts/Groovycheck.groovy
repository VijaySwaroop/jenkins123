package com.scripts;

import hudson.model.FreeStyleBuild;


class Groovycheck{

static def getSonarQub() {
		def build = new FreeStyleBuild()
		return build.getWorkspace()
        
        }
}
