package org.devops

//saltstack

def SaltDeploy(hosts,func){
  sh " salt \"${hosts}\" ${func} "
 
}

//ansible

def AnsibleDeploy(host,func){
  sh "ansible ${func} ${hosts}"
