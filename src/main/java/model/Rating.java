package model;

public enum Rating {
    A(90, "Отлично"),
    B(75, "Хорошо"),
    C(60, "Удовлетворительно"),
    D(40, "Плохо"),
    F(0, "Неуд");

    private int value;
    private String description;

    Rating(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public static String fromScore(int score) {
        if (score >= 90 && score <= 100 ) {
            return A.description;
        }  else if (score >= 75 && score <= 90 ) {
            return B.description;
        } else if (score >= 60 && score <= 75 ) {
            return C.description;
        } else if (score >= 40 && score <= 60  ) {
            return D.description;
        } else if (score >= 0 && score <= 40  ) {
            return F.description;
        } else {
            return "IllegalArgumentException";
        }
    }

}
