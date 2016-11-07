package com.allandroidprojects.ecomsample.utility;

import java.util.ArrayList;

/**
 * Created by 06peng on 2015/6/24.
 */
public class ImageUrlUtils {
    static ArrayList<String> wishlistImageUri = new ArrayList<>();
    static ArrayList<String> cartListImageUri = new ArrayList<>();

    public static String[] getImageUrls() {
        String[] urls = new String[] {
                "https://static.pexels.com/photos/5854/sea-woman-legs-water-medium.jpg",
                "https://static.pexels.com/photos/6245/kitchen-cooking-interior-decor-medium.jpg",
                "https://static.pexels.com/photos/6770/light-road-lights-night-medium.jpg",
                "https://static.pexels.com/photos/6041/nature-grain-moving-cereal-medium.jpg",
                "https://static.pexels.com/photos/7116/mountains-water-trees-lake-medium.jpg",
                "https://static.pexels.com/photos/6601/food-plate-yellow-white-medium.jpg",
                "https://static.pexels.com/photos/6695/summer-sun-yellow-spring-medium.jpg",
                "https://static.pexels.com/photos/7117/mountains-night-clouds-lake-medium.jpg",
                "https://static.pexels.com/photos/7262/clouds-ocean-seagull-medium.jpg",
                "https://static.pexels.com/photos/5968/wood-nature-dark-forest-medium.jpg",
                "https://static.pexels.com/photos/6101/hands-woman-art-hand-medium.jpg",
                "https://static.pexels.com/photos/6571/pexels-photo-medium.jpeg",
                "https://static.pexels.com/photos/6740/food-sugar-lighting-milk-medium.jpg",
                "https://static.pexels.com/photos/5659/sky-sunset-clouds-field-medium.jpg",
                "https://static.pexels.com/photos/6945/sunset-summer-golden-hour-paul-filitchkin-medium.jpg",
                "https://static.pexels.com/photos/6151/animal-cute-fur-white-medium.jpg",
                "https://static.pexels.com/photos/5696/coffee-cup-water-glass-medium.jpg",
                "https://static.pexels.com/photos/6789/flowers-petals-gift-flower-medium.jpg",
                "https://static.pexels.com/photos/7202/summer-trees-sunlight-trail-medium.jpg",
                "https://static.pexels.com/photos/7147/night-clouds-summer-trees-medium.jpg",
                "https://static.pexels.com/photos/6342/woman-notebook-working-girl-medium.jpg",
                "https://static.pexels.com/photos/5998/sky-love-people-romantic-medium.jpg",
                "https://static.pexels.com/photos/6872/cold-snow-nature-weather-medium.jpg",
                "https://static.pexels.com/photos/7045/pexels-photo-medium.jpeg",
                "https://static.pexels.com/photos/6923/mountains-fog-green-beauty-medium.jpg",
                "https://static.pexels.com/photos/6946/summer-bicycle-letsride-paul-filitchkin-medium.jpg",
                "https://static.pexels.com/photos/5650/sky-clouds-field-blue-medium.jpg",
                "https://static.pexels.com/photos/6292/blue-pattern-texture-macro-medium.jpg",
                "https://static.pexels.com/photos/6080/grass-lawn-technology-tablet-medium.jpg",
                "https://static.pexels.com/photos/7124/clouds-trees-medium.jpg",
                "https://static.pexels.com/photos/5923/woman-girl-teenager-wine-medium.jpg",
                "https://static.pexels.com/photos/6133/food-polish-cooking-making-medium.jpg",
                "https://static.pexels.com/photos/6224/hands-people-woman-working-medium.jpg",
                "https://static.pexels.com/photos/6414/rucola-young-argula-sproutus-medium.jpg",
                "https://static.pexels.com/photos/6739/art-graffiti-abstract-vintage-medium.jpg",
                "https://static.pexels.com/photos/6703/city-train-metal-public-transportation-medium.jpg",
                "https://static.pexels.com/photos/6851/man-love-woman-kiss-medium.jpg",
                "https://static.pexels.com/photos/6225/black-scissors-medium.jpg",
                "https://static.pexels.com/photos/7185/night-clouds-trees-stars-medium.jpg",
                "https://static.pexels.com/photos/5847/fashion-woman-girl-jacket-medium.jpg",
                "https://static.pexels.com/photos/5542/vintage-railroad-tracks-bw-medium.jpg",
                "https://static.pexels.com/photos/5938/food-salad-healthy-lunch-medium.jpg",
                "https://static.pexels.com/photos/7234/water-clouds-ocean-splash-medium.jpg",
                "https://static.pexels.com/photos/6418/flowers-flower-roses-rose-medium.jpg",
                "https://static.pexels.com/photos/6436/spring-flower-hyacinth-medium.jpg",
                "https://static.pexels.com/photos/6351/smartphone-desk-laptop-technology-medium.jpg",
                "https://static.pexels.com/photos/5618/fish-fried-mint-pepper-medium.jpg",
                "https://static.pexels.com/photos/6874/landscape-nature-water-rocks-medium.jpg",
                "https://static.pexels.com/photos/6918/bridge-fog-san-francisco-lets-get-lost-medium.jpg",
                "https://static.pexels.com/photos/5658/light-sunset-red-flowers-medium.jpg",
                "https://static.pexels.com/photos/6111/smartphone-friends-internet-connection-medium.jpg",
                "https://static.pexels.com/photos/5670/wood-fashion-black-stylish-medium.jpg",
                "https://static.pexels.com/photos/5838/hands-woman-hand-typing-medium.jpg",
                "https://static.pexels.com/photos/7050/sky-clouds-skyline-blue-medium.jpg",
                "https://static.pexels.com/photos/6036/nature-forest-tree-bark-medium.jpg",
                "https://static.pexels.com/photos/5676/art-camera-photography-picture-medium.jpg",
                "https://static.pexels.com/photos/6688/beach-sand-blue-ocean-medium.jpg",
                "https://static.pexels.com/photos/6901/sunset-clouds-golden-hour-lets-get-lost-medium.jpg",
                "https://static.pexels.com/photos/7260/rocks-fire-camping-medium.jpg",
                "https://static.pexels.com/photos/5672/dog-cute-adorable-play-medium.jpg",
                "https://static.pexels.com/photos/7261/rocks-trees-hiking-trail-medium.jpg",
                "https://static.pexels.com/photos/6411/smartphone-girl-typing-phone-medium.jpg",
                "https://static.pexels.com/photos/6412/table-white-home-interior-medium.jpg",
                "https://static.pexels.com/photos/6184/technology-keyboard-desktop-book-medium.jpg",
                "https://static.pexels.com/photos/7295/controller-xbox-gaming-medium.jpg",
                "https://static.pexels.com/photos/6732/city-cars-traffic-lights-medium.jpg",
                "https://static.pexels.com/photos/7160/bird-trees-medium.jpg",
                "https://static.pexels.com/photos/6999/red-hand-summer-berries-medium.jpg",
                "https://static.pexels.com/photos/5787/flowers-meadow-spring-green-medium.jpg",
                "https://static.pexels.com/photos/7136/water-rocks-stream-leaves-medium.jpg",
                "https://static.pexels.com/photos/7291/building-historical-church-religion-medium.jpg",
                "https://static.pexels.com/photos/6696/road-nature-summer-forest-medium.jpg",
                "https://static.pexels.com/photos/7294/garden-medium.jpg",
                "https://static.pexels.com/photos/6948/flight-sky-art-clouds-medium.jpg",
                "https://static.pexels.com/photos/7299/africa-animals-zoo-zebras-medium.jpg",
                "https://static.pexels.com/photos/6345/dark-brown-milk-candy-medium.jpg",
                "https://static.pexels.com/photos/7288/animal-dog-pet-park-medium.jpg",
                "https://static.pexels.com/photos/5863/nature-plant-leaf-fruits-medium.jpg",
                "https://static.pexels.com/photos/6625/pexels-photo-medium.jpeg",
                "https://static.pexels.com/photos/6708/stairs-people-sitting-architecture-medium.jpg",
                "https://static.pexels.com/photos/6429/smartphone-technology-music-white-medium.jpg",
                "https://static.pexels.com/photos/6574/pexels-photo-medium.jpeg",
                "https://static.pexels.com/photos/7287/grass-lawn-meadow-medium.jpg",
                "https://static.pexels.com/photos/6100/man-hands-holidays-looking-medium.jpg",
                "https://static.pexels.com/photos/6100/man-hands-holidays-looking-medium.jpg",
                "https://static.pexels.com/photos/6877/dog-pet-fur-brown-medium.jpg",
                "https://static.pexels.com/photos/6790/light-road-nature-iphone-medium.jpg",
                "https://static.pexels.com/photos/7077/man-people-office-writing-medium.jpg",
                "https://static.pexels.com/photos/6889/light-mountains-sunrise-california-medium.jpg",
                "https://static.pexels.com/photos/7274/leaf-fall-foliage-medium.jpg",
                "https://static.pexels.com/photos/7285/flowers-garden-medium.jpg",
                "https://static.pexels.com/photos/6821/light-sky-beach-sand-medium.jpg",
                "https://static.pexels.com/photos/7297/animal-africa-giraffe-medium.jpg",
                "https://static.pexels.com/photos/6154/sea-sky-water-clouds-medium.jpg",
                "https://static.pexels.com/photos/7059/man-people-space-desk-medium.jpg",
                "https://static.pexels.com/photos/6666/coffee-cup-mug-apple-medium.jpg",
                "https://static.pexels.com/photos/5949/food-nature-autumn-nuts-medium.jpg",
                "https://static.pexels.com/photos/7064/man-notes-macbook-computer-medium.jpg",
                "https://static.pexels.com/photos/5743/beach-sand-legs-shoes-medium.jpg",
                "https://static.pexels.com/photos/6355/desk-laptop-working-technology-medium.jpg",
                "https://static.pexels.com/photos/5844/sea-water-boats-boat-medium.jpg",
                "https://static.pexels.com/photos/5541/city-night-building-house-medium.jpg",
                "https://static.pexels.com/photos/7017/food-peppers-kitchen-yum-medium.jpg",
                "https://static.pexels.com/photos/5725/grey-luxury-carpet-silver-medium.jpg",
                "https://static.pexels.com/photos/6932/italian-vintage-old-beautiful-medium.jpg",
                "https://static.pexels.com/photos/7093/coffee-desk-notes-workspace-medium.jpg",
        };
        return urls;
    }

    public static String[] getOffersUrls() {
        String[] urls = new String[]{
                "https://static.pexels.com/photos/1543/landscape-nature-man-person-medium.jpg",
                "https://static.pexels.com/photos/211048/pexels-photo-211048-medium.jpeg",
                "https://static.pexels.com/photos/1778/numbers-time-watch-white-medium.jpg",
                "https://static.pexels.com/photos/111147/pexels-photo-111147-medium.jpeg",
                "https://static.pexels.com/photos/2713/wall-home-deer-medium.jpg",
                "https://static.pexels.com/photos/168575/pexels-photo-168575-medium.jpeg",
                "https://static.pexels.com/photos/213384/pexels-photo-213384-medium.jpeg",
                "https://static.pexels.com/photos/67442/pexels-photo-67442-medium.jpeg",
                "https://static.pexels.com/photos/159494/book-glasses-read-study-159494-medium.jpeg",
                "https://static.pexels.com/photos/1543/landscape-nature-man-person-medium.jpg",
                "https://static.pexels.com/photos/211048/pexels-photo-211048-medium.jpeg",
                "https://static.pexels.com/photos/2713/wall-home-deer-medium.jpg",
                "https://static.pexels.com/photos/177143/pexels-photo-177143-medium.jpeg",
                "https://static.pexels.com/photos/106936/pexels-photo-106936-medium.jpeg"
        };
        return urls;
    }

    public static String[] getHomeApplianceUrls() {
        String[] urls = new String[]{
                "https://static.pexels.com/photos/1778/numbers-time-watch-white-medium.jpg",
                "https://static.pexels.com/photos/189293/pexels-photo-189293-medium.jpeg",
                "https://static.pexels.com/photos/4703/inside-apartment-design-home-medium.jpg",
                "https://static.pexels.com/photos/133919/pexels-photo-133919-medium.jpeg",
                "https://static.pexels.com/photos/111147/pexels-photo-111147-medium.jpeg",
                "https://static.pexels.com/photos/2713/wall-home-deer-medium.jpg",
                "https://static.pexels.com/photos/177143/pexels-photo-177143-medium.jpeg",
                "https://static.pexels.com/photos/106936/pexels-photo-106936-medium.jpeg",
                "https://static.pexels.com/photos/1778/numbers-time-watch-white-medium.jpg",
                "https://static.pexels.com/photos/189293/pexels-photo-189293-medium.jpeg",
                "https://static.pexels.com/photos/4703/inside-apartment-design-home-medium.jpg",
                "https://static.pexels.com/photos/133919/pexels-photo-133919-medium.jpeg",
                "https://static.pexels.com/photos/111147/pexels-photo-111147-medium.jpeg",
                "https://static.pexels.com/photos/2713/wall-home-deer-medium.jpg",
                "https://static.pexels.com/photos/177143/pexels-photo-177143-medium.jpeg",
                "https://static.pexels.com/photos/106936/pexels-photo-106936-medium.jpeg"
        };
        return urls;
    }

    public static String[] getElectronicsUrls() {
        String[] urls = new String[]{
                "https://static.pexels.com/photos/204611/pexels-photo-204611-medium.jpeg",
                "https://static.pexels.com/photos/214487/pexels-photo-214487-medium.jpeg",
                "https://static.pexels.com/photos/168575/pexels-photo-168575-medium.jpeg",
                "https://static.pexels.com/photos/213384/pexels-photo-213384-medium.jpeg",
                "https://static.pexels.com/photos/114907/pexels-photo-114907-medium.jpeg",
                "https://static.pexels.com/photos/185030/pexels-photo-185030-medium.jpeg",
                "https://static.pexels.com/photos/133579/pexels-photo-133579-medium.jpeg",
                "https://static.pexels.com/photos/51383/photo-camera-subject-photographer-51383-medium.jpeg",
                "https://static.pexels.com/photos/205926/pexels-photo-205926-medium.jpeg",
                "https://static.pexels.com/photos/2396/light-glass-lamp-idea-medium.jpg",
                "https://static.pexels.com/photos/1854/person-woman-hand-relaxing-medium.jpg",
                "https://static.pexels.com/photos/204611/pexels-photo-204611-medium.jpeg",
                "https://static.pexels.com/photos/214487/pexels-photo-214487-medium.jpeg",
                "https://static.pexels.com/photos/168575/pexels-photo-168575-medium.jpeg",
                "https://static.pexels.com/photos/213384/pexels-photo-213384-medium.jpeg",
                "https://static.pexels.com/photos/114907/pexels-photo-114907-medium.jpeg"
        };
        return urls;
    }

    public static String[] getLifeStyleUrls() {
        String[] urls = new String[]{
                "https://static.pexels.com/photos/169047/pexels-photo-169047-medium.jpeg",
                "https://static.pexels.com/photos/160826/girl-dress-bounce-nature-160826-medium.jpeg",
                "https://static.pexels.com/photos/1702/bow-tie-businessman-fashion-man-medium.jpg",
                "https://static.pexels.com/photos/35188/child-childrens-baby-children-s-medium.jpg",
                "https://static.pexels.com/photos/70845/girl-model-pretty-portrait-70845-medium.jpeg",
                "https://static.pexels.com/photos/26378/pexels-photo-26378-medium.jpg",
                "https://static.pexels.com/photos/193355/pexels-photo-193355-medium.jpeg",
                "https://static.pexels.com/photos/1543/landscape-nature-man-person-medium.jpg",
                "https://static.pexels.com/photos/211048/pexels-photo-211048-medium.jpeg",
                "https://static.pexels.com/photos/189857/pexels-photo-189857-medium.jpeg",
                "https://static.pexels.com/photos/157948/model-modelling-attractive-fashion-157948-medium.jpeg",
                "https://static.pexels.com/photos/33608/dog-ice-woman-purple-medium.jpg",
                "https://static.pexels.com/photos/157940/hair-bracelet-beautiful-beauty-157940-medium.jpeg",
                "https://static.pexels.com/photos/35188/child-childrens-baby-children-s-medium.jpg",
                "https://static.pexels.com/photos/70845/girl-model-pretty-portrait-70845-medium.jpeg",
                "https://static.pexels.com/photos/26378/pexels-photo-26378-medium.jpg",
                "https://static.pexels.com/photos/193355/pexels-photo-193355-medium.jpeg",
        };
        return urls;
    }

    public static String[] getBooksUrls() {
        String[] urls = new String[]{
                "https://static.pexels.com/photos/67442/pexels-photo-67442-medium.jpeg",
                "https://static.pexels.com/photos/159494/book-glasses-read-study-159494-medium.jpeg",
                "https://static.pexels.com/photos/33283/stack-of-books-vintage-books-book-books-medium.jpg",
                "https://static.pexels.com/photos/205323/pexels-photo-205323-medium.png",
                "https://static.pexels.com/photos/38167/pexels-photo-38167-medium.jpeg",
                "https://static.pexels.com/photos/68562/pexels-photo-68562-medium.jpeg",
                "https://static.pexels.com/photos/34592/pexels-photo-medium.jpg",
                "https://static.pexels.com/photos/1579/hand-notes-holding-things-medium.jpg",
                "https://static.pexels.com/photos/26890/pexels-photo-26890-medium.jpg",
                "https://static.pexels.com/photos/67442/pexels-photo-67442-medium.jpeg",
                "https://static.pexels.com/photos/159494/book-glasses-read-study-159494-medium.jpeg",
                "https://static.pexels.com/photos/33283/stack-of-books-vintage-books-book-books-medium.jpg",
                "https://static.pexels.com/photos/205323/pexels-photo-205323-medium.png",
                "https://static.pexels.com/photos/38167/pexels-photo-38167-medium.jpeg",
                "https://static.pexels.com/photos/68562/pexels-photo-68562-medium.jpeg",
        };
        return urls;
    }

    // Methods for Wishlist
    public void addWishlistImageUri(String wishlistImageUri) {
        this.wishlistImageUri.add(0,wishlistImageUri);
    }

    public void removeWishlistImageUri(int position) {
        this.wishlistImageUri.remove(position);
    }

    public ArrayList<String> getWishlistImageUri(){ return this.wishlistImageUri; }

    // Methods for Cart
    public void addCartListImageUri(String wishlistImageUri) {
        this.cartListImageUri.add(0,wishlistImageUri);
    }

    public void removeCartListImageUri(int position) {
        this.cartListImageUri.remove(position);
    }

    public ArrayList<String> getCartListImageUri(){ return this.cartListImageUri; }
}
