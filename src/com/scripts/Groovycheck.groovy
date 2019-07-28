package com.scripts;


import hudson.model.ParametersAction;
import hudson.model.StringParameterValue;
import hudson.model.FreeStyleBuild;

class Groovycheck {

static def getSonarQub() {
        FreeStyleBuild build = new FreeStyleBuild()
		build.getWorkspace()
		return manager.listener.logger.println
		
        }
}
