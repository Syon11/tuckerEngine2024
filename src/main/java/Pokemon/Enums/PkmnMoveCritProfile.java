package Pokemon.Enums;

public enum PkmnMoveCritProfile {
    NORMAL(24),
    HIGH(8),
    VERY_HIGH(2);

    public int denominator;

    PkmnMoveCritProfile(int denominator) {
        this.denominator = denominator;
    }
}
