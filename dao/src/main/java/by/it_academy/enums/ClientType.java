package by.it_academy.enums;

public enum ClientType {
    ADMIN("ADMIN"),
    GRAND_USER("GRAND_USER"),
    USER("USER");

    String type;

    ClientType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }


    @Override
    public String toString() {
        return this.type;
    }

    public String getName() {
        return this.name();
    }
}

