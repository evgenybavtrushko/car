package by.it_academy.enums;

public enum OrderStatus {
    NEW("NEW"),
    APPROVED_BY("APPROVED_BY"),
    DENIED("DENIED"),
    ARCHIVE("ARCHIVE");

    String status;

    OrderStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return status;
    }


    @Override
    public String toString() {
        return this.status;
    }

    public String getName() {
        return this.name();
    }
}

