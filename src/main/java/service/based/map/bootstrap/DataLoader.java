package service.based.map.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import service.based.map.model.Owner;
import service.based.map.services.OwnerService;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    public DataLoader(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("ahmet");
        owner1.setLastName("kara");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("mehmet");
        owner2.setLastName("sas");
        ownerService.save(owner2);

        Owner owner3 = new Owner();
        owner3.setId(3L);
        owner3.setFirstName("recep");
        owner3.setLastName("tas");
        ownerService.save(owner3);

    }
}
