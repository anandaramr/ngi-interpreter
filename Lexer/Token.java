package Lexer;

public class Token {
    public TokenType type;
    public String lexeme;

    public Token(TokenType type, String lexeme) {
        this.type = type;
        this.lexeme = lexeme;
    }

    @Override
    public String toString() {
        String quotes = type==TokenType.STRING ? "\"" : "";

        return "( " + type + ", " + quotes + lexeme + quotes + " )";
    }
}
