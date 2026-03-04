
## Module III: Designing

### Chapter 17

#### 4 Maret 2026

The designing module of the course, module II and I were high-level and can be used for backend and frontend, but this module is mostly about frontend, with domain modeling and breaking down the application into smaller chunks / modules. By the end of this document, a design document will be made to give a high-level plan of how to implement. And add a bunch more tools to the software design toolkit. Design is not done once at the beginning and be forgotten, but done in parts and in iterations.

### Chapter 18

#### 4 Maret 2026

Entities are the main building blocks of the domain, in the case is FullSnack, its restaurant, customer, food item, etc. It's like an object in OOP, where they have names, data, and operations/relationships to other entities. Entities are also mostly abstract that may be drawn in diagram, but in real life it doesn't exist. But you can represent it when implementing into code, common ways to represent it is with a model, like MVC, Class, Interface, Type, or maybe as a Service. Modules are building blocks of the application, where the application is broken down. The first level is breaking down into modules, there's sometimes a 1:1 relationship from entity to module, but its not a hard rule, again it's an abstract concept and can be represented. Lastly is Componenets, they're not really an abstract so it's usually seen in code, like an UI component. In this module, when referring to these three, it's going to refer to the abstract, and not the concrete implementations.

### Chapter 19

#### 4 Maret 2026

Domain modeling is a method for discovering entities and describing their attributes and operations, in data engineering, its used to define database schema, and in OOP, its for classes, interfaces, and hierarchy, in frontend, its to organize structure and align with ui specs. Nouns in the FRs typically refer to entities, and verbs is the action that they can take. Another way to find out is through the UI specs to find out the attributes and operations. A simple way to define is just to write down known entities and it's attributes and operations, and find out more along the way. WHY do this? 1. naming things (giving entities names), if entities are not named then the one who implements it will name it, which can cause dissonance among the naming systems. Entities are the most likely things to survive, so to preserve readability, you have to name them correctly. 2. Align data model to the UI, if you try mapping the data at once, it will just become a nested mess of complications, by modeling the data model based on the UI, you will create encapsulation and decreases complexity. 3. Establish responsibilities, for something to happen, there are multiple ways to do it, and by establishing this early on, you can find more time to brainstorm on it's established responsibility, even if there is just a little of it. Similar to the iteration process, you don't have to finish it immediately, and can go back later.

### Chapter 20

#### 4 Maret 2026

exercise 3 yayy, completing the domain model of the FullSnack domain model. Going through the known FRs and UI specs, and try to identify the remaining entities, operations, and attributes. completing the model is not optimum here, it's better to find out the relationships first.

### Chapter 21

#### 4 Maret 2026

a

### Chapter 22

#### 4 Maret 2026

x

### Chapter 23

#### 4 Maret 2026

x

### Chapter 24

#### 4 Maret 2026

x

### Chapter 25

#### 4 Maret 2026

x

### Chapter 26

#### 4 Maret 2026

x
