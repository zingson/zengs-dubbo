# zengs-dubbo
dubbo demo


## Dubbo管理控制台
```text

# Tomcat 6
docker pull tomcat:6
docker run --name tomcat6 --rm -p 8901:8080 -it tomcat:6
docker run --name tomcat6 --rm -v /d/webapps/dubbo-admin-2.0.0:/usr/local/tomcat/webapps/ROOT -p 8901:8080 -it tomcat:6
docker run --name tomcat6 --rm -v /d/webapps/dubbo-admin-2.0.0:/usr/local/tomcat/webapps/ROOT -p 8901:8080 --link zookeeper:zookeeper-server -it tomcat:6

# zookeeper
docker pull zookeeper:3.4
docker run --name zookeeper --rm -p 2181:2181  -d zookeeper:3.4
```

## 服务提供者



## 服务消费者
