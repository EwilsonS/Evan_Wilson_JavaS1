# [Evan Wilson](https://ewilsons.github.io/)

> "They think technology just automatically improves. It only improves when alot of people work very hard to make it better" -Elon Musk  

## Class Notes
_________________________________________________
**_Prework_**  

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
**_6/3/2019_**  

One week redos for summatives  
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
  **_6/4/2019_**

  Iteration Planning  
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

  _Scanner_ - used to get user input  
  _Comments_ - /** JavaDoc Comments */  

**`comment`, `debug`, `comment`, `debug`, `comment`, `debug`**

_________________________________________________
  **_6/5/2019_**  
  _Booleans expressions_ 
  - Relational
    - ==, !=, >, <, <=, >=
  - Conditional - &&, ||

_Loops_
- While/ Do While
  - While- keep going until the condition is met be careful of infinite loops
 -  Do While- sets an ending condition

- For - define a stopping point.  
`continue` - restarts loop
`break` - exits loop

_________________________________________________
  **_6/6/2019_**  

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
  **_6/7/2019_**

  Data structues  
  Arrays - fixed number, same data type for _elements_ in the array.

  * convert num within a statement- sum/(double)len*witdh
  
Agile  led by scrum master
- sprint
  - standup
- retrospective - hi's and lows. 
  - H) file structure tips were helpful, forced pair programming
  - L) slow pace, inconsistent tests  

_________________________________________________
  **_6/10/2019_**  
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
**_6/11/2019_**  
_Classes & Objects pt2_  

_Class_ - is the blueprint/ model  
  - Every class **is a type**  
  - _Types_- numbers, text, booleans **user defined data types**  
  _Instantiate(creeate an instance of)_ - is to actually build the model  
_Properties, getters, and setters_  
_Contructors_- called when you want to instantiate a class  
  - used to initialize(set the internal state) of the object.
  - constructor must have the same name as the class that contains it.
  - Does not have a return type, not even void  
  - Class can have more than one constructor  
_Methods_ - (see previous work)  
_this keyword_
  - refers to the **object**  
_static_ 
  - static methods are onlly associated woth the class and _not_ any particular instance of the class.  
  - static meths can be accessed w/o creating an instance of the class.
_Dot(.) Operator_

