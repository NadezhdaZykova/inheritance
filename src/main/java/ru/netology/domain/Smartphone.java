package ru.netology.domain;

import java.util.Objects;

public class Smartphone extends Product {
  private String manufacturer;


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    Smartphone that = (Smartphone) o;
    return manufacturer.equals(that.manufacturer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode());
  }
}
