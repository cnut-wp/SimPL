// Output created by jacc on Wed May 29 21:14:03 CST 2013

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
                case 67:
                    yyn = yys0();
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 68:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 134;
                            continue;
                    }
                    yyn = 137;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 69:
                    yyn = yys2();
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 70:
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
                case 71:
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
                case 72:
                    switch (yytok) {
                        case ID:
                            yyn = 27;
                            continue;
                    }
                    yyn = 137;
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
                case 73:
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
                case 74:
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
                case 75:
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
                case 76:
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
                case 77:
                    switch (yytok) {
                        case ID:
                            yyn = 30;
                            continue;
                    }
                    yyn = 137;
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
                case 78:
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
                case 79:
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
                case 80:
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
                case 81:
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
                case 82:
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
                case 83:
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
                case 84:
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
                case 85:
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
                case 86:
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
                case 87:
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
                case 88:
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
                case 89:
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
                case 90:
                    yyn = yys23();
                    continue;

                case 24:
                    yyst[yysp] = 24;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 91:
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
                case 92:
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
                case 93:
                    yyn = yys26();
                    continue;

                case 27:
                    yyst[yysp] = 27;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 94:
                    switch (yytok) {
                        case LAMDA:
                            yyn = 46;
                            continue;
                    }
                    yyn = 137;
                    continue;

                case 28:
                    yyst[yysp] = 28;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 95:
                    yyn = yys28();
                    continue;

                case 29:
                    yyst[yysp] = 29;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 96:
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
                case 97:
                    switch (yytok) {
                        case EQ:
                            yyn = 48;
                            continue;
                    }
                    yyn = 137;
                    continue;

                case 31:
                    yyst[yysp] = 31;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 98:
                    yyn = yys31();
                    continue;

                case 32:
                    yyst[yysp] = 32;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 99:
                    yyn = yys32();
                    continue;

                case 33:
                    yyst[yysp] = 33;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 100:
                    yyn = yys33();
                    continue;

                case 34:
                    yyst[yysp] = 34;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 101:
                    yyn = yys34();
                    continue;

                case 35:
                    yyst[yysp] = 35;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 102:
                    yyn = yys35();
                    continue;

                case 36:
                    yyst[yysp] = 36;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 103:
                    yyn = yys36();
                    continue;

                case 37:
                    yyst[yysp] = 37;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 104:
                    yyn = yys37();
                    continue;

                case 38:
                    yyst[yysp] = 38;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 105:
                    yyn = yys38();
                    continue;

                case 39:
                    yyst[yysp] = 39;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 106:
                    yyn = yys39();
                    continue;

                case 40:
                    yyst[yysp] = 40;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 107:
                    yyn = yys40();
                    continue;

                case 41:
                    yyst[yysp] = 41;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 108:
                    yyn = yys41();
                    continue;

                case 42:
                    yyst[yysp] = 42;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 109:
                    yyn = yys42();
                    continue;

                case 43:
                    yyst[yysp] = 43;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 110:
                    yyn = yys43();
                    continue;

                case 44:
                    yyst[yysp] = 44;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 111:
                    yyn = yys44();
                    continue;

                case 45:
                    yyst[yysp] = 45;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 112:
                    yyn = yys45();
                    continue;

                case 46:
                    yyst[yysp] = 46;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 113:
                    yyn = yys46();
                    continue;

                case 47:
                    yyst[yysp] = 47;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 114:
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
                case 115:
                    yyn = yys48();
                    continue;

                case 49:
                    yyst[yysp] = 49;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 116:
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
                case 117:
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
                case 118:
                    yyn = yys51();
                    continue;

                case 52:
                    yyst[yysp] = 52;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 119:
                    yyn = yys52();
                    continue;

                case 53:
                    yyst[yysp] = 53;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 120:
                    yyn = yys53();
                    continue;

                case 54:
                    yyst[yysp] = 54;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 121:
                    yyn = yys54();
                    continue;

                case 55:
                    yyst[yysp] = 55;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 122:
                    yyn = yys55();
                    continue;

                case 56:
                    yyst[yysp] = 56;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 123:
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
                case 124:
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
                case 125:
                    yyn = yys58();
                    continue;

                case 59:
                    yyst[yysp] = 59;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 126:
                    yyn = yys59();
                    continue;

                case 60:
                    yyst[yysp] = 60;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 127:
                    yyn = yys60();
                    continue;

                case 61:
                    yyst[yysp] = 61;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 128:
                    switch (yytok) {
                        case END:
                            yyn = 64;
                            continue;
                    }
                    yyn = 137;
                    continue;

                case 62:
                    yyst[yysp] = 62;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 129:
                    yyn = yys62();
                    continue;

                case 63:
                    yyst[yysp] = 63;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 130:
                    yyn = yys63();
                    continue;

                case 64:
                    yyst[yysp] = 64;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 131:
                    yyn = yys64();
                    continue;

                case 65:
                    yyst[yysp] = 65;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 132:
                    yyn = yys65();
                    continue;

                case 66:
                    yyst[yysp] = 66;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 133:
                    switch (yytok) {
                        case END:
                            yyn = yyr26();
                            continue;
                    }
                    yyn = 137;
                    continue;

                case 134:
                    return true;
                case 135:
                    yyerror("stack overflow");
                case 136:
                    return false;
                case 137:
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
                return 4;
            case FUN:
                return 5;
            case HEAD:
                return 6;
            case ID:
                return 7;
            case IF:
                return 8;
            case INTEGER:
                return 9;
            case LET:
                return 10;
            case LPAREN:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case TAIL:
                return 14;
            case UMINUS:
                return 15;
            case WHILE:
                return 16;
        }
        return 137;
    }

    private int yys2() {
        switch (yytok) {
            case error:
            case LOW:
            case FST:
            case COMMA:
            case ASSIGN:
            case SND:
            case LAMDA:
            case SKIP:
                return 137;
        }
        return yyr19();
    }

    private int yys3() {
        switch (yytok) {
            case AND:
                return 17;
            case CONS:
                return 18;
            case DEVIDE:
                return 19;
            case EQ:
                return 20;
            case GT:
                return 21;
            case LT:
                return 22;
            case MINUS:
                return 23;
            case OR:
                return 24;
            case PLUS:
                return 25;
            case TIMES:
                return 26;
            case ENDINPUT:
                return yyr1();
        }
        return 137;
    }

    private int yys4() {
        switch (yytok) {
            case error:
            case LOW:
            case FST:
            case COMMA:
            case ASSIGN:
            case SND:
            case LAMDA:
            case SKIP:
                return 137;
        }
        return yyr14();
    }

    private int yys6() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FUN:
                return 5;
            case HEAD:
                return 6;
            case ID:
                return 7;
            case IF:
                return 8;
            case INTEGER:
                return 9;
            case LET:
                return 10;
            case LPAREN:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case TAIL:
                return 14;
            case UMINUS:
                return 15;
            case WHILE:
                return 16;
        }
        return 137;
    }

    private int yys7() {
        switch (yytok) {
            case error:
            case LOW:
            case FST:
            case COMMA:
            case ASSIGN:
            case SND:
            case LAMDA:
            case SKIP:
                return 137;
        }
        return yyr18();
    }

    private int yys8() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FUN:
                return 5;
            case HEAD:
                return 6;
            case ID:
                return 7;
            case IF:
                return 8;
            case INTEGER:
                return 9;
            case LET:
                return 10;
            case LPAREN:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case TAIL:
                return 14;
            case UMINUS:
                return 15;
            case WHILE:
                return 16;
        }
        return 137;
    }

    private int yys9() {
        switch (yytok) {
            case error:
            case LOW:
            case FST:
            case COMMA:
            case ASSIGN:
            case SND:
            case LAMDA:
            case SKIP:
                return 137;
        }
        return yyr12();
    }

    private int yys11() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FUN:
                return 5;
            case HEAD:
                return 6;
            case ID:
                return 7;
            case IF:
                return 8;
            case INTEGER:
                return 9;
            case LET:
                return 10;
            case LPAREN:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case TAIL:
                return 14;
            case UMINUS:
                return 15;
            case WHILE:
                return 16;
        }
        return 137;
    }

    private int yys12() {
        switch (yytok) {
            case error:
            case LOW:
            case FST:
            case COMMA:
            case ASSIGN:
            case SND:
            case LAMDA:
            case SKIP:
                return 137;
        }
        return yyr28();
    }

    private int yys13() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FUN:
                return 5;
            case HEAD:
                return 6;
            case ID:
                return 7;
            case IF:
                return 8;
            case INTEGER:
                return 9;
            case LET:
                return 10;
            case LPAREN:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case TAIL:
                return 14;
            case UMINUS:
                return 15;
            case WHILE:
                return 16;
        }
        return 137;
    }

    private int yys14() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FUN:
                return 5;
            case HEAD:
                return 6;
            case ID:
                return 7;
            case IF:
                return 8;
            case INTEGER:
                return 9;
            case LET:
                return 10;
            case LPAREN:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case TAIL:
                return 14;
            case UMINUS:
                return 15;
            case WHILE:
                return 16;
        }
        return 137;
    }

    private int yys15() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FUN:
                return 5;
            case HEAD:
                return 6;
            case ID:
                return 7;
            case IF:
                return 8;
            case INTEGER:
                return 9;
            case LET:
                return 10;
            case LPAREN:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case TAIL:
                return 14;
            case UMINUS:
                return 15;
            case WHILE:
                return 16;
        }
        return 137;
    }

    private int yys16() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FUN:
                return 5;
            case HEAD:
                return 6;
            case ID:
                return 7;
            case IF:
                return 8;
            case INTEGER:
                return 9;
            case LET:
                return 10;
            case LPAREN:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case TAIL:
                return 14;
            case UMINUS:
                return 15;
            case WHILE:
                return 16;
        }
        return 137;
    }

    private int yys17() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FUN:
                return 5;
            case HEAD:
                return 6;
            case ID:
                return 7;
            case IF:
                return 8;
            case INTEGER:
                return 9;
            case LET:
                return 10;
            case LPAREN:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case TAIL:
                return 14;
            case UMINUS:
                return 15;
            case WHILE:
                return 16;
        }
        return 137;
    }

    private int yys18() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FUN:
                return 5;
            case HEAD:
                return 6;
            case ID:
                return 7;
            case IF:
                return 8;
            case INTEGER:
                return 9;
            case LET:
                return 10;
            case LPAREN:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case TAIL:
                return 14;
            case UMINUS:
                return 15;
            case WHILE:
                return 16;
        }
        return 137;
    }

    private int yys19() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FUN:
                return 5;
            case HEAD:
                return 6;
            case ID:
                return 7;
            case IF:
                return 8;
            case INTEGER:
                return 9;
            case LET:
                return 10;
            case LPAREN:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case TAIL:
                return 14;
            case UMINUS:
                return 15;
            case WHILE:
                return 16;
        }
        return 137;
    }

    private int yys20() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FUN:
                return 5;
            case HEAD:
                return 6;
            case ID:
                return 7;
            case IF:
                return 8;
            case INTEGER:
                return 9;
            case LET:
                return 10;
            case LPAREN:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case TAIL:
                return 14;
            case UMINUS:
                return 15;
            case WHILE:
                return 16;
        }
        return 137;
    }

    private int yys21() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FUN:
                return 5;
            case HEAD:
                return 6;
            case ID:
                return 7;
            case IF:
                return 8;
            case INTEGER:
                return 9;
            case LET:
                return 10;
            case LPAREN:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case TAIL:
                return 14;
            case UMINUS:
                return 15;
            case WHILE:
                return 16;
        }
        return 137;
    }

    private int yys22() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FUN:
                return 5;
            case HEAD:
                return 6;
            case ID:
                return 7;
            case IF:
                return 8;
            case INTEGER:
                return 9;
            case LET:
                return 10;
            case LPAREN:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case TAIL:
                return 14;
            case UMINUS:
                return 15;
            case WHILE:
                return 16;
        }
        return 137;
    }

    private int yys23() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FUN:
                return 5;
            case HEAD:
                return 6;
            case ID:
                return 7;
            case IF:
                return 8;
            case INTEGER:
                return 9;
            case LET:
                return 10;
            case LPAREN:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case TAIL:
                return 14;
            case UMINUS:
                return 15;
            case WHILE:
                return 16;
        }
        return 137;
    }

    private int yys24() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FUN:
                return 5;
            case HEAD:
                return 6;
            case ID:
                return 7;
            case IF:
                return 8;
            case INTEGER:
                return 9;
            case LET:
                return 10;
            case LPAREN:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case TAIL:
                return 14;
            case UMINUS:
                return 15;
            case WHILE:
                return 16;
        }
        return 137;
    }

    private int yys25() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FUN:
                return 5;
            case HEAD:
                return 6;
            case ID:
                return 7;
            case IF:
                return 8;
            case INTEGER:
                return 9;
            case LET:
                return 10;
            case LPAREN:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case TAIL:
                return 14;
            case UMINUS:
                return 15;
            case WHILE:
                return 16;
        }
        return 137;
    }

    private int yys26() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FUN:
                return 5;
            case HEAD:
                return 6;
            case ID:
                return 7;
            case IF:
                return 8;
            case INTEGER:
                return 9;
            case LET:
                return 10;
            case LPAREN:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case TAIL:
                return 14;
            case UMINUS:
                return 15;
            case WHILE:
                return 16;
        }
        return 137;
    }

    private int yys28() {
        switch (yytok) {
            case error:
            case LOW:
            case FST:
            case COMMA:
            case ASSIGN:
            case SND:
            case LAMDA:
            case SKIP:
                return 137;
        }
        return yyr23();
    }

    private int yys29() {
        switch (yytok) {
            case AND:
                return 17;
            case CONS:
                return 18;
            case DEVIDE:
                return 19;
            case EQ:
                return 20;
            case GT:
                return 21;
            case LT:
                return 22;
            case MINUS:
                return 23;
            case OR:
                return 24;
            case PLUS:
                return 25;
            case TIMES:
                return 26;
            case THEN:
                return 47;
        }
        return 137;
    }

    private int yys31() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FUN:
                return 5;
            case HEAD:
                return 6;
            case ID:
                return 7;
            case IF:
                return 8;
            case INTEGER:
                return 9;
            case LET:
                return 10;
            case LPAREN:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case TAIL:
                return 14;
            case UMINUS:
                return 15;
            case WHILE:
                return 16;
            case AND:
                return 17;
            case CONS:
                return 18;
            case DEVIDE:
                return 19;
            case EQ:
                return 20;
            case GT:
                return 21;
            case LT:
                return 22;
            case MINUS:
                return 23;
            case OR:
                return 24;
            case PLUS:
                return 25;
            case TIMES:
                return 26;
            case RPAREN:
                return 50;
        }
        return 137;
    }

    private int yys32() {
        switch (yytok) {
            case error:
            case LOW:
            case FST:
            case COMMA:
            case ASSIGN:
            case SND:
            case LAMDA:
            case SKIP:
                return 137;
        }
        return yyr15();
    }

    private int yys33() {
        switch (yytok) {
            case error:
            case LOW:
            case FST:
            case COMMA:
            case ASSIGN:
            case SND:
            case LAMDA:
            case SKIP:
                return 137;
        }
        return yyr22();
    }

    private int yys34() {
        switch (yytok) {
            case error:
            case LOW:
            case FST:
            case COMMA:
            case ASSIGN:
            case SND:
            case LAMDA:
            case SKIP:
                return 137;
        }
        return yyr13();
    }

    private int yys35() {
        switch (yytok) {
            case AND:
                return 17;
            case CONS:
                return 18;
            case DEVIDE:
                return 19;
            case EQ:
                return 20;
            case GT:
                return 21;
            case LT:
                return 22;
            case MINUS:
                return 23;
            case OR:
                return 24;
            case PLUS:
                return 25;
            case TIMES:
                return 26;
            case DO:
                return 51;
        }
        return 137;
    }

    private int yys36() {
        switch (yytok) {
            case error:
            case ASSIGN:
            case FST:
            case LOW:
            case COMMA:
            case LAMDA:
            case SKIP:
            case SND:
                return 137;
            case CONS:
                return 18;
            case DEVIDE:
                return 19;
            case EQ:
                return 20;
            case GT:
                return 21;
            case LT:
                return 22;
            case MINUS:
                return 23;
            case PLUS:
                return 25;
            case TIMES:
                return 26;
        }
        return yyr10();
    }

    private int yys37() {
        switch (yytok) {
            case ASSIGN:
            case LAMDA:
            case COMMA:
            case FST:
            case error:
            case LOW:
            case SKIP:
            case SND:
                return 137;
            case DEVIDE:
                return 19;
            case EQ:
                return 20;
            case GT:
                return 21;
            case LT:
                return 22;
            case MINUS:
                return 23;
            case PLUS:
                return 25;
            case TIMES:
                return 26;
        }
        return yyr27();
    }

    private int yys38() {
        switch (yytok) {
            case error:
            case LOW:
            case FST:
            case COMMA:
            case ASSIGN:
            case SND:
            case LAMDA:
            case SKIP:
                return 137;
        }
        return yyr6();
    }

    private int yys39() {
        switch (yytok) {
            case FST:
            case error:
            case LOW:
            case COMMA:
            case LAMDA:
            case ASSIGN:
            case SKIP:
            case SND:
                return 137;
            case DEVIDE:
                return 19;
            case MINUS:
                return 23;
            case PLUS:
                return 25;
            case TIMES:
                return 26;
        }
        return yyr9();
    }

    private int yys40() {
        switch (yytok) {
            case FST:
            case error:
            case LOW:
            case COMMA:
            case LAMDA:
            case ASSIGN:
            case SKIP:
            case SND:
                return 137;
            case DEVIDE:
                return 19;
            case MINUS:
                return 23;
            case PLUS:
                return 25;
            case TIMES:
                return 26;
        }
        return yyr7();
    }

    private int yys41() {
        switch (yytok) {
            case FST:
            case error:
            case LOW:
            case COMMA:
            case LAMDA:
            case ASSIGN:
            case SKIP:
            case SND:
                return 137;
            case DEVIDE:
                return 19;
            case MINUS:
                return 23;
            case PLUS:
                return 25;
            case TIMES:
                return 26;
        }
        return yyr8();
    }

    private int yys42() {
        switch (yytok) {
            case FST:
            case LAMDA:
            case COMMA:
            case LOW:
            case ASSIGN:
            case error:
            case SKIP:
            case SND:
                return 137;
            case DEVIDE:
                return 19;
            case TIMES:
                return 26;
        }
        return yyr4();
    }

    private int yys43() {
        switch (yytok) {
            case error:
            case ASSIGN:
            case FST:
            case LOW:
            case COMMA:
            case LAMDA:
            case SKIP:
            case SND:
                return 137;
            case CONS:
                return 18;
            case DEVIDE:
                return 19;
            case EQ:
                return 20;
            case GT:
                return 21;
            case LT:
                return 22;
            case MINUS:
                return 23;
            case PLUS:
                return 25;
            case TIMES:
                return 26;
        }
        return yyr11();
    }

    private int yys44() {
        switch (yytok) {
            case FST:
            case LAMDA:
            case COMMA:
            case LOW:
            case ASSIGN:
            case error:
            case SKIP:
            case SND:
                return 137;
            case DEVIDE:
                return 19;
            case TIMES:
                return 26;
        }
        return yyr3();
    }

    private int yys45() {
        switch (yytok) {
            case error:
            case LOW:
            case FST:
            case COMMA:
            case ASSIGN:
            case SND:
            case LAMDA:
            case SKIP:
                return 137;
        }
        return yyr5();
    }

    private int yys46() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FUN:
                return 5;
            case HEAD:
                return 6;
            case ID:
                return 7;
            case IF:
                return 8;
            case INTEGER:
                return 9;
            case LET:
                return 10;
            case LPAREN:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case TAIL:
                return 14;
            case UMINUS:
                return 15;
            case WHILE:
                return 16;
        }
        return 137;
    }

    private int yys47() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FUN:
                return 5;
            case HEAD:
                return 6;
            case ID:
                return 7;
            case IF:
                return 8;
            case INTEGER:
                return 9;
            case LET:
                return 10;
            case LPAREN:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case TAIL:
                return 14;
            case UMINUS:
                return 15;
            case WHILE:
                return 16;
        }
        return 137;
    }

    private int yys48() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FUN:
                return 5;
            case HEAD:
                return 6;
            case ID:
                return 7;
            case IF:
                return 8;
            case INTEGER:
                return 9;
            case LET:
                return 10;
            case LPAREN:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case TAIL:
                return 14;
            case UMINUS:
                return 15;
            case WHILE:
                return 16;
        }
        return 137;
    }

    private int yys49() {
        switch (yytok) {
            case AND:
                return 17;
            case CONS:
                return 18;
            case DEVIDE:
                return 19;
            case EQ:
                return 20;
            case GT:
                return 21;
            case LT:
                return 22;
            case MINUS:
                return 23;
            case OR:
                return 24;
            case PLUS:
                return 25;
            case TIMES:
                return 26;
            case RPAREN:
                return 55;
        }
        return 137;
    }

    private int yys50() {
        switch (yytok) {
            case error:
            case LOW:
            case FST:
            case COMMA:
            case ASSIGN:
            case SND:
            case LAMDA:
            case SKIP:
                return 137;
        }
        return yyr24();
    }

    private int yys51() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FUN:
                return 5;
            case HEAD:
                return 6;
            case ID:
                return 7;
            case IF:
                return 8;
            case INTEGER:
                return 9;
            case LET:
                return 10;
            case LPAREN:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case TAIL:
                return 14;
            case UMINUS:
                return 15;
            case WHILE:
                return 16;
        }
        return 137;
    }

    private int yys52() {
        switch (yytok) {
            case SND:
            case error:
            case ASSIGN:
            case FST:
            case SKIP:
            case LOW:
            case LAMDA:
            case COMMA:
                return 137;
            case AND:
                return 17;
            case CONS:
                return 18;
            case DEVIDE:
                return 19;
            case EQ:
                return 20;
            case GT:
                return 21;
            case LT:
                return 22;
            case MINUS:
                return 23;
            case OR:
                return 24;
            case PLUS:
                return 25;
            case TIMES:
                return 26;
        }
        return yyr20();
    }

    private int yys53() {
        switch (yytok) {
            case AND:
                return 17;
            case CONS:
                return 18;
            case DEVIDE:
                return 19;
            case EQ:
                return 20;
            case GT:
                return 21;
            case LT:
                return 22;
            case MINUS:
                return 23;
            case OR:
                return 24;
            case PLUS:
                return 25;
            case TIMES:
                return 26;
            case ELSE:
                return 57;
        }
        return 137;
    }

    private int yys54() {
        switch (yytok) {
            case AND:
                return 17;
            case CONS:
                return 18;
            case DEVIDE:
                return 19;
            case EQ:
                return 20;
            case GT:
                return 21;
            case LT:
                return 22;
            case MINUS:
                return 23;
            case OR:
                return 24;
            case PLUS:
                return 25;
            case TIMES:
                return 26;
            case IN:
                return 58;
        }
        return 137;
    }

    private int yys55() {
        switch (yytok) {
            case error:
            case LOW:
            case FST:
            case COMMA:
            case ASSIGN:
            case SND:
            case LAMDA:
            case SKIP:
                return 137;
        }
        return yyr21();
    }

    private int yys56() {
        switch (yytok) {
            case AND:
                return 17;
            case CONS:
                return 18;
            case DEVIDE:
                return 19;
            case EQ:
                return 20;
            case GT:
                return 21;
            case LT:
                return 22;
            case MINUS:
                return 23;
            case OR:
                return 24;
            case PLUS:
                return 25;
            case TIMES:
                return 26;
            case END:
                return 59;
        }
        return 137;
    }

    private int yys57() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FUN:
                return 5;
            case HEAD:
                return 6;
            case ID:
                return 7;
            case IF:
                return 8;
            case INTEGER:
                return 9;
            case LET:
                return 10;
            case LPAREN:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case TAIL:
                return 14;
            case UMINUS:
                return 15;
            case WHILE:
                return 16;
        }
        return 137;
    }

    private int yys58() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FUN:
                return 5;
            case HEAD:
                return 6;
            case ID:
                return 7;
            case IF:
                return 8;
            case INTEGER:
                return 9;
            case LET:
                return 10;
            case LPAREN:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case TAIL:
                return 14;
            case UMINUS:
                return 15;
            case WHILE:
                return 16;
        }
        return 137;
    }

    private int yys59() {
        switch (yytok) {
            case error:
            case LOW:
            case FST:
            case COMMA:
            case ASSIGN:
            case SND:
            case LAMDA:
            case SKIP:
                return 137;
        }
        return yyr17();
    }

    private int yys60() {
        switch (yytok) {
            case AND:
                return 17;
            case CONS:
                return 18;
            case DEVIDE:
                return 19;
            case EQ:
                return 20;
            case GT:
                return 21;
            case LT:
                return 22;
            case MINUS:
                return 23;
            case OR:
                return 24;
            case PLUS:
                return 25;
            case TIMES:
                return 26;
            case END:
                return 63;
        }
        return 137;
    }

    private int yys62() {
        switch (yytok) {
            case AND:
                return 17;
            case CONS:
                return 18;
            case DEVIDE:
                return 19;
            case EQ:
                return 20;
            case GT:
                return 21;
            case LT:
                return 22;
            case MINUS:
                return 23;
            case OR:
                return 24;
            case PLUS:
                return 25;
            case TIMES:
                return 26;
            case SEMICOLON:
                return 65;
            case END:
                return yyr25();
        }
        return 137;
    }

    private int yys63() {
        switch (yytok) {
            case error:
            case LOW:
            case FST:
            case COMMA:
            case ASSIGN:
            case SND:
            case LAMDA:
            case SKIP:
                return 137;
        }
        return yyr16();
    }

    private int yys64() {
        switch (yytok) {
            case error:
            case LOW:
            case FST:
            case COMMA:
            case ASSIGN:
            case SND:
            case LAMDA:
            case SKIP:
                return 137;
        }
        return yyr2();
    }

    private int yys65() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FUN:
                return 5;
            case HEAD:
                return 6;
            case ID:
                return 7;
            case IF:
                return 8;
            case INTEGER:
                return 9;
            case LET:
                return 10;
            case LPAREN:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case TAIL:
                return 14;
            case UMINUS:
                return 15;
            case WHILE:
                return 16;
        }
        return 137;
    }

    private int yyr1() { // prog : expr
        { System.out.println(((Expression)yysv[yysp-1]).eval()); }
        yysv[yysp-=1] = yyrv;
        return 1;
    }

    private int yyr25() { // expseq : expr
        {yyrv=yysv[yysp-1];}
        yysv[yysp-=1] = yyrv;
        return yypexpseq();
    }

    private int yyr26() { // expseq : expr SEMICOLON expseq
        {yyrv = new Sequence(yysv[yysp-3],yysv[yysp-1]);}
        yysv[yysp-=3] = yyrv;
        return yypexpseq();
    }

    private int yypexpseq() {
        switch (yyst[yysp-1]) {
            case 58: return 61;
            default: return 66;
        }
    }

    private int yyr27() { // list : expr CONS expr
        { yyrv = new List(yysv[yysp-3],yysv[yysp-1]);}
        yysv[yysp-=3] = yyrv;
        return 2;
    }

    private int yyr28() { // list : NIL
        {yyrv = new Nil();}
        yysv[yysp-=1] = yyrv;
        return 2;
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

    private int yyr19() { // expr : list
        {yyrv = yysv[yysp-1];}
        yysv[yysp-=1] = yyrv;
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

    private int yyr22() { // expr : TAIL expr
        {yyrv = new Tail(yysv[yysp-1]);}
        yysv[yysp-=2] = yyrv;
        return yypexpr();
    }

    private int yyr23() { // expr : HEAD expr
        {yyrv = new Head(yysv[yysp-1]);}
        yysv[yysp-=2] = yyrv;
        return yypexpr();
    }

    private int yyr24() { // expr : LPAREN expr RPAREN
        {yyrv = new Bracket(yysv[yysp-2]);}
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yypexpr() {
        switch (yyst[yysp-1]) {
            case 57: return 60;
            case 51: return 56;
            case 48: return 54;
            case 47: return 53;
            case 46: return 52;
            case 31: return 49;
            case 26: return 45;
            case 25: return 44;
            case 24: return 43;
            case 23: return 42;
            case 22: return 41;
            case 21: return 40;
            case 20: return 39;
            case 19: return 38;
            case 18: return 37;
            case 17: return 36;
            case 16: return 35;
            case 15: return 34;
            case 14: return 33;
            case 13: return 32;
            case 11: return 31;
            case 8: return 29;
            case 6: return 28;
            case 0: return 3;
            default: return 62;
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
