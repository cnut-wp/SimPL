// Output created by jacc on Wed May 29 21:30:54 CST 2013

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
                case 70:
                    yyn = yys0();
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 71:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 140;
                            continue;
                    }
                    yyn = 143;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 72:
                    yyn = yys2();
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 73:
                    yyn = yys3();
                    continue;

                case 4:
                    yyst[yysp] = 4;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 74:
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
                case 75:
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
                case 76:
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
                case 77:
                    switch (yytok) {
                        case ID:
                            yyn = 29;
                            continue;
                    }
                    yyn = 143;
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
                case 78:
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
                case 79:
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
                case 80:
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
                case 81:
                    switch (yytok) {
                        case ID:
                            yyn = 31;
                            continue;
                    }
                    yyn = 143;
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
                case 82:
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
                case 83:
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
                case 84:
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
                case 85:
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
                case 86:
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
                case 87:
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
                case 88:
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
                case 89:
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
                case 90:
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
                case 91:
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
                case 92:
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
                case 93:
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
                case 94:
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
                case 95:
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
                case 96:
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
                case 97:
                    yyn = yys27();
                    continue;

                case 28:
                    yyst[yysp] = 28;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 98:
                    yyn = yys28();
                    continue;

                case 29:
                    yyst[yysp] = 29;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 99:
                    switch (yytok) {
                        case LAMDA:
                            yyn = 47;
                            continue;
                    }
                    yyn = 143;
                    continue;

                case 30:
                    yyst[yysp] = 30;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 100:
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
                case 101:
                    switch (yytok) {
                        case EQ:
                            yyn = 49;
                            continue;
                    }
                    yyn = 143;
                    continue;

                case 32:
                    yyst[yysp] = 32;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 102:
                    yyn = yys32();
                    continue;

                case 33:
                    yyst[yysp] = 33;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 103:
                    yyn = yys33();
                    continue;

                case 34:
                    yyst[yysp] = 34;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 104:
                    yyn = yys34();
                    continue;

                case 35:
                    yyst[yysp] = 35;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 105:
                    yyn = yys35();
                    continue;

                case 36:
                    yyst[yysp] = 36;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 106:
                    yyn = yys36();
                    continue;

                case 37:
                    yyst[yysp] = 37;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 107:
                    yyn = yys37();
                    continue;

                case 38:
                    yyst[yysp] = 38;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 108:
                    yyn = yys38();
                    continue;

                case 39:
                    yyst[yysp] = 39;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 109:
                    yyn = yys39();
                    continue;

                case 40:
                    yyst[yysp] = 40;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 110:
                    yyn = yys40();
                    continue;

                case 41:
                    yyst[yysp] = 41;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 111:
                    yyn = yys41();
                    continue;

                case 42:
                    yyst[yysp] = 42;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 112:
                    yyn = yys42();
                    continue;

                case 43:
                    yyst[yysp] = 43;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 113:
                    yyn = yys43();
                    continue;

                case 44:
                    yyst[yysp] = 44;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 114:
                    yyn = yys44();
                    continue;

                case 45:
                    yyst[yysp] = 45;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 115:
                    yyn = yys45();
                    continue;

                case 46:
                    yyst[yysp] = 46;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 116:
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
                case 117:
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
                case 118:
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
                case 119:
                    yyn = yys49();
                    continue;

                case 50:
                    yyst[yysp] = 50;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 120:
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
                case 121:
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
                case 122:
                    yyn = yys52();
                    continue;

                case 53:
                    yyst[yysp] = 53;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 123:
                    yyn = yys53();
                    continue;

                case 54:
                    yyst[yysp] = 54;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 124:
                    yyn = yys54();
                    continue;

                case 55:
                    yyst[yysp] = 55;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 125:
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
                case 126:
                    yyn = yys56();
                    continue;

                case 57:
                    yyst[yysp] = 57;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 127:
                    yyn = yys57();
                    continue;

                case 58:
                    yyst[yysp] = 58;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 128:
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
                case 129:
                    yyn = yys59();
                    continue;

                case 60:
                    yyst[yysp] = 60;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 130:
                    yyn = yys60();
                    continue;

                case 61:
                    yyst[yysp] = 61;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 131:
                    yyn = yys61();
                    continue;

                case 62:
                    yyst[yysp] = 62;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 132:
                    yyn = yys62();
                    continue;

                case 63:
                    yyst[yysp] = 63;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 133:
                    yyn = yys63();
                    continue;

                case 64:
                    yyst[yysp] = 64;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 134:
                    switch (yytok) {
                        case END:
                            yyn = 67;
                            continue;
                    }
                    yyn = 143;
                    continue;

                case 65:
                    yyst[yysp] = 65;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 135:
                    yyn = yys65();
                    continue;

                case 66:
                    yyst[yysp] = 66;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 136:
                    yyn = yys66();
                    continue;

                case 67:
                    yyst[yysp] = 67;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 137:
                    yyn = yys67();
                    continue;

                case 68:
                    yyst[yysp] = 68;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 138:
                    yyn = yys68();
                    continue;

                case 69:
                    yyst[yysp] = 69;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 139:
                    switch (yytok) {
                        case END:
                            yyn = yyr26();
                            continue;
                    }
                    yyn = 143;
                    continue;

                case 140:
                    return true;
                case 141:
                    yyerror("stack overflow");
                case 142:
                    return false;
                case 143:
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
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case ID:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case LPAREN:
                return 12;
            case NIL:
                return 13;
            case NOT:
                return 14;
            case SND:
                return 15;
            case UMINUS:
                return 16;
            case WHILE:
                return 17;
        }
        return 143;
    }

    private int yys2() {
        switch (yytok) {
            case LAMDA:
            case HEAD:
            case LOW:
            case error:
            case ASSIGN:
            case SKIP:
            case TAIL:
                return 143;
        }
        return yyr19();
    }

    private int yys3() {
        switch (yytok) {
            case LAMDA:
            case HEAD:
            case LOW:
            case error:
            case ASSIGN:
            case SKIP:
            case TAIL:
                return 143;
        }
        return yyr20();
    }

    private int yys4() {
        switch (yytok) {
            case AND:
                return 18;
            case CONS:
                return 19;
            case DEVIDE:
                return 20;
            case EQ:
                return 21;
            case GT:
                return 22;
            case LT:
                return 23;
            case MINUS:
                return 24;
            case OR:
                return 25;
            case PLUS:
                return 26;
            case TIMES:
                return 27;
            case ENDINPUT:
                return yyr1();
        }
        return 143;
    }

    private int yys5() {
        switch (yytok) {
            case LAMDA:
            case HEAD:
            case LOW:
            case error:
            case ASSIGN:
            case SKIP:
            case TAIL:
                return 143;
        }
        return yyr14();
    }

    private int yys6() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case ID:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case LPAREN:
                return 12;
            case NIL:
                return 13;
            case NOT:
                return 14;
            case SND:
                return 15;
            case UMINUS:
                return 16;
            case WHILE:
                return 17;
        }
        return 143;
    }

    private int yys8() {
        switch (yytok) {
            case LAMDA:
            case HEAD:
            case LOW:
            case error:
            case ASSIGN:
            case SKIP:
            case TAIL:
                return 143;
        }
        return yyr18();
    }

    private int yys9() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case ID:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case LPAREN:
                return 12;
            case NIL:
                return 13;
            case NOT:
                return 14;
            case SND:
                return 15;
            case UMINUS:
                return 16;
            case WHILE:
                return 17;
        }
        return 143;
    }

    private int yys10() {
        switch (yytok) {
            case LAMDA:
            case HEAD:
            case LOW:
            case error:
            case ASSIGN:
            case SKIP:
            case TAIL:
                return 143;
        }
        return yyr12();
    }

    private int yys12() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case ID:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case LPAREN:
                return 12;
            case NIL:
                return 13;
            case NOT:
                return 14;
            case SND:
                return 15;
            case UMINUS:
                return 16;
            case WHILE:
                return 17;
        }
        return 143;
    }

    private int yys13() {
        switch (yytok) {
            case LAMDA:
            case HEAD:
            case LOW:
            case error:
            case ASSIGN:
            case SKIP:
            case TAIL:
                return 143;
        }
        return yyr28();
    }

    private int yys14() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case ID:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case LPAREN:
                return 12;
            case NIL:
                return 13;
            case NOT:
                return 14;
            case SND:
                return 15;
            case UMINUS:
                return 16;
            case WHILE:
                return 17;
        }
        return 143;
    }

    private int yys15() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case ID:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case LPAREN:
                return 12;
            case NIL:
                return 13;
            case NOT:
                return 14;
            case SND:
                return 15;
            case UMINUS:
                return 16;
            case WHILE:
                return 17;
        }
        return 143;
    }

    private int yys16() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case ID:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case LPAREN:
                return 12;
            case NIL:
                return 13;
            case NOT:
                return 14;
            case SND:
                return 15;
            case UMINUS:
                return 16;
            case WHILE:
                return 17;
        }
        return 143;
    }

    private int yys17() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case ID:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case LPAREN:
                return 12;
            case NIL:
                return 13;
            case NOT:
                return 14;
            case SND:
                return 15;
            case UMINUS:
                return 16;
            case WHILE:
                return 17;
        }
        return 143;
    }

    private int yys18() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case ID:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case LPAREN:
                return 12;
            case NIL:
                return 13;
            case NOT:
                return 14;
            case SND:
                return 15;
            case UMINUS:
                return 16;
            case WHILE:
                return 17;
        }
        return 143;
    }

    private int yys19() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case ID:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case LPAREN:
                return 12;
            case NIL:
                return 13;
            case NOT:
                return 14;
            case SND:
                return 15;
            case UMINUS:
                return 16;
            case WHILE:
                return 17;
        }
        return 143;
    }

    private int yys20() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case ID:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case LPAREN:
                return 12;
            case NIL:
                return 13;
            case NOT:
                return 14;
            case SND:
                return 15;
            case UMINUS:
                return 16;
            case WHILE:
                return 17;
        }
        return 143;
    }

    private int yys21() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case ID:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case LPAREN:
                return 12;
            case NIL:
                return 13;
            case NOT:
                return 14;
            case SND:
                return 15;
            case UMINUS:
                return 16;
            case WHILE:
                return 17;
        }
        return 143;
    }

    private int yys22() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case ID:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case LPAREN:
                return 12;
            case NIL:
                return 13;
            case NOT:
                return 14;
            case SND:
                return 15;
            case UMINUS:
                return 16;
            case WHILE:
                return 17;
        }
        return 143;
    }

    private int yys23() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case ID:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case LPAREN:
                return 12;
            case NIL:
                return 13;
            case NOT:
                return 14;
            case SND:
                return 15;
            case UMINUS:
                return 16;
            case WHILE:
                return 17;
        }
        return 143;
    }

    private int yys24() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case ID:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case LPAREN:
                return 12;
            case NIL:
                return 13;
            case NOT:
                return 14;
            case SND:
                return 15;
            case UMINUS:
                return 16;
            case WHILE:
                return 17;
        }
        return 143;
    }

    private int yys25() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case ID:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case LPAREN:
                return 12;
            case NIL:
                return 13;
            case NOT:
                return 14;
            case SND:
                return 15;
            case UMINUS:
                return 16;
            case WHILE:
                return 17;
        }
        return 143;
    }

    private int yys26() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case ID:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case LPAREN:
                return 12;
            case NIL:
                return 13;
            case NOT:
                return 14;
            case SND:
                return 15;
            case UMINUS:
                return 16;
            case WHILE:
                return 17;
        }
        return 143;
    }

    private int yys27() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case ID:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case LPAREN:
                return 12;
            case NIL:
                return 13;
            case NOT:
                return 14;
            case SND:
                return 15;
            case UMINUS:
                return 16;
            case WHILE:
                return 17;
        }
        return 143;
    }

    private int yys28() {
        switch (yytok) {
            case LAMDA:
            case HEAD:
            case LOW:
            case error:
            case ASSIGN:
            case SKIP:
            case TAIL:
                return 143;
        }
        return yyr21();
    }

    private int yys30() {
        switch (yytok) {
            case AND:
                return 18;
            case CONS:
                return 19;
            case DEVIDE:
                return 20;
            case EQ:
                return 21;
            case GT:
                return 22;
            case LT:
                return 23;
            case MINUS:
                return 24;
            case OR:
                return 25;
            case PLUS:
                return 26;
            case TIMES:
                return 27;
            case THEN:
                return 48;
        }
        return 143;
    }

    private int yys32() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case ID:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case LPAREN:
                return 12;
            case NIL:
                return 13;
            case NOT:
                return 14;
            case SND:
                return 15;
            case UMINUS:
                return 16;
            case WHILE:
                return 17;
            case AND:
                return 18;
            case CONS:
                return 19;
            case DEVIDE:
                return 20;
            case EQ:
                return 21;
            case GT:
                return 22;
            case LT:
                return 23;
            case MINUS:
                return 24;
            case OR:
                return 25;
            case PLUS:
                return 26;
            case TIMES:
                return 27;
            case COMMA:
                return 51;
        }
        return 143;
    }

    private int yys33() {
        switch (yytok) {
            case LAMDA:
            case HEAD:
            case LOW:
            case error:
            case ASSIGN:
            case SKIP:
            case TAIL:
                return 143;
        }
        return yyr15();
    }

    private int yys34() {
        switch (yytok) {
            case LAMDA:
            case HEAD:
            case LOW:
            case error:
            case ASSIGN:
            case SKIP:
            case TAIL:
                return 143;
        }
        return yyr22();
    }

    private int yys35() {
        switch (yytok) {
            case LAMDA:
            case HEAD:
            case LOW:
            case error:
            case ASSIGN:
            case SKIP:
            case TAIL:
                return 143;
        }
        return yyr13();
    }

    private int yys36() {
        switch (yytok) {
            case AND:
                return 18;
            case CONS:
                return 19;
            case DEVIDE:
                return 20;
            case EQ:
                return 21;
            case GT:
                return 22;
            case LT:
                return 23;
            case MINUS:
                return 24;
            case OR:
                return 25;
            case PLUS:
                return 26;
            case TIMES:
                return 27;
            case DO:
                return 52;
        }
        return 143;
    }

    private int yys37() {
        switch (yytok) {
            case LAMDA:
            case SKIP:
            case ASSIGN:
            case LOW:
            case error:
            case TAIL:
            case HEAD:
                return 143;
            case CONS:
                return 19;
            case DEVIDE:
                return 20;
            case EQ:
                return 21;
            case GT:
                return 22;
            case LT:
                return 23;
            case MINUS:
                return 24;
            case PLUS:
                return 26;
            case TIMES:
                return 27;
        }
        return yyr10();
    }

    private int yys38() {
        switch (yytok) {
            case SKIP:
            case TAIL:
            case LAMDA:
            case LOW:
            case ASSIGN:
            case error:
            case HEAD:
                return 143;
            case DEVIDE:
                return 20;
            case EQ:
                return 21;
            case GT:
                return 22;
            case LT:
                return 23;
            case MINUS:
                return 24;
            case PLUS:
                return 26;
            case TIMES:
                return 27;
        }
        return yyr27();
    }

    private int yys39() {
        switch (yytok) {
            case LAMDA:
            case HEAD:
            case LOW:
            case error:
            case ASSIGN:
            case SKIP:
            case TAIL:
                return 143;
        }
        return yyr6();
    }

    private int yys40() {
        switch (yytok) {
            case SKIP:
            case TAIL:
            case LOW:
            case ASSIGN:
            case error:
            case LAMDA:
            case HEAD:
                return 143;
            case DEVIDE:
                return 20;
            case MINUS:
                return 24;
            case PLUS:
                return 26;
            case TIMES:
                return 27;
        }
        return yyr9();
    }

    private int yys41() {
        switch (yytok) {
            case SKIP:
            case TAIL:
            case LOW:
            case ASSIGN:
            case error:
            case LAMDA:
            case HEAD:
                return 143;
            case DEVIDE:
                return 20;
            case MINUS:
                return 24;
            case PLUS:
                return 26;
            case TIMES:
                return 27;
        }
        return yyr7();
    }

    private int yys42() {
        switch (yytok) {
            case SKIP:
            case TAIL:
            case LOW:
            case ASSIGN:
            case error:
            case LAMDA:
            case HEAD:
                return 143;
            case DEVIDE:
                return 20;
            case MINUS:
                return 24;
            case PLUS:
                return 26;
            case TIMES:
                return 27;
        }
        return yyr8();
    }

    private int yys43() {
        switch (yytok) {
            case SKIP:
            case LOW:
            case TAIL:
            case ASSIGN:
            case LAMDA:
            case error:
            case HEAD:
                return 143;
            case DEVIDE:
                return 20;
            case TIMES:
                return 27;
        }
        return yyr4();
    }

    private int yys44() {
        switch (yytok) {
            case LAMDA:
            case SKIP:
            case ASSIGN:
            case LOW:
            case error:
            case TAIL:
            case HEAD:
                return 143;
            case CONS:
                return 19;
            case DEVIDE:
                return 20;
            case EQ:
                return 21;
            case GT:
                return 22;
            case LT:
                return 23;
            case MINUS:
                return 24;
            case PLUS:
                return 26;
            case TIMES:
                return 27;
        }
        return yyr11();
    }

    private int yys45() {
        switch (yytok) {
            case SKIP:
            case LOW:
            case TAIL:
            case ASSIGN:
            case LAMDA:
            case error:
            case HEAD:
                return 143;
            case DEVIDE:
                return 20;
            case TIMES:
                return 27;
        }
        return yyr3();
    }

    private int yys46() {
        switch (yytok) {
            case LAMDA:
            case HEAD:
            case LOW:
            case error:
            case ASSIGN:
            case SKIP:
            case TAIL:
                return 143;
        }
        return yyr5();
    }

    private int yys47() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case ID:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case LPAREN:
                return 12;
            case NIL:
                return 13;
            case NOT:
                return 14;
            case SND:
                return 15;
            case UMINUS:
                return 16;
            case WHILE:
                return 17;
        }
        return 143;
    }

    private int yys48() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case ID:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case LPAREN:
                return 12;
            case NIL:
                return 13;
            case NOT:
                return 14;
            case SND:
                return 15;
            case UMINUS:
                return 16;
            case WHILE:
                return 17;
        }
        return 143;
    }

    private int yys49() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case ID:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case LPAREN:
                return 12;
            case NIL:
                return 13;
            case NOT:
                return 14;
            case SND:
                return 15;
            case UMINUS:
                return 16;
            case WHILE:
                return 17;
        }
        return 143;
    }

    private int yys50() {
        switch (yytok) {
            case AND:
                return 18;
            case CONS:
                return 19;
            case DEVIDE:
                return 20;
            case EQ:
                return 21;
            case GT:
                return 22;
            case LT:
                return 23;
            case MINUS:
                return 24;
            case OR:
                return 25;
            case PLUS:
                return 26;
            case TIMES:
                return 27;
            case RPAREN:
                return 56;
        }
        return 143;
    }

    private int yys51() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case ID:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case LPAREN:
                return 12;
            case NIL:
                return 13;
            case NOT:
                return 14;
            case SND:
                return 15;
            case UMINUS:
                return 16;
            case WHILE:
                return 17;
        }
        return 143;
    }

    private int yys52() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case ID:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case LPAREN:
                return 12;
            case NIL:
                return 13;
            case NOT:
                return 14;
            case SND:
                return 15;
            case UMINUS:
                return 16;
            case WHILE:
                return 17;
        }
        return 143;
    }

    private int yys53() {
        switch (yytok) {
            case ASSIGN:
            case error:
            case TAIL:
            case LOW:
            case HEAD:
            case LAMDA:
            case SKIP:
                return 143;
            case AND:
                return 18;
            case CONS:
                return 19;
            case DEVIDE:
                return 20;
            case EQ:
                return 21;
            case GT:
                return 22;
            case LT:
                return 23;
            case MINUS:
                return 24;
            case OR:
                return 25;
            case PLUS:
                return 26;
            case TIMES:
                return 27;
        }
        return yyr23();
    }

    private int yys54() {
        switch (yytok) {
            case AND:
                return 18;
            case CONS:
                return 19;
            case DEVIDE:
                return 20;
            case EQ:
                return 21;
            case GT:
                return 22;
            case LT:
                return 23;
            case MINUS:
                return 24;
            case OR:
                return 25;
            case PLUS:
                return 26;
            case TIMES:
                return 27;
            case ELSE:
                return 59;
        }
        return 143;
    }

    private int yys55() {
        switch (yytok) {
            case AND:
                return 18;
            case CONS:
                return 19;
            case DEVIDE:
                return 20;
            case EQ:
                return 21;
            case GT:
                return 22;
            case LT:
                return 23;
            case MINUS:
                return 24;
            case OR:
                return 25;
            case PLUS:
                return 26;
            case TIMES:
                return 27;
            case IN:
                return 60;
        }
        return 143;
    }

    private int yys56() {
        switch (yytok) {
            case LAMDA:
            case HEAD:
            case LOW:
            case error:
            case ASSIGN:
            case SKIP:
            case TAIL:
                return 143;
        }
        return yyr24();
    }

    private int yys57() {
        switch (yytok) {
            case AND:
                return 18;
            case CONS:
                return 19;
            case DEVIDE:
                return 20;
            case EQ:
                return 21;
            case GT:
                return 22;
            case LT:
                return 23;
            case MINUS:
                return 24;
            case OR:
                return 25;
            case PLUS:
                return 26;
            case TIMES:
                return 27;
            case RPAREN:
                return 61;
        }
        return 143;
    }

    private int yys58() {
        switch (yytok) {
            case AND:
                return 18;
            case CONS:
                return 19;
            case DEVIDE:
                return 20;
            case EQ:
                return 21;
            case GT:
                return 22;
            case LT:
                return 23;
            case MINUS:
                return 24;
            case OR:
                return 25;
            case PLUS:
                return 26;
            case TIMES:
                return 27;
            case END:
                return 62;
        }
        return 143;
    }

    private int yys59() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case ID:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case LPAREN:
                return 12;
            case NIL:
                return 13;
            case NOT:
                return 14;
            case SND:
                return 15;
            case UMINUS:
                return 16;
            case WHILE:
                return 17;
        }
        return 143;
    }

    private int yys60() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case ID:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case LPAREN:
                return 12;
            case NIL:
                return 13;
            case NOT:
                return 14;
            case SND:
                return 15;
            case UMINUS:
                return 16;
            case WHILE:
                return 17;
        }
        return 143;
    }

    private int yys61() {
        switch (yytok) {
            case LAMDA:
            case HEAD:
            case LOW:
            case error:
            case ASSIGN:
            case SKIP:
            case TAIL:
                return 143;
        }
        return yyr29();
    }

    private int yys62() {
        switch (yytok) {
            case LAMDA:
            case HEAD:
            case LOW:
            case error:
            case ASSIGN:
            case SKIP:
            case TAIL:
                return 143;
        }
        return yyr17();
    }

    private int yys63() {
        switch (yytok) {
            case AND:
                return 18;
            case CONS:
                return 19;
            case DEVIDE:
                return 20;
            case EQ:
                return 21;
            case GT:
                return 22;
            case LT:
                return 23;
            case MINUS:
                return 24;
            case OR:
                return 25;
            case PLUS:
                return 26;
            case TIMES:
                return 27;
            case END:
                return 66;
        }
        return 143;
    }

    private int yys65() {
        switch (yytok) {
            case AND:
                return 18;
            case CONS:
                return 19;
            case DEVIDE:
                return 20;
            case EQ:
                return 21;
            case GT:
                return 22;
            case LT:
                return 23;
            case MINUS:
                return 24;
            case OR:
                return 25;
            case PLUS:
                return 26;
            case TIMES:
                return 27;
            case SEMICOLON:
                return 68;
            case END:
                return yyr25();
        }
        return 143;
    }

    private int yys66() {
        switch (yytok) {
            case LAMDA:
            case HEAD:
            case LOW:
            case error:
            case ASSIGN:
            case SKIP:
            case TAIL:
                return 143;
        }
        return yyr16();
    }

    private int yys67() {
        switch (yytok) {
            case LAMDA:
            case HEAD:
            case LOW:
            case error:
            case ASSIGN:
            case SKIP:
            case TAIL:
                return 143;
        }
        return yyr2();
    }

    private int yys68() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case ID:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case LPAREN:
                return 12;
            case NIL:
                return 13;
            case NOT:
                return 14;
            case SND:
                return 15;
            case UMINUS:
                return 16;
            case WHILE:
                return 17;
        }
        return 143;
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
            case 60: return 64;
            default: return 69;
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

    private int yyr29() { // pair : LPAREN expr COMMA expr RPAREN
        { yyrv = new Pair(yysv[yysp-4],yysv[yysp-2]);}
        yysv[yysp-=5] = yyrv;
        return 3;
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

    private int yyr20() { // expr : pair
        {yyrv = yysv[yysp-1];}
        yysv[yysp-=1] = yyrv;
        return yypexpr();
    }

    private int yyr21() { // expr : FST expr
        { yyrv = new First(2);}
        yysv[yysp-=2] = yyrv;
        return yypexpr();
    }

    private int yyr22() { // expr : SND expr
        { yyrv = new First(2);}
        yysv[yysp-=2] = yyrv;
        return yypexpr();
    }

    private int yyr23() { // expr : FUN ID LAMDA expr
        {yyrv = new AnonymousFunction(new Variable(yysv[yysp-3]), yysv[yysp-1]);}
        yysv[yysp-=4] = yyrv;
        return yypexpr();
    }

    private int yyr24() { // expr : LPAREN expr expr RPAREN
        {yyrv = new Application(yysv[yysp-3], yysv[yysp-2]);}
        yysv[yysp-=4] = yyrv;
        return yypexpr();
    }

    private int yypexpr() {
        switch (yyst[yysp-1]) {
            case 59: return 63;
            case 52: return 58;
            case 51: return 57;
            case 49: return 55;
            case 48: return 54;
            case 47: return 53;
            case 32: return 50;
            case 27: return 46;
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
            case 12: return 32;
            case 9: return 30;
            case 6: return 28;
            case 0: return 4;
            default: return 65;
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
