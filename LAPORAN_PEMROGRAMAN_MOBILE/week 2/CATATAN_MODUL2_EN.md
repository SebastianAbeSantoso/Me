
## Module II: Understanding

### Chapter 7

#### 23/02/26

This part explains that the current and upcoming modules (2, 3, 4) are structured into Understanding (2), Design (3), and Implementation (4). The mentor explains that even though the course is structured like this, in a real world project, it usually does not work in that exact structure in a single attempt, that's called a waterfall approach, where you can't incorporate the learnings during implementation, it is very inefficient. Instead, it's gonna be done in iterations. In a single attempt you do a little understanding, a little design, a little implementation, and then you repeat multiple times, you do not have to do this in that exact order, it is more like tools in a toolbox, where you can choose a tool that is right for the job, whenever a problem arises.

### Chapter 8

#### 23/02/2026

This part explains the project structure that will be done in this whole course, which is a fictitious project called FullSnack, a food delivery web application. This project is mainly chosen to illustrate an example, to visualize the different concepts and tools that is going to be explained, and how they apply. It is mentioned that it is similar tu Uber Eats, well, because it is. Because rather than a completely fictitious project where you have to design all the things and make things up along the way, it is better to choose based on a real app and figure out how they are supposed to work. Althought it is a standard e-commerce application, the concepts that are taught are mostly universal, not only to this particular type.

The specification for the app can be seen here: https://github.com/Charca/frontend-architecture-workshop/blob/main/documents/project-spec.md

This course aims to build and design an architecture for a customer facing web application, essentially an application where the customer can look around and order food. The role that the i (mentee) play here is a tech lead for a small team, that is expected to triple within the next year. It is expected to come up with a foundation for the rest of the team to build on top of, naturally this includes gathering requirements, designing, and supporting the team during the implementation, for full details, just check the github link provided. 

The mentor highlights a system context diagram, it shows the entire software systems including a collection of different applications, databases, apis, that share the same goal, which in the middle of it, is the system represented as a box, on top of it is the three users, which is customer, restaurant and driver. They all use the same systems, but they most likely wont have the same app depending on their uses. Then the bottom are external payment systems, and an admin system from FullSnack, that is a part of a different team, and also a different application. Then the next are system containers, which is the building blocks of the system. 

### Chapter 9

#### 23/02/26

The previous chapter mentioned the C4 Model which will be explained in this chapter, it is a series of diagrams that can be used to visualize the architecture of a project with different levels of detail, which was developed by Simon Brown. It is explained as "A Google Maps for your code", in the same way that you can zoom in or out of a particular area to see more or less context/detail, you can do the same with the C4 Model, which has four levels, four types of diagrams. Essentially, the four levels are: 1. Context Diagram, 2. Containers, 3. Components, 4. Code. At level one, you can zoom into a particular system and see it's contents (level two), and when you zoom into a particular container, that is the components, and inside a component is the fourth level, code.

The first level is usually context, which is users of the systems and the external systems. This level is very good to look at a high-level overview, which can be used for documentation, since the system contexts are unlikely to change overtime, it is also good to share to non-technical people. Level two is taking a particular system and opening it up, where you can see the containers, same context (user and external system). You can see the containers being applications, databases, APIs, like the first level, you can see the name of a box, and it's short description. It is used for orienting as it is still pretty high-level, not about the nitty gritty. The third level is where you can see the components inside a particular container, it depends on the type of system, in this case, it is referred as the main classes of the applicaiton, like controllers, spring components, the mentor mentions that this level is not quite useful for frontend as it is for backend, some small parts will be mentioned in the next module when the designing starts. The third level is aimed towards more technical people, you dont want to write these for every containers as your code will change quickly, and there's no good way to automate this because it doesn't represent all of your classes because that will be too overwhelming, it instead will represent the main ones, that are important. it is usually used to explain, or change something in the architecture. The fourth and final level is code diagrams, these can be any kind of diagrams that explains on code-level, like a class diagram, component diagram, or relationship diagram. More on this on the provided links by the mentor, which is https://c4model.com/.

### Chapter 10

#### 23/02/26

This is the first exercise of the course, which is drawing the container diagram of the FullSnack system, anything can be used here for drawing diagram. My attempt with lucidchart is here: https://lucid.app/lucidchart/35fbdb26-5cb0-40ff-8ff7-28d3f14dbaa3/edit?viewport_loc=-4629%2C-956%2C8061%2C4256%2C0_0&invitationId=inv_31ac1de4-b752-4504-bc2e-571fb39c0726

### Chapter 11

#### 23/02/26

My diagram is a bit different from the one the mentor made, i spotted quite a few mistakes on mine, as it was a short attempt at drawing the diagram, as suggested by the mentor at chapter 10. One mistake that mainly annoys me is the fact that i didn't have the internal dotted line around the web apps like the one the mentor made, i only made the fullsnack system box, in that case, it is a bit unclear. I'll improve on it when i need to.

### Chapter 12

#### 25/02/26

1. Architectural Drivers

- Things that will influence your architecture, this will determine your requirements

- It was mentioned in module 1 that the same application can have very different architectures, here it is mentioned that it may happen due to the drivers, some common ones are Business Goals, the reason for building the architecture. Quality attributes, also mentioned in module 1, it is things like performance, scalability, reliability, mantainability, etc. The  '-ility' and 'ilities'. There is a baseline level for quality attributes, for example, there is a baseline for security, or like performance, so the point is not to mention all of these, but to mention the most important ones, that may influence the architecture. Constraints, which are usually divided into two, technical constraints, which come with a particular language or framework that is used, and business constraints, which are usually related to budget, or deadline, it is non-negotiable as it is a constraint.  They are helpful in the way that they limit the scope of a problem. Functional Requirements, all of the things that your application do, in the case of FullSnack, the FRs may include being able to search for food items, browse restaurants, managing the cart, login, create an account, etc. Not all FRs are influental, so part of this job is deciding which are significant. Team's experience + Knowledge, this will definitely influence the technology decisions, like which patterns to use. The experience and knowledge of an architect mentioned in module 1 will also be important here, because the technical breadth about all the different things they know will influence how they build the architecture. Lastly, is Technology Trends, which will also influence to some degree, this doesn't mean you have to follow the newest things, because more often than not, you are more likely to be following the old and stable technology, but being aware of the latest trends and being up to date is part of the job as an architect.

### Chapter 13

#### 25/02/26

2. Architectural Requirements

- Success criteria of your architecture, the things it needs to do in order to be successful, this will drive your decisions and is driven by the aforementioned architecture drivers. Can be thought of as a checklist.

- On a real project, these documents won't be as organized in the beginning, where you have to think of the requirements yourself. There are a couple ways to do this, one is essentially talking to people, maybe with stakeholders, potential users, PMs, and designers, and see what they care about in the architecture, of course you do not have to comply with everything, but it will give you an idea. The mentor also mentioned a couple of resources that will help in this process, one of which is the book "Design It!", the mentor also gave a template on how to make the documents, https://charca.notion.site/Architectural-Requirements-Doc-f47fe67cd5ba408d840306e01eb38081. In the course, the requirements are categorized by the different types of drivers from CH13, such as Business Goals, Constraints, Quality Attributes, Influential Functional Requirements, and other Influencers.

- Business goals are often obvious and simple, but often taken as granted, but they are clearly important because they are what other people might have in mind for the architecture, like CEOs wanting double of customers in a year, customer wanting to order delicious foods that are delivered ASAP. Constraints here are unbreakable rules or guidelines, an example is that it must only be deployed on AWS infrastructure because thats the only thing your DevOps team supports, another example is a business constraint where it must ship on X date and X year, T time from now, which is a time constraint, it doesn't have to be fully featured as it will help determine the priority of the features. Quality Attributes are important attributes that you want defined and the priority of it, it can also be seen as non-functional requirements, like Performance, an example is a user must be able load the app using 4G connection within 5 seconds is high priority, or Scalability, where the codebase should be modularized to allow incrasing number of frontend developers to work in parallel is high priority. Influential FRs are self-explanatory, and Other Influencers are things that come into play as work is continued on the architecture, like the frontend team is only a single team of 4 developers, which is expected to be tripled over the next year, which may change the team composition. Another example is every frontend developer on the team has experience working with React and Next.js, and some are also comfortable working with Vue.js and Laravel, and not everyone is comfortable working with TS.

### Chapter 14

#### 25/02/26

Second exercise yayyyyyyyyyyy, putting together the influential functional requirements, which are FRs that are architecturally significant, and may influence the architecture. Since the FRs are already listed, there is no need to make stuff up, just finding out which ones are influential.


### Chapter 15

#### 25/02/26

Haha, my list looks mostly different, but the mentor did mentioned that it might be completely different so it's fine.

### Chapter 16

#### 25/02/26

3. Architectural Decisions
- The decisions that falls into the architectural end of the spectrum of "Design or Architecture"
- The decisions that are made at the start, hard to change, and significant. Most of the decision early in the project are achitectural because there's no information to design.
- Example: Deciding what framework to use, making decisions about version control, making decisions about how to keep the codebase organized, making decisions about using a third-party vendors to support an IFR, making decisions about observability and monitoring
- Don't try to make every architectural decision at this point, this will block the whole development project and lead to analysis paralysis.
- Why is more important than the What, as an example, using Next.js for the framework, but rather than what to use, the more important point is why use Next.js, a simple way of thinking about this is using ADRs, template provided: https://github.com/joelparkerhenderson/architecture-decision-record/blob/main/locales/en/templates/decision-record-template-by-michael-nygard/index.md
- Architectural Decision Records (ADRs), allows documenting architecturally significant decisions, overtime this record will form a log and becomea book that tells a story about the whole architecture, an akashic records for the architecture or some sorts. It's simply divided into Title, status, context, decision, and consequences.
