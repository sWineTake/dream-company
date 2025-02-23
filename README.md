# SpringBoot 멀티모듈

## 프로젝트 구조
```
super-module(root)
├── adapter : 각종 외부 프로그램 연동 (DB, REDIS, KAFKA, ...)
│   ├──  
├── api : 컨트롤러 / 비즈니스 로직 구현
│   ├── api-1-server : API 1번 서버
│   ├── api-2-server : API 2번 서버
├── usecase : 어뎁터 연결 창로, API 모듈 연결
│   ├── sample-usecase : 
└── worker : 비동기 작업 처리 서버(배치, 이벤트서버)
    └── auto-inspection-worker : 이벤트서버 ex) 카프카 컨슈머 처리
```
