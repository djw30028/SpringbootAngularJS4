### 1. Create spring boot app: http://start.spring.io/   
Unzip to top directory spring-angular4-report   
Create server directory and move src and pom.xml to server folder       
build and start server: java -jar target\spring-angular4-report-0.0.1-SNAPSHOT.jar      

modify application.properties   
  - server.port: 8809

http://localhost:8809/api/hi


### 2. Create angularJS 4 app         
spring-angular4-report> ng new client   


### 3. Download STS    

#### 3.1 Import -> General -> Projects from Folder or Archieve 
 

### 4. Start angularJS 4: spring-angular4-report\client   
 - npm start

### 5. Create proxy.conf.json
<code> 
{
	"/api": {
		"target": "http://localhost:8809",
		"secure": false
	}
}
</code> 

### 6. Edit package.json   
<code>"start": "ng server --proxy-config proxy.conf.json",</code>

### 7. Test http://localhost:4200/api/hi
Should be same as http://localhost:8809/api/hi

### 8. Package: spring-angular4-report\client
1. build
    ng build -prod
2. copy generated above dist to  D:\projects\TotalSouce\spring-angular4-report\server\src\main\resources\static
  
### 9. Combined build and start
 - mvn clean package
 - mvn spring-boot:run
  
### 10. Final Test
 - shttp://localhost:8809/


---
### DEVELOPMENT:
   
####  1. Start Server    
Start server in Eclipse by right click \ReportApplication.java then run as Debug

#### 2. Start Client   
spring-angular4-report\client>npm start

#### 3. Test
 - http://localhost:4200/api/hi
 - http://localhost:4200/
 
---
### Deployment with maven server/client
 

#### 1. Create symbolic link:
  to workaround the mvn frontend-maven-plugin, as it is looking at node directory instead of nodejs (default directory)
  Create symbolic link: node to nodejs, under the directory node installation:    
 - mklink /D node nodejs

#### 2. set env
 - set NODE_PATH={the parent directory of node created above}   
 ex (NODE_PATH=C:\MyProgs\) 

###3 3. Reconfig : "outDir": "dist" 
 spring-angular4-report\client\.angular-cli.json    
 
FROM: "outDir": "dist"    
TO:   "outDir": "../server/src/main/resources/static",    

#### 4. build disk:spring-angular4-report\client>
 - mvn clean package

#### 5. start server
 - java -jar server\target\spring-angular4-server-0.0.1-SNAPSHOT.jar
 
#### 6 .Test
 - http://localhost:8809/   
 - http://localhost:8809/api/hi  


### Reference:    
http://javasampleapproach.com/java-integration/integrate-angular-4-springboot-web-app-springtoolsuite   
https://github.com/dlizarra/spring-angular2-cli-starter/blob/master/pom.xm   
