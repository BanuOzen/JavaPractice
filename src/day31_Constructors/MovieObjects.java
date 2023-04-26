package day31_Constructors;

public class MovieObjects {
    public static void main(String[] args) {
        String gene = "Adventure, Comedy, Thriller";
        String title = "Journey to SDET: Cydeo Batch 25";
        String[] casts = {"Asiye", "Adam", "Muhtar", "Akbar", "Gurhan", "Saim", "Murodil", "Nadir", "Guljannet"};

        Movie movie1 = new Movie("USA", title, "Adventure", "10/25/2021","Kuzzat Altay");
        movie1.addCasts(casts);
        System.out.println(movie1);
    }
}
