import FeaturedOffersCarousel from './features/featured-offers-carousel/featured-offers-carousel'
import RestaurantCarousel from './features/restaurant-carousel/restaurant-carousel'
import RestaurantFilters from './features/restaurant-filters/restaurant-filters'
import { offers, carousels } from './data'

export function RestaurantScreen() {
  return (
    <>
      <div className="flex items-center justify-between px-4 py-2">
      <RestauranHeader />
      <div className="flex items-center justify-between px-4 py-2">
        <MenuCatagoriees />
        <RestaurantPromotions />
        <FeaturedItemsCarousel />
        <RestaurantRatings />
        <RestaurantMenu />
        <RestaurantUserRatings />
        </div>      
    </>
  )
}
