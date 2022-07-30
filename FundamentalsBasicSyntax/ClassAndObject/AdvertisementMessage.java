package FundamentalsBasicSyntax.ClassAndObject;

import java.util.*;

public class AdvertisementMessage {

    static class Advertisement {
        private String phrases;
        private String events;
        private String authors;
        private String cities;

/*        Advertisement() {

        }*/

        Advertisement(String phrases, String events, String authors, String cities) {
            this.phrases = phrases;
            this.events = events;
            this.authors = authors;
            this.cities = cities;
        }

        String getInfo() {
            return String.format("%s %s %s - %s", this.phrases, this.events, this.authors, this.cities);
        }

        String getPhrases(List<String> phrases) {
            return phrases.get(new Random().nextInt(phrases.size()));
        }

        String getEvents(List<String> events) {
            return events.get(new Random().nextInt(events.size()));
        }

        String getAuthors(List<String> authors) {
            return authors.get(new Random().nextInt(authors.size()));
        }

        String getCities(List<String> cities) {
            return cities.get(new Random().nextInt(cities.size()));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> phrases = new ArrayList<>(Arrays.asList("Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."));
        List<String> events = new ArrayList<>(Arrays.asList("Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"));
        List<String> authors = new ArrayList<>(Arrays.asList("Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"));
        List<String> cities = new ArrayList<>(Arrays.asList("Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"));


        int count = Integer.parseInt(scanner.nextLine());
        Random rnd = new Random();
        for (int i = 0; i < count; i++) {
/*            Advertisement advert = new Advertisement();
            advert = new Advertisement(advert.getPhrases(phrases),
                                        advert.getEvents(events),
                                        advert.getAuthors(authors),
                                        advert.getCities(cities));
            System.out.println(advert.getInfo());*/

            System.out.printf("%s %s %s - %s.%n",phrases.get(rnd.nextInt(phrases.size())),
                                                events.get(rnd.nextInt(events.size())),
                                                authors.get(rnd.nextInt(authors.size())),
                                                cities.get(rnd.nextInt(cities.size())));
        }
    }
}
