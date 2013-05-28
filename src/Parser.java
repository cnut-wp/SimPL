// Output created by jacc on Tue May 28 13:36:14 CST 2013


import syntax.*;

class Parser implements Tokens {
    private int yyss = 100;
    private int yytok;
    private int yysp = 0;
    private int[] yyst;
    protected int yyerrno = (-1);
    private Object[] yysv;
    private Object yyrv;

    public boolean parse() {
        int yyn = 0;
        yysp = 0;
        yyst = new int[yyss];
        yysv = new Object[yyss];
        yytok = (Interpreter.lexer.token
                 );
    loop:
        for (;;) {
            switch (yyn) {
                case 0:
                    yyst[yysp] = 0;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 16:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 3;
                            continue;
                        case LET:
                            yyn = 4;
                            continue;
                    }
                    yyn = 35;
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 17:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 32;
                            continue;
                    }
                    yyn = 35;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 18:
                    switch (yytok) {
                        case '+':
                            yyn = 5;
                            continue;
                        case '-':
                            yyn = 6;
                            continue;
                        case ENDINPUT:
                            yyn = yyr1();
                            continue;
                    }
                    yyn = 35;
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 19:
                    switch (yytok) {
                        case '-':
                        case '+':
                        case END:
                        case IN:
                        case ENDINPUT:
                            yyn = yyr5();
                            continue;
                    }
                    yyn = 35;
                    continue;

                case 4:
                    yyst[yysp] = 4;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 20:
                    switch (yytok) {
                        case ID:
                            yyn = 7;
                            continue;
                    }
                    yyn = 35;
                    continue;

                case 5:
                    yyst[yysp] = 5;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 21:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 3;
                            continue;
                        case LET:
                            yyn = 4;
                            continue;
                    }
                    yyn = 35;
                    continue;

                case 6:
                    yyst[yysp] = 6;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 22:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 3;
                            continue;
                        case LET:
                            yyn = 4;
                            continue;
                    }
                    yyn = 35;
                    continue;

                case 7:
                    yyst[yysp] = 7;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 23:
                    switch (yytok) {
                        case '=':
                            yyn = 10;
                            continue;
                    }
                    yyn = 35;
                    continue;

                case 8:
                    yyst[yysp] = 8;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 24:
                    switch (yytok) {
                        case '-':
                        case '+':
                        case END:
                        case IN:
                        case ENDINPUT:
                            yyn = yyr3();
                            continue;
                    }
                    yyn = 35;
                    continue;

                case 9:
                    yyst[yysp] = 9;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 25:
                    switch (yytok) {
                        case '-':
                        case '+':
                        case END:
                        case IN:
                        case ENDINPUT:
                            yyn = yyr4();
                            continue;
                    }
                    yyn = 35;
                    continue;

                case 10:
                    yyst[yysp] = 10;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 26:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 3;
                            continue;
                        case LET:
                            yyn = 4;
                            continue;
                    }
                    yyn = 35;
                    continue;

                case 11:
                    yyst[yysp] = 11;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 27:
                    switch (yytok) {
                        case '+':
                            yyn = 5;
                            continue;
                        case '-':
                            yyn = 6;
                            continue;
                        case IN:
                            yyn = 12;
                            continue;
                    }
                    yyn = 35;
                    continue;

                case 12:
                    yyst[yysp] = 12;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 28:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 3;
                            continue;
                        case LET:
                            yyn = 4;
                            continue;
                    }
                    yyn = 35;
                    continue;

                case 13:
                    yyst[yysp] = 13;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 29:
                    switch (yytok) {
                        case END:
                            yyn = 15;
                            continue;
                    }
                    yyn = 35;
                    continue;

                case 14:
                    yyst[yysp] = 14;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 30:
                    switch (yytok) {
                        case '+':
                            yyn = 5;
                            continue;
                        case '-':
                            yyn = 6;
                            continue;
                        case END:
                            yyn = yyr6();
                            continue;
                    }
                    yyn = 35;
                    continue;

                case 15:
                    yyst[yysp] = 15;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 31:
                    switch (yytok) {
                        case '-':
                        case '+':
                        case END:
                        case IN:
                        case ENDINPUT:
                            yyn = yyr2();
                            continue;
                    }
                    yyn = 35;
                    continue;

                case 32:
                    return true;
                case 33:
                    yyerror("stack overflow");
                case 34:
                    return false;
                case 35:
                    yyerror("syntax error");
                    return false;
            }
        }
    }

    protected void yyexpand() {
        int[] newyyst = new int[2*yyst.length];
        Object[] newyysv = new Object[2*yyst.length];
        for (int i=0; i<yyst.length; i++) {
            newyyst[i] = yyst[i];
            newyysv[i] = yysv[i];
        }
        yyst = newyyst;
        yysv = newyysv;
    }

    private int yyr1() { // prog : expr
        { System.out.println(yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return 1;
    }

    private int yyr6() { // expseq : expr
        {yyrv=yysv[yysp-1];}
        yysv[yysp-=1] = yyrv;
        return 13;
    }

    private int yyr2() { // expr : LET ID '=' expr IN expseq END
        { yyrv = new LetInEnd(new Variable(yysv[yysp-6]),yysv[yysp-4],yysv[yysp-2]);}
        yysv[yysp-=7] = yyrv;
        return yypexpr();
    }

    private int yyr3() { // expr : expr '+' expr
        { yyrv = new BinaryOperation(yysv[yysp-3], BinaryOperation.BinaryOperator.plus , yysv[yysp-1]);}
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr4() { // expr : expr '-' expr
        { yyrv = new BinaryOperation(yysv[yysp-3], BinaryOperation.BinaryOperator.minus, yysv[yysp-1]);}
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr5() { // expr : INTEGER
        {yyrv = new IntValue(yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return yypexpr();
    }

    private int yypexpr() {
        switch (yyst[yysp-1]) {
            case 10: return 11;
            case 6: return 9;
            case 5: return 8;
            case 0: return 2;
            default: return 14;
        }
    }

    protected String[] yyerrmsgs = {
    };


private void yyerror(String msg) {
        System.out.println(msg);
        System.exit(1);
}

}
