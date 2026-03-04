## Exercise 2

### Functional Requirements

This section lists all of the main functional requirements of FullSnack's web app. This is more of a functionality overview to help guide some of your architectural decisions.

#### Authentication
- Customers can browse the app without being authenticated.
- Customers can create an account using email, phone number, or social media accounts.
- Customers can authenticate using their created account credentials.
- Authenticated customers can update their profile information.
- Authenticated customers can reset their passwords if forgotten.
#### Browsing and Searching
- Customers can browse restaurants and food items without authentication.
- Customers can search for restaurants by name.
- Customers can search for restaurants by type of food.
- Customers can filter search results by various criteria (e.g., ratings, delivery time, distance).
#### Favorites and Recommendations
- Authenticated customers can add restaurants to their favorites.
- Authenticated customers can add food items to their favorites.
- The app can provide personalized restaurant and food item recommendations based on customer preferences and order history.
#### Ordering Food
- Customers can add food items to a shopping cart (with or without authentication).
- Customers can customize food items (e.g., add toppings, select portion size).
- Customers can apply promo codes or discounts to their orders.
- Customers can place an order from a restaurant, including multiple items per order (only authenticated customers).
- Customers can schedule orders for later delivery or pickup.
#### Payment
- Customers can choose from multiple payment methods (e.g., credit/debit cards, digital wallets).
- Customers can save payment information for future orders.
- Customers can view an order summary and total cost before confirming the order.
- Customers can receive an email confirmation with a digital receipt after placing an order.
#### Order Tracking
- After placing an order, customers can see a real-time tracker of their order status.
- Customers receive notifications about their order status (e.g., order confirmed, food being prepared, out for delivery).
- Once an order is out for delivery, customers can see a real-time map showing the driver's current location.
- Customers can contact the delivery driver or the restaurant in case of issues.
#### Ratings and Reviews
- Customers can rate and review restaurants and food items after receiving their orders.
- Customers can view ratings and reviews from other users.
- Customers can receive a notification if a restaurant responds to one of their reviews.

---

### Influential Functional Requirements
#### Authentication
- Customers can browse the app without being authenticated.
- - Reason: Anonymous access + authentication means dual identity, meaning "visitor" and "registered user" has to be differentiated concept-wise
- Customers can create an account using email, phone number, or social media accounts.
- - Reason:  Social login introduces third-party OAuth integration.
#### Browsing and Searching
- Customers can browse restaurants and food items without authentication.
- - Reason: Must support unauthicated user traffic at scale, security is a bit more fragile, and may incur higher load from crawlers/bots, it is similar or identical to Authentication's can browse the app without Auth.
#### Favorites and Recommendations
- The app can provide personalized restaurant and food item recommendations based on customer preferences and order history.
- - Reason: Needs a huge data structure, user-specific and can introduce ML analytics for behavioral data processing.
#### Ordering Food
- Customers can add food items to a shopping cart (with or without authentication).
- - Reason: Supporting carts for unauthenticated users means session-based or token-based cart storage.
- Customers can schedule orders for later delivery or pickup.
- - Reason: Needs time-based job execution, which means coordinating between schedule and restaurant which uses background schedulers, and a reliable future processing.
- Customers can place an order from a restaurant, including multiple items per order (only authenticated customers).
- - Reason: It is the core of the app itself, if this is not implemented then the software will have no use.
#### Payment
- Customers can choose from multiple payment methods (e.g., credit/debit cards, digital wallets).
- - Reason: There are lots of debit/credit cards and wallets that exist that usually needs payment fateways, wallet APIs, so a separate layer is needed specifically for funneling payment, and also for coordinating order placements, and authorizations.
#### Order Tracking
- Once an order is out for delivery, customers can see a real-time map showing the driver's current location.
- - Reason: The driver's app must capture GPS continuously and send update, handle poor connectivity and avoid draining battery. External map provider also needed because creating another maps app is like reinventing the wheel, but there are a couple maps app, so you need to integrate a couple, like Google Maps or Apple Maps, which introduces API Keys, usage quotas and pricing constraints.
