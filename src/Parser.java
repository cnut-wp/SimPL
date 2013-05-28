// Output created by jacc on Tue May 28 14:26:40 CST 2013


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
                case 32:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 3;
                            continue;
                        case LET:
                            yyn = 4;
                            continue;
                        case UMINUS:
                            yyn = 5;
                            continue;
                    }
                    yyn = 67;
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 33:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 64;
                            continue;
                    }
                    yyn = 67;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 34:
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
                case 35:
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
                case 36:
                    switch (yytok) {
                        case ID:
                            yyn = 15;
                            continue;
                    }
                    yyn = 67;
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
                case 37:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 3;
                            continue;
                        case LET:
                            yyn = 4;
                            continue;
                        case UMINUS:
                            yyn = 5;
                            continue;
                    }
                    yyn = 67;
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
                case 38:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 3;
                            continue;
                        case LET:
                            yyn = 4;
                            continue;
                        case UMINUS:
                            yyn = 5;
                            continue;
                    }
                    yyn = 67;
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
                case 39:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 3;
                            continue;
                        case LET:
                            yyn = 4;
                            continue;
                        case UMINUS:
                            yyn = 5;
                            continue;
                    }
                    yyn = 67;
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
                case 40:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 3;
                            continue;
                        case LET:
                            yyn = 4;
                            continue;
                        case UMINUS:
                            yyn = 5;
                            continue;
                    }
                    yyn = 67;
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
                case 41:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 3;
                            continue;
                        case LET:
                            yyn = 4;
                            continue;
                        case UMINUS:
                            yyn = 5;
                            continue;
                    }
                    yyn = 67;
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
                case 42:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 3;
                            continue;
                        case LET:
                            yyn = 4;
                            continue;
                        case UMINUS:
                            yyn = 5;
                            continue;
                    }
                    yyn = 67;
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
                case 43:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 3;
                            continue;
                        case LET:
                            yyn = 4;
                            continue;
                        case UMINUS:
                            yyn = 5;
                            continue;
                    }
                    yyn = 67;
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
                case 44:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 3;
                            continue;
                        case LET:
                            yyn = 4;
                            continue;
                        case UMINUS:
                            yyn = 5;
                            continue;
                    }
                    yyn = 67;
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
                case 45:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 3;
                            continue;
                        case LET:
                            yyn = 4;
                            continue;
                        case UMINUS:
                            yyn = 5;
                            continue;
                    }
                    yyn = 67;
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
                case 46:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 3;
                            continue;
                        case LET:
                            yyn = 4;
                            continue;
                        case UMINUS:
                            yyn = 5;
                            continue;
                    }
                    yyn = 67;
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
                case 47:
                    switch (yytok) {
                        case EQ:
                            yyn = 26;
                            continue;
                    }
                    yyn = 67;
                    continue;

                case 16:
                    yyst[yysp] = 16;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 48:
                    yyn = yys16();
                    continue;

                case 17:
                    yyst[yysp] = 17;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 49:
                    yyn = yys17();
                    continue;

                case 18:
                    yyst[yysp] = 18;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 50:
                    yyn = yys18();
                    continue;

                case 19:
                    yyst[yysp] = 19;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 51:
                    yyn = yys19();
                    continue;

                case 20:
                    yyst[yysp] = 20;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 52:
                    yyn = yys20();
                    continue;

                case 21:
                    yyst[yysp] = 21;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 53:
                    yyn = yys21();
                    continue;

                case 22:
                    yyst[yysp] = 22;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 54:
                    yyn = yys22();
                    continue;

                case 23:
                    yyst[yysp] = 23;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 55:
                    yyn = yys23();
                    continue;

                case 24:
                    yyst[yysp] = 24;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 56:
                    yyn = yys24();
                    continue;

                case 25:
                    yyst[yysp] = 25;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 57:
                    yyn = yys25();
                    continue;

                case 26:
                    yyst[yysp] = 26;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 58:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 3;
                            continue;
                        case LET:
                            yyn = 4;
                            continue;
                        case UMINUS:
                            yyn = 5;
                            continue;
                    }
                    yyn = 67;
                    continue;

                case 27:
                    yyst[yysp] = 27;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 59:
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
                case 60:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 3;
                            continue;
                        case LET:
                            yyn = 4;
                            continue;
                        case UMINUS:
                            yyn = 5;
                            continue;
                    }
                    yyn = 67;
                    continue;

                case 29:
                    yyst[yysp] = 29;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 61:
                    switch (yytok) {
                        case END:
                            yyn = 31;
                            continue;
                    }
                    yyn = 67;
                    continue;

                case 30:
                    yyst[yysp] = 30;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 62:
                    yyn = yys30();
                    continue;

                case 31:
                    yyst[yysp] = 31;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 63:
                    yyn = yys31();
                    continue;

                case 64:
                    return true;
                case 65:
                    yyerror("stack overflow");
                case 66:
                    return false;
                case 67:
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
                return 6;
            case DEVIDE:
                return 7;
            case EQ:
                return 8;
            case GT:
                return 9;
            case LT:
                return 10;
            case MINUS:
                return 11;
            case OR:
                return 12;
            case PLUS:
                return 13;
            case TIMES:
                return 14;
            case ENDINPUT:
                return yyr1();
        }
        return 67;
    }

    private int yys3() {
        switch (yytok) {
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
        return 67;
    }

    private int yys16() {
        switch (yytok) {
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
        return 67;
    }

    private int yys17() {
        switch (yytok) {
            case DEVIDE:
                return 7;
            case EQ:
                return 8;
            case GT:
                return 9;
            case LT:
                return 10;
            case MINUS:
                return 11;
            case PLUS:
                return 13;
            case TIMES:
                return 14;
            case OR:
            case ENDINPUT:
            case END:
            case IN:
            case AND:
                return yyr10();
        }
        return 67;
    }

    private int yys18() {
        switch (yytok) {
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
        return 67;
    }

    private int yys19() {
        switch (yytok) {
            case DEVIDE:
                return 7;
            case MINUS:
                return 11;
            case PLUS:
                return 13;
            case TIMES:
                return 14;
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
        return 67;
    }

    private int yys20() {
        switch (yytok) {
            case DEVIDE:
                return 7;
            case MINUS:
                return 11;
            case PLUS:
                return 13;
            case TIMES:
                return 14;
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
        return 67;
    }

    private int yys21() {
        switch (yytok) {
            case DEVIDE:
                return 7;
            case MINUS:
                return 11;
            case PLUS:
                return 13;
            case TIMES:
                return 14;
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
        return 67;
    }

    private int yys22() {
        switch (yytok) {
            case DEVIDE:
                return 7;
            case TIMES:
                return 14;
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
        return 67;
    }

    private int yys23() {
        switch (yytok) {
            case AND:
                return 6;
            case DEVIDE:
                return 7;
            case EQ:
                return 8;
            case GT:
                return 9;
            case LT:
                return 10;
            case MINUS:
                return 11;
            case PLUS:
                return 13;
            case TIMES:
                return 14;
            case OR:
            case ENDINPUT:
            case END:
            case IN:
                return yyr11();
        }
        return 67;
    }

    private int yys24() {
        switch (yytok) {
            case DEVIDE:
                return 7;
            case TIMES:
                return 14;
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
        return 67;
    }

    private int yys25() {
        switch (yytok) {
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
        return 67;
    }

    private int yys27() {
        switch (yytok) {
            case AND:
                return 6;
            case DEVIDE:
                return 7;
            case EQ:
                return 8;
            case GT:
                return 9;
            case LT:
                return 10;
            case MINUS:
                return 11;
            case OR:
                return 12;
            case PLUS:
                return 13;
            case TIMES:
                return 14;
            case IN:
                return 28;
        }
        return 67;
    }

    private int yys30() {
        switch (yytok) {
            case AND:
                return 6;
            case DEVIDE:
                return 7;
            case EQ:
                return 8;
            case GT:
                return 9;
            case LT:
                return 10;
            case MINUS:
                return 11;
            case OR:
                return 12;
            case PLUS:
                return 13;
            case TIMES:
                return 14;
            case END:
                return yyr14();
        }
        return 67;
    }

    private int yys31() {
        switch (yytok) {
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
        return 67;
    }

    private int yyr1() { // prog : expr
        { System.out.println(yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return 1;
    }

    private int yyr14() { // expseq : expr
        {yyrv=yysv[yysp-1];}
        yysv[yysp-=1] = yyrv;
        return 29;
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

    private int yypexpr() {
        switch (yyst[yysp-1]) {
            case 26: return 27;
            case 14: return 25;
            case 13: return 24;
            case 12: return 23;
            case 11: return 22;
            case 10: return 21;
            case 9: return 20;
            case 8: return 19;
            case 7: return 18;
            case 6: return 17;
            case 5: return 16;
            case 0: return 2;
            default: return 30;
        }
    }

    protected String[] yyerrmsgs = {
    };


private void yyerror(String msg) {
        System.out.println(msg);
        System.exit(1);
}

}
