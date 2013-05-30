// Output created by jacc on Thu May 30 19:31:59 CST 2013

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
                case 75:
                    yyn = yys0();
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 76:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 150;
                            continue;
                    }
                    yyn = 153;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 77:
                    switch (yytok) {
                        case LAMDA:
                        case ASSIGN:
                        case SKIP:
                        case error:
                        case LOW:
                            yyn = 153;
                            continue;
                    }
                    yyn = yyr19();
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 78:
                    switch (yytok) {
                        case LAMDA:
                        case ASSIGN:
                        case SKIP:
                        case error:
                        case LOW:
                            yyn = 153;
                            continue;
                    }
                    yyn = yyr20();
                    continue;

                case 4:
                    yyst[yysp] = 4;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 79:
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
                case 80:
                    switch (yytok) {
                        case LAMDA:
                        case ASSIGN:
                        case SKIP:
                        case error:
                        case LOW:
                            yyn = 153;
                            continue;
                    }
                    yyn = yyr14();
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
                case 81:
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
                case 82:
                    switch (yytok) {
                        case ID:
                            yyn = 32;
                            continue;
                    }
                    yyn = 153;
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
                case 83:
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
                case 84:
                    switch (yytok) {
                        case LAMDA:
                        case ASSIGN:
                        case SKIP:
                        case error:
                        case LOW:
                            yyn = 153;
                            continue;
                    }
                    yyn = yyr18();
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
                case 85:
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
                case 86:
                    switch (yytok) {
                        case LAMDA:
                        case ASSIGN:
                        case SKIP:
                        case error:
                        case LOW:
                            yyn = 153;
                            continue;
                    }
                    yyn = yyr12();
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
                case 87:
                    switch (yytok) {
                        case ID:
                            yyn = 35;
                            continue;
                    }
                    yyn = 153;
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
                case 88:
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
                case 89:
                    switch (yytok) {
                        case LAMDA:
                        case ASSIGN:
                        case SKIP:
                        case error:
                        case LOW:
                            yyn = 153;
                            continue;
                    }
                    yyn = yyr31();
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
                case 90:
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
                case 91:
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
                case 92:
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
                case 93:
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
                case 94:
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
                case 95:
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
                case 96:
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
                case 97:
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
                case 98:
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
                case 99:
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
                case 100:
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
                case 101:
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
                case 102:
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
                case 103:
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
                case 104:
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
                case 105:
                    yyn = yys30();
                    continue;

                case 31:
                    yyst[yysp] = 31;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 106:
                    switch (yytok) {
                        case LAMDA:
                        case ASSIGN:
                        case SKIP:
                        case error:
                        case LOW:
                            yyn = 153;
                            continue;
                    }
                    yyn = yyr21();
                    continue;

                case 32:
                    yyst[yysp] = 32;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 107:
                    switch (yytok) {
                        case LAMDA:
                            yyn = 54;
                            continue;
                    }
                    yyn = 153;
                    continue;

                case 33:
                    yyst[yysp] = 33;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 108:
                    switch (yytok) {
                        case LAMDA:
                        case ASSIGN:
                        case SKIP:
                        case error:
                        case LOW:
                            yyn = 153;
                            continue;
                    }
                    yyn = yyr26();
                    continue;

                case 34:
                    yyst[yysp] = 34;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 109:
                    yyn = yys34();
                    continue;

                case 35:
                    yyst[yysp] = 35;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 110:
                    switch (yytok) {
                        case EQ:
                            yyn = 56;
                            continue;
                    }
                    yyn = 153;
                    continue;

                case 36:
                    yyst[yysp] = 36;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 111:
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
                case 112:
                    switch (yytok) {
                        case LAMDA:
                        case ASSIGN:
                        case SKIP:
                        case error:
                        case LOW:
                            yyn = 153;
                            continue;
                    }
                    yyn = yyr28();
                    continue;

                case 38:
                    yyst[yysp] = 38;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 113:
                    switch (yytok) {
                        case LAMDA:
                        case ASSIGN:
                        case SKIP:
                        case error:
                        case LOW:
                            yyn = 153;
                            continue;
                    }
                    yyn = yyr15();
                    continue;

                case 39:
                    yyst[yysp] = 39;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 114:
                    switch (yytok) {
                        case LAMDA:
                        case ASSIGN:
                        case SKIP:
                        case error:
                        case LOW:
                            yyn = 153;
                            continue;
                    }
                    yyn = yyr22();
                    continue;

                case 40:
                    yyst[yysp] = 40;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 115:
                    switch (yytok) {
                        case LAMDA:
                        case ASSIGN:
                        case SKIP:
                        case error:
                        case LOW:
                            yyn = 153;
                            continue;
                    }
                    yyn = yyr25();
                    continue;

                case 41:
                    yyst[yysp] = 41;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 116:
                    switch (yytok) {
                        case LAMDA:
                        case ASSIGN:
                        case SKIP:
                        case error:
                        case LOW:
                            yyn = 153;
                            continue;
                    }
                    yyn = yyr13();
                    continue;

                case 42:
                    yyst[yysp] = 42;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 117:
                    yyn = yys42();
                    continue;

                case 43:
                    yyst[yysp] = 43;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 118:
                    yyn = yys43();
                    continue;

                case 44:
                    yyst[yysp] = 44;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 119:
                    yyn = yys44();
                    continue;

                case 45:
                    yyst[yysp] = 45;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 120:
                    switch (yytok) {
                        case LAMDA:
                        case ASSIGN:
                        case SKIP:
                        case error:
                        case LOW:
                            yyn = 153;
                            continue;
                    }
                    yyn = yyr6();
                    continue;

                case 46:
                    yyst[yysp] = 46;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 121:
                    yyn = yys46();
                    continue;

                case 47:
                    yyst[yysp] = 47;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 122:
                    yyn = yys47();
                    continue;

                case 48:
                    yyst[yysp] = 48;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 123:
                    yyn = yys48();
                    continue;

                case 49:
                    yyst[yysp] = 49;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 124:
                    yyn = yys49();
                    continue;

                case 50:
                    yyst[yysp] = 50;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 125:
                    yyn = yys50();
                    continue;

                case 51:
                    yyst[yysp] = 51;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 126:
                    yyn = yys51();
                    continue;

                case 52:
                    yyst[yysp] = 52;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 127:
                    yyn = yys52();
                    continue;

                case 53:
                    yyst[yysp] = 53;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 128:
                    switch (yytok) {
                        case LAMDA:
                        case ASSIGN:
                        case SKIP:
                        case error:
                        case LOW:
                            yyn = 153;
                            continue;
                    }
                    yyn = yyr5();
                    continue;

                case 54:
                    yyst[yysp] = 54;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 129:
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
                case 130:
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
                case 131:
                    yyn = yys56();
                    continue;

                case 57:
                    yyst[yysp] = 57;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 132:
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
                case 133:
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
                case 134:
                    switch (yytok) {
                        case LAMDA:
                        case ASSIGN:
                        case SKIP:
                        case error:
                        case LOW:
                            yyn = 153;
                            continue;
                    }
                    yyn = yyr27();
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
                case 135:
                    yyn = yys60();
                    continue;

                case 61:
                    yyst[yysp] = 61;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 136:
                    yyn = yys61();
                    continue;

                case 62:
                    yyst[yysp] = 62;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 137:
                    yyn = yys62();
                    continue;

                case 63:
                    yyst[yysp] = 63;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 138:
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
                case 139:
                    switch (yytok) {
                        case LAMDA:
                        case ASSIGN:
                        case SKIP:
                        case error:
                        case LOW:
                            yyn = 153;
                            continue;
                    }
                    yyn = yyr24();
                    continue;

                case 65:
                    yyst[yysp] = 65;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 140:
                    yyn = yys65();
                    continue;

                case 66:
                    yyst[yysp] = 66;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 141:
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
                case 142:
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
                case 143:
                    yyn = yys68();
                    continue;

                case 69:
                    yyst[yysp] = 69;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 144:
                    switch (yytok) {
                        case LAMDA:
                        case ASSIGN:
                        case SKIP:
                        case error:
                        case LOW:
                            yyn = 153;
                            continue;
                    }
                    yyn = yyr32();
                    continue;

                case 70:
                    yyst[yysp] = 70;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 145:
                    switch (yytok) {
                        case LAMDA:
                        case ASSIGN:
                        case SKIP:
                        case error:
                        case LOW:
                            yyn = 153;
                            continue;
                    }
                    yyn = yyr17();
                    continue;

                case 71:
                    yyst[yysp] = 71;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 146:
                    yyn = yys71();
                    continue;

                case 72:
                    yyst[yysp] = 72;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 147:
                    yyn = yys72();
                    continue;

                case 73:
                    yyst[yysp] = 73;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 148:
                    switch (yytok) {
                        case LAMDA:
                        case ASSIGN:
                        case SKIP:
                        case error:
                        case LOW:
                            yyn = 153;
                            continue;
                    }
                    yyn = yyr16();
                    continue;

                case 74:
                    yyst[yysp] = 74;
                    yysv[yysp] = (Interpreter.lexer.yylval
                                 );
                    yytok = (Interpreter.lexer.yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 149:
                    switch (yytok) {
                        case LAMDA:
                        case ASSIGN:
                        case SKIP:
                        case error:
                        case LOW:
                            yyn = 153;
                            continue;
                    }
                    yyn = yyr2();
                    continue;

                case 150:
                    return true;
                case 151:
                    yyerror("stack overflow");
                case 152:
                    return false;
                case 153:
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
            case HEAD:
                return 8;
            case ID:
                return 9;
            case IF:
                return 10;
            case INTEGER:
                return 11;
            case LET:
                return 12;
            case LPAREN:
                return 13;
            case NIL:
                return 14;
            case NOT:
                return 15;
            case SND:
                return 16;
            case TAIL:
                return 17;
            case UMINUS:
                return 18;
            case WHILE:
                return 19;
        }
        return 153;
    }

    private int yys4() {
        switch (yytok) {
            case AND:
                return 20;
            case CONS:
                return 21;
            case DEVIDE:
                return 22;
            case EQ:
                return 23;
            case GT:
                return 24;
            case LT:
                return 25;
            case MINUS:
                return 26;
            case OR:
                return 27;
            case PLUS:
                return 28;
            case SEMICOLON:
                return 29;
            case TIMES:
                return 30;
            case ENDINPUT:
                return yyr1();
        }
        return 153;
    }

    private int yys6() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case HEAD:
                return 8;
            case ID:
                return 9;
            case IF:
                return 10;
            case INTEGER:
                return 11;
            case LET:
                return 12;
            case LPAREN:
                return 13;
            case NIL:
                return 14;
            case NOT:
                return 15;
            case SND:
                return 16;
            case TAIL:
                return 17;
            case UMINUS:
                return 18;
            case WHILE:
                return 19;
        }
        return 153;
    }

    private int yys8() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case HEAD:
                return 8;
            case ID:
                return 9;
            case IF:
                return 10;
            case INTEGER:
                return 11;
            case LET:
                return 12;
            case LPAREN:
                return 13;
            case NIL:
                return 14;
            case NOT:
                return 15;
            case SND:
                return 16;
            case TAIL:
                return 17;
            case UMINUS:
                return 18;
            case WHILE:
                return 19;
        }
        return 153;
    }

    private int yys10() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case HEAD:
                return 8;
            case ID:
                return 9;
            case IF:
                return 10;
            case INTEGER:
                return 11;
            case LET:
                return 12;
            case LPAREN:
                return 13;
            case NIL:
                return 14;
            case NOT:
                return 15;
            case SND:
                return 16;
            case TAIL:
                return 17;
            case UMINUS:
                return 18;
            case WHILE:
                return 19;
        }
        return 153;
    }

    private int yys13() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case HEAD:
                return 8;
            case ID:
                return 9;
            case IF:
                return 10;
            case INTEGER:
                return 11;
            case LET:
                return 12;
            case LPAREN:
                return 13;
            case NIL:
                return 14;
            case NOT:
                return 15;
            case SND:
                return 16;
            case TAIL:
                return 17;
            case UMINUS:
                return 18;
            case WHILE:
                return 19;
            case RPAREN:
                return 37;
        }
        return 153;
    }

    private int yys15() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case HEAD:
                return 8;
            case ID:
                return 9;
            case IF:
                return 10;
            case INTEGER:
                return 11;
            case LET:
                return 12;
            case LPAREN:
                return 13;
            case NIL:
                return 14;
            case NOT:
                return 15;
            case SND:
                return 16;
            case TAIL:
                return 17;
            case UMINUS:
                return 18;
            case WHILE:
                return 19;
        }
        return 153;
    }

    private int yys16() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case HEAD:
                return 8;
            case ID:
                return 9;
            case IF:
                return 10;
            case INTEGER:
                return 11;
            case LET:
                return 12;
            case LPAREN:
                return 13;
            case NIL:
                return 14;
            case NOT:
                return 15;
            case SND:
                return 16;
            case TAIL:
                return 17;
            case UMINUS:
                return 18;
            case WHILE:
                return 19;
        }
        return 153;
    }

    private int yys17() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case HEAD:
                return 8;
            case ID:
                return 9;
            case IF:
                return 10;
            case INTEGER:
                return 11;
            case LET:
                return 12;
            case LPAREN:
                return 13;
            case NIL:
                return 14;
            case NOT:
                return 15;
            case SND:
                return 16;
            case TAIL:
                return 17;
            case UMINUS:
                return 18;
            case WHILE:
                return 19;
        }
        return 153;
    }

    private int yys18() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case HEAD:
                return 8;
            case ID:
                return 9;
            case IF:
                return 10;
            case INTEGER:
                return 11;
            case LET:
                return 12;
            case LPAREN:
                return 13;
            case NIL:
                return 14;
            case NOT:
                return 15;
            case SND:
                return 16;
            case TAIL:
                return 17;
            case UMINUS:
                return 18;
            case WHILE:
                return 19;
        }
        return 153;
    }

    private int yys19() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case HEAD:
                return 8;
            case ID:
                return 9;
            case IF:
                return 10;
            case INTEGER:
                return 11;
            case LET:
                return 12;
            case LPAREN:
                return 13;
            case NIL:
                return 14;
            case NOT:
                return 15;
            case SND:
                return 16;
            case TAIL:
                return 17;
            case UMINUS:
                return 18;
            case WHILE:
                return 19;
        }
        return 153;
    }

    private int yys20() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case HEAD:
                return 8;
            case ID:
                return 9;
            case IF:
                return 10;
            case INTEGER:
                return 11;
            case LET:
                return 12;
            case LPAREN:
                return 13;
            case NIL:
                return 14;
            case NOT:
                return 15;
            case SND:
                return 16;
            case TAIL:
                return 17;
            case UMINUS:
                return 18;
            case WHILE:
                return 19;
        }
        return 153;
    }

    private int yys21() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case HEAD:
                return 8;
            case ID:
                return 9;
            case IF:
                return 10;
            case INTEGER:
                return 11;
            case LET:
                return 12;
            case LPAREN:
                return 13;
            case NIL:
                return 14;
            case NOT:
                return 15;
            case SND:
                return 16;
            case TAIL:
                return 17;
            case UMINUS:
                return 18;
            case WHILE:
                return 19;
        }
        return 153;
    }

    private int yys22() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case HEAD:
                return 8;
            case ID:
                return 9;
            case IF:
                return 10;
            case INTEGER:
                return 11;
            case LET:
                return 12;
            case LPAREN:
                return 13;
            case NIL:
                return 14;
            case NOT:
                return 15;
            case SND:
                return 16;
            case TAIL:
                return 17;
            case UMINUS:
                return 18;
            case WHILE:
                return 19;
        }
        return 153;
    }

    private int yys23() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case HEAD:
                return 8;
            case ID:
                return 9;
            case IF:
                return 10;
            case INTEGER:
                return 11;
            case LET:
                return 12;
            case LPAREN:
                return 13;
            case NIL:
                return 14;
            case NOT:
                return 15;
            case SND:
                return 16;
            case TAIL:
                return 17;
            case UMINUS:
                return 18;
            case WHILE:
                return 19;
        }
        return 153;
    }

    private int yys24() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case HEAD:
                return 8;
            case ID:
                return 9;
            case IF:
                return 10;
            case INTEGER:
                return 11;
            case LET:
                return 12;
            case LPAREN:
                return 13;
            case NIL:
                return 14;
            case NOT:
                return 15;
            case SND:
                return 16;
            case TAIL:
                return 17;
            case UMINUS:
                return 18;
            case WHILE:
                return 19;
        }
        return 153;
    }

    private int yys25() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case HEAD:
                return 8;
            case ID:
                return 9;
            case IF:
                return 10;
            case INTEGER:
                return 11;
            case LET:
                return 12;
            case LPAREN:
                return 13;
            case NIL:
                return 14;
            case NOT:
                return 15;
            case SND:
                return 16;
            case TAIL:
                return 17;
            case UMINUS:
                return 18;
            case WHILE:
                return 19;
        }
        return 153;
    }

    private int yys26() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case HEAD:
                return 8;
            case ID:
                return 9;
            case IF:
                return 10;
            case INTEGER:
                return 11;
            case LET:
                return 12;
            case LPAREN:
                return 13;
            case NIL:
                return 14;
            case NOT:
                return 15;
            case SND:
                return 16;
            case TAIL:
                return 17;
            case UMINUS:
                return 18;
            case WHILE:
                return 19;
        }
        return 153;
    }

    private int yys27() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case HEAD:
                return 8;
            case ID:
                return 9;
            case IF:
                return 10;
            case INTEGER:
                return 11;
            case LET:
                return 12;
            case LPAREN:
                return 13;
            case NIL:
                return 14;
            case NOT:
                return 15;
            case SND:
                return 16;
            case TAIL:
                return 17;
            case UMINUS:
                return 18;
            case WHILE:
                return 19;
        }
        return 153;
    }

    private int yys28() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case HEAD:
                return 8;
            case ID:
                return 9;
            case IF:
                return 10;
            case INTEGER:
                return 11;
            case LET:
                return 12;
            case LPAREN:
                return 13;
            case NIL:
                return 14;
            case NOT:
                return 15;
            case SND:
                return 16;
            case TAIL:
                return 17;
            case UMINUS:
                return 18;
            case WHILE:
                return 19;
        }
        return 153;
    }

    private int yys29() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case HEAD:
                return 8;
            case ID:
                return 9;
            case IF:
                return 10;
            case INTEGER:
                return 11;
            case LET:
                return 12;
            case LPAREN:
                return 13;
            case NIL:
                return 14;
            case NOT:
                return 15;
            case SND:
                return 16;
            case TAIL:
                return 17;
            case UMINUS:
                return 18;
            case WHILE:
                return 19;
        }
        return 153;
    }

    private int yys30() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case HEAD:
                return 8;
            case ID:
                return 9;
            case IF:
                return 10;
            case INTEGER:
                return 11;
            case LET:
                return 12;
            case LPAREN:
                return 13;
            case NIL:
                return 14;
            case NOT:
                return 15;
            case SND:
                return 16;
            case TAIL:
                return 17;
            case UMINUS:
                return 18;
            case WHILE:
                return 19;
        }
        return 153;
    }

    private int yys34() {
        switch (yytok) {
            case AND:
                return 20;
            case CONS:
                return 21;
            case DEVIDE:
                return 22;
            case EQ:
                return 23;
            case GT:
                return 24;
            case LT:
                return 25;
            case MINUS:
                return 26;
            case OR:
                return 27;
            case PLUS:
                return 28;
            case SEMICOLON:
                return 29;
            case TIMES:
                return 30;
            case THEN:
                return 55;
        }
        return 153;
    }

    private int yys36() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case HEAD:
                return 8;
            case ID:
                return 9;
            case IF:
                return 10;
            case INTEGER:
                return 11;
            case LET:
                return 12;
            case LPAREN:
                return 13;
            case NIL:
                return 14;
            case NOT:
                return 15;
            case SND:
                return 16;
            case TAIL:
                return 17;
            case UMINUS:
                return 18;
            case WHILE:
                return 19;
            case AND:
                return 20;
            case CONS:
                return 21;
            case DEVIDE:
                return 22;
            case EQ:
                return 23;
            case GT:
                return 24;
            case LT:
                return 25;
            case MINUS:
                return 26;
            case OR:
                return 27;
            case PLUS:
                return 28;
            case SEMICOLON:
                return 29;
            case TIMES:
                return 30;
            case COMMA:
                return 58;
            case RPAREN:
                return 59;
        }
        return 153;
    }

    private int yys42() {
        switch (yytok) {
            case AND:
                return 20;
            case CONS:
                return 21;
            case DEVIDE:
                return 22;
            case EQ:
                return 23;
            case GT:
                return 24;
            case LT:
                return 25;
            case MINUS:
                return 26;
            case OR:
                return 27;
            case PLUS:
                return 28;
            case SEMICOLON:
                return 29;
            case TIMES:
                return 30;
            case DO:
                return 60;
        }
        return 153;
    }

    private int yys43() {
        switch (yytok) {
            case ASSIGN:
            case error:
            case SKIP:
            case LOW:
            case LAMDA:
                return 153;
            case CONS:
                return 21;
            case DEVIDE:
                return 22;
            case EQ:
                return 23;
            case GT:
                return 24;
            case LT:
                return 25;
            case MINUS:
                return 26;
            case PLUS:
                return 28;
            case TIMES:
                return 30;
        }
        return yyr10();
    }

    private int yys44() {
        switch (yytok) {
            case SKIP:
            case error:
            case ASSIGN:
            case LOW:
            case LAMDA:
                return 153;
            case DEVIDE:
                return 22;
            case EQ:
                return 23;
            case GT:
                return 24;
            case LT:
                return 25;
            case MINUS:
                return 26;
            case PLUS:
                return 28;
            case TIMES:
                return 30;
        }
        return yyr30();
    }

    private int yys46() {
        switch (yytok) {
            case LAMDA:
            case LOW:
            case SKIP:
            case ASSIGN:
            case error:
                return 153;
            case DEVIDE:
                return 22;
            case MINUS:
                return 26;
            case PLUS:
                return 28;
            case TIMES:
                return 30;
        }
        return yyr9();
    }

    private int yys47() {
        switch (yytok) {
            case LAMDA:
            case LOW:
            case SKIP:
            case ASSIGN:
            case error:
                return 153;
            case DEVIDE:
                return 22;
            case MINUS:
                return 26;
            case PLUS:
                return 28;
            case TIMES:
                return 30;
        }
        return yyr7();
    }

    private int yys48() {
        switch (yytok) {
            case LAMDA:
            case LOW:
            case SKIP:
            case ASSIGN:
            case error:
                return 153;
            case DEVIDE:
                return 22;
            case MINUS:
                return 26;
            case PLUS:
                return 28;
            case TIMES:
                return 30;
        }
        return yyr8();
    }

    private int yys49() {
        switch (yytok) {
            case SKIP:
            case error:
            case LOW:
            case LAMDA:
            case ASSIGN:
                return 153;
            case DEVIDE:
                return 22;
            case TIMES:
                return 30;
        }
        return yyr4();
    }

    private int yys50() {
        switch (yytok) {
            case ASSIGN:
            case error:
            case SKIP:
            case LOW:
            case LAMDA:
                return 153;
            case CONS:
                return 21;
            case DEVIDE:
                return 22;
            case EQ:
                return 23;
            case GT:
                return 24;
            case LT:
                return 25;
            case MINUS:
                return 26;
            case PLUS:
                return 28;
            case TIMES:
                return 30;
        }
        return yyr11();
    }

    private int yys51() {
        switch (yytok) {
            case SKIP:
            case error:
            case LOW:
            case LAMDA:
            case ASSIGN:
                return 153;
            case DEVIDE:
                return 22;
            case TIMES:
                return 30;
        }
        return yyr3();
    }

    private int yys52() {
        switch (yytok) {
            case SKIP:
            case LAMDA:
            case LOW:
            case error:
            case ASSIGN:
                return 153;
            case AND:
                return 20;
            case CONS:
                return 21;
            case DEVIDE:
                return 22;
            case EQ:
                return 23;
            case GT:
                return 24;
            case LT:
                return 25;
            case MINUS:
                return 26;
            case OR:
                return 27;
            case PLUS:
                return 28;
            case TIMES:
                return 30;
        }
        return yyr29();
    }

    private int yys54() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case HEAD:
                return 8;
            case ID:
                return 9;
            case IF:
                return 10;
            case INTEGER:
                return 11;
            case LET:
                return 12;
            case LPAREN:
                return 13;
            case NIL:
                return 14;
            case NOT:
                return 15;
            case SND:
                return 16;
            case TAIL:
                return 17;
            case UMINUS:
                return 18;
            case WHILE:
                return 19;
        }
        return 153;
    }

    private int yys55() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case HEAD:
                return 8;
            case ID:
                return 9;
            case IF:
                return 10;
            case INTEGER:
                return 11;
            case LET:
                return 12;
            case LPAREN:
                return 13;
            case NIL:
                return 14;
            case NOT:
                return 15;
            case SND:
                return 16;
            case TAIL:
                return 17;
            case UMINUS:
                return 18;
            case WHILE:
                return 19;
        }
        return 153;
    }

    private int yys56() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case HEAD:
                return 8;
            case ID:
                return 9;
            case IF:
                return 10;
            case INTEGER:
                return 11;
            case LET:
                return 12;
            case LPAREN:
                return 13;
            case NIL:
                return 14;
            case NOT:
                return 15;
            case SND:
                return 16;
            case TAIL:
                return 17;
            case UMINUS:
                return 18;
            case WHILE:
                return 19;
        }
        return 153;
    }

    private int yys57() {
        switch (yytok) {
            case AND:
                return 20;
            case CONS:
                return 21;
            case DEVIDE:
                return 22;
            case EQ:
                return 23;
            case GT:
                return 24;
            case LT:
                return 25;
            case MINUS:
                return 26;
            case OR:
                return 27;
            case PLUS:
                return 28;
            case SEMICOLON:
                return 29;
            case TIMES:
                return 30;
            case RPAREN:
                return 64;
        }
        return 153;
    }

    private int yys58() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case HEAD:
                return 8;
            case ID:
                return 9;
            case IF:
                return 10;
            case INTEGER:
                return 11;
            case LET:
                return 12;
            case LPAREN:
                return 13;
            case NIL:
                return 14;
            case NOT:
                return 15;
            case SND:
                return 16;
            case TAIL:
                return 17;
            case UMINUS:
                return 18;
            case WHILE:
                return 19;
        }
        return 153;
    }

    private int yys60() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case HEAD:
                return 8;
            case ID:
                return 9;
            case IF:
                return 10;
            case INTEGER:
                return 11;
            case LET:
                return 12;
            case LPAREN:
                return 13;
            case NIL:
                return 14;
            case NOT:
                return 15;
            case SND:
                return 16;
            case TAIL:
                return 17;
            case UMINUS:
                return 18;
            case WHILE:
                return 19;
        }
        return 153;
    }

    private int yys61() {
        switch (yytok) {
            case SKIP:
            case LAMDA:
            case LOW:
            case error:
            case ASSIGN:
                return 153;
            case AND:
                return 20;
            case CONS:
                return 21;
            case DEVIDE:
                return 22;
            case EQ:
                return 23;
            case GT:
                return 24;
            case LT:
                return 25;
            case MINUS:
                return 26;
            case OR:
                return 27;
            case PLUS:
                return 28;
            case TIMES:
                return 30;
        }
        return yyr23();
    }

    private int yys62() {
        switch (yytok) {
            case AND:
                return 20;
            case CONS:
                return 21;
            case DEVIDE:
                return 22;
            case EQ:
                return 23;
            case GT:
                return 24;
            case LT:
                return 25;
            case MINUS:
                return 26;
            case OR:
                return 27;
            case PLUS:
                return 28;
            case SEMICOLON:
                return 29;
            case TIMES:
                return 30;
            case ELSE:
                return 67;
        }
        return 153;
    }

    private int yys63() {
        switch (yytok) {
            case AND:
                return 20;
            case CONS:
                return 21;
            case DEVIDE:
                return 22;
            case EQ:
                return 23;
            case GT:
                return 24;
            case LT:
                return 25;
            case MINUS:
                return 26;
            case OR:
                return 27;
            case PLUS:
                return 28;
            case SEMICOLON:
                return 29;
            case TIMES:
                return 30;
            case IN:
                return 68;
        }
        return 153;
    }

    private int yys65() {
        switch (yytok) {
            case AND:
                return 20;
            case CONS:
                return 21;
            case DEVIDE:
                return 22;
            case EQ:
                return 23;
            case GT:
                return 24;
            case LT:
                return 25;
            case MINUS:
                return 26;
            case OR:
                return 27;
            case PLUS:
                return 28;
            case SEMICOLON:
                return 29;
            case TIMES:
                return 30;
            case RPAREN:
                return 69;
        }
        return 153;
    }

    private int yys66() {
        switch (yytok) {
            case AND:
                return 20;
            case CONS:
                return 21;
            case DEVIDE:
                return 22;
            case EQ:
                return 23;
            case GT:
                return 24;
            case LT:
                return 25;
            case MINUS:
                return 26;
            case OR:
                return 27;
            case PLUS:
                return 28;
            case SEMICOLON:
                return 29;
            case TIMES:
                return 30;
            case END:
                return 70;
        }
        return 153;
    }

    private int yys67() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case HEAD:
                return 8;
            case ID:
                return 9;
            case IF:
                return 10;
            case INTEGER:
                return 11;
            case LET:
                return 12;
            case LPAREN:
                return 13;
            case NIL:
                return 14;
            case NOT:
                return 15;
            case SND:
                return 16;
            case TAIL:
                return 17;
            case UMINUS:
                return 18;
            case WHILE:
                return 19;
        }
        return 153;
    }

    private int yys68() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case FST:
                return 6;
            case FUN:
                return 7;
            case HEAD:
                return 8;
            case ID:
                return 9;
            case IF:
                return 10;
            case INTEGER:
                return 11;
            case LET:
                return 12;
            case LPAREN:
                return 13;
            case NIL:
                return 14;
            case NOT:
                return 15;
            case SND:
                return 16;
            case TAIL:
                return 17;
            case UMINUS:
                return 18;
            case WHILE:
                return 19;
        }
        return 153;
    }

    private int yys71() {
        switch (yytok) {
            case AND:
                return 20;
            case CONS:
                return 21;
            case DEVIDE:
                return 22;
            case EQ:
                return 23;
            case GT:
                return 24;
            case LT:
                return 25;
            case MINUS:
                return 26;
            case OR:
                return 27;
            case PLUS:
                return 28;
            case SEMICOLON:
                return 29;
            case TIMES:
                return 30;
            case END:
                return 73;
        }
        return 153;
    }

    private int yys72() {
        switch (yytok) {
            case AND:
                return 20;
            case CONS:
                return 21;
            case DEVIDE:
                return 22;
            case EQ:
                return 23;
            case GT:
                return 24;
            case LT:
                return 25;
            case MINUS:
                return 26;
            case OR:
                return 27;
            case PLUS:
                return 28;
            case SEMICOLON:
                return 29;
            case TIMES:
                return 30;
            case END:
                return 74;
        }
        return 153;
    }

    private int yyr1() { // prog : expr
        { System.out.println(((Expression)yysv[yysp-1]).eval()); }
        yysv[yysp-=1] = yyrv;
        return 1;
    }

    private int yyr30() { // list : expr CONS expr
        { yyrv = new List(yysv[yysp-3],yysv[yysp-1]);}
        yysv[yysp-=3] = yyrv;
        return 2;
    }

    private int yyr31() { // list : NIL
        {yyrv = new Nil();}
        yysv[yysp-=1] = yyrv;
        return 2;
    }

    private int yyr32() { // pair : LPAREN expr COMMA expr RPAREN
        { yyrv = new Pair(yysv[yysp-4],yysv[yysp-2]);}
        yysv[yysp-=5] = yyrv;
        return 3;
    }

    private int yyr2() { // expr : LET ID EQ expr IN expr END
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
        { yyrv = new First(yysv[yysp-1]);}
        yysv[yysp-=2] = yyrv;
        return yypexpr();
    }

    private int yyr22() { // expr : SND expr
        { yyrv = new Second(yysv[yysp-1]);}
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

    private int yyr25() { // expr : TAIL expr
        {yyrv = new Tail(yysv[yysp-1]);}
        yysv[yysp-=2] = yyrv;
        return yypexpr();
    }

    private int yyr26() { // expr : HEAD expr
        {yyrv = new Head(yysv[yysp-1]);}
        yysv[yysp-=2] = yyrv;
        return yypexpr();
    }

    private int yyr27() { // expr : LPAREN expr RPAREN
        {yyrv = new Bracket(yysv[yysp-2]);}
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr28() { // expr : LPAREN RPAREN
        {yyrv = new Nop();}
        yysv[yysp-=2] = yyrv;
        return yypexpr();
    }

    private int yyr29() { // expr : expr SEMICOLON expr
        {yyrv = new Sequence(yysv[yysp-3],yysv[yysp-1]);}
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yypexpr() {
        switch (yyst[yysp-1]) {
            case 67: return 71;
            case 60: return 66;
            case 58: return 65;
            case 56: return 63;
            case 55: return 62;
            case 54: return 61;
            case 36: return 57;
            case 30: return 53;
            case 29: return 52;
            case 28: return 51;
            case 27: return 50;
            case 26: return 49;
            case 25: return 48;
            case 24: return 47;
            case 23: return 46;
            case 22: return 45;
            case 21: return 44;
            case 20: return 43;
            case 19: return 42;
            case 18: return 41;
            case 17: return 40;
            case 16: return 39;
            case 15: return 38;
            case 13: return 36;
            case 10: return 34;
            case 8: return 33;
            case 6: return 31;
            case 0: return 4;
            default: return 72;
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
