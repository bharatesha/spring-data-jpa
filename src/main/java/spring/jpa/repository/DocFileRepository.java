package spring.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import spring.jpa.entity.DocFile;

import java.util.List;

public interface DocFileRepository extends CrudRepository<DocFile, Long> {
    List<String> findXmlFileByTitle(String title);
}
