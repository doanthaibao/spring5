package bao.doan.web.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Store {

  @Autowired
  private Item item;

  public void setItem(Item item) {
    this.item = item;
  }
}
