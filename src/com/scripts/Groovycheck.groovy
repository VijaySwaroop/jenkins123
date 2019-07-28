package com.scripts;


import hudson.model.ParametersAction;
import hudson.model.StringParameterValue;
import hudson.model.FreeStyleBuild;
import java.*;

class Groovycheck {

static def getSonarQub() {
        FreeStyleBuild build = new FreeStyleBuild()
		System.out.println(build.getWorkspace())
		//return build.getWorkspace()
		//return manager.listener.logger.println
		
        }
}
