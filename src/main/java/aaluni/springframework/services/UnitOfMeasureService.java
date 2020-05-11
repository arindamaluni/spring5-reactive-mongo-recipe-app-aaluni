package aaluni.springframework.services;

import java.util.Set;

import aaluni.springframework.commands.UnitOfMeasureCommand;

public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();
}
