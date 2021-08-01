package collection.list.classesForTest;

public class Phone {
  private String name;
  private String IMEI;

  public Phone(String name, String IMEI) {
    this.name = name;
    this.IMEI = IMEI;
  }

  @Override
  public int hashCode () {
    return IMEI != null ? IMEI.hashCode() : 1;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) return  false;
    if (this == obj) return  true;
    if (this.getClass() != obj.getClass()) return  false;

    Phone otherPhone = (Phone) obj;

    return  IMEI != null && IMEI.equals(otherPhone.getIMEI());
  }

  @Override
  public String toString() {
    return String.format("Phone ( name: %s - IMEI: %s )", name, IMEI);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getIMEI() {
    return IMEI;
  }

  public void setIMEI(String IMEI) {
    this.IMEI = IMEI;
  }
}
