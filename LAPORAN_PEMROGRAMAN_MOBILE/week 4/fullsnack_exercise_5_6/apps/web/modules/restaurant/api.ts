import { MenuResponse, RestaurantResponse } from './types'

export async function fetchRestaurant(
  restaurantId: string
): Promise<RestaurantResponse> {
  const response = await fetch(
    `http://localhost:3002/restaurants/${restaurantId}`
  )
  return response.json()
}

export async function fetchRestaurantMenu(
  restaurantId: string
): Promise<MenuResponse> {
  const response = await fetch(
    `http://localhost:3002/restaurants/${restaurantId}/menu`
  )
  return response.json()
}

export async function fetchRestaurantCategories(

  return response.json()
}

export async function fetchRestaurantReviews(
  restaurantId: string
): Promise<ReviewResponse[]> {
  const response = await fetch(
    `http://localhost:3002/restaurants/${restaurantId}/reviews`
    )
  return response.json()
}
