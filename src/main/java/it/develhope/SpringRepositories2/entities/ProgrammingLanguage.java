package it.develhope.SpringRepositories2.entities;

import jakarta.persistence.*;

/**
 * @author Drumstyle92
 * Entity class that represents characteristics of programming languages and maps a table in the mysql database
 */
@Entity
@Table
public class ProgrammingLanguage {

    /**
     * Id variable representing the primary key of the table
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Variable that represents the name of the programming language and maps it to the database as a column
     */
    @Column(nullable = false)
    private String name;

    /**
     * Variable that represents the first appearance
     * of the programming language and maps it to the database as a column
     */
    @Column
    private Integer firstAppearance;

    /**
     * Variable that represents the inventor of the programming language and maps it to the database as a column
     */
    @Column(nullable = false)
    private String inventor;

    /**
     * Default constructor of the class it belongs to
     */
    public ProgrammingLanguage(){}

    /**
     * @param id Programming language id parameter
     * @param name Programming language name parameter
     * @param firstAppearance Parameter first appearance of the programming language
     * @param inventor Parameter inventor of the programming language
     * Parameterized constructor of the class it belongs to
     */
    public ProgrammingLanguage(Long id, String name, Integer firstAppearance, String inventor) {

        this.id = id;
        this.name = name;
        this.firstAppearance = firstAppearance;
        this.inventor = inventor;

    }

    /**
     * @return
     * Method for encapsulation
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     * Method for encapsulation
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return
     * Method for encapsulation
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     * Method for encapsulation
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     * Method for encapsulation
     */
    public Integer getFirstAppearance() {
        return firstAppearance;
    }

    /**
     * @param firstAppearance
     * Method for encapsulation
     */
    public void setFirstAppearance(Integer firstAppearance) {
        this.firstAppearance = firstAppearance;
    }

    /**
     * @return
     * Method for encapsulation
     */
    public String getInventor() {
        return inventor;
    }

    /**
     * @param inventor
     * Method for encapsulation
     */
    public void setInventor(String inventor) {
        this.inventor = inventor;
    }

}