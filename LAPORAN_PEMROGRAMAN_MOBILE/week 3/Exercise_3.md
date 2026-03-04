# Exercise 3

# Domain Model

## Entities

- `Customer`
- `Restaurant`
- `Driver`
- `ShoppingCart`
- `FoodItem`
- `Order`
- `PaymentMethod`
- `Review`

## Attributes and Operations

### `Customer`

- ID: string
- Name: string
- Email: string
- PhoneNumber: string
- Address: string
- Favorites: List<String>
- `addFavoriteRestaurant(Restaurant.ID)`
- `addFavoriteFoodItem(foodItemId)`
- `updateProfile()`

### `Restaurant`

- ID: string
- Name: string
- Description: string
- Logo URL: string
- Address: string
- `addMenuItem()`
- `removeMenuItem()`
- `updateMenuItem()`


### `Driver`

- ID: string
- Name: string
- PhoneNumber: string
- Status: enum / string
- `assignOrder(orderId)`
- `updateLocation()`
- `markOrderDelivered()`

### `ShoppingCart`

- ID: string
- CustomerId: string
- TotalPrice: double
- `addItem()`
- `removeItem()`
- `clear()`


### `FoodItem`

- ID: string
- RestaurantId: string
- Name: string
- Description: string
- Price: double
- Available: enum / boolean

### `Order`

- ID: string
- CustomerId: string
- RestaurantId: string
- Status: enum / string
- DriverId: string
- DeliveryAddress: string
- TotalPrice: double
- `place()`
- `changeStatus()`
- `confirm()`
- `cancel()`
- `complete()`


### `PaymentMethod`

- ID: string
- CustomerId: string
- Type: enum / string
- Expiration: date
- IsDefault: boolean

### `Review`

- ID: string
- CustomerId: string
- TargetIdd: string
- Rating: int 1-5
- Comment: string
- RestaurantResponse: string
- createdAt: date
- `edit()`
- `delete()`
