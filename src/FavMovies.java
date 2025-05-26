public class FavMovies {

        // Array to store favorite movies
        private String[] movies;

        // Constructor to initialize the array with some movies
        public FavMovies() {
            movies = new String[5]; // Let's store 5 movies
            movies[0] = "Interstellar";
            movies[1] = "A Clockwork Orange";
            movies[2] = "Good Will Hunting";
            movies[3] = "The Dark Knight";
            movies[4] = "Django";
        }

        // Method to check if a movie exists in the array and return its index
        public int findMovie(String movieTitle) {
            for (int i = 0; i < movies.length; i++) {
                if (movies[i].equalsIgnoreCase(movieTitle)) {
                    return i; // Return the index if found
                }
            }
            return -1; // Return -1 if not found
        }

        // Main method to test the findMovie method
        public static void main(String[] args) {
            FavMovies myMovies = new FavMovies();

            // Test with two movies
            String testMovie1 = "Interstellar";
            int index1 = myMovies.findMovie(testMovie1);
            if (index1 != -1) {
                System.out.println(testMovie1 + " is at index " + index1);
            } else {
                System.out.println(testMovie1 + " is not in the list.");
            }

            String testMovie2 = "Django";
            int index2 = myMovies.findMovie(testMovie2);
            if (index2 != -1) {
                System.out.println(testMovie2 + " is at index " + index2);
            } else {
                System.out.println(testMovie2 + " is not in the list.");
            }
        }
    }