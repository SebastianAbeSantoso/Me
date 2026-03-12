import {
  fetchRestaurant,
  fetchRestaurantCategories,
  fetchRestaurantReviews,
} from '../lib/api'

import { Ratings, Restaurant } from './types'

export async function getRestaurant(id: string): Promise<Restaurant> {
  const restaurant = await fetchRestaurant(id)
@@ -20,3 +25,20 @@ export async function getRestaurant(id: string): Promise<Restaurant> {
    reviews,
  }
}

export async function getRestaurantRatings(id: string): Promise<Ratings> {
  const restaurant = await fetchRestaurant(id)
  const reviews = await fetchRestaurantReviews(id)
  const { attributes } = restaurant

  return {
    rating: attributes.rating,
    numRatings: attributes.numRatings,
    reviews: reviews.map((review) => ({
      rating: review.rating,
      comment: review.comment,
      date: review.date,
      userName: review.user.name,
    })),
  }
}
