// Output created by jacc on Tue May 28 15:45:00 CST 2013


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
                case 36:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 3;
                            continue;
                        case LET:
                            yyn = 4;
                            continue;
                        case NOT:
                            yyn = 5;
                            continue;
                        case UMINUS:
                            yyn = 6;
                            continue;
                    }
                    yyn = 75;
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 37:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 72;
                            continue;
                    }
                    yyn = 75;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 38:
                    yyn = yys2();
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
                case 39:
                    yyn = yys3();
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
                case 40:
                    switch (yytok) {
                        case ID:
                            yyn = 16;
                            continue;
                    }
                    yyn = 75;
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
                case 41:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 3;
                            continue;
                        case LET:
                            yyn = 4;
                            continue;
                        case NOT:
                            yyn = 5;
                            continue;
                        case UMINUS:
                            yyn = 6;
                            continue;
                    }
                    yyn = 75;
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
                case 42:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 3;
                            continue;
                        case LET:
                            yyn = 4;
                            continue;
                        case NOT:
                            yyn = 5;
                            continue;
                        case UMINUS:
                            yyn = 6;
                            continue;
                    }
                    yyn = 75;
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
                case 43:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 3;
                            continue;
                        case LET:
                            yyn = 4;
                            continue;
                        case NOT:
                            yyn = 5;
                            continue;
                        case UMINUS:
                            yyn = 6;
                            continue;
                    }
                    yyn = 75;
                    continue;

                case 8:
                    yyst[yysp] = 8;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 44:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 3;
                            continue;
                        case LET:
                            yyn = 4;
                            continue;
                        case NOT:
                            yyn = 5;
                            continue;
                        case UMINUS:
                            yyn = 6;
                            continue;
                    }
                    yyn = 75;
                    continue;

                case 9:
                    yyst[yysp] = 9;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 45:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 3;
                            continue;
                        case LET:
                            yyn = 4;
                            continue;
                        case NOT:
                            yyn = 5;
                            continue;
                        case UMINUS:
                            yyn = 6;
                            continue;
                    }
                    yyn = 75;
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
                case 46:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 3;
                            continue;
                        case LET:
                            yyn = 4;
                            continue;
                        case NOT:
                            yyn = 5;
                            continue;
                        case UMINUS:
                            yyn = 6;
                            continue;
                    }
                    yyn = 75;
                    continue;

                case 11:
                    yyst[yysp] = 11;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 47:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 3;
                            continue;
                        case LET:
                            yyn = 4;
                            continue;
                        case NOT:
                            yyn = 5;
                            continue;
                        case UMINUS:
                            yyn = 6;
                            continue;
                    }
                    yyn = 75;
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
                case 48:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 3;
                            continue;
                        case LET:
                            yyn = 4;
                            continue;
                        case NOT:
                            yyn = 5;
                            continue;
                        case UMINUS:
                            yyn = 6;
                            continue;
                    }
                    yyn = 75;
                    continue;

                case 13:
                    yyst[yysp] = 13;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 49:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 3;
                            continue;
                        case LET:
                            yyn = 4;
                            continue;
                        case NOT:
                            yyn = 5;
                            continue;
                        case UMINUS:
                            yyn = 6;
                            continue;
                    }
                    yyn = 75;
                    continue;

                case 14:
                    yyst[yysp] = 14;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 50:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 3;
                            continue;
                        case LET:
                            yyn = 4;
                            continue;
                        case NOT:
                            yyn = 5;
                            continue;
                        case UMINUS:
                            yyn = 6;
                            continue;
                    }
                    yyn = 75;
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
                case 51:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 3;
                            continue;
                        case LET:
                            yyn = 4;
                            continue;
                        case NOT:
                            yyn = 5;
                            continue;
                        case UMINUS:
                            yyn = 6;
                            continue;
                    }
                    yyn = 75;
                    continue;

                case 16:
                    yyst[yysp] = 16;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 52:
                    switch (yytok) {
                        case EQ:
                            yyn = 28;
                            continue;
                    }
                    yyn = 75;
                    continue;

                case 17:
                    yyst[yysp] = 17;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 53:
                    yyn = yys17();
                    continue;

                case 18:
                    yyst[yysp] = 18;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 54:
                    yyn = yys18();
                    continue;

                case 19:
                    yyst[yysp] = 19;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 55:
                    yyn = yys19();
                    continue;

                case 20:
                    yyst[yysp] = 20;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 56:
                    yyn = yys20();
                    continue;

                case 21:
                    yyst[yysp] = 21;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 57:
                    yyn = yys21();
                    continue;

                case 22:
                    yyst[yysp] = 22;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 58:
                    yyn = yys22();
                    continue;

                case 23:
                    yyst[yysp] = 23;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 59:
                    yyn = yys23();
                    continue;

                case 24:
                    yyst[yysp] = 24;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 60:
                    yyn = yys24();
                    continue;

                case 25:
                    yyst[yysp] = 25;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 61:
                    yyn = yys25();
                    continue;

                case 26:
                    yyst[yysp] = 26;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 62:
                    yyn = yys26();
                    continue;

                case 27:
                    yyst[yysp] = 27;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 63:
                    yyn = yys27();
                    continue;

                case 28:
                    yyst[yysp] = 28;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 64:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 3;
                            continue;
                        case LET:
                            yyn = 4;
                            continue;
                        case NOT:
                            yyn = 5;
                            continue;
                        case UMINUS:
                            yyn = 6;
                            continue;
                    }
                    yyn = 75;
                    continue;

                case 29:
                    yyst[yysp] = 29;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 65:
                    yyn = yys29();
                    continue;

                case 30:
                    yyst[yysp] = 30;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 66:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 3;
                            continue;
                        case LET:
                            yyn = 4;
                            continue;
                        case NOT:
                            yyn = 5;
                            continue;
                        case UMINUS:
                            yyn = 6;
                            continue;
                    }
                    yyn = 75;
                    continue;

                case 31:
                    yyst[yysp] = 31;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 67:
                    switch (yytok) {
                        case END:
                            yyn = 33;
                            continue;
                    }
                    yyn = 75;
                    continue;

                case 32:
                    yyst[yysp] = 32;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 68:
                    yyn = yys32();
                    continue;

                case 33:
                    yyst[yysp] = 33;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 69:
                    yyn = yys33();
                    continue;

                case 34:
                    yyst[yysp] = 34;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 70:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 3;
                            continue;
                        case LET:
                            yyn = 4;
                            continue;
                        case NOT:
                            yyn = 5;
                            continue;
                        case UMINUS:
                            yyn = 6;
                            continue;
                    }
                    yyn = 75;
                    continue;

                case 35:
                    yyst[yysp] = 35;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 71:
                    switch (yytok) {
                        case END:
                            yyn = yyr16();
                            continue;
                    }
                    yyn = 75;
                    continue;

                case 72:
                    return true;
                case 73:
                    yyerror("stack overflow");
                case 74:
                    return false;
                case 75:
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

    private int yys2() {
        switch (yytok) {
            case AND:
                return 7;
            case DEVIDE:
                return 8;
            case EQ:
                return 9;
            case GT:
                return 10;
            case LT:
                return 11;
            case MINUS:
                return 12;
            case OR:
                return 13;
            case PLUS:
                return 14;
            case TIMES:
                return 15;
            case ENDINPUT:
                return yyr1();
        }
        return 75;
    }

    private int yys3() {
        switch (yytok) {
            case SEMICOLON:
            case PLUS:
            case OR:
            case GT:
            case MINUS:
            case DEVIDE:
            case LT:
            case EQ:
            case ENDINPUT:
            case END:
            case TIMES:
            case IN:
            case AND:
                return yyr12();
        }
        return 75;
    }

    private int yys17() {
        switch (yytok) {
            case SEMICOLON:
            case PLUS:
            case OR:
            case GT:
            case MINUS:
            case DEVIDE:
            case LT:
            case EQ:
            case ENDINPUT:
            case END:
            case TIMES:
            case IN:
            case AND:
                return yyr14();
        }
        return 75;
    }

    private int yys18() {
        switch (yytok) {
            case SEMICOLON:
            case PLUS:
            case OR:
            case GT:
            case MINUS:
            case DEVIDE:
            case LT:
            case EQ:
            case ENDINPUT:
            case END:
            case TIMES:
            case IN:
            case AND:
                return yyr13();
        }
        return 75;
    }

    private int yys19() {
        switch (yytok) {
            case DEVIDE:
                return 8;
            case EQ:
                return 9;
            case GT:
                return 10;
            case LT:
                return 11;
            case MINUS:
                return 12;
            case PLUS:
                return 14;
            case TIMES:
                return 15;
            case SEMICOLON:
            case OR:
            case ENDINPUT:
            case END:
            case IN:
            case AND:
                return yyr10();
        }
        return 75;
    }

    private int yys20() {
        switch (yytok) {
            case SEMICOLON:
            case PLUS:
            case OR:
            case GT:
            case MINUS:
            case DEVIDE:
            case LT:
            case EQ:
            case ENDINPUT:
            case END:
            case TIMES:
            case IN:
            case AND:
                return yyr6();
        }
        return 75;
    }

    private int yys21() {
        switch (yytok) {
            case DEVIDE:
                return 8;
            case MINUS:
                return 12;
            case PLUS:
                return 14;
            case TIMES:
                return 15;
            case SEMICOLON:
            case OR:
            case GT:
            case LT:
            case EQ:
            case ENDINPUT:
            case END:
            case IN:
            case AND:
                return yyr9();
        }
        return 75;
    }

    private int yys22() {
        switch (yytok) {
            case DEVIDE:
                return 8;
            case MINUS:
                return 12;
            case PLUS:
                return 14;
            case TIMES:
                return 15;
            case SEMICOLON:
            case OR:
            case GT:
            case LT:
            case EQ:
            case ENDINPUT:
            case END:
            case IN:
            case AND:
                return yyr7();
        }
        return 75;
    }

    private int yys23() {
        switch (yytok) {
            case DEVIDE:
                return 8;
            case MINUS:
                return 12;
            case PLUS:
                return 14;
            case TIMES:
                return 15;
            case SEMICOLON:
            case OR:
            case GT:
            case LT:
            case EQ:
            case ENDINPUT:
            case END:
            case IN:
            case AND:
                return yyr8();
        }
        return 75;
    }

    private int yys24() {
        switch (yytok) {
            case DEVIDE:
                return 8;
            case TIMES:
                return 15;
            case SEMICOLON:
            case PLUS:
            case OR:
            case GT:
            case MINUS:
            case LT:
            case EQ:
            case ENDINPUT:
            case END:
            case IN:
            case AND:
                return yyr4();
        }
        return 75;
    }

    private int yys25() {
        switch (yytok) {
            case DEVIDE:
                return 8;
            case EQ:
                return 9;
            case GT:
                return 10;
            case LT:
                return 11;
            case MINUS:
                return 12;
            case PLUS:
                return 14;
            case TIMES:
                return 15;
            case SEMICOLON:
            case OR:
            case ENDINPUT:
            case END:
            case IN:
            case AND:
                return yyr11();
        }
        return 75;
    }

    private int yys26() {
        switch (yytok) {
            case DEVIDE:
                return 8;
            case TIMES:
                return 15;
            case SEMICOLON:
            case PLUS:
            case OR:
            case GT:
            case MINUS:
            case LT:
            case EQ:
            case ENDINPUT:
            case END:
            case IN:
            case AND:
                return yyr3();
        }
        return 75;
    }

    private int yys27() {
        switch (yytok) {
            case SEMICOLON:
            case PLUS:
            case OR:
            case GT:
            case MINUS:
            case DEVIDE:
            case LT:
            case EQ:
            case ENDINPUT:
            case END:
            case TIMES:
            case IN:
            case AND:
                return yyr5();
        }
        return 75;
    }

    private int yys29() {
        switch (yytok) {
            case AND:
                return 7;
            case DEVIDE:
                return 8;
            case EQ:
                return 9;
            case GT:
                return 10;
            case LT:
                return 11;
            case MINUS:
                return 12;
            case OR:
                return 13;
            case PLUS:
                return 14;
            case TIMES:
                return 15;
            case IN:
                return 30;
        }
        return 75;
    }

    private int yys32() {
        switch (yytok) {
            case AND:
                return 7;
            case DEVIDE:
                return 8;
            case EQ:
                return 9;
            case GT:
                return 10;
            case LT:
                return 11;
            case MINUS:
                return 12;
            case OR:
                return 13;
            case PLUS:
                return 14;
            case TIMES:
                return 15;
            case SEMICOLON:
                return 34;
            case END:
                return yyr15();
        }
        return 75;
    }

    private int yys33() {
        switch (yytok) {
            case SEMICOLON:
            case PLUS:
            case OR:
            case GT:
            case MINUS:
            case DEVIDE:
            case LT:
            case EQ:
            case ENDINPUT:
            case END:
            case TIMES:
            case IN:
            case AND:
                return yyr2();
        }
        return 75;
    }

    private int yyr1() { // prog : expr
        { System.out.println(((Expression)yysv[yysp-1]).eval()); }
        yysv[yysp-=1] = yyrv;
        return 1;
    }

    private int yyr15() { // expseq : expr
        {yyrv=yysv[yysp-1];}
        yysv[yysp-=1] = yyrv;
        return yypexpseq();
    }

    private int yyr16() { // expseq : expr SEMICOLON expseq
        {yyrv = new Sequence(yysv[yysp-3],yysv[yysp-1]);}
        yysv[yysp-=3] = yyrv;
        return yypexpseq();
    }

    private int yypexpseq() {
        switch (yyst[yysp-1]) {
            case 30: return 31;
            default: return 35;
        }
    }

    private int yyr2() { // expr : LET ID EQ expr IN expseq END
        { yyrv = new LetInEnd(new Variable(yysv[yysp-6]),yysv[yysp-4],yysv[yysp-2]);}
        yysv[yysp-=7] = yyrv;
        return yypexpr();
    }

    private int yyr3() { // expr : expr PLUS expr
        { yyrv = new BinaryOperation(yysv[yysp-3], BinaryOperation.BinaryOperator.plus , yysv[yysp-1]);}
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr4() { // expr : expr MINUS expr
        { yyrv = new BinaryOperation(yysv[yysp-3], BinaryOperation.BinaryOperator.minus, yysv[yysp-1]);}
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr5() { // expr : expr TIMES expr
        { yyrv = new BinaryOperation(yysv[yysp-3], BinaryOperation.BinaryOperator.times, yysv[yysp-1]);}
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr6() { // expr : expr DEVIDE expr
        { yyrv = new BinaryOperation(yysv[yysp-3], BinaryOperation.BinaryOperator.devide, yysv[yysp-1]);}
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr7() { // expr : expr GT expr
        { yyrv = new BinaryOperation(yysv[yysp-3], BinaryOperation.BinaryOperator.biggerThan, yysv[yysp-1]);}
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr8() { // expr : expr LT expr
        { yyrv = new BinaryOperation(yysv[yysp-3], BinaryOperation.BinaryOperator.lessThan, yysv[yysp-1]);}
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr9() { // expr : expr EQ expr
        { yyrv = new BinaryOperation(yysv[yysp-3], BinaryOperation.BinaryOperator.equal, yysv[yysp-1]);}
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr10() { // expr : expr AND expr
        { yyrv = new BinaryOperation(yysv[yysp-3], BinaryOperation.BinaryOperator.and, yysv[yysp-1]);}
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr11() { // expr : expr OR expr
        { yyrv = new BinaryOperation(yysv[yysp-3], BinaryOperation.BinaryOperator.or, yysv[yysp-1]);}
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr12() { // expr : INTEGER
        {yyrv = new IntValue(yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return yypexpr();
    }

    private int yyr13() { // expr : UMINUS expr
        {yyrv = new UnaryOperation(UnaryOperation.UnaryOperator.negative, yysv[yysp-1]);}
        yysv[yysp-=2] = yyrv;
        return yypexpr();
    }

    private int yyr14() { // expr : NOT expr
        {yyrv = new UnaryOperation(UnaryOperation.UnaryOperator.not, yysv[yysp-1]);}
        yysv[yysp-=2] = yyrv;
        return yypexpr();
    }

    private int yypexpr() {
        switch (yyst[yysp-1]) {
            case 28: return 29;
            case 15: return 27;
            case 14: return 26;
            case 13: return 25;
            case 12: return 24;
            case 11: return 23;
            case 10: return 22;
            case 9: return 21;
            case 8: return 20;
            case 7: return 19;
            case 6: return 18;
            case 5: return 17;
            case 0: return 2;
            default: return 32;
        }
    }

    protected String[] yyerrmsgs = {
    };


private void yyerror(String msg) {
        System.out.println(msg);
        System.exit(1);
}

}
