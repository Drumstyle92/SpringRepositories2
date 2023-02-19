package it.develhope.SpringRepositories2.repositories;

import it.develhope.SpringRepositories2.entities.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author Drumstyle92
 * Repository interface that extends another interface
 * such that through the referenced entity it automates the CRUD of API calls
 */
@RepositoryRestResource(path = "repo-prog-languages",
                        collectionResourceDescription = @Description("Repository for programming languages"))
public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage,Long> {

}
