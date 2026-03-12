
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

Comparing my attempt: https://github.com/SebastianAbeSantoso/Me/tree/main/LAPORAN_PEMROGRAMAN_MOBILE/week%204/exercise_5 with the mentor's was interesting, a bit of the names and structures were different, mainly was i didn't put footnotes and combined it into a single shared box, also the "free" part i put into menu, the mentor did not, so that's also the difference in the hierarchy. After trying to make the hierarchy in the files, there are a couple jarring mistakes, like there are two "MenuCatagories" and they're misspelled from "MenuCategories"

### Chapter 33

#### 11 Maret 2026

This part is about how to represent domain entities, like restaurants or customers as examples in earlier modules, in the actual codebase. Since these entities are the core building blocks of the domain, they show up everywhere from the UI to the database. The mentor mentions that while it's common to just drop simple fetch functions in the endpoints directly inside components to hit the API, doing that for your core entities brings up a few problems. The raw data comes back exactly as the API formats it, meaning you get weird backend conventions like nested "attributes" and "relationships" objects, extra data you don't even need to render, or incomplete data that forces you to make extra calls just to get simple things like category names.

To solve these inefficiencies, a "model" layer is introduced as an abstraction right between the API and the frontend, which simplifies and makes data more efficient, only giving what is needed. For example is the function getRestaurant which promises the restaurant object as async, here you can grab the attributes or relationships, this is where aggregation of multiple endpoints happen. The mentor metnions that he's passing the entire object, it might not be optimal, but it's passing the restaurant information, which takes an object of the restaurant entity type, and prints the data. In a real app, it's going to be much more efficient and elegant, but here is essentially a way to pass the data from an API all the way to the components that need it, and respects the shape of the entity, and how we want it to look in front. It's a much more simplified view of the entity compared what we got, which may look to be a small improvement, but it will runs lots of times, and inefficiency here will go a long way.

### Chapter 34

#### 11 Maret 2026

Exercise 6: Implementing a model for the restaurant ratings entity, there are two: top and bottom of the menu, in the endpoint call the information you get is the top (summary rating), to get the other reviews theres a review endpoint to call, the exercise is to create a model function to call the bottom ratings. Not just the simplified like the current one, but also the number of ratings. 1. Creating the fetch function from the reviews endpoint, 2. Create a model function to call via restaurantid and can give back an object in the format in the video, 3. use the model function in the ui

### Chapter 35

#### 11 Maret 2026

I... lowkirkenuenly do not have an idea on how to solve this, because i do not even have an inkling of knowledge on Next.js so i just learned by following the answer given by the mentor, there are a couple of interesting things the mentor mentions, like in Next.js and similar frameworks there are methods to cache so subsequent fetches dont require networks since it's already cached, theres also the mentor's rule of thumb where he makes the function call from the ratings feature for data, rather than component for the decoupling.

### Chapter 36

#### 11 Maret 2026

x
