// Output created by jacc on Wed May 29 16:32:03 CST 2013

package interpreter;

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
                case 60:
                    yyn = yys0();
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 61:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 120;
                            continue;
                    }
                    yyn = 123;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 62:
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
                case 63:
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
                case 64:
                    switch (yytok) {
                        case ID:
                            yyn = 23;
                            continue;
                    }
                    yyn = 123;
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
                case 65:
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
                case 66:
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
                case 67:
                    yyn = yys7();
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
                case 68:
                    switch (yytok) {
                        case ID:
                            yyn = 25;
                            continue;
                    }
                    yyn = 123;
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
                case 69:
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
                case 70:
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
                case 71:
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
                case 72:
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
                case 73:
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
                case 74:
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
                case 75:
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
                case 76:
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
                case 77:
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
                case 78:
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
                case 79:
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
                case 80:
                    yyn = yys20();
                    continue;

                case 21:
                    yyst[yysp] = 21;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 81:
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
                case 82:
                    yyn = yys22();
                    continue;

                case 23:
                    yyst[yysp] = 23;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 83:
                    switch (yytok) {
                        case LAMDA:
                            yyn = 40;
                            continue;
                    }
                    yyn = 123;
                    continue;

                case 24:
                    yyst[yysp] = 24;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 84:
                    yyn = yys24();
                    continue;

                case 25:
                    yyst[yysp] = 25;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 85:
                    switch (yytok) {
                        case EQ:
                            yyn = 42;
                            continue;
                    }
                    yyn = 123;
                    continue;

                case 26:
                    yyst[yysp] = 26;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 86:
                    yyn = yys26();
                    continue;

                case 27:
                    yyst[yysp] = 27;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 87:
                    yyn = yys27();
                    continue;

                case 28:
                    yyst[yysp] = 28;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 88:
                    yyn = yys28();
                    continue;

                case 29:
                    yyst[yysp] = 29;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 89:
                    yyn = yys29();
                    continue;

                case 30:
                    yyst[yysp] = 30;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 90:
                    yyn = yys30();
                    continue;

                case 31:
                    yyst[yysp] = 31;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 91:
                    yyn = yys31();
                    continue;

                case 32:
                    yyst[yysp] = 32;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 92:
                    yyn = yys32();
                    continue;

                case 33:
                    yyst[yysp] = 33;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 93:
                    yyn = yys33();
                    continue;

                case 34:
                    yyst[yysp] = 34;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 94:
                    yyn = yys34();
                    continue;

                case 35:
                    yyst[yysp] = 35;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 95:
                    yyn = yys35();
                    continue;

                case 36:
                    yyst[yysp] = 36;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 96:
                    yyn = yys36();
                    continue;

                case 37:
                    yyst[yysp] = 37;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 97:
                    yyn = yys37();
                    continue;

                case 38:
                    yyst[yysp] = 38;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 98:
                    yyn = yys38();
                    continue;

                case 39:
                    yyst[yysp] = 39;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 99:
                    yyn = yys39();
                    continue;

                case 40:
                    yyst[yysp] = 40;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 100:
                    yyn = yys40();
                    continue;

                case 41:
                    yyst[yysp] = 41;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 101:
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
                case 102:
                    yyn = yys42();
                    continue;

                case 43:
                    yyst[yysp] = 43;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 103:
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
                case 104:
                    yyn = yys44();
                    continue;

                case 45:
                    yyst[yysp] = 45;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 105:
                    yyn = yys45();
                    continue;

                case 46:
                    yyst[yysp] = 46;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 106:
                    yyn = yys46();
                    continue;

                case 47:
                    yyst[yysp] = 47;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 107:
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
                case 108:
                    yyn = yys48();
                    continue;

                case 49:
                    yyst[yysp] = 49;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 109:
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
                case 110:
                    yyn = yys50();
                    continue;

                case 51:
                    yyst[yysp] = 51;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 111:
                    yyn = yys51();
                    continue;

                case 52:
                    yyst[yysp] = 52;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 112:
                    yyn = yys52();
                    continue;

                case 53:
                    yyst[yysp] = 53;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 113:
                    yyn = yys53();
                    continue;

                case 54:
                    yyst[yysp] = 54;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 114:
                    switch (yytok) {
                        case END:
                            yyn = 57;
                            continue;
                    }
                    yyn = 123;
                    continue;

                case 55:
                    yyst[yysp] = 55;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 115:
                    yyn = yys55();
                    continue;

                case 56:
                    yyst[yysp] = 56;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 116:
                    yyn = yys56();
                    continue;

                case 57:
                    yyst[yysp] = 57;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 117:
                    yyn = yys57();
                    continue;

                case 58:
                    yyst[yysp] = 58;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 118:
                    yyn = yys58();
                    continue;

                case 59:
                    yyst[yysp] = 59;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 119:
                    switch (yytok) {
                        case END:
                            yyn = yyr23();
                            continue;
                    }
                    yyn = 123;
                    continue;

                case 120:
                    return true;
                case 121:
                    yyerror("stack overflow");
                case 122:
                    return false;
                case 123:
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
            case FUN:
                return 4;
            case ID:
                return 5;
            case IF:
                return 6;
            case INTEGER:
                return 7;
            case LET:
                return 8;
            case LPAREN:
                return 9;
            case NOT:
                return 10;
            case UMINUS:
                return 11;
            case WHILE:
                return 12;
        }
        return 123;
    }

    private int yys2() {
        switch (yytok) {
            case AND:
                return 13;
            case CONS:
                return 14;
            case DEVIDE:
                return 15;
            case EQ:
                return 16;
            case GT:
                return 17;
            case LT:
                return 18;
            case MINUS:
                return 19;
            case OR:
                return 20;
            case PLUS:
                return 21;
            case TIMES:
                return 22;
            case ENDINPUT:
                return yyr1();
        }
        return 123;
    }

    private int yys3() {
        switch (yytok) {
            case HEAD:
            case ASSIGN:
            case SKIP:
            case LOW:
            case error:
            case COMMA:
            case LAMDA:
            case SND:
            case NIL:
            case FST:
            case TAIL:
                return 123;
        }
        return yyr14();
    }

    private int yys5() {
        switch (yytok) {
            case HEAD:
            case ASSIGN:
            case SKIP:
            case LOW:
            case error:
            case COMMA:
            case LAMDA:
            case SND:
            case NIL:
            case FST:
            case TAIL:
                return 123;
        }
        return yyr18();
    }

    private int yys6() {
        switch (yytok) {
            case BOOLEAN:
                return 3;
            case FUN:
                return 4;
            case ID:
                return 5;
            case IF:
                return 6;
            case INTEGER:
                return 7;
            case LET:
                return 8;
            case LPAREN:
                return 9;
            case NOT:
                return 10;
            case UMINUS:
                return 11;
            case WHILE:
                return 12;
        }
        return 123;
    }

    private int yys7() {
        switch (yytok) {
            case HEAD:
            case ASSIGN:
            case SKIP:
            case LOW:
            case error:
            case COMMA:
            case LAMDA:
            case SND:
            case NIL:
            case FST:
            case TAIL:
                return 123;
        }
        return yyr12();
    }

    private int yys9() {
        switch (yytok) {
            case BOOLEAN:
                return 3;
            case FUN:
                return 4;
            case ID:
                return 5;
            case IF:
                return 6;
            case INTEGER:
                return 7;
            case LET:
                return 8;
            case LPAREN:
                return 9;
            case NOT:
                return 10;
            case UMINUS:
                return 11;
            case WHILE:
                return 12;
        }
        return 123;
    }

    private int yys10() {
        switch (yytok) {
            case BOOLEAN:
                return 3;
            case FUN:
                return 4;
            case ID:
                return 5;
            case IF:
                return 6;
            case INTEGER:
                return 7;
            case LET:
                return 8;
            case LPAREN:
                return 9;
            case NOT:
                return 10;
            case UMINUS:
                return 11;
            case WHILE:
                return 12;
        }
        return 123;
    }

    private int yys11() {
        switch (yytok) {
            case BOOLEAN:
                return 3;
            case FUN:
                return 4;
            case ID:
                return 5;
            case IF:
                return 6;
            case INTEGER:
                return 7;
            case LET:
                return 8;
            case LPAREN:
                return 9;
            case NOT:
                return 10;
            case UMINUS:
                return 11;
            case WHILE:
                return 12;
        }
        return 123;
    }

    private int yys12() {
        switch (yytok) {
            case BOOLEAN:
                return 3;
            case FUN:
                return 4;
            case ID:
                return 5;
            case IF:
                return 6;
            case INTEGER:
                return 7;
            case LET:
                return 8;
            case LPAREN:
                return 9;
            case NOT:
                return 10;
            case UMINUS:
                return 11;
            case WHILE:
                return 12;
        }
        return 123;
    }

    private int yys13() {
        switch (yytok) {
            case BOOLEAN:
                return 3;
            case FUN:
                return 4;
            case ID:
                return 5;
            case IF:
                return 6;
            case INTEGER:
                return 7;
            case LET:
                return 8;
            case LPAREN:
                return 9;
            case NOT:
                return 10;
            case UMINUS:
                return 11;
            case WHILE:
                return 12;
        }
        return 123;
    }

    private int yys14() {
        switch (yytok) {
            case BOOLEAN:
                return 3;
            case FUN:
                return 4;
            case ID:
                return 5;
            case IF:
                return 6;
            case INTEGER:
                return 7;
            case LET:
                return 8;
            case LPAREN:
                return 9;
            case NOT:
                return 10;
            case UMINUS:
                return 11;
            case WHILE:
                return 12;
        }
        return 123;
    }

    private int yys15() {
        switch (yytok) {
            case BOOLEAN:
                return 3;
            case FUN:
                return 4;
            case ID:
                return 5;
            case IF:
                return 6;
            case INTEGER:
                return 7;
            case LET:
                return 8;
            case LPAREN:
                return 9;
            case NOT:
                return 10;
            case UMINUS:
                return 11;
            case WHILE:
                return 12;
        }
        return 123;
    }

    private int yys16() {
        switch (yytok) {
            case BOOLEAN:
                return 3;
            case FUN:
                return 4;
            case ID:
                return 5;
            case IF:
                return 6;
            case INTEGER:
                return 7;
            case LET:
                return 8;
            case LPAREN:
                return 9;
            case NOT:
                return 10;
            case UMINUS:
                return 11;
            case WHILE:
                return 12;
        }
        return 123;
    }

    private int yys17() {
        switch (yytok) {
            case BOOLEAN:
                return 3;
            case FUN:
                return 4;
            case ID:
                return 5;
            case IF:
                return 6;
            case INTEGER:
                return 7;
            case LET:
                return 8;
            case LPAREN:
                return 9;
            case NOT:
                return 10;
            case UMINUS:
                return 11;
            case WHILE:
                return 12;
        }
        return 123;
    }

    private int yys18() {
        switch (yytok) {
            case BOOLEAN:
                return 3;
            case FUN:
                return 4;
            case ID:
                return 5;
            case IF:
                return 6;
            case INTEGER:
                return 7;
            case LET:
                return 8;
            case LPAREN:
                return 9;
            case NOT:
                return 10;
            case UMINUS:
                return 11;
            case WHILE:
                return 12;
        }
        return 123;
    }

    private int yys19() {
        switch (yytok) {
            case BOOLEAN:
                return 3;
            case FUN:
                return 4;
            case ID:
                return 5;
            case IF:
                return 6;
            case INTEGER:
                return 7;
            case LET:
                return 8;
            case LPAREN:
                return 9;
            case NOT:
                return 10;
            case UMINUS:
                return 11;
            case WHILE:
                return 12;
        }
        return 123;
    }

    private int yys20() {
        switch (yytok) {
            case BOOLEAN:
                return 3;
            case FUN:
                return 4;
            case ID:
                return 5;
            case IF:
                return 6;
            case INTEGER:
                return 7;
            case LET:
                return 8;
            case LPAREN:
                return 9;
            case NOT:
                return 10;
            case UMINUS:
                return 11;
            case WHILE:
                return 12;
        }
        return 123;
    }

    private int yys21() {
        switch (yytok) {
            case BOOLEAN:
                return 3;
            case FUN:
                return 4;
            case ID:
                return 5;
            case IF:
                return 6;
            case INTEGER:
                return 7;
            case LET:
                return 8;
            case LPAREN:
                return 9;
            case NOT:
                return 10;
            case UMINUS:
                return 11;
            case WHILE:
                return 12;
        }
        return 123;
    }

    private int yys22() {
        switch (yytok) {
            case BOOLEAN:
                return 3;
            case FUN:
                return 4;
            case ID:
                return 5;
            case IF:
                return 6;
            case INTEGER:
                return 7;
            case LET:
                return 8;
            case LPAREN:
                return 9;
            case NOT:
                return 10;
            case UMINUS:
                return 11;
            case WHILE:
                return 12;
        }
        return 123;
    }

    private int yys24() {
        switch (yytok) {
            case AND:
                return 13;
            case CONS:
                return 14;
            case DEVIDE:
                return 15;
            case EQ:
                return 16;
            case GT:
                return 17;
            case LT:
                return 18;
            case MINUS:
                return 19;
            case OR:
                return 20;
            case PLUS:
                return 21;
            case TIMES:
                return 22;
            case THEN:
                return 41;
        }
        return 123;
    }

    private int yys26() {
        switch (yytok) {
            case BOOLEAN:
                return 3;
            case FUN:
                return 4;
            case ID:
                return 5;
            case IF:
                return 6;
            case INTEGER:
                return 7;
            case LET:
                return 8;
            case LPAREN:
                return 9;
            case NOT:
                return 10;
            case UMINUS:
                return 11;
            case WHILE:
                return 12;
            case AND:
                return 13;
            case CONS:
                return 14;
            case DEVIDE:
                return 15;
            case EQ:
                return 16;
            case GT:
                return 17;
            case LT:
                return 18;
            case MINUS:
                return 19;
            case OR:
                return 20;
            case PLUS:
                return 21;
            case TIMES:
                return 22;
        }
        return 123;
    }

    private int yys27() {
        switch (yytok) {
            case HEAD:
            case ASSIGN:
            case SKIP:
            case LOW:
            case error:
            case COMMA:
            case LAMDA:
            case SND:
            case NIL:
            case FST:
            case TAIL:
                return 123;
        }
        return yyr15();
    }

    private int yys28() {
        switch (yytok) {
            case HEAD:
            case ASSIGN:
            case SKIP:
            case LOW:
            case error:
            case COMMA:
            case LAMDA:
            case SND:
            case NIL:
            case FST:
            case TAIL:
                return 123;
        }
        return yyr13();
    }

    private int yys29() {
        switch (yytok) {
            case AND:
                return 13;
            case CONS:
                return 14;
            case DEVIDE:
                return 15;
            case EQ:
                return 16;
            case GT:
                return 17;
            case LT:
                return 18;
            case MINUS:
                return 19;
            case OR:
                return 20;
            case PLUS:
                return 21;
            case TIMES:
                return 22;
            case DO:
                return 44;
        }
        return 123;
    }

    private int yys30() {
        switch (yytok) {
            case LOW:
            case NIL:
            case SKIP:
            case error:
            case COMMA:
            case FST:
            case SND:
            case TAIL:
            case ASSIGN:
            case HEAD:
            case LAMDA:
                return 123;
            case CONS:
                return 14;
            case DEVIDE:
                return 15;
            case EQ:
                return 16;
            case GT:
                return 17;
            case LT:
                return 18;
            case MINUS:
                return 19;
            case PLUS:
                return 21;
            case TIMES:
                return 22;
        }
        return yyr10();
    }

    private int yys31() {
        switch (yytok) {
            case HEAD:
            case NIL:
            case COMMA:
            case FST:
            case error:
            case LOW:
            case SND:
            case TAIL:
            case LAMDA:
            case ASSIGN:
            case SKIP:
                return 123;
            case DEVIDE:
                return 15;
            case EQ:
                return 16;
            case GT:
                return 17;
            case LT:
                return 18;
            case MINUS:
                return 19;
            case PLUS:
                return 21;
            case TIMES:
                return 22;
        }
        return yyr19();
    }

    private int yys32() {
        switch (yytok) {
            case HEAD:
            case ASSIGN:
            case SKIP:
            case LOW:
            case error:
            case COMMA:
            case LAMDA:
            case SND:
            case NIL:
            case FST:
            case TAIL:
                return 123;
        }
        return yyr6();
    }

    private int yys33() {
        switch (yytok) {
            case FST:
            case SKIP:
            case NIL:
            case ASSIGN:
            case error:
            case LAMDA:
            case SND:
            case TAIL:
            case HEAD:
            case COMMA:
            case LOW:
                return 123;
            case DEVIDE:
                return 15;
            case MINUS:
                return 19;
            case PLUS:
                return 21;
            case TIMES:
                return 22;
        }
        return yyr9();
    }

    private int yys34() {
        switch (yytok) {
            case FST:
            case SKIP:
            case NIL:
            case ASSIGN:
            case error:
            case LAMDA:
            case SND:
            case TAIL:
            case HEAD:
            case COMMA:
            case LOW:
                return 123;
            case DEVIDE:
                return 15;
            case MINUS:
                return 19;
            case PLUS:
                return 21;
            case TIMES:
                return 22;
        }
        return yyr7();
    }

    private int yys35() {
        switch (yytok) {
            case FST:
            case SKIP:
            case NIL:
            case ASSIGN:
            case error:
            case LAMDA:
            case SND:
            case TAIL:
            case HEAD:
            case COMMA:
            case LOW:
                return 123;
            case DEVIDE:
                return 15;
            case MINUS:
                return 19;
            case PLUS:
                return 21;
            case TIMES:
                return 22;
        }
        return yyr8();
    }

    private int yys36() {
        switch (yytok) {
            case SKIP:
            case error:
            case FST:
            case LAMDA:
            case ASSIGN:
            case COMMA:
            case SND:
            case TAIL:
            case HEAD:
            case NIL:
            case LOW:
                return 123;
            case DEVIDE:
                return 15;
            case TIMES:
                return 22;
        }
        return yyr4();
    }

    private int yys37() {
        switch (yytok) {
            case LOW:
            case NIL:
            case SKIP:
            case error:
            case COMMA:
            case FST:
            case SND:
            case TAIL:
            case ASSIGN:
            case HEAD:
            case LAMDA:
                return 123;
            case CONS:
                return 14;
            case DEVIDE:
                return 15;
            case EQ:
                return 16;
            case GT:
                return 17;
            case LT:
                return 18;
            case MINUS:
                return 19;
            case PLUS:
                return 21;
            case TIMES:
                return 22;
        }
        return yyr11();
    }

    private int yys38() {
        switch (yytok) {
            case SKIP:
            case error:
            case FST:
            case LAMDA:
            case ASSIGN:
            case COMMA:
            case SND:
            case TAIL:
            case HEAD:
            case NIL:
            case LOW:
                return 123;
            case DEVIDE:
                return 15;
            case TIMES:
                return 22;
        }
        return yyr3();
    }

    private int yys39() {
        switch (yytok) {
            case HEAD:
            case ASSIGN:
            case SKIP:
            case LOW:
            case error:
            case COMMA:
            case LAMDA:
            case SND:
            case NIL:
            case FST:
            case TAIL:
                return 123;
        }
        return yyr5();
    }

    private int yys40() {
        switch (yytok) {
            case BOOLEAN:
                return 3;
            case FUN:
                return 4;
            case ID:
                return 5;
            case IF:
                return 6;
            case INTEGER:
                return 7;
            case LET:
                return 8;
            case LPAREN:
                return 9;
            case NOT:
                return 10;
            case UMINUS:
                return 11;
            case WHILE:
                return 12;
        }
        return 123;
    }

    private int yys41() {
        switch (yytok) {
            case BOOLEAN:
                return 3;
            case FUN:
                return 4;
            case ID:
                return 5;
            case IF:
                return 6;
            case INTEGER:
                return 7;
            case LET:
                return 8;
            case LPAREN:
                return 9;
            case NOT:
                return 10;
            case UMINUS:
                return 11;
            case WHILE:
                return 12;
        }
        return 123;
    }

    private int yys42() {
        switch (yytok) {
            case BOOLEAN:
                return 3;
            case FUN:
                return 4;
            case ID:
                return 5;
            case IF:
                return 6;
            case INTEGER:
                return 7;
            case LET:
                return 8;
            case LPAREN:
                return 9;
            case NOT:
                return 10;
            case UMINUS:
                return 11;
            case WHILE:
                return 12;
        }
        return 123;
    }

    private int yys43() {
        switch (yytok) {
            case AND:
                return 13;
            case CONS:
                return 14;
            case DEVIDE:
                return 15;
            case EQ:
                return 16;
            case GT:
                return 17;
            case LT:
                return 18;
            case MINUS:
                return 19;
            case OR:
                return 20;
            case PLUS:
                return 21;
            case TIMES:
                return 22;
            case RPAREN:
                return 48;
        }
        return 123;
    }

    private int yys44() {
        switch (yytok) {
            case BOOLEAN:
                return 3;
            case FUN:
                return 4;
            case ID:
                return 5;
            case IF:
                return 6;
            case INTEGER:
                return 7;
            case LET:
                return 8;
            case LPAREN:
                return 9;
            case NOT:
                return 10;
            case UMINUS:
                return 11;
            case WHILE:
                return 12;
        }
        return 123;
    }

    private int yys45() {
        switch (yytok) {
            case SND:
            case NIL:
            case LAMDA:
            case COMMA:
            case FST:
            case TAIL:
            case HEAD:
            case ASSIGN:
            case error:
            case SKIP:
            case LOW:
                return 123;
            case AND:
                return 13;
            case CONS:
                return 14;
            case DEVIDE:
                return 15;
            case EQ:
                return 16;
            case GT:
                return 17;
            case LT:
                return 18;
            case MINUS:
                return 19;
            case OR:
                return 20;
            case PLUS:
                return 21;
            case TIMES:
                return 22;
        }
        return yyr20();
    }

    private int yys46() {
        switch (yytok) {
            case AND:
                return 13;
            case CONS:
                return 14;
            case DEVIDE:
                return 15;
            case EQ:
                return 16;
            case GT:
                return 17;
            case LT:
                return 18;
            case MINUS:
                return 19;
            case OR:
                return 20;
            case PLUS:
                return 21;
            case TIMES:
                return 22;
            case ELSE:
                return 50;
        }
        return 123;
    }

    private int yys47() {
        switch (yytok) {
            case AND:
                return 13;
            case CONS:
                return 14;
            case DEVIDE:
                return 15;
            case EQ:
                return 16;
            case GT:
                return 17;
            case LT:
                return 18;
            case MINUS:
                return 19;
            case OR:
                return 20;
            case PLUS:
                return 21;
            case TIMES:
                return 22;
            case IN:
                return 51;
        }
        return 123;
    }

    private int yys48() {
        switch (yytok) {
            case HEAD:
            case ASSIGN:
            case SKIP:
            case LOW:
            case error:
            case COMMA:
            case LAMDA:
            case SND:
            case NIL:
            case FST:
            case TAIL:
                return 123;
        }
        return yyr21();
    }

    private int yys49() {
        switch (yytok) {
            case AND:
                return 13;
            case CONS:
                return 14;
            case DEVIDE:
                return 15;
            case EQ:
                return 16;
            case GT:
                return 17;
            case LT:
                return 18;
            case MINUS:
                return 19;
            case OR:
                return 20;
            case PLUS:
                return 21;
            case TIMES:
                return 22;
            case END:
                return 52;
        }
        return 123;
    }

    private int yys50() {
        switch (yytok) {
            case BOOLEAN:
                return 3;
            case FUN:
                return 4;
            case ID:
                return 5;
            case IF:
                return 6;
            case INTEGER:
                return 7;
            case LET:
                return 8;
            case LPAREN:
                return 9;
            case NOT:
                return 10;
            case UMINUS:
                return 11;
            case WHILE:
                return 12;
        }
        return 123;
    }

    private int yys51() {
        switch (yytok) {
            case BOOLEAN:
                return 3;
            case FUN:
                return 4;
            case ID:
                return 5;
            case IF:
                return 6;
            case INTEGER:
                return 7;
            case LET:
                return 8;
            case LPAREN:
                return 9;
            case NOT:
                return 10;
            case UMINUS:
                return 11;
            case WHILE:
                return 12;
        }
        return 123;
    }

    private int yys52() {
        switch (yytok) {
            case HEAD:
            case ASSIGN:
            case SKIP:
            case LOW:
            case error:
            case COMMA:
            case LAMDA:
            case SND:
            case NIL:
            case FST:
            case TAIL:
                return 123;
        }
        return yyr17();
    }

    private int yys53() {
        switch (yytok) {
            case AND:
                return 13;
            case CONS:
                return 14;
            case DEVIDE:
                return 15;
            case EQ:
                return 16;
            case GT:
                return 17;
            case LT:
                return 18;
            case MINUS:
                return 19;
            case OR:
                return 20;
            case PLUS:
                return 21;
            case TIMES:
                return 22;
            case END:
                return 56;
        }
        return 123;
    }

    private int yys55() {
        switch (yytok) {
            case AND:
                return 13;
            case CONS:
                return 14;
            case DEVIDE:
                return 15;
            case EQ:
                return 16;
            case GT:
                return 17;
            case LT:
                return 18;
            case MINUS:
                return 19;
            case OR:
                return 20;
            case PLUS:
                return 21;
            case TIMES:
                return 22;
            case SEMICOLON:
                return 58;
            case END:
                return yyr22();
        }
        return 123;
    }

    private int yys56() {
        switch (yytok) {
            case HEAD:
            case ASSIGN:
            case SKIP:
            case LOW:
            case error:
            case COMMA:
            case LAMDA:
            case SND:
            case NIL:
            case FST:
            case TAIL:
                return 123;
        }
        return yyr16();
    }

    private int yys57() {
        switch (yytok) {
            case HEAD:
            case ASSIGN:
            case SKIP:
            case LOW:
            case error:
            case COMMA:
            case LAMDA:
            case SND:
            case NIL:
            case FST:
            case TAIL:
                return 123;
        }
        return yyr2();
    }

    private int yys58() {
        switch (yytok) {
            case BOOLEAN:
                return 3;
            case FUN:
                return 4;
            case ID:
                return 5;
            case IF:
                return 6;
            case INTEGER:
                return 7;
            case LET:
                return 8;
            case LPAREN:
                return 9;
            case NOT:
                return 10;
            case UMINUS:
                return 11;
            case WHILE:
                return 12;
        }
        return 123;
    }

    private int yyr1() { // prog : expr
        { System.out.println(((Expression)yysv[yysp-1]).eval()); }
        yysv[yysp-=1] = yyrv;
        return 1;
    }

    private int yyr22() { // expseq : expr
        {yyrv=yysv[yysp-1];}
        yysv[yysp-=1] = yyrv;
        return yypexpseq();
    }

    private int yyr23() { // expseq : expr SEMICOLON expseq
        {yyrv = new Sequence(yysv[yysp-3],yysv[yysp-1]);}
        yysv[yysp-=3] = yyrv;
        return yypexpseq();
    }

    private int yypexpseq() {
        switch (yyst[yysp-1]) {
            case 51: return 54;
            default: return 59;
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

    private int yyr20() { // expr : FUN ID LAMDA expr
        {yyrv = new AnonymousFunction(new Variable(yysv[yysp-3]), yysv[yysp-1]);}
        yysv[yysp-=4] = yyrv;
        return yypexpr();
    }

    private int yyr21() { // expr : LPAREN expr expr RPAREN
        {yyrv = new Application(yysv[yysp-3], yysv[yysp-2]);}
        yysv[yysp-=4] = yyrv;
        return yypexpr();
    }

    private int yypexpr() {
        switch (yyst[yysp-1]) {
            case 50: return 53;
            case 44: return 49;
            case 42: return 47;
            case 41: return 46;
            case 40: return 45;
            case 26: return 43;
            case 22: return 39;
            case 21: return 38;
            case 20: return 37;
            case 19: return 36;
            case 18: return 35;
            case 17: return 34;
            case 16: return 33;
            case 15: return 32;
            case 14: return 31;
            case 13: return 30;
            case 12: return 29;
            case 11: return 28;
            case 10: return 27;
            case 9: return 26;
            case 6: return 24;
            case 0: return 2;
            default: return 55;
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
