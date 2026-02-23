
## Module II: Understanding

### Chapter 7

#### 23/02/26

This part explains that the current and upcoming modules (2, 3, 4) are structured into Understanding (2), Design (3), and Implementation (4). The mentor explains that even though the course is structured like this, in a real world project, it usually does not work in that exact structure in a single attempt, that's called a waterfall approach, where you can't incorporate the learnings during implementation, it is very inefficient. Instead, it's gonna be done in iterations. In a single attempt you do a little understanding, a little design, a little implementation, and then you repeat multiple times, you do not have to do this in that exact order, it is more like tools in a toolbox, where you can choose a tool that is right for the job, whenever a problem arises.

### Chapter 8

#### 23/02/2026

This part explains the project structure that will be done in this whole course, which is a fictitious project called FullSnack, a food delivery web application. This project is mainly chosen to illustrate an example, to visualize the different concepts and tools that is going to be explained, and how they apply. It is mentioned that it is similar tu Uber Eats, well, because it is. Because rather than a completely fictitious project where you have to design all the things and make things up along the way, it is better to choose based on a real app and figure out how they are supposed to work. Althought it is a standard e-commerce application, the concepts that are taught are mostly universal, not only to this particular type.

The specification for the app can be seen here: https://github.com/Charca/frontend-architecture-workshop/blob/main/documents/project-spec.md

This course aims to build and design an architecture for a customer facing web application, essentially an application where the customer can look around and order food. The role that the mentee plays here is a tech lead for a small team, that is expected to triple within the next year. It is expected to come up with a foundation for the rest of the team to build on top of, naturally this includes gathering requirements, designing, and supporting the team during the implementation, for full details, just check the github link provided. 

The mentor highlights a system context diagram, it shows the entire software systems including a collection of different applications, databases, apis, that share the same goal, which in the middle of it, is the system represented as a box, on top of it is the three users, which is customer, restaurant and driver. They all use the same systems, but they most likely wont have the same app depending on their uses. Then the bottom are external payment systems, and an admin system from FullSnack, that is a part of a different team, and also a different application. Then the next are system containers, which is the building blocks of the system. 

### Chapter 9

### 23/02/26
The previous chapter mentioned the C4 Model which will be explained in this chapter, it is a series of diagrams that can be used to visualize the architecture of a project with different levels of detail, which was developed by Simon Brown. It is explained as "A Google Maps for your code", in the same way that you can zoom in or out of a particular area to see more or less context/detail, you can do the same with the C4 Model, which has four levels, four types of diagrams. Essentially, the four levels are: 1. Context Diagram, 2. Containers, 3. Components, 4. Code. At level one, you can zoom into a particular system and see it's contents (level two), and when you zoom into a particular container, that is the components, and inside a component is the fourth level, code.

The first level is usually context, which is users of the systems and the external systems. This level is very good to look at a high-level overview, which can be used for documentation, since the system contexts are unlikely to change overtime, it is also good to share to non-technical people. Level two is taking a particular system and opening it up, where you can see the containers, same context (user and external system). You can see the containers being applications, databases, APIs, like the first level, you can see the name of a box, and it's short description. It is used for orienting as it is still pretty high-level, not about the nitty gritty. The third level is where you can see the components inside a particular container, it depends on the type of system, in this case, it is referred as the main classes of the applicaiton, like controllers, spring components, the mentor mentions that this level is not quite useful for frontend as it is for backend, some small parts will be mentioned in the next module when the designing starts. The third level is aimed towards more technical people, you dont want to write these for every containers as your code will change quickly, and there's no good way to automate this because it doesn't represent all of your classes because that will be too overwhelming, it instead will represent the main ones, that are important. it is usually used to explain, or change something in the architecture. The fourth and final level is code diagrams, these can be any kind of diagrams that explains on code-level, like a class diagram, component diagram, or relationship diagram. More on this on the provided links by the mentor, which is https://c4model.com/.

### Chapter 10

x

### Chapter 11

x

### Chapter 12

x

### Chapter 13

x

### Chapter 14

x

### Chapter 15

x

### Chapter 16

x
