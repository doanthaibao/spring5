package bao.doan.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: People
 *
 */
@Entity
@Table(name = "People")


public class People implements Serializable {


  private static final long serialVersionUID = 1L;

  public People() {
    super();
  }

  @Id
  @GeneratedValue
  private Long id;

  @Column
  private String name;

  @Column
  private int age;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public Long getId() {
    return id;
  }

}
