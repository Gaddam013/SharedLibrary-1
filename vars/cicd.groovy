def newGit(repo)
{
  "enter the git url ${repo}"
}
def newBuild()
{
  "mvn package"
}
def newDeploy(file_name,Des_ip,app)
{
  "sudo scp /home/ubuntu/.jenkins/workspace/${file_name}/webapp/target/webapp.war ubuntu@${Des_ip}:/var/lib/tomcat9/webapps/${app}.war"
}
