package test.Lesson15.enums;

public enum Colors {
    BLACK("Черный","5"),
    WHITE("Белый", "9"),
    YELLOW("Желтый","7");

    private String colorName;
    private String codeRGB;

    //Конструктор enum (включает два элемента) (Какой конструктор был в DayOfWeek? (конструктор по умолчанию))
    private Colors (String colorName, String codeRGB){
        this.colorName = colorName;
        this.codeRGB = codeRGB;
    }

    //Добавили геттеры для переменных
    public String getColorName() {
        return colorName;
    }
    public String getCodeRGB() {
        return codeRGB;
    }
}
