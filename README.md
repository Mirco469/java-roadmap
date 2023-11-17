# Java roadmap
from zero to dev
## Intro
What? How? Why Java?
## Resources
- https://www.baeldung.com
- https://spring.io/projects/spring-boot
- https://github.com/spring-io/initializr
- MVC vs Reactive: https://spring.io/reactive
- https://gradle.org/guides/
- https://mvnrepository.com/
## Setup environment
IDE: Eclipse, IntelliJ and VsCode
### Setup new origin
git remote add origin  https://github.com/albertoielpo/java-roadmap.git
### Extensions VSCODE
vscjava.vscode-java-pack
vscjava.vscode-gradle
richardwillis.vscode-gradle-extension-pack
naco-siren.gradle-language
dgileadi.java-decompiler
## Maven vs Gradle
Package management
## Setup spring MVC project
https://start.spring.io/
### Command
```
# build
./gradlew build
# start
./gradlew bootRun
```
### Basic spring keywords
- @Autowired
- @Component
- @Service
- @Repository
- @Configuration
- @Bean

## Next step TODO
├── annotation
│   └── TODO
├── config
│   ├── CommonBean.java
│   └── Const.java
├── controller
│   └── HelloWorldController.java
├── dao
│   └── TODO
├── dto
│   ├── BaseResponseOkDto.java
│   ├── ErrorResponseDto.java
│   └── HelloWorldResponseDto.java
├── exception
│   └── TODO
├── factory
│   └── ResponseFactory.java
├── filter
│   └── TODO
├── helper
│   └── TODO
├── manager
│   └── TODO
├── provider
│   └── TODO
├── repository
│   └── TODO
├── RoadmapApplication.java
├── service
│   └── TODO
└── util
    └── TODO