package spring.jpa.repository;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
@Sql("classpath:testdb.sql")
public class DocFileRepositoryTest {

    @Autowired
    private DocFileRepository docFileRepository;

    @Test
    public void whenDocFileTitleIncorrect_thenNoXmlFiles() {

        List<String> xmlFiles = docFileRepository.findXmlFileByTitle("not exists");

        Assert.isTrue(xmlFiles.size() == 0, "xml files size should be 0");

    }

    @Test
    public void whenDocFileTitle_thenXmlFiles() {

        List<String> xmlFiles = docFileRepository.findXmlFileByTitle("title");

        Assert.isTrue(xmlFiles.size() == 1, "xml files size should be 1");

    }

}
