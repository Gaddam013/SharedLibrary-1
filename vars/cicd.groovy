def newGit(repo)
{
  "enter the git url ${repo}"
}
def newBuild()
{
  "mvn package"
}
def newDeploy(jobname,Des_ip,appname)
{
  sh "scp /home/ubuntu/.jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${appname}.war"
}
