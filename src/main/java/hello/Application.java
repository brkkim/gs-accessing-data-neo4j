package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@SpringBootApplication
@EnableNeo4jRepositories
public class Application {

    private final static Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

    /**
    @Bean
    CommandLineRunner demo(PersonRepository personRepository) {
        return args -> {
            personRepository.deleteAll();

            Person greg = new Person("Greg","Norman");
            Person rory = new Person("Rory", "McIlroy");
            Person craig = new Person("Craig", "Stadler");

            List<Person> team = Arrays.asList(greg, rory, craig);

            log.info("Before linking up with Neo4j...");

            team.stream().forEach(person -> log.info("\t" + person.toString()));

            personRepository.save(greg);
            personRepository.save(rory);
            personRepository.save(craig);

            List<Person> gregList = personRepository.findByFirstName(greg.getFirstName());
            gregList.get(0).worksWith(rory);
            gregList.get(0).worksWith(craig);
            personRepository.save(gregList.get(0));

            List<Person> roryList = personRepository.findByFirstName(rory.getFirstName());
            roryList.get(0).worksWith(craig);
            // We already know that roy works with greg
            personRepository.save(roryList.get(0));

            // We already know craig works with roy and greg
            log.info("Looking each person by name...");
            team.stream().forEach(person -> log.info("\t" + personRepository.findByFirstName(person.getFirstName()).toString()));
        };
    }
    **/
}
