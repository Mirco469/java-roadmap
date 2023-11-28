# Java roadmap
From zero to dev
## Intro
What is Java? When use it? Why use it? Stack, Heap, Static and garbage collector
## Resources
- Getting started: https://spring.io/projects/spring-boot
- Blog: https://www.baeldung.com
- Spring Doc: https://docs.spring.io/spring-framework/reference/overview.html
- MVC vs Reactive: https://spring.io/reactive
- Maven repository: https://mvnrepository.com/
- Gradle guide: https://gradle.org/guides/
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
- Init new project: https://start.spring.io/
- Code examples: https://github.com/spring-io/initializr
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

## Project structure
```
├── annotation
│   └── build custom annotation
│   └── aop usage
├── config
│   ├── construct a bean
│   └── consts
├── controller
│   └── build a controller
├── dao
│   └── build dao object
├── dto
│   ├── build dto object
├── exception
│   └── construct a custom exception
├── factory
│   └── factory pattern
├── filter
│   └── global exception handler filter
├── helper
│   └── helper vs factory
├── manager
│   └── manager layer
├── provider
│   └── build a custom service provider
├── repository
│   └── access to database with repo layer
├── RoadmapApplication.java
├── service
│   └── service class
└── util
    └── utils
```
## Spring libs (servlet containers + api)
- Spring security
- Spring MVC (web)
- Spring Data (JDBC, JPA)
## Exercises
### Concatenate String
```
/**
  * Return all numbers x <= n < y concatenated with "_" character
  * @param x
  * @param y
  * @return
  */
public String concatenate(Integer x, Integer y);
```

### Array list test
This is a valid solution? If not reimplement it
```
List<String> data = new ArrayList<String>(Arrays.asList("testData1", "testData2", "testData2", "testData3"));

System.out.println(data);

for (String d : data) {
    if (d.equals("testData2")) {
        data.remove(d);
    }
}

System.out.println(data);
```

### Ascii art
Print the following ascii art
```
[]#########
@][########
@@][#######
@@@[]######
@@@@][#####
@@@@@][####
@@@@@@[]###
@@@@@@@][##
@@@@@@@@][#
@@@@@@@@@[]
```
### Long test 
Think about it and fix it...

```
Long test1 = Long.valueOf(113L);
Long check1 = Long.valueOf(113L);

Long test2 = Long.valueOf(2500L);
Long check2 = Long.valueOf(2500L);

if (test1 == check1) {
    System.out.println("OK");
} else {
    System.out.println("KO!");
}

if (test2 == check2) {
    System.out.println("OK");
} else {
    System.out.println("KO!");
}
```
### Decimal test 
Think about it and fix it...
```
float a = 0.01F;
float b = 0.05F;
float c = 0.06F;

System.out.println((a + b) == c);
```
### Leader test
Write a program to print all the LEADERS in the array. An element is leader if it is greater than all the elements to its right side. And the rightmost element is always a leader.elementi alla sua destra
```
/* input data */
int arr[] = { 10, 8, 14, 23, 15, 0, 9 };
/* expected result [23, 15, 9] */
```
### Custom List
Create the structure "CustomList" with the possibility to save elements of the same type. Custom List can grown in size.

Class must contains
<ul>
    <li>Constructor/s</li>
    <li>public function "printAll" with the purpose of printing all elements in the list</li>
    <li>public function "push" with the purpose to insert an element as last one</li>
</ul>
Requirement:
The CustomList class cannot contains data structure as Array or List

### Add to List
Implement it
```
public class AddToListClass {
    /**
     * This function creates a new "List" of Integers, and adds to it a range of numbers included between 0 and "maxNumber".
     * "threadNumber" describes the number of threads which will perform this task at the same time (each one should insert a range). 
     * If threadNumber is more than 1, insertion order is not guaranteed.
     * 
     * Examples
     * List<Integer> res = addToList(10, 1); //[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
     * List<Integer> res = addToList(10, 2); //[0, 1, 2, 3, 4, 5, 6, 7, 8, 0, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9]
     * 
     * @param maxNumber
     * @param threadNumber
     * @return
     * @throws Exception
     */
    private static List<Integer> addToList(int maxNumber, int threadNumber) throws Exception {
        /* implement it.. */
        return null;
    }

    public static void main(String[] args) {
        try {
            int maxNumber = 10;
            int threadNumber = 1;
            long start = System.currentTimeMillis();
            List<Integer> res = addToList(maxNumber, threadNumber);
            long end = System.currentTimeMillis();
            System.out.println("Total time: " + (end - start) + "ms");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

## Mini project
@see exercises/mini-project.txt
# Reactive stack
Differences and usage
## Spring libs (netty containers + streams)
- Spring security reactive
- Spring WebFlux
- Spring Data Reactive(r2dbc, redis, mongo)