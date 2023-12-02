public enum Operation {
    ADD("Сложение",1),
    SUBTRACT("Вычитание",2),
    MULTIPLY("Умножение",3);
    private String value;
    private int numberOperation;

     Operation(String value, int numberOperation) {
        this.value = value;
        this.numberOperation = numberOperation;
    }

    public int getValue() {
        return numberOperation;
    }
}
