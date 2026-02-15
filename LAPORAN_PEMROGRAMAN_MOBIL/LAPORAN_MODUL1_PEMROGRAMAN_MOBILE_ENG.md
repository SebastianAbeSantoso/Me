# Laporan Pemrograman Mobile

## Foundations
---
**09/02/2026** : Saya menyelesaikan seluruh kursus Modul 1 dan mencatat module 1 part 3 - 6.

**11/02/2026** : Saya pindah catatan ke GitHub agar mudah di perbaiki.

**14/02/2026** : Menambahkan catatan untuk memuat part 1-2, serta memperbaiki format.

**15/02/2026** : Mencerna ulang materi dan menambah insight & Impact

---

### Deskripsi

#### Part 1 

The introductions, like who the mentor is, what this course will teach or not teach, and mentions that the course will keep things at high level, not deep diving into every topic that concerns Frontend Architecture.

#### Part 2 

The course overview, describes which module teaches what, Materials are from module 1 to module 4, as module 5 will wrap up the module. 
In module 1 the course will teach the general definition of software architecture and frontend architecture, module 2 will teach about the difference between architecture and design, then module 3 will start to actually design the software/application mainly using domain modeling, and the fourth module material is mainly about implementing, in this part, coding is finally starting. The final module (5) will be wrapping up the whole course, and the mentor will be sharing resources for more research in case more understanding is needed.

#### Part 3

Software architecture is the structure of a system. The foundation of building blocks where all other pieces of software will sit on top of. According to Ralph Johnson and Martin Fowler, architecture is the decisions you wish you could get right early in the project. Because earlier decisions of software are hard to change because other pieces of software are built on top of it. In that case, architecture is defined as the things that people perceive as hard to change. And then again, they were confused, how can you find the easy stuff or the hard stuff while designing the architecture. So it became "Architecture is about the important stuff... whatever that is." Then again, how do you find the important stuffs? Because of that, in this course, architecture is simply defined as a systems software,  and architecture is a set of significant design decisions about how the software is organized to promote desired quality attributes and other properties. Shortened to "Architecture are decisions", important decisions that are hard to change, that is used to promote desired quality attributes and properties.

in the book "Head First Software Architecture A Learner's Guide to Architectural Thinking" by Raju Gandhi, Mark Richards & Neal Ford
Architecture is defined into four dimensions, that is, style, characteristics, decisions, and logical components. The four dimensions can be easily mapped to a video game character, as they usually have classes, stats, background and skills. In software architecture, this translates easily, like a class is a architecture style, stats are the strength and weaknesses so its the characteristics, it usually ends with 'ility' or 'ilities' like agility or scalabilities. Like in a video game where a character will favor certain stats, each architecture will also have a different set of priorities when it comes to which characteristics they support. Then its the background story, which is architectural decisions, it is described as structural guides, it is sometimes rules, and most of the times its a guideline. Lastly, a character's skill, the mentor mentions that it maps really well to architecture's logical components, these are usually modules, UI components, design systems, classes, functions, etc. Pretty much all of the building blocks that make the architecture or software. Just like all those aforementioned things make a character, these four dimensions are combined and that makes an architecture

#### Part 4

Like the previos definition of Architecture, frontend architecture can be similarly defined as "A system's frontend architecture is the set of significant design decisions about how its frontend layer is organized to promote
desired quality attributes and other properties." Concisely, frontend is important frontend stuff... whatever that is It used to be simple to define frontend and backend, where frontend is it runs on the client and backend runs in the server, but nowadays its not so simple. So its better to think of it as a spectrum, like in the frontend spectrum it can be like CSS, HTML, and client-side JS, and backend has things like databses, APIs or kubernetes. Modern framework sometimes falls in the middle, where they have components that are client sided and server sided, like nextjs or nuxt, or react server components. In this course, frontend is  toward the middle-forward area of the spectrum. In the case of building an app, there are myriads of ways to combine the four dimensions to make what the user sees is the same application, yet it couldnt be any more different when looked at architecturally.

#### Part 5

Many parts of architecture and software designs overlap, so they're sometimes interchangeable, but there is one difference between them that is important. Architecture and design also can be seen as a spectrum, whereas architecture can be about the structure of the system, and on the design end, its more about code, or the design pattern, to know where a decision lies in this spectrum, it helps to analyze it in different viewpoints. One of them is how hard is it to change, the harder it is, the more architecture is it in nature. Another one is how strategic or how tactical the decision is, architectural decisions typically involve multiple teams, they have longer term implication, or it requires more to think strategically about how to make that decision, while design decisions are more about day to day operations. Architecture issues are high level, they require more context of how other part of the applications, or how all the application work, while design decision are at the level of codes, so we dont need to know it all.

An example on how to put a decision in this spectrum is, deciding on the style of the architecture, it definitely falls more on the architecture side because it checks multiple boxes, in that its hard to change, its strategic, and its a higher level decision. Another example is the one earlier used in the course, to use signals to share global state in the application, it is something that isnt easy to change, and also not that hard, it falls more on the design spectrum, yet also strategic with long term implication, its also more about the code than the structure, overall the decision itself falls on the middle of the spectrum, a bit to the side of design. Why does this matter? The more it falls under the architecture spectrum, the more time to spend thinking about or researching about tbe decision, and also the more people involved or at least aware of the decision, and the more important it is to document it. The more it is about design, the more quickly you can make it, you dont have to align entire teams, or have a meeting on which design patterns to use. It helps to avoid underestimating architectural decisions and overestimating design decisions

#### Part 6

The frontend architect role is quite vague, because there is no universal job description on what they're supposed to do, traditionally they only create the structure of systems and hand it off to the development team, called the waterfall approach, but because this architecture doesnt work or doesnt really exist anymore, the modern architect write codes, review, and iterate with the team aswell. Three common traits that architects have are, one is that they are responsible for setting technical direction, Will Larson described it in his book, in that staff engineers and architects speak behalf on their companies technology, creating technical vision and strategy, aligning the team with that vision, and making architectural decisions, then writing and writing code. The second trait is that they apply architectural thinking, Mark Richard describes it in his book "Architectural Thinking" into three parts, understanding and analyzing tradeoffs, understanding business drivers and translating it into architectural requirements, and having a wide breath of technical knowledge while still maintaining technical depth.
Another concept that Mark Richard has is his pyramid of knowledge, he top is what you know, and your mastery, the top two is said as to be your technical breath, things you understand on a shallow level. To be a good architech, you must have a wide technical breadth to make various decisions on multiple fields, you do not have to be a master at one thing as it is better to know more about multiple field than only focusing on one in this case. The last trait of modern architect is doing "glue work" called by Tanya Reilly, in which it is described as the invisible but very important work that needs to be done so other things can be worked on. It includes writing documentations, or running meetings, and doing sponsorship and mentorship. As a senior engineer you have a responsibility to grow your team around you, meaning that your knowledge on architectural and design earlier, you have the responsibility for sharing that knowledge with the rest of the team.

Two last things about frontend architecture is that you dont need a title, in a lot of companies, there is no such title, you dont need anyone's permission to care or think about the architecture, you might need some authority to make the architectural decisions, but that comes with other titles such as tech lead. Architecture is not just the responsibility of the architect, it's everyone's job, even if you dont care about the role, you can still make things better for the team by taking care of the architecture

---

### Insight

What I gained was the general description of software architecture, frontend architecture, software design, and the role of a frontend architect, more details below.

As I mentioned before software architecture and design can be interchangeable as they are both a form of decisions, however they have some strict differences. Software architecture is the foundation, meaning it is high-level, very important, and a decision you have to get right at the start, while software design is more low-level, code or design-based problem, the building blocks above the foundation. Because they both overlap, it can be seen as a spectrum, so stating that a problem is either architecture or design is a false dichotomy. A general way of finding out which spectrum it resides in is by asking a few questions, like "does it require the consideration of multiple teams?", "is it hard to change?", "will it have long-term effect?" the more boxes it checks, the more architectural it is on the spectrum. 

Similar to software architecture, frontend architecture is also a set of important decisions to promote quality attributes and other properties, but it is on the layer or vertical slice of frontend systems. 

Software architecture is commonly divided into four dimensions (Architecture style, Architecture characteristics, Architecture decisions, and Logical components), but it is not a law as SOLID is to OOP, as with more modern applications and designs, the line between the four dimensions continue to blur. The four dimensions are indispensable in creating a picture of an architecture, as they all combine into one for an application. Style or structure is deciding the form of a system (Microservice, Monolithic, Event-driven, etc). Characteristic is how the system operates, usually classified with -ility or -ilities (e.g. Agility, Scalabilities). Decisions are specific, enforceable constraints or rules for developers to align their view on the system, essentially it is a boundary usually in the form of guidelines. Finally, logical components are modules, like blocks of code that performs a specific set of functions, it wraps similar tasks into partitions, pretty much all the building blocks that makes an architecture or software.

Lastly, a frontend architect's role is quite vague, even some companies may not have this role, but in the course it has three common traits such as setting technical direction, applying architectural thinking, and doing "glue work", simply put, it describes the unseen/unquantifiable tasks that are required in order for a project to succeed, it is largely non-technical, like communicating, documenting, onboarding, etc. An important point to mention is that you don't have to be an architect to care about architecture, while you might need some authority to make architectural decisions, caring about it is everyone's task, not the architect's sole responsibility.

With this newfound knowledge, I tried brainstorming and imagining how a frontend architect works and creates their architecture, and found similarities to game dev's role of game designer, as they both have similar fields of work. They both align the team's views on the project (systems thinking), balancing imagination and reality, and govern the team. Most importantly, they are both roles that do "glue work", like communicating between roles, setting deadlines, making documents, etc.

---

### Impact

This whole topic changes my mind, a role so important is largely unavailable in many companies, but then I learnt that architects were seen as people on ivory towers, creating complex diagrams that are impossible to implement, hence the role's "death". In the modern era, the responsibility is redistributed amongst senior+ roles. In startup companies this specific role is very rare (often combined along with other roles), but in large companies, it is mandatory for someone to have a specific "glue work" role, even if it is not "Frontend Architect". In the case of Google, the role is based upon technical management, not personnel management, called Individual Contributor, like L6 "Staff Software Engineer", L7 "Senior Staff Engineer" and L8 "Principal Engineer". 

Learning about this broke my perception of teams usually having a manager, but modern companies prefer work-related roles is based upon technical work (what needs to be done) rather than staff management (who needs to do it), staff management is usually held by managers, which mostly focuses on management of people rather than their work.

https://progressivecoder.substack.com/p/is-the-software-architect-job-role
In this newsletter, they indeed mentioned that "ivory tower architects" is mostly why the role is hated, people who do the same work that got special titles, and those who make uselessly complicated diagrams, mentioning that architecture should be on every developer's mind, not solely the architect, and treat the architect as the guide, not the sole manager. With more modern workflows being more collaborative, the "solo" architect role has died down, being replaced by architects that collaborates.
