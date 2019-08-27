_This is a repository of project completed for a Java Bootcamp @UNCC_  
_Below, are some of the topics mentioned_  


<a name="top"></a>

##### Keywords
[`Box of Randoms`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#random)
[`Iteration planning`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#iteration)
[`Loops`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#loops)
[`Composition`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#composition)
[`Constructors`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#constructors)
[`Static`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#constructors)
[`Memory`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#constructors)
[`Polymorphism`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#poly)
[`Collections`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#collections)
[`Exceptions`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#exceptions)
[`Strems/Lambdas`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#lambdas)
[`OpenCSV/Jackson`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#lambdas)
[`Web Services`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#service)
[`Error Handling`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#error)
[`MVC`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#mvc)
[`Relational DBs(SQL)`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#data)
[`Join`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#join)
[`Dependency Injection`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#di)
[`JDBC`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#jdbc)
[`JPA`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#jpa)
[`Service Layer`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#servicelayer)
[`Mocking`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#mocking)
[`Validation`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#validation)
[`Microservices`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#microservices)
[`Queue`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#queue)
[`Cache`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#queue)
[`Edge Service`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#edge)
[`Predicate`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#random)
[`Consumer`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#random)
[`Security`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#security)
[`Oauth`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#oauth)
[`PWS`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#pws)
[`Circuit Breaker`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#circuit)





# [Evan Wilson](https://ewilsons.github.io/)

> "They think technology just automatically improves. It only improves when alot of people work very hard to make it better" -Elon Musk  

## Class Notes
_________________________________________________
**_Prework_**  [`Top`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#top)  

 **Terms**  
 - port binding
 - concurrency

**Git Shorts**  
`git checkout -b name-of-new-branch`  new branch
`git checkout name-of-new-branch` switch
`git branch`  will show  
`git touch`... edit your stuff  
`git add .`  
`git commit -m "description"`  
`git push origin name-of-branch`   
`git branch -D name-of-branch` delete
`git clean -d -f` undo error pull
`git stash` put away git changes
`git stash apply` unstash
`git config --system core.longpaths true` in bash admin allow long paths

_________________________________________________
**_6/3/2019_**  [`Top`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#top)  
  
JRE- runtime environment  
JDK-development kit  
IDE-integrated development environment  
  - Eclipse
  - NetBeans
  - IntelliJ Idea
J2EE libraries
  - Jakarta (apache)
  - Spring(most popular)

_________________________________________________
 **_6/4/2019_**  [`Top`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#top)  
 
 <a name="Iteration"></a>
_Iteration Planning_
  - Pivotal Tracker
  - Kanban
  - Jira

  _Data v Info_ - data has no contex... we make the info  
  _Stepwise problem solving_ - cpu does what we say. garbage in => garbage out  
  Abstraction of real world processes. ie desktop  
  Data Types  

   `String`
   `char`
   `boolean`

   `byte 8 bit`
   `short 16`
   `int 32`  

   `long 64`
   `float 32`
   `double 64`  

   `long`  
  Variable name rules(identifiers)
  - no dashes
  - cannot begin with a digit
  - $ are ok  
  Java Naming Conventions
  - Class & Variables - **nouns**
  - Methods - **verbs, camelCase**
  - Variables **camelCase**
  - Classes - **PascalCase**  
  _Expressions_ evaluate to a single value   

**`comment`, `debug`, `repeat`**

_________________________________________________
**_6/5/2019_**    [`Top`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#top)  
<a name="loops"></a>

_Boolean expressions_
  - Relational - ==, !=, >, <, <=, >= 
  - Conditional - &&, || 

_Loops_
- While- keep going until the condition is met be careful of infinite loops
- Do While- sets an ending condition, runs at least once
- For - define a stopping point.  
`continue` - restarts loop  
`break` - exits loop

_________________________________________________
  **_6/6/2019_**    [`Top`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#top)  

  `Debug` - Debugger is an essential tool.  
  `Dry` - Dont repeat code.  
  `Methods`  
  _Method Signature_ - public static int num(x, y)  

  System.out.println() **does not** return a value  
  nextLine() **does return** a value  
  _forms of methods_  
  - no return value, no params
  - return value, no params
  - no return value, params
  - return value, one or more prams 

_________________________________________________
  **_6/7/2019_**  [`Top`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#top)  

  Data structues  
  Arrays - fixed number, same data type for _elements_ in the array.

  * convert (cast) num within a statement- sum/(double)len*witdh
  
Agile  led by scrum master
- sprint
  - standup
- retrospective 
  - hi's and lows. 

**Retrospective**
  - H) file structure tips were helpful, forced pair programming
  - L) slow pace, inconsistent tests  
_________________________________________________
  **_6/10/2019_**    [`Top`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#top)  
  <a name="composition"></a>

_Java objects_  
Key concepts  
  - Composition - Object of objects
  - Abstraction
  - Assembly language
  - Everything is an object
  - Every object/class has a type
    - A new object/class defines a new type.
  - Objects have **state**, **behavior** and **identity**
    - state of a car - color, shange color => change state
    - behavior - methods of the object
    - Distinguishes each obj from every other obj  

  Public interface and private implementation  
  - Accessible to the outside world (public)
  - The _how_ should be hidden (private)
  - i.e. ATM machine  

  Encapsulation  
  - A well defined class has a public interface that clearly defines what the class does
  - Has a well defned area of responsiblilty
  - The class should do one thing, well and completely
  - Cohesion- related stuff in one place, no random 
  - Single resposibilty principle

  Data Hiding - Close to encapsulation, works within the private imlpementation
  - Only share pertinent info with user  

  Delegation - Private implementation will delegate the work to existing classes 

_________________________________________________
**_6/11/2019_**    [`Top`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#top)  
<a name="constructors"></a>
_Classes & Objects pt2_  

_Class_ - is the blueprint/ model  
  - Every class **is a type**  
  - _Types_- numbers, text, booleans **user defined data types**  

  _Instantiate(create an instance of)_ - is to actually build the model, the **Object**  

_Properties, getters, and setters_  

_Constructors_- called when you want to instantiate a class  
  - used to initialize(set the internal state) of the object.
  - constructor must have the same name as the class that contains it.
  - Does not have a return type, not even void  
  - Class can have more than one constructor  

_Methods_ - (see previous work)  

_this keyword_
  - refers to the **object**  

_static_ 
  - static methods are only associated with the class and _not_ any particular instance of the class.  
  - static meths can be accessed w/o creating an instance of the class.  
  - ex) Class.method();

_Dot(.) Operator_  

_Instantiate_ - by using the "new" keyword  
  - JVM will store new instance in **heap** memory and gives a reference  

_Stack/ Heap_  
  - Stack memory only exists for the duration of the code block they are in  
  - Local primitive values live on the stack
  - The reference variable the point to the heap lives in the stack.  
  OBjs created with the _new_ operator live on the heap and we use references to access them  

_Garbage collection_  
  - Java is a managed language(using new, JVM allocates memory accordingly)  
  - Objs on the heap are eligible for garbage collection when there are no more references pointing to them.  
  - end a reference manually by setting **null**
  - referenced auto end when the method returns  

 _Pass parameters by value & reference_  
  - value - copies value into another var, two completely diff variables that can be changed  
  - ref - passes value of the reference  
  - Java is a pass by value language

  _Method Overloading_ - same name different params, for code reuse  
_________________________________________________
**_6/12/2019_**    [`Top`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#top)  <a name="interface"></a>

_Interfaces_

_Interface_ is a contract, losely ... 
  - defines a set of methods by any class/ lives up to it..
  - does not **implement**  
  - interfaces help define, in a reusable, portable way,  the public interface of a class
  - good way to crate specs for components to "plug into" a system.
  - interfaces _cannot_ have properties


_________________________________________________
**_6/13/2019_**    [`Top`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#top)  

_Composition_  
  - Has-a relationship
  - objects made of objects

_Inheritance_  
  - Is-a relationship
  - protected
  - all java classes extends Object class by default  
  - **Base class**
    - parent class/ super class  
  - **Derived Class**
    - child, subclass, extended class
    - inherits meths and props of superclass
    - Specializes the base class
    - Adds more meth and propls
    - Overriding provides a differnt implementation of properties and methods  

_Overriding methods_
  - method signatre must be the same

_Constructors and Inheritance_  
  - use **super** to access super class from the derived clss.  
  - super must be the first statement in the code block

_Protected_ - 
  - only code in that class and childre n classes have access to its protected properties.

_Abstract_ - has at least one method that will not be implemented.
  - all child classes must use this method but in any way they want.Abstract methods define access modifier, void, paramas. When abstract is implemented, the methjod signature must match.
  <!-- In Java, abstract means that the class can still be extended by other classes but that it can never be instantiated (turned into an object). -->

Standup-codebat solution vs mine. .max() & other array functions
_________________________________________________
**_6/14/2019_**    [`Top`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#top)  <a name="poly"></a>

_Polymorphism_ 
  - **Polymorphism** is the ability of an object to take on many forms. The most common use of polymorphism in OOP occurs when a parent class reference is used to refer to a child class object. `Any Java object that can pass more than one IS-A test is considered to be polymorphic.`
  - many formed
  - derived types are base types
  - The type will determine what methods are available.
  - recall the "is-A' relationship. A developer is not always a team Lead but a TL is always a dev.

**Retrospective**  
  - H)
  - L) pass by value/ref lion example before lecture exaples, architect-tl

  _________________________________________________
**_6/17/2019_**    [`Top`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#top) <a name="collections"></a> 

_Java Collections_  
  - Interface
  - Collections dont work with primitives

_Iterator_ - interface  
  - Object that allows us to access each element in a collection
  - Two methods  
    - hasNext()
    - next()
    - (remove()-_optional_)
  - no order  

*List_Iterator can go either direction

_List_ - interface  
    - array list implements list  

_Java Generics_

_Wrapper classes_
  - privitive tyoes have this. 
    - int => Integer
    - boolean => Boolean
    - char => Character

_Map_ 
  - key value pairs
  - only one null key
  - Set will not have duplicates


`.size()` - gets number of elements  
`.add()` - 
`.get()` - 
`.clear()`- 
`.containsKey()` - use this instead of .equals(null)

Consider list vs set vs map


_________________________________________________
**_6/18/2019_**    [`Top`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#top) <a name="exceptions"></a> 

_Exceptions_
  - Checked  
    -  something we catch or specify that our code may throw an error
  - unchecked  
    - Errors we cant or dont want ot recover from
    - We do not have to catch or specify these
`try`-code that might throw an exception  
`catch`- catch err and do domething (message/ recover)  
`finally`- run some code anyway  

`throws IOException` or `throws Exception`

Stack catches by most specific on top  

Structure data: CSV XML JSON  


_________________________________________________
**_6/19/2019_**    [`Top`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#top)  <a name="lambdas"></a>

_Lambdas and Streams_

_Streams and aggregate ops_
  - Introduced in Java 8
  - Two types  
    - Intermediate:  accepts a srteam and produces a stream
    - Terminal: produces a non-stream result
  - Lambdas introduce functional programming to Java  
  - When combined, provides great options for processing collections of data

_Pipeline_
  - sequence of aggregate ops
  - consists of:
    - source of data (collections, for example)
    - Zero or more intermediate aggregate ops
    - One terminal operation
  - Complex processing of a group of objects in a collection

_Loops/iterators vs Streams & aggregate ops_
  - loops work on objects directly from the collection 
  - agg ops work on objs from the stream
  - The params for agg ops are **lamdas expression**

_Lambdas_
  - Allow us to pass methods as params to define functionality on the fly

_Aggregate operations_
  - filter - intermediate op the filters the obj in a stream
  - forEach - 
  - collect - returns a collection of objs 
  - average - returns an optional double
  - mapToXxxx - 
  - getAs - 
  - max 

_Reading/Writing to/from file_
```xml
<!-- dependencies for csv, json and xml conversions -->
    <dependencies>
        <dependency>
            <groupId>com.opencsv</groupId>
            <artifactId>opencsv</artifactId>
            <version>4.4</version>
        </dependency>
        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-databind</artifactId>
            <version>2.8.10</version>
        </dependency>
        <dependency>
            <groupId>com.fasterxml.jackson.dataformat</groupId>
            <artifactId>jackson-dataformat-xml</artifactId>
            <version>2.8.10</version>
        </dependency>
    </dependencies>
```
```java
// Read from csv
List<Motorcycle> bikes = 
new CsvToBeanBuilder<Motorcycle>(new FileReader("motorcycles.csv")).withType(Motorcycle.class).build().parse();

```
```java
List<Motorcycle> bikes = new CsvToBeanBuilder<Motorcycle>(new FileReader("motorcycles.csv")).withType(Motorcycle.class).build().parse();

            // Print the information for all Suzuki motorcycles in inventory 
            String make = "Suzuki";
            System.out.println("All " + make + " motorcycles in inventory: ");
            bikes                                          // list type Motorcycle
                    .stream()                              // use stream
                    .filter(b -> b.getMake().equals(make)) // filter
                    .forEach(bike -> {                     
                        System.out.println("===============");
                        System.out.println("Make: " + bike.getMake());
                    });

            // Print the information for all motorcycles that weigh less than 500 pounds
            int weight = 500;
            bikes
                    .stream()
                    .filter(bike -> bike.getWeight() < weight)
                    .forEach(bike -> {
                        System.out.println("===============");
                        System.out.println("Make: " + bike.getMake());
                    });

            // Rather than printing out the matching motorcycles, let's put them into a list
            List<Motorcycle> lightBikes =
                    bikes
                            .stream()
                            .filter(bike -> bike.getWeight() < weight)
                            .collect(Collectors.toList());

            System.out.println(lightBikes.size());

            // We can also group our motorcycles by Make.
            Map<String, List<Motorcycle>> groupedBikes =
                    bikes
                            .stream()
                            .collect(Collectors.groupingBy(b -> b.getMake()));

            Set<String> keys = groupedBikes.keySet();
            keys
                    .stream()
                    .forEach(System.out::println); // shorthand

            // Print the average horsepower of the motorcycles in inventory
            double avgHorsepower =
                    bikes
                            .stream()
                            .mapToInt(b -> b.getHorsepower())
                            .average()
                            .getAsDouble();

            System.out.println("Average horsepower is: " + avgHorsepower);

            // Print the max HP of all bikes
            int maxHorsePower =
                    bikes
                            .stream()
                            .mapToInt(bike -> bike.getHorsepower())
                            .max()
                            .getAsInt();

            System.out.println("Max horsepower: " + maxHorsePower);


  ```
17 lines per method

  _________________________________________________
**_6/24/2019_**    [`Top`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#top)  <a name="service">
standup- using casting to change double to int with math.pow

_Web appliactions and web services_

_HTTP_
  - Request - Get Post Put or Delete
  - Response- Status line, Header, Body (optional)
    - status codes
      - `100` informational
      - `200` success
      - `300` redirection
      - `400` client error (wrong page)
      - `500` server error

_REST_
  - Architecture style
  - built on top of http
  - revolves around the concept of resources (data)
  - data xfer via http media types (usually JSON or XML)

  In class API practice  
  create post /api/addRecord
``` 
  Method: Post 
  URI: /inventory
  Req Body: JSON of created rcord
  Res body: NONE 
 ```

  retrieve /api/records?name=evan
```
      Method: Get
      URI: /inventory
      Req Body: None
      Res body: Json returned
```
  update 
```  
      Method: Put
      URI: /inventory{id}
      Req Body: JSON of created rcord
      Res body: JSON returned
```
  delete
```  
      Method: DELETE
      URI: /inventory{id}
      Req Body: NONE
      Res body: NONE 
```

_________________________________________________
**_6/25/2019_**    [`Top`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#top)  

Standup - prepare for code review, revisited abstract, reviewed routes from earlier projects 

```
_Cognizant Q/A_  -Sharek and Devin
  - pair programming
  - tdd
  - xp 
  - dev ops- ownership -> full cylce
  - goals me-team-company 
  - agile
  - Company wide goals for employment? progress? 2018 article
  - Diversity
  - Junior engineer career path and role starting out
  - employee development
  - What kind of success have you had with non traditional employees
  - 193 fortune 500
```
_Spring, Spring Boot & Spring Initializer_
  - Makes Java lightweight and easily configurable
  - cmoparable to express in terms of connectiong the dots and making reasonable config assuptions  

_SI(spring initializr)_
  - app and sever all in one(Tomcat)
  - start.spring.io - sets up project
  - tomcat -servlet to 

_Swagger(openapi)_ 

_________________________________________________
**_6/26/2019_**    [`Top`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#top)  <a name ="mvc"></a>

_Servlet Containers_
  - Java containers that run java-based web apps
  - Apps **implement** the Java Servlet Specification
    - defines how it should act and what features it should have
  - Routes HTTP req to Java components to `servlets`

_Tomcat_ - reference implemetaion of the servlet container
  - Implements the Servlet specification
  - components 
    - `Catalina` - servlet container
    - `Coyote` - http support 
    - `Jasper` - provides support for JavaPages jsp

_Servlet API_
  - web service - collection of requests, requests routing and servlets
  - Spring MVC implements front controller patterns

_Front controller patters_(as it pertains to spring mvc)
  - `Dispatcher Servlet` (handles all incoming http reqs) routes to the controller. 
  - the controller has the code and executes business logic
  - the respose data is put into models
  - Web services `do not` have a server-side view component. the client will handle the view.
  - web applications `do` have a view component

_MVC Patterns_

_Spring Rest Controller_
  - `Dispatcher servlet` routes requests to Rest controller
```java  
@RestController  // class_ level annotation
@RequestMapping  // method/class level, 2 params(value = "/endpoint", Method = RequestMethod Get..) class level will ensure you hit that route first (ex. /api/endpoint)
@ResponseStatus  // method level
@PathVariable 
```
_DTO _ - Object that carries data between processes

_@Valid_- 

_________________________________________________
**_6/27/2019_**    [`Top`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#top)  
<a name="error"></a>  
_Error Handling_

``` java
@RestControllerAdvice // class_ level
@ExceptionHandler // method level
```
Aspect oriented programming(AOP)

`application/vnd.error` - one of many formats to use for errors(hateos supports this)

_Web Interfaces_

_________________________________________________
**_7/01/2019_**    [`Top`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#top) 
<a name="data"></a>

_Relational Databases_  
  - Entity - Table - thing we want to track (book) 
    - `Tuple` - Row - instance of the entity(_The Bean Trees_)
    - `Attibutes` - Column - describes the entity (isbn, author)  

  - Data v Metadata  

  - Keys
    - `Primary key` - natural or artificial(preferred). Uniquely identifies the tuple.
    - `Foriegn Key` - used to facilitate relationships between 

  - Types of relationships linking tables and entities together
    - one to one
    - one to many
    - many to one
    - many to many - requires a **bridge table**


_Data Modeling_
  - Be mindful of nameing
  - GUI - globally unique identifier

_Normalization_
  - `Composite key` - several columns together used to uniquely idendify a tuple

_Functional Dependency_
  - The PK should be a FD to all of the columns
  - 

```
1NF - Single PK if sufficient. no unnecessry combinations. single values for data(no commas). Physical address and mailing address as opposed to one address column with 2 address values
2NF- Only after 1NF is achieved consider 2NF. Attributes should be fully dependent on the PK. see FD.
3NF- After 2NF is achieved, consider 3NF. Cannot have a FD based on any columns
4NF - not covered
5NF - not covered
```

_________________________________________________
**_7/02/2019_**    [`Top`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#top) 
<a name="join"></a>

_Joins_
  - `Inner Join` - Used when you expect a value on both tables of the join
    - Only see results when there is a common value in **both** tables
  - `Outer Join` - Used when rows are not expected in both tables of a join
    - `**Left Outer**` (most used) - Every row in the first table and only values from the second when a match is found
    - Right Outer - Opposite of right outer
    - Full Outer - Shows all rows from both tables whether or not they have matching rows in an opposite table.

_ACID_ - Atomicity, Consistiency, Isolation, Durability
  - `Atomic` - RDBMS will guarantee that a **transaction** (group of statements) **commits** (all run together) or **rolls back** (not run at all).
  - `Consistency` - Data entered does not break a any constraints
  - `Isolated` - Control access to data, using locking, to keep two or more users from modifying data at the same time.
  - `Durable` - Once a transacion is commited, it must reamin so

_Indexes_ - Allows system to quiqckly find rows, even when data set is very large (admins can index commonly searched atributes for speed)

- '%a' values that end in 'a' 0 - many
- 'a%' values that begin with 'a' 0 - many

``` SQL 
-- Let's find all the orders that had a shipping fee of between 6 and 8 dollars that were shipped to Peru or Poland
SELECT * 
FROM northwind.orders 
WHERE shipping_fee 
BETWEEN 6 and 8 
AND ship_country 
IN('Peru', 'Poland');

--- Let's get the customer names and the names of the people that all the completed orders for Keith Lawrence were shipped to
SELECT orders.ship_name, customers.first_name, customers.last_name 
FROM northwind.orders 
inner join northwind.employees 
ON orders.employee_id = employees.id 
inner join northwind.customers 
ON orders.customer_id = customers.id 
where employees.first_name = 'Keith' 
and employees.last_name = 'Lawrence' 
and orders.order_status = 'Complete';

-- Delete
delete from car_lot where make = 'bmw';
 
-- keeps you from deleteing w/o a key
SET SQL_SAFE_UPDATES = 0;

-- emplyee with max salary
select * from employee where salary = (select MAX (salary) from employee) ;

-- highest salary
select MAX(salary) from eployee;

-- second highest salary use NOT IN to filter
select MAX(salary)
from employee
where salary NOT IN (select Max(salary) from employee) ;

-- Declare an alias?

```

_________________________________________________
**_7/03/2019_**    [`Top`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#top) 
<a name="jdbc"></a>

_JDBC Templates_
  - Table is the class
  - Row is the instance, tuple or object (same thing)
  - columns are properties
  - DTOs have only properties getters and setters  

*note- primitive data types cannot be null*

_TDD and Unit/Integration Tests_ - 
  - Red Green Refactor
  - integration testing includes the db
  - unit testing removes dependency on outside data
  - AAA pattern
    - `Arrange`
    - `Act`
    - `Assert`  
  - retruned Lists are never null when returned from DAO.
  - :: double colon - method reference
  - dependency injection - the container provides the instance of the object we are testing <a name="di"></a>
  - 3 types
    - field injection
    - contructor injection
    - setter injection

``` java
// Field-based
@Component
public class TheClientBean{
  private TheBean theBean;
}

// Contructor-based
@Component
public class TheClientBean{
  private final TheBean theBean;

  @Autowired
  public TheClientBean(TheBean theBean){
    this.theBean = theBean;
  }
}

// Setter-based
@Component
public class TheClientBean{
  private TheBean theBean;

  @Autowired
  public setTheBean(TheBean theBean){
    this.theBean = theBean;
  }
}

```

*`sql injection` attacks are prevented by jdbc template, alwasy use **prepared statements***  
`result set` - each returned row obj from the db.  
`jdbc.queryForObject` - method to return exactly one result  
`jdbc.query` - method to return zero or more 

_annotations_

``` java
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@Autowired  //method level connects collaborating beans
@Repository  //class_ level annotation to identify current class_ as one connected to db
@transactional  //ensures commit/rollback and lock out
```

Model with getters setters hashcode and equals methods

``` java
public class Artist {
    // properties
    private String name;
    // getters
    public String getName() {return name;}
    //setters
    public void setName(String name) {this.name = name;}
    
    /*
    Java Object hashCode() is a native method and returns the integer hash code value of the object. The general contract of hashCode() method is: Multiple invocations of hashCode() should return the same integer value, unless the object property is modified that is being used in the equals() method.
    */
    
    // equals, for testing
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artist artist = (Artist) o;
        return getId() == artist.getId() &&
                Objects.equals(getName(), artist.getName()) &&
                Objects.equals(getInstagram(), artist.getInstagram()) &&
                Objects.equals(getTwitter(), artist.getTwitter());
    }
    // hashcode
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getInstagram(), getTwitter());
    }
}

```
_________________________________________________
**_7/08/2019_**    [`Top`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#top) 
<a name="jpa"></a>

@Transactional (params?)

```
Standup
- explored the @After annotation to see how my db was behaving
- sql - discovered cascade while testing delete on an FK
```

_Spring Data JPA_-java persistence api
  - ORM - object relational mapping, matches object to db tables
    - Hibernate framwork abstracts away ORM implementations 
  - @Repository vs marker interface repository 
    - Repository interface
      - CrudRepository - create read update delete
        - PagingAndSorting
        - JpaRepository - adds features to pagin and sorting
  - 


``` java
@Entity       // class level -  maps to table
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})      // props to be ignored when serializing to json
@Table(name="customer")       // optional annotation to name the table class will be default
public classCustomer {
  @Id       // property level - identifies as primary key
  @GeneratedValue(strategy= GenerationType.AUTO)      // sets auto-increment
  private Integer id;
  private String firstName;
  private String lastName;
  private String company;
  private String phone;
  // the "one" side to a one to may relationsihp, cascade - delets info of related tables, .EAGER(load dependent class objs right away) .LAZY(loads dependent class objs when called upon)
  @OneToMany(mappedBy="customerId", cascade= CascadeType.ALL, fetch= FetchType.EAGER)
  private Set<Note> notes;
  // Getters, setters, equals, and hashCode left out of this listing for brevity}
```

Possible values for .ddl in **`application.properties`** include:  
  - **`none`** — This is the default for MySQL databases. Spring Data JPA will not do anything to alter the database structure on startup.  

 - **`update`** — Spring Data JPA will modify the database structure based on the annotations of the Java @Entity classes.  

 - **`create`** — Spring Data JPA creates the database every time the application is started, but it does not drop the tables when the application quits.  

 - **`create-drop`** — Spring Data JPA create the data every time the application is started and drops all the tables when the application quits.  

 - We use the create value because we don't have a database. After the initial run, we could switch to none or update depending on our project requirements.  

 - spring.jps.show-sql=true allows us to see the SQL statements that Spring Data JPA is executing.  

 _________________________________________________
**_7/10/2019_**    [`Top`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#top) 
<a name="servicelayer"></a>

_Service Layer_
  - Provides a way to access and modify data outside the controller
  - @Component annotation tells spring this class is used as a bean
  - list DAOs as properties

_View Models_
<p>
The purpose of a ViewModel is for the view to have a single object to render, 
alleviating the need for UI logic code in the view that would otherwise be necessary. 
This means the only responsibility, or concern, of the view is to render that single
 ViewModel object, aiding in a cleaner <b>separation of concerns (SoC)</b>.
</p>

 _________________________________________________
**_7/12/2019_**    [`Top`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#top) 
<a name="mocking"></a>

_Mocking_
  - Mokito - framwork to mock objects for unit testing
  - Why unit testing? to eliminate need for external dependencies, non deterninistic  


Validation annotations  <a name="validation"></a>
``` java
@NotNull // validates that the annotated property value is not null
@AssertTrue // validates that the annotated property value is true
@Size // validates that the annotated property value has a size between the attributes min and max; can be applied to String, Collection, Map, and array properties
@Min // vValidates that the annotated property has a value no smaller than the value attribute
@Max // validates that the annotated property has a value no larger than the value attribute
@Email // validates that the annotated property is a valid email address Some annotations accept additional attributes, but the message attribute is common to all of them. This is the message that will usually be rendered when the value of the respective property fails validation. 
@NotEmpty // validates that the property is not null or empty; can be applied to String, Collection, Map or Array values
@NotBlank // can be applied only to text values and validated that the property is not null or whitespace
@Positive and @PositiveOrZero // apply to numeric values and validate that they are strictly positive, or positive including 0
@Negative and @NegativeOrZero // apply to numeric values and validate that they are strictly negative, or negative including 0
@Past and @PastOrPresent // validate that a date value is in the past or the past including the present; can be applied to date types including those added in Java 8
@Future and @FutureOrPresent // validates that a date value is in the future, or in the future including the present
```

 _________________________________________________
**_7/24/2019_**    [`Top`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#top) 
<a name="microservices"></a>

_Twelve-Factor app_  - software as a service Saas  
  - Codebase
  - Dependencies
  - Config
  - Backing serices
  - Build, Release, Run
  - Processes
  - Port Binding
  - Concurrency
  - Disposability
  - Dev/Prod parity
  - Logs
  - Admin Process

_Cloud-Native apps_
  - Main ideas
    - Scalabilty
      - Vertical - Limited by size of existing hardware. Makes best use of space already available. Adding tables to a restaurant
      - Horizontal - Takes time, resources and planning. Expanding a highway
    - Reliabilty
    - Agility
  - Approach
    - Independent Conponents for scalability
    - Contraints -
    - Practices - repeatable actions that recognizes the constraints 

_Microservices_ - Small independent services, high cohesion, follow single responsibilty principle
  - Advantages
    - Independent scaling, Independent release schedules/cycles (features/ bugs),  Right tech for right job, Resilience.
  - Disadvantages
    - Complexity
    - Lots of moving parts

_Configuration Servers_ 
  1. create git repo for config
  1. Initializr dependencies - Config Server
  1. `@EnableConfigServer` to main app file class
  1. `application.properties`
    1. `server.port`=9999
    1. `spring.cloud.config.server.git.uri`=gitRepoLink 

_Config Client_ - For each service
  1. Initializr dependencies - Web starter, Config Client, Spring Boot Actuator
  1. `bootstrap.properties`
    1. `spring.application.name`=name of service
    1. `spring.cloud.config.uri`=http://localhost:9999(server localhost address)
  1. `@EnableConfigServer` in main app class level

  git file 
``` 
server.port=7979 // arbitrary port num for browser
management.endpoints.web.exposure.include=* // env variables to use with `@value` annotation in controller
serviceName=service-name-in-project
serviceProtocol=http://
servicePath=/enpoint // from service controller
```

  1. Service controller for the logic(or reference to service layer)
    1. `@RestController` as usual, let spring know this is a controller
    1. `@RefreshScope` class level annotation for ability to refresh without restarting entire server
    1. Autowire DiscoveryClient
    1. Instantiate new RestTemplate
    1. `@Value("${officialGreeting}")` - method level annotation used to bind env variables to locals
    1. In the mapping body goes the logic


_Service registry_- uses multiple services at once
  1. Spring initializr- `Eureka Server`
  1. `@EnableEurekaServer` class level annotation in the main class
  1. `application.properties`
``` java
server.port=8761 // arbitrary
eureka.instance.hostname=localhost
// shut off the client functionality of the Eureka server
eureka.client.registerWithEureka=false
eureka.client.fetchRegistry=false
eureka.client.serviceUrl.defaultZone=http://${eureka.insance.hostname}:${server.port}/eureka
```


 _________________________________________________
**_7/25/2019_**    [`Top`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#top) 
<a name="serviceregistry"></a>

_Service Registry_ - a database of services
  - Advantages - service instances are registered at startup and deregistered at shutdown
  - Disadvantages - Must be setup, configured and managed. It is a **critical system component** highly available.
  - Service discovery- similar to dns->used to find ip address of a site.


``` java 
// curl localhost:7979/actuator/refresh -d {} -H "Content-Type: application/json" 
```
_________________________________________________
**_7/25/2019_**    [`Top`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#top) 
<a name="queue"></a>


_Queues_ - FIFO
  - sync - waits for response
  - async - does not wait for response
  - AMQP - advanced messaging queueing protocol

_Cache_ - Storing a copy of data for future use
  - saves a copy and accesses that copy
  - might be old data, not very effective when data changes often
  - best with non user specific data

_Buffering_ - preloads data from original source



_________________________________________________
**_8/3/2019_**    [`Top`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#top) 
<a name="edge"></a>

_Edge Sevice_ - The entry point into a service that sits in front of an api
  - used to meet the needs for different clients
  - exposed to the public internet
  - improve security thru authentication
  - improve performance thru load balancing
  - encapsulates the internal structure of the app
  - even more complexity and must be highly available


_________________________________________________
**_8/7/2019_**    [`Top`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#top) 
<a name="security"></a>

_Spring Security_
  - Penetration testing
  - Ethical hacking
  - Authentication
  - Authorization
  - Principal - object that represents a logged in user
    - name, autorities etc.
  - 


_________________________________________________
**_8/8/2019_**    [`Top`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#top) 
<a name="oauth"></a>
_Oauth_-industry standard protocol for authorization






_________________________________________________
**_8/8/2019_**    [`Top`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#top) 
<a name="pws"></a>

_Pivotal Web Services_
  - __Software as a Service (SaaS)__ - The capability provided to the consumer is to use the provider’s applications running on a cloud infrastructure2 . The applications are accessible from various client devices through either a thin client interface, such as a web browser (e.g.,web-based email), or a program interface. The consumer does not manage or control theunderlying cloud infrastructure including network, servers, operating systems, storage, or even individual application capabilities, with the possible exception of limited userspecific application configuration settings.
  - __Platform as a Service (PaaS)__ - The capability provided to the consumer is to deploy onto the cloud infrastructure consumer-created or acquired applications created using programming languages, libraries, services, and tools supported by the provider.3 The consumer does not manage or control the underlying cloud infrastructure including network, servers, operating systems, or storage, but has control over the deployed applications and possibly configuration settings for the application-hosting environment.
  - __Infrastructure as a Service (IaaS)__ - The capability provided to the consumer is to provision processing, storage, networks, and other fundamental computing resources where the consumer is able to deploy and run arbitrary software, which can include operating systems and applications. The consumer does not manage or control the underlying cloud infrastructure but has control over operating systems, storage, and deployed applications; and possibly limited control of select networking components (e.g., host firewalls).


__On-demand self-service__ -  A consumer can unilaterally provision computing capabilities, such as server time and network storage, as needed automatically without requiring human
interaction with each service provider.

__Broad network access__ - Capabilities are available over the network and accessed through standard mechanisms that promote use by heterogeneous thin or thick client platforms (e.g.,
mobile phones, tablets, laptops, and workstations).

__Resource pooling__ - The provider’s computing resources are pooled to serve multiple consumers using a multi-tenant model, with different physical and virtual resources dynamically assigned and reassigned according to consumer demand. There is a sense of location independence in that the customer generally has no control or knowledge over the exact location of the provided resources but may be able to specify location at a higher level of abstraction (e.g., country, state, or datacenter). Examples of resources include storage, processing, memory, and network bandwidth.

__Rapid elasticity__ - Capabilities can be elastically provisioned and released, in some cases
automatically, to scale rapidly outward and inward commensurate with demand. To the
consumer, the capabilities available for provisioning often appear to be unlimited and can
be appropriated in any quantity at any time.

__Measured service__ - Cloud systems automatically control and optimize resource use by leveraging a metering capability1 at some level of abstraction appropriate to the type of service (e.g.,storage, processing, bandwidth, and active user accounts). Resource usage can be monitored, controlled, and reported, providing transparency for both the provider and
consumer of the utilized service.


_________________________________________________
**_8/8/2019_**    [`Top`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#top) 
<a name="circuit"></a>

_Circuit Breaker Pattern_ 
  - helps to reduce resources tied up on operations that are likely to fail
    
_Fault tolerance article_
  - network timeouts and retires
  - separate threads on per depependency thread pools
  - semaphors - multithreading concept
  - circuit breakers

_________________________________________________
**_8/8/2019_**    [`Top`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#top) 
<a name="jenkins"></a>

_DevOps_ - 
  - 
  - pros - continuous deployment, faster scaling, improves communication and collaboration
  - cons - user fatigue, need beta users, security concerns,  vaiable environment from B2B(consistency)  

_Contuous inegration_ - development practice that requires developers to integrate code into a shared repository several times a day. 
  - cons - reduced integration risk, higher quality code(for not having to worry about breaking anything). costs, dev resistence  
  - pros - rapid development

_Continuous Delivery_- the ability to get changes of all types into production, or into the hands of users, safely and quickly in a sustainable way.  
  - enable teams to release a constant flow of software updates into production to quicken release cycles, lower costs, and reduce the risks associated with development.   
  - Low risk releases, faster time to market,  higher quality

_Containerization_(docker, kubernetes) - is an OS-level virtualization method used to deploy and run distributed applications without launching an entire virtual machine (VM) for each app. Multiple isolated applications or services run on a single host and access the same OS kernel.
  - lightweight, isolated, vunerable
   
_Jenkins_ - leading automation srerver

_Docker_


_________________________________________________
**_8/8/2019_**    [`Top`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#top) 
<a name="testing"></a>

system and performance
_System testing_ – This is the first time end to end testing of application on the complete and fully integrated software product before it is launch to the market.
  - Black Box testing - System test involves the external workings of the software from the user's perspective.

_Java Reflection_ - 


<!-- ==================================================================================================================== -->
 [`Top`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#top)
<a name="random"></a> 


###Q and A
``` java

"Compare and contrast web applications and web services." // A web service is a componet of a web application. Services refer to the software & business logic separate from the client. Services dont have a view component
"List the two most common data transfer formats for web services." // JSON and xml
"List the two main types of data stores that back web applications and web services." // Database and files
"Describe a request-response protocol." // Client, server, db and back
"Describe the three main parts of an HTTP request." // request line, header, body
"Describe the two required HTTP request methods." // 
"Describe the four most common HTTP request methods used by web services." // GET, PUT, POST, DELETE
"Describe the three main parts of an HTTP response." // response line, header, body
"Describe the five groups of HTTP response codes." // 1xx-info, 2xx-success, 3xx-redirect, 4xx-client err, 5xx-server err
"Explain the architectural principles of REST." //
"Explain the Richardson Maturity Model." // POM, resources, specific verbs, hypermedia controls Hateoas
"Describe JSON." // JS object notation
"Explain how key/value pairs and arrays are used in JSON." //
"Describe Spring." // 
"Describe Spring Boot." //
"Explain the relationship between Spring Boot and the Spring Initializr." // Initializr is the web interface used to spin up projects
"Explain the Spring Boot project structure." //
"Explain the purpose of a Servlet container." //
"Compare and contrast a Servlet container and the Servlet API." //
"Explain Tomcats relationship with Servlet containers and the Servlet API." //
"Describe Spring MVC." //
"Explain the Front Controller Pattern." //
"Describe the MVC Pattern." //
"Explain the following sections of the OpenAPI 3.x specification:" //
"Metadata, Servers, Paths, Parameters, Request body, Responses, Data Definitions and refs" //
"Explain the following Spring annotations:" //
"@RestController, @RequestMapping, @RequestBody, @ResponseBody, @PathVariable, @Valid" //
"Explain the Document Object Model (DOM)" //
"Explain how a browser renders content" // 
"Describe Lambda Expressions"
"Explain Functional Interface" // Interface that has one and only one absrtact method
"Describe how to use default Methods" //
"Types of sql joins" // 
"What are Streams" // Streams provide a mechanism for processing a set of data in various ways that can include filtering, transformation, or any other way that may be useful to an application.
"Date/Time API Changes"
"Static variables"// static variables are, essentially, global variables. All instances of the class share the same static variable.
"map.KeySet()" // return a Set of keys
"map.values()" // returns a Collection
"Consumer<T>" 
// functional interface that represents an operation that accepts a single input and returns no result. Expected to operate via "side effects". ex.) 
List<Integer> nums = new ArrayList<>();
  nums.add(1);
  nums.add(2);

  List<Integer> nums2 = new ArrayList<>();

  // Consumer Example to mult 100 to each element in nums and add to nums2
  Consumer<List<Integer>> display = list -> list.forEach(a -> {
      nums2.add(a * 100);
      System.out.println(nums2);
  });

  // Consumer to print nums to screen
  Consumer<List<Integer>> printNums = list -> list.forEach(a -> System.out.println("Here is an element in the nums Array List: "+a));

  // Implement display using accept()
  display.accept(nums); // runs display consumer on nums arrayList
  printNums.accept(nums2); // runs printNums consumer on nums2 arrayList
  display.andThen(printNums).accept(nums); // runs both consumer on nums array


"Supply<T>" // 
"Optional<T>" //
"Predicate<T>" // Return Boolean use with filter
List<Integer> nums = Arrays.asList(2, 3, 1, 5, 6, 7, 8, 9, 12);
        
  // predicate can be used without lambdas. Its an interface, so any class can implement it
  Predicate<Integer> btf = n -> n > 5;
  
  //negate() will get the opposite
  nums.stream().filter(btf).forEach(System.out::println);

"REST" //
"RESTful"//
"JAX-RS" //
"marshal" //
"unmarshal"//
"durable" // queues will persist if service fails
"marker interface" // indicates that an implementing class can be serialized and deserialized. Marker interfaces have no properties or defined methods.
".class at the end of an object referece"
"deserialization"// json to java
"serialization" //java to json
"servlet container" //
"tomcat"// implementation of the servelet container by Spring boot
@requestbody // maps the HttpRequest body to a transfer object, enabling automatic deserialization of the inbound HttpRequest body onto a Java object.
@responsebody // tells a controller that the object returned is automatically serialized into JSON and passed back into the HttpResponse object.
"transactional manager" //
@Transactional (params? // 
"Boyce-Codd normalization"//
"Spring Securities" //
"try with resources" // 
"Singleton" // one "single" instance allowed. This is useful when exactly one object is needed to coordinate actions across the system. - spring default to singleton
"Scopes"// run the app (global/session), make request(request), then usese either proto or singlton 
// singleton-only one, 
//prototype-many, 
//request-instance only lives in the request, 
//session - one instance lives until logout
//global - 
"Testing run with coverge" // shows lines of code that are tested
"What is referentioal integrity?" //
"What is depedndency injection?" // When the container provides an instance of the object
"What is List and how is it used in java?" // List is an interface that extends the Collection and Iterable interfaces. All inplementations: AbstractList, AbstractSequentialList, ArrayList, AttributeList, CopyOnWriteArrayList, LinkedList, RoleList, RoleUnresolvedList, Stack, Vector
"JSR303"// bean validation
"ArgumentCaptor" // unit testing for void methods
  service.updateBook(bvm);
  ArgumentCaptor<Book> bookCaptor = ArgumentCaptor.forClass(Book.class);
  verify(bookDao).update(bookCaptor.capture());
  assertEquals(bvm.getAuthor(), bookCaptor.getValue().getAuthor());
"Software Entropy" // It is the invisible hand that breaks component interactions that weren’t in scope, causes production servers to inexplicably crash, and withholds a timely and cost-effective hotfix.
"Caching vs buffering" // Caching stores a copy for later use, Buffering pulls from the original a little at a time. 
"Exchange with a queue and binding" // Binds routing key to the appropriate queue
"queue producer" // writes to the exchange
"queue consumer" // reads form the queue
"tdd"// begin with "should" and be descriptive
"Mockmvc"//  


char[] arr = str.toCharArray(); // don't forget the 'single quotes'
/*

write a query to display user's names who are on the same team

  |     users         |
  |-------------------|
  |name  | fave_color |
  |-------------------|
  |Bob   | red        |
  |Gwen  | blue       |
  |Ernald| green      |
  |Mavis | blue       |
  ---------------------


  |      teams        |
  |-------------------|
  |  id  | team_color |
  |-------------------|
  |1     | red        |
  |2     | blue       |
  |3     | green      |
  ---------------------

---
SELECT COUNT(CustomerID), Country
FROM Customers
GROUP BY Country
HAVING COUNT(CustomerID) > 5;

returns table with 2 columns, the number of people people and their country only if there are more than 5 people from there
*/

```

``` javascript
// Passport review
// •	Parsing through an array and manipulating strings/data
// •	Prototypical inheritance
// •	Asynchronous functions (particularly how they behave in a loop)...i.e. the event loop
"ES6/ESNext features" //
"Hoisting" // hoisting moves all declarations to the top of the current scope. Let and const are not hoisted. Using Let will allow reassignment of a variable inside a blosk without changing it outside the block.

/*
Q's
What are you excited about?
What are the company goals?
What are the common challenges people in this possition face

*/

```

 [![Build Status](https://dev.azure.com/definitelytyped/DefinitelyTyped/_apis/build/status/DefinitelyTyped.DefinitelyTyped?branchName=master)](https://dev.azure.com/definitelytyped/DefinitelyTyped/_build/latest?definitionId=1&branchName=master)
