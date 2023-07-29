# cloudbus-configclient
spring cloudbus config client


Zookeeper start:
.\zookeeper-server-start.bat zookeeper.properties

Zookeeper stop:
.\zookeeper-server-stop.bat .\zookeeper.properties


kafka start:
.\kafka-server-start.bat .\server.properties

kafka stop:
.\kafka-server-stop.bat .\server.properties



Refreshing cloud-bus server via postman:
curl -v -X POST "http://localhost:8080/monitor" \
-H "Content-Type: application/json" \
-H "X-Event-Key: repo:push" \
-H "X-Hook-UUID: webhook-uuid" \
-d '{"push": {"changes": []} }'
