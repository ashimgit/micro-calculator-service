# micro-calculator-service
This is just like a controller. it will call add/subtract etc as rest call and will get the data


Docker :

	i. ==$docker build -f src/main/docker/Dockerfile -t docker-micro-calculator-service .
	
	ii. ==$docker run --network mynet --name docker-micro-calculator-service -p 12347:12347 docker-eureka-calculator-discovery
	