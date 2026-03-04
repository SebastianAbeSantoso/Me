
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

exercise 3 yayy, completing the domain model of the FullSnack domain model. Going through the known FRs and UI specs, and try to identify the remaining entities, operations, and attributes. completing the model is not optimum here, it's better to find out the relationships first. Here i made the entities first, and then mapped what it can do, can't do, and how it potentially interacts with other entities, idk how to link them if they do interact so i only made simple attributes and operations without relationships. my attempt here: https://github.com/SebastianAbeSantoso/Me/blob/main/LAPORAN_PEMROGRAMAN_MOBILE/week%203/Exercise_3.md

### Chapter 21

#### 4 Maret 2026

A couple differences i see between mentor's and mine's, like RestaurantCategory, MenuItem (mine is FoodItem, but theres also drinks so mine is wrong), MenuItemCategory i don't have, menuitemoption i dont have aswell. for attributes and operations theres a lot of different ones with the data type im unaware of aswell, and he made a class diagram aswell which i am lacking of. But one thing i have advantage over is Driver, which the mentor does not have

### Chapter 22

#### 4 Maret 2026

In module II, the C4 model was explained, but mostly on layer 1-2, in this chapter, the third level will be explained. In the c4 Model, the components, or called by the mentor, "modules" as components are taken by like UI components, e.g react components. Modules is the top level concerns of the app, when breaking down the app, the first thing to do is breaking them into modules. A good way to visualize them is to make up routes based on the design brief and visualize them, like for example is google.com/images for images, google.com/.... etc etc. Some modules are entities, but it is good to be clear that not all entities are modules, and not all modules are entities. Routes and modules aren't 1:1 either. an example given by the mentor is subroutes (fullsnack.com/restaurant/:id/item/:id) which is a subroute to restaurants, but can be considered another module, and there are some modules that don't belong to a particular route, an example is chrome's bookmark function, it's a module but is not route, but shows up on every page. This is focused on naming modules for now, in the next module of the course, implementation, will be where the relationships are defines, like dependencies.

### Chapter 23

#### 4 Maret 2026

A simple way to make a low-level diagram is just to create a box and arrows until something is made and decided, because it is low level, its good to sort out your thoughts and communicating it with the team, but because it is low level, it cant be for documentation which changes a lot. Common types are flowcharts, which is good for logic or a process, then state diagrams, which is good for changes in state, next is class diagrams which is mainly used for OOP, but it can be used to represent entities. Finally, it is a sequence diagram, which is good for whole processes from start to finish, pretty much a sequence that can be used to discuss things around the system processes.

### Chapter 24

#### 4 Maret 2026

exercise 4 yayy, from the last chapter it's about sequence diagrams. The old exercise for diagram was good at conveying high-level process, but the real process is much more complicated, and sequence diagram is a good way to bridge that and bridge the complexity. The task is to create a sequence diagram for real time order status changes

### Chapter 25

#### 4 Maret 2026

x

### Chapter 26

#### 4 Maret 2026

x
