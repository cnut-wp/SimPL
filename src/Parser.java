// Output created by jacc on Wed May 29 15:23:16 CST 2013


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
                case 52:
                    yyn = yys0();
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 53:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 104;
                            continue;
                    }
                    yyn = 107;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 54:
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
                case 55:
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
                case 56:
                    yyn = yys4();
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
                case 57:
                    yyn = yys5();
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
                case 58:
                    yyn = yys6();
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
                case 59:
                    switch (yytok) {
                        case ID:
                            yyn = 22;
                            continue;
                    }
                    yyn = 107;
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
                case 60:
                    yyn = yys8();
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
                case 61:
                    yyn = yys9();
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
                case 62:
                    yyn = yys10();
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
                case 63:
                    yyn = yys11();
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
                case 64:
                    yyn = yys12();
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
                case 65:
                    yyn = yys13();
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
                case 66:
                    yyn = yys14();
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
                case 67:
                    yyn = yys15();
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
                case 68:
                    yyn = yys16();
                    continue;

                case 17:
                    yyst[yysp] = 17;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 69:
                    yyn = yys17();
                    continue;

                case 18:
                    yyst[yysp] = 18;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 70:
                    yyn = yys18();
                    continue;

                case 19:
                    yyst[yysp] = 19;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 71:
                    yyn = yys19();
                    continue;

                case 20:
                    yyst[yysp] = 20;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 72:
                    yyn = yys20();
                    continue;

                case 21:
                    yyst[yysp] = 21;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 73:
                    yyn = yys21();
                    continue;

                case 22:
                    yyst[yysp] = 22;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 74:
                    switch (yytok) {
                        case EQ:
                            yyn = 37;
                            continue;
                    }
                    yyn = 107;
                    continue;

                case 23:
                    yyst[yysp] = 23;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 75:
                    yyn = yys23();
                    continue;

                case 24:
                    yyst[yysp] = 24;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 76:
                    yyn = yys24();
                    continue;

                case 25:
                    yyst[yysp] = 25;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 77:
                    yyn = yys25();
                    continue;

                case 26:
                    yyst[yysp] = 26;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 78:
                    yyn = yys26();
                    continue;

                case 27:
                    yyst[yysp] = 27;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 79:
                    yyn = yys27();
                    continue;

                case 28:
                    yyst[yysp] = 28;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 80:
                    yyn = yys28();
                    continue;

                case 29:
                    yyst[yysp] = 29;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 81:
                    yyn = yys29();
                    continue;

                case 30:
                    yyst[yysp] = 30;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 82:
                    yyn = yys30();
                    continue;

                case 31:
                    yyst[yysp] = 31;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 83:
                    yyn = yys31();
                    continue;

                case 32:
                    yyst[yysp] = 32;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 84:
                    yyn = yys32();
                    continue;

                case 33:
                    yyst[yysp] = 33;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 85:
                    yyn = yys33();
                    continue;

                case 34:
                    yyst[yysp] = 34;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 86:
                    yyn = yys34();
                    continue;

                case 35:
                    yyst[yysp] = 35;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 87:
                    yyn = yys35();
                    continue;

                case 36:
                    yyst[yysp] = 36;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 88:
                    yyn = yys36();
                    continue;

                case 37:
                    yyst[yysp] = 37;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 89:
                    yyn = yys37();
                    continue;

                case 38:
                    yyst[yysp] = 38;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 90:
                    yyn = yys38();
                    continue;

                case 39:
                    yyst[yysp] = 39;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 91:
                    yyn = yys39();
                    continue;

                case 40:
                    yyst[yysp] = 40;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 92:
                    yyn = yys40();
                    continue;

                case 41:
                    yyst[yysp] = 41;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 93:
                    yyn = yys41();
                    continue;

                case 42:
                    yyst[yysp] = 42;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 94:
                    yyn = yys42();
                    continue;

                case 43:
                    yyst[yysp] = 43;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 95:
                    yyn = yys43();
                    continue;

                case 44:
                    yyst[yysp] = 44;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 96:
                    yyn = yys44();
                    continue;

                case 45:
                    yyst[yysp] = 45;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 97:
                    yyn = yys45();
                    continue;

                case 46:
                    yyst[yysp] = 46;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 98:
                    switch (yytok) {
                        case END:
                            yyn = 49;
                            continue;
                    }
                    yyn = 107;
                    continue;

                case 47:
                    yyst[yysp] = 47;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 99:
                    yyn = yys47();
                    continue;

                case 48:
                    yyst[yysp] = 48;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 100:
                    yyn = yys48();
                    continue;

                case 49:
                    yyst[yysp] = 49;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 101:
                    yyn = yys49();
                    continue;

                case 50:
                    yyst[yysp] = 50;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 102:
                    yyn = yys50();
                    continue;

                case 51:
                    yyst[yysp] = 51;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 103:
                    switch (yytok) {
                        case END:
                            yyn = yyr21();
                            continue;
                    }
                    yyn = 107;
                    continue;

                case 104:
                    return true;
                case 105:
                    yyerror("stack overflow");
                case 106:
                    return false;
                case 107:
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

    private int yys0() {
        switch (yytok) {
            case BOOLEAN:
                return 3;
            case ID:
                return 4;
            case IF:
                return 5;
            case INTEGER:
                return 6;
            case LET:
                return 7;
            case NOT:
                return 8;
            case UMINUS:
                return 9;
            case WHILE:
                return 10;
        }
        return 107;
    }

    private int yys2() {
        switch (yytok) {
            case AND:
                return 11;
            case CONS:
                return 12;
            case DEVIDE:
                return 13;
            case EQ:
                return 14;
            case GT:
                return 15;
            case LT:
                return 16;
            case MINUS:
                return 17;
            case OR:
                return 18;
            case PLUS:
                return 19;
            case TIMES:
                return 20;
            case ENDINPUT:
                return yyr1();
        }
        return 107;
    }

    private int yys3() {
        switch (yytok) {
            case SEMICOLON:
            case PLUS:
            case DO:
            case OR:
            case GT:
            case MINUS:
            case DEVIDE:
            case LT:
            case EQ:
            case CONS:
            case ENDINPUT:
            case END:
            case TIMES:
            case THEN:
            case IN:
            case ELSE:
            case AND:
                return yyr14();
        }
        return 107;
    }

    private int yys4() {
        switch (yytok) {
            case SEMICOLON:
            case PLUS:
            case DO:
            case OR:
            case GT:
            case MINUS:
            case DEVIDE:
            case LT:
            case EQ:
            case CONS:
            case ENDINPUT:
            case END:
            case TIMES:
            case THEN:
            case IN:
            case ELSE:
            case AND:
                return yyr18();
        }
        return 107;
    }

    private int yys5() {
        switch (yytok) {
            case BOOLEAN:
                return 3;
            case ID:
                return 4;
            case IF:
                return 5;
            case INTEGER:
                return 6;
            case LET:
                return 7;
            case NOT:
                return 8;
            case UMINUS:
                return 9;
            case WHILE:
                return 10;
        }
        return 107;
    }

    private int yys6() {
        switch (yytok) {
            case SEMICOLON:
            case PLUS:
            case DO:
            case OR:
            case GT:
            case MINUS:
            case DEVIDE:
            case LT:
            case EQ:
            case CONS:
            case ENDINPUT:
            case END:
            case TIMES:
            case THEN:
            case IN:
            case ELSE:
            case AND:
                return yyr12();
        }
        return 107;
    }

    private int yys8() {
        switch (yytok) {
            case BOOLEAN:
                return 3;
            case ID:
                return 4;
            case IF:
                return 5;
            case INTEGER:
                return 6;
            case LET:
                return 7;
            case NOT:
                return 8;
            case UMINUS:
                return 9;
            case WHILE:
                return 10;
        }
        return 107;
    }

    private int yys9() {
        switch (yytok) {
            case BOOLEAN:
                return 3;
            case ID:
                return 4;
            case IF:
                return 5;
            case INTEGER:
                return 6;
            case LET:
                return 7;
            case NOT:
                return 8;
            case UMINUS:
                return 9;
            case WHILE:
                return 10;
        }
        return 107;
    }

    private int yys10() {
        switch (yytok) {
            case BOOLEAN:
                return 3;
            case ID:
                return 4;
            case IF:
                return 5;
            case INTEGER:
                return 6;
            case LET:
                return 7;
            case NOT:
                return 8;
            case UMINUS:
                return 9;
            case WHILE:
                return 10;
        }
        return 107;
    }

    private int yys11() {
        switch (yytok) {
            case BOOLEAN:
                return 3;
            case ID:
                return 4;
            case IF:
                return 5;
            case INTEGER:
                return 6;
            case LET:
                return 7;
            case NOT:
                return 8;
            case UMINUS:
                return 9;
            case WHILE:
                return 10;
        }
        return 107;
    }

    private int yys12() {
        switch (yytok) {
            case BOOLEAN:
                return 3;
            case ID:
                return 4;
            case IF:
                return 5;
            case INTEGER:
                return 6;
            case LET:
                return 7;
            case NOT:
                return 8;
            case UMINUS:
                return 9;
            case WHILE:
                return 10;
        }
        return 107;
    }

    private int yys13() {
        switch (yytok) {
            case BOOLEAN:
                return 3;
            case ID:
                return 4;
            case IF:
                return 5;
            case INTEGER:
                return 6;
            case LET:
                return 7;
            case NOT:
                return 8;
            case UMINUS:
                return 9;
            case WHILE:
                return 10;
        }
        return 107;
    }

    private int yys14() {
        switch (yytok) {
            case BOOLEAN:
                return 3;
            case ID:
                return 4;
            case IF:
                return 5;
            case INTEGER:
                return 6;
            case LET:
                return 7;
            case NOT:
                return 8;
            case UMINUS:
                return 9;
            case WHILE:
                return 10;
        }
        return 107;
    }

    private int yys15() {
        switch (yytok) {
            case BOOLEAN:
                return 3;
            case ID:
                return 4;
            case IF:
                return 5;
            case INTEGER:
                return 6;
            case LET:
                return 7;
            case NOT:
                return 8;
            case UMINUS:
                return 9;
            case WHILE:
                return 10;
        }
        return 107;
    }

    private int yys16() {
        switch (yytok) {
            case BOOLEAN:
                return 3;
            case ID:
                return 4;
            case IF:
                return 5;
            case INTEGER:
                return 6;
            case LET:
                return 7;
            case NOT:
                return 8;
            case UMINUS:
                return 9;
            case WHILE:
                return 10;
        }
        return 107;
    }

    private int yys17() {
        switch (yytok) {
            case BOOLEAN:
                return 3;
            case ID:
                return 4;
            case IF:
                return 5;
            case INTEGER:
                return 6;
            case LET:
                return 7;
            case NOT:
                return 8;
            case UMINUS:
                return 9;
            case WHILE:
                return 10;
        }
        return 107;
    }

    private int yys18() {
        switch (yytok) {
            case BOOLEAN:
                return 3;
            case ID:
                return 4;
            case IF:
                return 5;
            case INTEGER:
                return 6;
            case LET:
                return 7;
            case NOT:
                return 8;
            case UMINUS:
                return 9;
            case WHILE:
                return 10;
        }
        return 107;
    }

    private int yys19() {
        switch (yytok) {
            case BOOLEAN:
                return 3;
            case ID:
                return 4;
            case IF:
                return 5;
            case INTEGER:
                return 6;
            case LET:
                return 7;
            case NOT:
                return 8;
            case UMINUS:
                return 9;
            case WHILE:
                return 10;
        }
        return 107;
    }

    private int yys20() {
        switch (yytok) {
            case BOOLEAN:
                return 3;
            case ID:
                return 4;
            case IF:
                return 5;
            case INTEGER:
                return 6;
            case LET:
                return 7;
            case NOT:
                return 8;
            case UMINUS:
                return 9;
            case WHILE:
                return 10;
        }
        return 107;
    }

    private int yys21() {
        switch (yytok) {
            case AND:
                return 11;
            case CONS:
                return 12;
            case DEVIDE:
                return 13;
            case EQ:
                return 14;
            case GT:
                return 15;
            case LT:
                return 16;
            case MINUS:
                return 17;
            case OR:
                return 18;
            case PLUS:
                return 19;
            case TIMES:
                return 20;
            case THEN:
                return 36;
        }
        return 107;
    }

    private int yys23() {
        switch (yytok) {
            case SEMICOLON:
            case PLUS:
            case DO:
            case OR:
            case GT:
            case MINUS:
            case DEVIDE:
            case LT:
            case EQ:
            case CONS:
            case ENDINPUT:
            case END:
            case TIMES:
            case THEN:
            case IN:
            case ELSE:
            case AND:
                return yyr15();
        }
        return 107;
    }

    private int yys24() {
        switch (yytok) {
            case SEMICOLON:
            case PLUS:
            case DO:
            case OR:
            case GT:
            case MINUS:
            case DEVIDE:
            case LT:
            case EQ:
            case CONS:
            case ENDINPUT:
            case END:
            case TIMES:
            case THEN:
            case IN:
            case ELSE:
            case AND:
                return yyr13();
        }
        return 107;
    }

    private int yys25() {
        switch (yytok) {
            case AND:
                return 11;
            case CONS:
                return 12;
            case DEVIDE:
                return 13;
            case EQ:
                return 14;
            case GT:
                return 15;
            case LT:
                return 16;
            case MINUS:
                return 17;
            case OR:
                return 18;
            case PLUS:
                return 19;
            case TIMES:
                return 20;
            case DO:
                return 38;
        }
        return 107;
    }

    private int yys26() {
        switch (yytok) {
            case CONS:
                return 12;
            case DEVIDE:
                return 13;
            case EQ:
                return 14;
            case GT:
                return 15;
            case LT:
                return 16;
            case MINUS:
                return 17;
            case PLUS:
                return 19;
            case TIMES:
                return 20;
            case SEMICOLON:
            case DO:
            case OR:
            case ENDINPUT:
            case END:
            case THEN:
            case IN:
            case ELSE:
            case AND:
                return yyr10();
        }
        return 107;
    }

    private int yys27() {
        switch (yytok) {
            case DEVIDE:
                return 13;
            case EQ:
                return 14;
            case GT:
                return 15;
            case LT:
                return 16;
            case MINUS:
                return 17;
            case PLUS:
                return 19;
            case TIMES:
                return 20;
            case SEMICOLON:
            case DO:
            case OR:
            case CONS:
            case ENDINPUT:
            case END:
            case THEN:
            case IN:
            case ELSE:
            case AND:
                return yyr19();
        }
        return 107;
    }

    private int yys28() {
        switch (yytok) {
            case SEMICOLON:
            case PLUS:
            case DO:
            case OR:
            case GT:
            case MINUS:
            case DEVIDE:
            case LT:
            case EQ:
            case CONS:
            case ENDINPUT:
            case END:
            case TIMES:
            case THEN:
            case IN:
            case ELSE:
            case AND:
                return yyr6();
        }
        return 107;
    }

    private int yys29() {
        switch (yytok) {
            case DEVIDE:
                return 13;
            case MINUS:
                return 17;
            case PLUS:
                return 19;
            case TIMES:
                return 20;
            case SEMICOLON:
            case DO:
            case OR:
            case GT:
            case LT:
            case EQ:
            case CONS:
            case ENDINPUT:
            case END:
            case THEN:
            case IN:
            case ELSE:
            case AND:
                return yyr9();
        }
        return 107;
    }

    private int yys30() {
        switch (yytok) {
            case DEVIDE:
                return 13;
            case MINUS:
                return 17;
            case PLUS:
                return 19;
            case TIMES:
                return 20;
            case SEMICOLON:
            case DO:
            case OR:
            case GT:
            case LT:
            case EQ:
            case CONS:
            case ENDINPUT:
            case END:
            case THEN:
            case IN:
            case ELSE:
            case AND:
                return yyr7();
        }
        return 107;
    }

    private int yys31() {
        switch (yytok) {
            case DEVIDE:
                return 13;
            case MINUS:
                return 17;
            case PLUS:
                return 19;
            case TIMES:
                return 20;
            case SEMICOLON:
            case DO:
            case OR:
            case GT:
            case LT:
            case EQ:
            case CONS:
            case ENDINPUT:
            case END:
            case THEN:
            case IN:
            case ELSE:
            case AND:
                return yyr8();
        }
        return 107;
    }

    private int yys32() {
        switch (yytok) {
            case DEVIDE:
                return 13;
            case TIMES:
                return 20;
            case SEMICOLON:
            case PLUS:
            case DO:
            case OR:
            case GT:
            case MINUS:
            case LT:
            case EQ:
            case CONS:
            case ENDINPUT:
            case END:
            case THEN:
            case IN:
            case ELSE:
            case AND:
                return yyr4();
        }
        return 107;
    }

    private int yys33() {
        switch (yytok) {
            case CONS:
                return 12;
            case DEVIDE:
                return 13;
            case EQ:
                return 14;
            case GT:
                return 15;
            case LT:
                return 16;
            case MINUS:
                return 17;
            case PLUS:
                return 19;
            case TIMES:
                return 20;
            case SEMICOLON:
            case DO:
            case OR:
            case ENDINPUT:
            case END:
            case THEN:
            case IN:
            case ELSE:
            case AND:
                return yyr11();
        }
        return 107;
    }

    private int yys34() {
        switch (yytok) {
            case DEVIDE:
                return 13;
            case TIMES:
                return 20;
            case SEMICOLON:
            case PLUS:
            case DO:
            case OR:
            case GT:
            case MINUS:
            case LT:
            case EQ:
            case CONS:
            case ENDINPUT:
            case END:
            case THEN:
            case IN:
            case ELSE:
            case AND:
                return yyr3();
        }
        return 107;
    }

    private int yys35() {
        switch (yytok) {
            case SEMICOLON:
            case PLUS:
            case DO:
            case OR:
            case GT:
            case MINUS:
            case DEVIDE:
            case LT:
            case EQ:
            case CONS:
            case ENDINPUT:
            case END:
            case TIMES:
            case THEN:
            case IN:
            case ELSE:
            case AND:
                return yyr5();
        }
        return 107;
    }

    private int yys36() {
        switch (yytok) {
            case BOOLEAN:
                return 3;
            case ID:
                return 4;
            case IF:
                return 5;
            case INTEGER:
                return 6;
            case LET:
                return 7;
            case NOT:
                return 8;
            case UMINUS:
                return 9;
            case WHILE:
                return 10;
        }
        return 107;
    }

    private int yys37() {
        switch (yytok) {
            case BOOLEAN:
                return 3;
            case ID:
                return 4;
            case IF:
                return 5;
            case INTEGER:
                return 6;
            case LET:
                return 7;
            case NOT:
                return 8;
            case UMINUS:
                return 9;
            case WHILE:
                return 10;
        }
        return 107;
    }

    private int yys38() {
        switch (yytok) {
            case BOOLEAN:
                return 3;
            case ID:
                return 4;
            case IF:
                return 5;
            case INTEGER:
                return 6;
            case LET:
                return 7;
            case NOT:
                return 8;
            case UMINUS:
                return 9;
            case WHILE:
                return 10;
        }
        return 107;
    }

    private int yys39() {
        switch (yytok) {
            case AND:
                return 11;
            case CONS:
                return 12;
            case DEVIDE:
                return 13;
            case EQ:
                return 14;
            case GT:
                return 15;
            case LT:
                return 16;
            case MINUS:
                return 17;
            case OR:
                return 18;
            case PLUS:
                return 19;
            case TIMES:
                return 20;
            case ELSE:
                return 42;
        }
        return 107;
    }

    private int yys40() {
        switch (yytok) {
            case AND:
                return 11;
            case CONS:
                return 12;
            case DEVIDE:
                return 13;
            case EQ:
                return 14;
            case GT:
                return 15;
            case LT:
                return 16;
            case MINUS:
                return 17;
            case OR:
                return 18;
            case PLUS:
                return 19;
            case TIMES:
                return 20;
            case IN:
                return 43;
        }
        return 107;
    }

    private int yys41() {
        switch (yytok) {
            case AND:
                return 11;
            case CONS:
                return 12;
            case DEVIDE:
                return 13;
            case EQ:
                return 14;
            case GT:
                return 15;
            case LT:
                return 16;
            case MINUS:
                return 17;
            case OR:
                return 18;
            case PLUS:
                return 19;
            case TIMES:
                return 20;
            case END:
                return 44;
        }
        return 107;
    }

    private int yys42() {
        switch (yytok) {
            case BOOLEAN:
                return 3;
            case ID:
                return 4;
            case IF:
                return 5;
            case INTEGER:
                return 6;
            case LET:
                return 7;
            case NOT:
                return 8;
            case UMINUS:
                return 9;
            case WHILE:
                return 10;
        }
        return 107;
    }

    private int yys43() {
        switch (yytok) {
            case BOOLEAN:
                return 3;
            case ID:
                return 4;
            case IF:
                return 5;
            case INTEGER:
                return 6;
            case LET:
                return 7;
            case NOT:
                return 8;
            case UMINUS:
                return 9;
            case WHILE:
                return 10;
        }
        return 107;
    }

    private int yys44() {
        switch (yytok) {
            case SEMICOLON:
            case PLUS:
            case DO:
            case OR:
            case GT:
            case MINUS:
            case DEVIDE:
            case LT:
            case EQ:
            case CONS:
            case ENDINPUT:
            case END:
            case TIMES:
            case THEN:
            case IN:
            case ELSE:
            case AND:
                return yyr17();
        }
        return 107;
    }

    private int yys45() {
        switch (yytok) {
            case AND:
                return 11;
            case CONS:
                return 12;
            case DEVIDE:
                return 13;
            case EQ:
                return 14;
            case GT:
                return 15;
            case LT:
                return 16;
            case MINUS:
                return 17;
            case OR:
                return 18;
            case PLUS:
                return 19;
            case TIMES:
                return 20;
            case END:
                return 48;
        }
        return 107;
    }

    private int yys47() {
        switch (yytok) {
            case AND:
                return 11;
            case CONS:
                return 12;
            case DEVIDE:
                return 13;
            case EQ:
                return 14;
            case GT:
                return 15;
            case LT:
                return 16;
            case MINUS:
                return 17;
            case OR:
                return 18;
            case PLUS:
                return 19;
            case TIMES:
                return 20;
            case SEMICOLON:
                return 50;
            case END:
                return yyr20();
        }
        return 107;
    }

    private int yys48() {
        switch (yytok) {
            case SEMICOLON:
            case PLUS:
            case DO:
            case OR:
            case GT:
            case MINUS:
            case DEVIDE:
            case LT:
            case EQ:
            case CONS:
            case ENDINPUT:
            case END:
            case TIMES:
            case THEN:
            case IN:
            case ELSE:
            case AND:
                return yyr16();
        }
        return 107;
    }

    private int yys49() {
        switch (yytok) {
            case SEMICOLON:
            case PLUS:
            case DO:
            case OR:
            case GT:
            case MINUS:
            case DEVIDE:
            case LT:
            case EQ:
            case CONS:
            case ENDINPUT:
            case END:
            case TIMES:
            case THEN:
            case IN:
            case ELSE:
            case AND:
                return yyr2();
        }
        return 107;
    }

    private int yys50() {
        switch (yytok) {
            case BOOLEAN:
                return 3;
            case ID:
                return 4;
            case IF:
                return 5;
            case INTEGER:
                return 6;
            case LET:
                return 7;
            case NOT:
                return 8;
            case UMINUS:
                return 9;
            case WHILE:
                return 10;
        }
        return 107;
    }

    private int yyr1() { // prog : expr
        { System.out.println(((Expression)yysv[yysp-1]).eval()); }
        yysv[yysp-=1] = yyrv;
        return 1;
    }

    private int yyr20() { // expseq : expr
        {yyrv=yysv[yysp-1];}
        yysv[yysp-=1] = yyrv;
        return yypexpseq();
    }

    private int yyr21() { // expseq : expr SEMICOLON expseq
        {yyrv = new Sequence(yysv[yysp-3],yysv[yysp-1]);}
        yysv[yysp-=3] = yyrv;
        return yypexpseq();
    }

    private int yypexpseq() {
        switch (yyst[yysp-1]) {
            case 43: return 46;
            default: return 51;
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

    private int yyr14() { // expr : BOOLEAN
        {yyrv = new BoolValue(yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return yypexpr();
    }

    private int yyr15() { // expr : NOT expr
        {yyrv = new UnaryOperation(UnaryOperation.UnaryOperator.not, yysv[yysp-1]);}
        yysv[yysp-=2] = yyrv;
        return yypexpr();
    }

    private int yyr16() { // expr : IF expr THEN expr ELSE expr END
        {yyrv = new IfThenElse(yysv[yysp-6],yysv[yysp-4], yysv[yysp-2]);}
        yysv[yysp-=7] = yyrv;
        return yypexpr();
    }

    private int yyr17() { // expr : WHILE expr DO expr END
        {yyrv = new WhileDoEnd(yysv[yysp-4],yysv[yysp-2]);}
        yysv[yysp-=5] = yyrv;
        return yypexpr();
    }

    private int yyr18() { // expr : ID
        {yyrv = new Variable(yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return yypexpr();
    }

    private int yyr19() { // expr : expr CONS expr
        { yyrv = new List(yysv[yysp-3],yysv[yysp-1]);}
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yypexpr() {
        switch (yyst[yysp-1]) {
            case 42: return 45;
            case 38: return 41;
            case 37: return 40;
            case 36: return 39;
            case 20: return 35;
            case 19: return 34;
            case 18: return 33;
            case 17: return 32;
            case 16: return 31;
            case 15: return 30;
            case 14: return 29;
            case 13: return 28;
            case 12: return 27;
            case 11: return 26;
            case 10: return 25;
            case 9: return 24;
            case 8: return 23;
            case 5: return 21;
            case 0: return 2;
            default: return 47;
        }
    }

    protected String[] yyerrmsgs = {
    };


private void yyerror(String msg) {
            String prefix = "[line:" + Interpreter.lexer.line+ " TokenID:" + Interpreter.tokenName[Lexer.token];
            if (Lexer.token == Tokens.ID || Lexer.token == Tokens.BOOLEAN || Lexer.token == Tokens.INTEGER)
            {
                prefix += " " +Lexer.yylval;
            }
            prefix += "]\t";
        System.out.println(prefix+msg);
        System.exit(1);
}

}
