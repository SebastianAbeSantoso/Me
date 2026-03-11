
## Module IV: Implementing

### Chapter 27

#### 11 Maret 2026

The part where the mentor mentions that we'll be writing code huh, or at least a part of it as a reference how the high-level decisions translate into code. Like the modules defined in the previous modules, also start to break the modules into components.

### Chapter 28

#### 11 Maret 2026

It seems like something called turborepo will be used, which is a tool to manage mono repos. Mentor mentions that mono repos are good for projects that have multiple packages and applications, helps run simpler in the long term. The app is simply divided into 3, which is core API, docs and web. next is packages and ui. The docs arent of importance yet, the API is a mockup and the web is a simple next.js app with only implemented home and search page so far.

### Chapter 29

#### 11 Maret 2026

The part where the mentor mentions how we'll be implementing the different application modules into the actual codebase, or at least showing how high-level design decisions translate into the system. Like the home, login, and delivery modules defined in the previous section, there is'nt always a 1:1 between modules as mentioned in the previous module, which means looking at it like its a folder structure wont help much.

The mentor mentions that he likes to not follow any conventions, which helps avoiding nested modules, even when things are logically subroutes. If a module like 'menu item' is kept at the top level instead of being buried inside a 'restaurant' route, it makes the codebase way easier to navigate. Helps you know exactly where to go to fix a component without hunting through Next.js conventions. Keeping things separated like this also helps apply constraints and guardrails later on at the end of the module. The app folder is basically just acting as a router to handle URLs, rendering, and maybe some data fetching. All the heavy logic is kept safely inside the modules, which have their own internal hierarchy of features and components that'll be covered in the next video.

### Chapter 30

#### 11 Maret 2026

Thinking in component-based framework like react implies that stuff is always broken down into components. Popularized by react in the beginning, called by react "Thinking in React" the page is usually divided into components, the mentor mentions that he likes to also organize it using hierarchy. A simple hierarchy involves putting the components into one of four component typse (screns, features, components, shared). Shared is there as an umbrella to catch what does not belong to the three, like layout, design systems, common features, shared componenets, utilities, and so on. A screen is one of the main entry points in the module, a lot of hte modules only have one screen, like the delivery module. But in the search module you can switch tabs, these can be different enough to call different screens. Feature and components are only different in sized, components are small like dropdowns, but features are big and have multiple components. A rule of thumb is if a feature needs its own internal set of folders, then its probably a feature, like filtering restaurants. Another way besides the simple, is feature-sliced design, which is architectural methodology for frontend projects, essentialyl a components hierarchy. Fullsnack will use the simple one.

### Chapter 31

#### 11 Maret 2026

yay first exercise of this module.....which is catagorizing or breaking down the restaurant module into one of the four components mentioned in chapter 30, and "maybe" implement it into the codebase << this is unneeded, just create a breakdown and folder hierarchy, dont worry about shared, and there is only one screen.

### Chapter 32

#### 11 Maret 2026

x

### Chapter 33

#### 11 Maret 2026

z

### Chapter 34

#### 11 Maret 2026

x

### Chapter 35

#### 11 Maret 2026

x

### Chapter 36

#### 11 Maret 2026

x
