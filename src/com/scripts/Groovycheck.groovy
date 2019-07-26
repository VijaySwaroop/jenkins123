package com.scripts;

import hudson.model.AbstractBuild;

def n
public abstract class Groovycheck extends AbstractBuild{

def Groovycheck(def n){
this.n=n
}
static def getSonarQub() {
		def build = new Groovycheck(n)
		return build.getWorkspace()
        
        }
}
