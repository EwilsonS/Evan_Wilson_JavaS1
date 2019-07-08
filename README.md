<a name="top"></a>

##### Keywords
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
[`JDBC`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#jdbc)




# [Evan Wilson](https://ewilsons.github.io/)

> "They think technology just automatically improves. It only improves when alot of people work very hard to make it better" -Elon Musk  

## Class Notes
_________________________________________________
**_Prework_**  [`Top`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#top)  

 **Terms**  
 - port binding
 - concurrency

**Git Shorts**  
`git checkout -b name-of-new-branch`  
`git branch`  will show  
`git touch`... edit your stuff  
`git add .`  
`git commit -m "description"`  
`git push origin name-of-branch`   
`git branch -D name-of-branch`  

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
  - Stack memory only exists ifor the duration of the code block they are in  
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
  - only code in that class and children classes have access to its protected properties.

_Abstract_ - has at least one method that will not be implemented.
  - all child classes must use this method but in any way they want.Abstract methods define access modifier, void, paramas. When abstract is implemented, the methjod signature must match.

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

_Iterators_  
  - Object that allows us to access each element in a collection
  - Two methods  
    - hasNext()
    - next()
    - (remove()-_optional_)
  - no order  

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
    - We do not have to catach jor specify these
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
_________________________________________________
**_6/20/2019_**    [`Top`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#top)  

stand up -
  reverse array to get the first instance of a duplicate element
  then subtract that index from original array.size() to get the last
  instance of that element's index.
  List<Integer> tenRandomsCopy = new ArrayList<>(tenRandoms);
  Collections.reverse(tenRandomsCopy);
                


_________________________________________________
**_6/21/2019_**    [`Top`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#top)  

17 lines per method

carslist app discussion - always ask why this?

Structured data lesson- Would have been helpful to see code first. Then instructor gives quick description (1 minute or so). No questions answred at this time. Then begin lesson. 


**Retrospective**  
  - H) 
  - L) Need examples before definitions, then examples again;.

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
``` java
  Method: Post 
  URI: /inventory
  Req Body: JSON of created rcord
  Res body: NONE 
 ```

  retrieve /api/records?name=evan
```java
      Method: Get
      URI: /inventory
      Req Body: None
      Res body: Json returned
```
  update 
```  java
      Method: Put
      URI: /inventory{id}
      Req Body: JSON of created rcord
      Res body: JSON returned
```
  delete
```  java
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
  - Java containers that run jaba-based web apps
  - Apps **implement** the Java Servlet Specification
    - defines how it should act and what features it should have
  - Routes HTTP req to Java components to `servlets`

_Tomcat_ - refernce implemetaion of the servlet container
  - Implements the Servlet specification
  - components 
    - `Catalina` - servlet container
    - `Coyote` - 
    - `Jasper` - provides support for JavaPages

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
@RestController - class_ level annotation
@RequestMapping - method level, 2 params(value = "/endpoint", Method = RequestMethod Get..)
@ResponseStatus - method level
@PathVariable - 
```
_DTO _ - Object that carries data between processes

_@Valid_- 

_________________________________________________
**_6/27/2019_**    [`Top`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#top)  
<a name="error"></a>  
_Error Handling_

``` java
@RestControllerAdvice - class_ level
@ExceptionHandler - method level
```
Aspect oriented programming(AOP)

`application/vnd.error` - one of many formats to use for errors(hateos supports this)

_Web Interfaces_


_________________________________________________
**_6/28/2019_**    [`Top`](https://github.com/EwilsonS/Evan_Wilson_JavaS1#top) 

M2 summative review
```
- Improve Java Talk
- Use constructor for data hiding/ consistency 
```

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
  - integration testing inclused the db
  - AAA pattern
    - `Arrange`
    - `Act`
    - `Assert`  
  - dependency injection - the container provides the instance of the object we are testing
  - retruned Lists are never null when returned from DAO.
  - :: doulble colon - method reference

*`sql injection` attack are prevented by jdbc template, alwasy use **prepared statements***  
`result set` - each returned row obj from the db.  
`queryForObject` - method ot return exactly one result  
`query` - method to return zero or more 

_annotations_

``` java
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@Autowired - method level
@Repository - class_ level annotation to identify current class_ as one connected to db
@transactional
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
<a name="jdbc"></a>

@Transactional (params?)

```
Standup
- explored the @After annotation to see how my db was behaving
- sql - discovered cascade while testing delete on an FK
```

_Spring Data JPA_
  - ORM - object relational mapping, matches object to db tables
    - Hibernate framwork abstracts away ORM implementations 
  - @Repository vs marker interface repository 
    - Repository interface
      - CrudRepository - create read update delete
        - PagingAndSorting
        - JpaRepository - adds features to pagin and sorting
  - 

``` java
@Entity  // maps to table
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) // props to be ignored when serializing to json
@Table(name="customer") // optional annotation to name the table class will be default
public classCustomer {
  @Id // property level - identifies as primary key
  @GeneratedValue(strategy= GenerationType.AUTO) // sets auto-increment
  private Integer id;
  private String firstName;
  private String lastName;
  private String company;
  private String phone;
  // the "one" side to a one to may relationsihp, cascade - links deletion to parent tables of  .EAGER(first) .LAZY(last)
  @OneToMany(mappedBy="customerId", cascade= CascadeType.ALL, fetch= FetchType.EAGER)
  private Set<Note> notes;
  // Getters, setters, equals, and hashCode left out of this listing for brevity}
```