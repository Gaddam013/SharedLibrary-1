def newGit(repo)
{
  git "${repo}"
}
def newBuild()
{
  sh 'mvn package'
}
def newDeploy(jobname,ip,appname)
{
  sh "sudo scp /home/ubuntu/.jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${appname}.war"
}
def newTest(testfile)
{
  sh "java -jar /home/ubuntu/.jenkins/workspace/${testfile}.jar"
}
def newDelivery(jobname,ip,appname)
{
  sh "sudo scp /home/ubuntu/.jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${appname}.war"
}
