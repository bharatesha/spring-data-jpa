package spring.jpa.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
@Getter
@Entity
@Table(name = "FIN.DOC_FILE")
public class DocFile {

    @Id
    private Long id;
    private String title;
    private String xmlFile;

}
