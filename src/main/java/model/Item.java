package model;

public enum Item {
    MATH("Математика"),
    PHYSICS("Физика"),
    HISTORY("История"),
    ENGLISH("Английский"),
    PROGRAMMING("Программирование");

    private String displayName;

    Item(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
