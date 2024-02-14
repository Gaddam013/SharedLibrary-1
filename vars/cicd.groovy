def newGit(repo)
{
  "enter the git url ${repo}"
}
def newBuild()
{
  "mvn package"
}
def newDeploy(jobname,ip,appname)
{
  sh "sudo scp /home/ubuntu/.jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${appname}.war"
}
