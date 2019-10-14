# demo-k8s

Demo Spring boot project which builds the Spring boot project into a war file.

The Docker definition builds the container with Tomcat image and adds the WAR file

The Kubernetes Pod definition file, creates the pod with the above image and demonstrates the POD lifecycle events through 
PostStart and preStop hook events. 

It gracefully shutsdown the tomcat container when the POD is terminated. 
