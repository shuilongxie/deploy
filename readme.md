1、在项目根目录，运行以下命令启动

```
 .\mvnw spring-boot:run
```

2、访问接口

```
http://localhost:8080/
```

3、返回固定值

```
{"status":1,"ecode":0,"emessage":null,"data":"this is deploy home"}
```

4、打包
```
mvn clean package docker:build
```