# 🚀 Spring Boot 멀티 모듈 프로젝트

## 📂 프로젝트 구조
```
super-module(root)
├── web : REST API, 컨트롤러
│   ├──  api :
├── service : 
│   ├──  api-service :
├── infrastructure : 
│   ├──  my-sql :
```
---

## 🛠 **local(환경) 프로젝트 실행 방법**
✅ Gradle 명령어 실행
```bash
./gradlew bootRun
```

---
## 🛠 **Dev(환경) - 프로젝트 실행 방법**
### 🔹 1. **Docker Desktop 설치**
프로젝트 실행을 위해 **Docker Desktop**을 먼저 설치해야 합니다.  
🔗 **다운로드:** [Docker Desktop 공식 사이트](https://www.docker.com/products/docker-desktop/)

### 🔹 2. **Docker 컨테이너 실행**
아래 명령어를 실행하여 MySQL 및 기타 의존성 서비스를 실행합니다.

```bash
docker-compose up -d
```

### 🔹 3. Spring Boot 실행
✅ Gradle 명령어 실행
```bash
./gradlew bootRun --args='--spring.profiles.active=local'
```

---
### 🔗 API 문서 확인 (Swagger)
프로젝트 실행 후, API 명세는 Swagger UI를 통해 확인할 수 있습니다.

📌 Swagger 주소: [스웨거 바로가기](http://localhost:8080/swagger-ui/index.html)
