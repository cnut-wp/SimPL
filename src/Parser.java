// Output created by jacc on Mon May 27 20:44:47 CST 2013


class Parser implements Tokens {
    private int yyss = 100;
    private int yytok;
    private int yysp = 0;
    private int[] yyst;
    protected int yyerrno = (-1);
    private int[] yysv;
    private int yyrv;

    public boolean parse() {
        int yyn = 0;
        yysp = 0;
        yyst = new int[yyss];
        yysv = new int[yyss];
        yytok = (token
                 );
    loop:
        for (;;) {
            switch (yyn) {
                case 0:
                    yyst[yysp] = 0;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 71:
                    yyn = yys0();
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 72:
                    yyn = yys1();
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 73:
                    yyn = yys2();
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 74:
                    switch (yytok) {
                        case LAMDA:
                        case error:
                            yyn = 145;
                            continue;
                        case CONS:
                            yyn = 34;
                            continue;
                    }
                    yyn = yyr2();
                    continue;

                case 4:
                    yyst[yysp] = 4;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 75:
                    switch (yytok) {
                        case error:
                        case LAMDA:
                            yyn = 145;
                            continue;
                    }
                    yyn = yyr17();
                    continue;

                case 5:
                    yyst[yysp] = 5;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 76:
                    yyn = yys5();
                    continue;

                case 6:
                    yyst[yysp] = 6;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 77:
                    switch (yytok) {
                        case ID:
                            yyn = 36;
                            continue;
                    }
                    yyn = 145;
                    continue;

                case 7:
                    yyst[yysp] = 7;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 78:
                    yyn = yys7();
                    continue;

                case 8:
                    yyst[yysp] = 8;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 79:
                    switch (yytok) {
                        case error:
                        case LAMDA:
                            yyn = 145;
                            continue;
                    }
                    yyn = yyr1();
                    continue;

                case 9:
                    yyst[yysp] = 9;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 80:
                    yyn = yys9();
                    continue;

                case 10:
                    yyst[yysp] = 10;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 81:
                    switch (yytok) {
                        case error:
                        case LAMDA:
                            yyn = 145;
                            continue;
                    }
                    yyn = yyr16();
                    continue;

                case 11:
                    yyst[yysp] = 11;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 82:
                    switch (yytok) {
                        case ID:
                            yyn = 39;
                            continue;
                    }
                    yyn = 145;
                    continue;

                case 12:
                    yyst[yysp] = 12;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 83:
                    switch (yytok) {
                        case error:
                        case LAMDA:
                            yyn = 145;
                            continue;
                    }
                    yyn = yyr18();
                    continue;

                case 13:
                    yyst[yysp] = 13;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 84:
                    yyn = yys13();
                    continue;

                case 14:
                    yyst[yysp] = 14;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 85:
                    switch (yytok) {
                        case error:
                        case LAMDA:
                            yyn = 145;
                            continue;
                    }
                    yyn = yyr19();
                    continue;

                case 15:
                    yyst[yysp] = 15;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 86:
                    yyn = yys15();
                    continue;

                case 16:
                    yyst[yysp] = 16;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 87:
                    yyn = yys16();
                    continue;

                case 17:
                    yyst[yysp] = 17;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 88:
                    yyn = yys17();
                    continue;

                case 18:
                    yyst[yysp] = 18;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 89:
                    yyn = yys18();
                    continue;

                case 19:
                    yyst[yysp] = 19;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 90:
                    yyn = yys19();
                    continue;

                case 20:
                    yyst[yysp] = 20;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 91:
                    yyn = yys20();
                    continue;

                case 21:
                    yyst[yysp] = 21;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 92:
                    yyn = yys21();
                    continue;

                case 22:
                    yyst[yysp] = 22;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 93:
                    yyn = yys22();
                    continue;

                case 23:
                    yyst[yysp] = 23;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 94:
                    yyn = yys23();
                    continue;

                case 24:
                    yyst[yysp] = 24;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 95:
                    yyn = yys24();
                    continue;

                case 25:
                    yyst[yysp] = 25;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 96:
                    yyn = yys25();
                    continue;

                case 26:
                    yyst[yysp] = 26;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 97:
                    yyn = yys26();
                    continue;

                case 27:
                    yyst[yysp] = 27;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 98:
                    yyn = yys27();
                    continue;

                case 28:
                    yyst[yysp] = 28;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 99:
                    yyn = yys28();
                    continue;

                case 29:
                    yyst[yysp] = 29;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 100:
                    yyn = yys29();
                    continue;

                case 30:
                    yyst[yysp] = 30;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 101:
                    yyn = yys30();
                    continue;

                case 31:
                    yyst[yysp] = 31;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 102:
                    yyn = yys31();
                    continue;

                case 32:
                    yyst[yysp] = 32;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 103:
                    yyn = yys32();
                    continue;

                case 33:
                    yyst[yysp] = 33;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 104:
                    yyn = yys33();
                    continue;

                case 34:
                    yyst[yysp] = 34;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 105:
                    yyn = yys34();
                    continue;

                case 35:
                    yyst[yysp] = 35;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 106:
                    yyn = yys35();
                    continue;

                case 36:
                    yyst[yysp] = 36;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 107:
                    switch (yytok) {
                        case LAMDA:
                            yyn = 50;
                            continue;
                    }
                    yyn = 145;
                    continue;

                case 37:
                    yyst[yysp] = 37;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 108:
                    yyn = yys37();
                    continue;

                case 38:
                    yyst[yysp] = 38;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 109:
                    yyn = yys38();
                    continue;

                case 39:
                    yyst[yysp] = 39;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 110:
                    switch (yytok) {
                        case '=':
                            yyn = 52;
                            continue;
                    }
                    yyn = 145;
                    continue;

                case 40:
                    yyst[yysp] = 40;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 111:
                    yyn = yys40();
                    continue;

                case 41:
                    yyst[yysp] = 41;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 112:
                    yyn = yys41();
                    continue;

                case 42:
                    yyst[yysp] = 42;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 113:
                    yyn = yys42();
                    continue;

                case 43:
                    yyst[yysp] = 43;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 114:
                    yyn = yys43();
                    continue;

                case 44:
                    yyst[yysp] = 44;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 115:
                    yyn = yys44();
                    continue;

                case 45:
                    yyst[yysp] = 45;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 116:
                    yyn = yys45();
                    continue;

                case 46:
                    yyst[yysp] = 46;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 117:
                    yyn = yys46();
                    continue;

                case 47:
                    yyst[yysp] = 47;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 118:
                    yyn = yys47();
                    continue;

                case 48:
                    yyst[yysp] = 48;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 119:
                    switch (yytok) {
                        case LAMDA:
                        case error:
                            yyn = 145;
                            continue;
                        case CONS:
                            yyn = 34;
                            continue;
                    }
                    yyn = yyr22();
                    continue;

                case 49:
                    yyst[yysp] = 49;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 120:
                    yyn = yys49();
                    continue;

                case 50:
                    yyst[yysp] = 50;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 121:
                    yyn = yys50();
                    continue;

                case 51:
                    yyst[yysp] = 51;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 122:
                    yyn = yys51();
                    continue;

                case 52:
                    yyst[yysp] = 52;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 123:
                    yyn = yys52();
                    continue;

                case 53:
                    yyst[yysp] = 53;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 124:
                    yyn = yys53();
                    continue;

                case 54:
                    yyst[yysp] = 54;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 125:
                    yyn = yys54();
                    continue;

                case 55:
                    yyst[yysp] = 55;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 126:
                    switch (yytok) {
                        case error:
                        case LAMDA:
                            yyn = 145;
                            continue;
                    }
                    yyn = yyr15();
                    continue;

                case 56:
                    yyst[yysp] = 56;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 127:
                    yyn = yys56();
                    continue;

                case 57:
                    yyst[yysp] = 57;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 128:
                    switch (yytok) {
                        case CONS:
                            yyn = 34;
                            continue;
                        case ',':
                            yyn = 56;
                            continue;
                    }
                    yyn = 145;
                    continue;

                case 58:
                    yyst[yysp] = 58;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 129:
                    yyn = yys58();
                    continue;

                case 59:
                    yyst[yysp] = 59;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 130:
                    yyn = yys59();
                    continue;

                case 60:
                    yyst[yysp] = 60;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 131:
                    yyn = yys60();
                    continue;

                case 61:
                    yyst[yysp] = 61;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 132:
                    yyn = yys61();
                    continue;

                case 62:
                    yyst[yysp] = 62;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 133:
                    switch (yytok) {
                        case error:
                        case LAMDA:
                            yyn = 145;
                            continue;
                    }
                    yyn = yyr3();
                    continue;

                case 63:
                    yyst[yysp] = 63;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 134:
                    switch (yytok) {
                        case CONS:
                            yyn = 34;
                            continue;
                        case ')':
                            yyn = 67;
                            continue;
                    }
                    yyn = 145;
                    continue;

                case 64:
                    yyst[yysp] = 64;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 135:
                    yyn = yys64();
                    continue;

                case 65:
                    yyst[yysp] = 65;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 136:
                    yyn = yys65();
                    continue;

                case 66:
                    yyst[yysp] = 66;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 137:
                    switch (yytok) {
                        case error:
                        case LAMDA:
                            yyn = 145;
                            continue;
                    }
                    yyn = yyr10();
                    continue;

                case 67:
                    yyst[yysp] = 67;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 138:
                    switch (yytok) {
                        case error:
                        case LAMDA:
                            yyn = 145;
                            continue;
                    }
                    yyn = yyr21();
                    continue;

                case 68:
                    yyst[yysp] = 68;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 139:
                    yyn = yys68();
                    continue;

                case 69:
                    yyst[yysp] = 69;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 140:
                    yyn = yys69();
                    continue;

                case 70:
                    yyst[yysp] = 70;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 141:
                    switch (yytok) {
                        case error:
                        case LAMDA:
                            yyn = 145;
                            continue;
                    }
                    yyn = yyr6();
                    continue;

                case 142:
                    return true;
                case 143:
                    yyerror("stack overflow");
                case 144:
                    return false;
                case 145:
                    yyerror("syntax error");
                    return false;
            }
        }
    }

    protected void yyexpand() {
        int[] newyyst = new int[2*yyst.length];
        int[] newyysv = new int[2*yyst.length];
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
            case FST:
                return 5;
            case FUN:
                return 6;
            case HEAD:
                return 7;
            case ID:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case SKIP:
                return 14;
            case SND:
                return 15;
            case TAIL:
                return 16;
            case WHILE:
                return 17;
            case '(':
                return 18;
            case '~':
                return 19;
        }
        return 145;
    }

    private int yys1() {
        switch (yytok) {
            case ENDINPUT:
                return 142;
            case AND:
                return 21;
            case CONS:
                return 22;
            case OR:
                return 23;
            case '*':
                return 24;
            case '+':
                return 25;
            case ',':
                return 26;
            case '-':
                return 27;
            case '/':
                return 28;
            case ';':
                return 29;
            case '<':
                return 30;
            case '=':
                return 31;
            case '>':
                return 32;
        }
        return 145;
    }

    private int yys2() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FST:
                return 5;
            case FUN:
                return 6;
            case HEAD:
                return 7;
            case ID:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case SKIP:
                return 14;
            case SND:
                return 15;
            case TAIL:
                return 16;
            case WHILE:
                return 17;
            case '(':
                return 18;
            case '~':
                return 19;
        }
        return 145;
    }

    private int yys5() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FST:
                return 5;
            case FUN:
                return 6;
            case HEAD:
                return 7;
            case ID:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case SKIP:
                return 14;
            case SND:
                return 15;
            case TAIL:
                return 16;
            case WHILE:
                return 17;
            case '(':
                return 18;
            case '~':
                return 19;
        }
        return 145;
    }

    private int yys7() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FST:
                return 5;
            case FUN:
                return 6;
            case HEAD:
                return 7;
            case ID:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case SKIP:
                return 14;
            case SND:
                return 15;
            case TAIL:
                return 16;
            case WHILE:
                return 17;
            case '(':
                return 18;
            case '~':
                return 19;
        }
        return 145;
    }

    private int yys9() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FST:
                return 5;
            case FUN:
                return 6;
            case HEAD:
                return 7;
            case ID:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case SKIP:
                return 14;
            case SND:
                return 15;
            case TAIL:
                return 16;
            case WHILE:
                return 17;
            case '(':
                return 18;
            case '~':
                return 19;
        }
        return 145;
    }

    private int yys13() {
        switch (yytok) {
            case LET:
            case FST:
            case INTEGER:
            case '(':
            case WHILE:
            case IF:
            case TAIL:
            case SND:
            case ID:
            case SKIP:
            case '~':
            case HEAD:
            case NOT:
            case NIL:
            case FUN:
            case BOOLEAN:
                return yyr35();
        }
        return 145;
    }

    private int yys15() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FST:
                return 5;
            case FUN:
                return 6;
            case HEAD:
                return 7;
            case ID:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case SKIP:
                return 14;
            case SND:
                return 15;
            case TAIL:
                return 16;
            case WHILE:
                return 17;
            case '(':
                return 18;
            case '~':
                return 19;
        }
        return 145;
    }

    private int yys16() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FST:
                return 5;
            case FUN:
                return 6;
            case HEAD:
                return 7;
            case ID:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case SKIP:
                return 14;
            case SND:
                return 15;
            case TAIL:
                return 16;
            case WHILE:
                return 17;
            case '(':
                return 18;
            case '~':
                return 19;
        }
        return 145;
    }

    private int yys17() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FST:
                return 5;
            case FUN:
                return 6;
            case HEAD:
                return 7;
            case ID:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case SKIP:
                return 14;
            case SND:
                return 15;
            case TAIL:
                return 16;
            case WHILE:
                return 17;
            case '(':
                return 18;
            case '~':
                return 19;
        }
        return 145;
    }

    private int yys18() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FST:
                return 5;
            case FUN:
                return 6;
            case HEAD:
                return 7;
            case ID:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case SKIP:
                return 14;
            case SND:
                return 15;
            case TAIL:
                return 16;
            case WHILE:
                return 17;
            case '(':
                return 18;
            case '~':
                return 19;
        }
        return 145;
    }

    private int yys19() {
        switch (yytok) {
            case LET:
            case FST:
            case INTEGER:
            case '(':
            case WHILE:
            case IF:
            case TAIL:
            case SND:
            case ID:
            case SKIP:
            case '~':
            case HEAD:
            case NOT:
            case NIL:
            case FUN:
            case BOOLEAN:
                return yyr34();
        }
        return 145;
    }

    private int yys20() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FST:
                return 5;
            case FUN:
                return 6;
            case HEAD:
                return 7;
            case ID:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case SKIP:
                return 14;
            case SND:
                return 15;
            case TAIL:
                return 16;
            case WHILE:
                return 17;
            case '(':
                return 18;
            case '~':
                return 19;
        }
        return 145;
    }

    private int yys21() {
        switch (yytok) {
            case LET:
            case FST:
            case INTEGER:
            case '(':
            case WHILE:
            case IF:
            case TAIL:
            case SND:
            case ID:
            case SKIP:
            case '~':
            case HEAD:
            case NOT:
            case NIL:
            case FUN:
            case BOOLEAN:
                return yyr30();
        }
        return 145;
    }

    private int yys22() {
        switch (yytok) {
            case LET:
            case FST:
            case INTEGER:
            case '(':
            case WHILE:
            case IF:
            case TAIL:
            case SND:
            case ID:
            case SKIP:
            case '~':
            case HEAD:
            case NOT:
            case NIL:
            case FUN:
            case BOOLEAN:
                return yyr32();
        }
        return 145;
    }

    private int yys23() {
        switch (yytok) {
            case LET:
            case FST:
            case INTEGER:
            case '(':
            case WHILE:
            case IF:
            case TAIL:
            case SND:
            case ID:
            case SKIP:
            case '~':
            case HEAD:
            case NOT:
            case NIL:
            case FUN:
            case BOOLEAN:
                return yyr31();
        }
        return 145;
    }

    private int yys24() {
        switch (yytok) {
            case LET:
            case FST:
            case INTEGER:
            case '(':
            case WHILE:
            case IF:
            case TAIL:
            case SND:
            case ID:
            case SKIP:
            case '~':
            case HEAD:
            case NOT:
            case NIL:
            case FUN:
            case BOOLEAN:
                return yyr25();
        }
        return 145;
    }

    private int yys25() {
        switch (yytok) {
            case LET:
            case FST:
            case INTEGER:
            case '(':
            case WHILE:
            case IF:
            case TAIL:
            case SND:
            case ID:
            case SKIP:
            case '~':
            case HEAD:
            case NOT:
            case NIL:
            case FUN:
            case BOOLEAN:
                return yyr23();
        }
        return 145;
    }

    private int yys26() {
        switch (yytok) {
            case LET:
            case FST:
            case INTEGER:
            case '(':
            case WHILE:
            case IF:
            case TAIL:
            case SND:
            case ID:
            case SKIP:
            case '~':
            case HEAD:
            case NOT:
            case NIL:
            case FUN:
            case BOOLEAN:
                return yyr33();
        }
        return 145;
    }

    private int yys27() {
        switch (yytok) {
            case LET:
            case FST:
            case INTEGER:
            case '(':
            case WHILE:
            case IF:
            case TAIL:
            case SND:
            case ID:
            case SKIP:
            case '~':
            case HEAD:
            case NOT:
            case NIL:
            case FUN:
            case BOOLEAN:
                return yyr24();
        }
        return 145;
    }

    private int yys28() {
        switch (yytok) {
            case LET:
            case FST:
            case INTEGER:
            case '(':
            case WHILE:
            case IF:
            case TAIL:
            case SND:
            case ID:
            case SKIP:
            case '~':
            case HEAD:
            case NOT:
            case NIL:
            case FUN:
            case BOOLEAN:
                return yyr26();
        }
        return 145;
    }

    private int yys29() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FST:
                return 5;
            case FUN:
                return 6;
            case HEAD:
                return 7;
            case ID:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case SKIP:
                return 14;
            case SND:
                return 15;
            case TAIL:
                return 16;
            case WHILE:
                return 17;
            case '(':
                return 18;
            case '~':
                return 19;
        }
        return 145;
    }

    private int yys30() {
        switch (yytok) {
            case LET:
            case FST:
            case INTEGER:
            case '(':
            case WHILE:
            case IF:
            case TAIL:
            case SND:
            case ID:
            case SKIP:
            case '~':
            case HEAD:
            case NOT:
            case NIL:
            case FUN:
            case BOOLEAN:
                return yyr29();
        }
        return 145;
    }

    private int yys31() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FST:
                return 5;
            case FUN:
                return 6;
            case HEAD:
                return 7;
            case ID:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case SKIP:
                return 14;
            case SND:
                return 15;
            case TAIL:
                return 16;
            case WHILE:
                return 17;
            case '(':
                return 18;
            case '~':
                return 19;
        }
        return 145;
    }

    private int yys32() {
        switch (yytok) {
            case LET:
            case FST:
            case INTEGER:
            case '(':
            case WHILE:
            case IF:
            case TAIL:
            case SND:
            case ID:
            case SKIP:
            case '~':
            case HEAD:
            case NOT:
            case NIL:
            case FUN:
            case BOOLEAN:
                return yyr28();
        }
        return 145;
    }

    private int yys33() {
        switch (yytok) {
            case error:
            case LAMDA:
                return 145;
            case AND:
                return 21;
            case CONS:
                return 22;
            case OR:
                return 23;
            case '*':
                return 24;
            case '+':
                return 25;
            case ',':
                return 26;
            case '-':
                return 27;
            case '/':
                return 28;
            case ';':
                return 29;
            case '<':
                return 30;
            case '=':
                return 31;
            case '>':
                return 32;
        }
        return yyr5();
    }

    private int yys34() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FUN:
                return 6;
            case INTEGER:
                return 10;
            case NIL:
                return 12;
            case SKIP:
                return 14;
            case '(':
                return 49;
        }
        return 145;
    }

    private int yys35() {
        switch (yytok) {
            case error:
            case LAMDA:
                return 145;
            case AND:
                return 21;
            case CONS:
                return 22;
            case OR:
                return 23;
            case '*':
                return 24;
            case '+':
                return 25;
            case ',':
                return 26;
            case '-':
                return 27;
            case '/':
                return 28;
            case ';':
                return 29;
            case '<':
                return 30;
            case '=':
                return 31;
            case '>':
                return 32;
        }
        return yyr11();
    }

    private int yys37() {
        switch (yytok) {
            case error:
            case LAMDA:
                return 145;
            case AND:
                return 21;
            case CONS:
                return 22;
            case OR:
                return 23;
            case '*':
                return 24;
            case '+':
                return 25;
            case ',':
                return 26;
            case '-':
                return 27;
            case '/':
                return 28;
            case ';':
                return 29;
            case '<':
                return 30;
            case '=':
                return 31;
            case '>':
                return 32;
        }
        return yyr13();
    }

    private int yys38() {
        switch (yytok) {
            case AND:
                return 21;
            case CONS:
                return 22;
            case OR:
                return 23;
            case '*':
                return 24;
            case '+':
                return 25;
            case ',':
                return 26;
            case '-':
                return 27;
            case '/':
                return 28;
            case ';':
                return 29;
            case '<':
                return 30;
            case '=':
                return 31;
            case '>':
                return 32;
            case THEN:
                return 51;
        }
        return 145;
    }

    private int yys40() {
        switch (yytok) {
            case error:
            case LAMDA:
                return 145;
            case AND:
                return 21;
            case CONS:
                return 22;
            case OR:
                return 23;
            case '*':
                return 24;
            case '+':
                return 25;
            case ',':
                return 26;
            case '-':
                return 27;
            case '/':
                return 28;
            case ';':
                return 29;
            case '<':
                return 30;
            case '=':
                return 31;
            case '>':
                return 32;
        }
        return yyr12();
    }

    private int yys41() {
        switch (yytok) {
            case error:
            case LAMDA:
                return 145;
            case AND:
                return 21;
            case CONS:
                return 22;
            case OR:
                return 23;
            case '*':
                return 24;
            case '+':
                return 25;
            case ',':
                return 26;
            case '-':
                return 27;
            case '/':
                return 28;
            case ';':
                return 29;
            case '<':
                return 30;
            case '=':
                return 31;
            case '>':
                return 32;
        }
        return yyr14();
    }

    private int yys42() {
        switch (yytok) {
            case AND:
                return 21;
            case CONS:
                return 22;
            case OR:
                return 23;
            case '*':
                return 24;
            case '+':
                return 25;
            case ',':
                return 26;
            case '-':
                return 27;
            case '/':
                return 28;
            case ';':
                return 29;
            case '<':
                return 30;
            case '=':
                return 31;
            case '>':
                return 32;
            case DO:
                return 53;
        }
        return 145;
    }

    private int yys43() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FST:
                return 5;
            case FUN:
                return 6;
            case HEAD:
                return 7;
            case ID:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case SKIP:
                return 14;
            case SND:
                return 15;
            case TAIL:
                return 16;
            case WHILE:
                return 17;
            case '(':
                return 18;
            case '~':
                return 19;
            case AND:
                return 21;
            case CONS:
                return 22;
            case OR:
                return 23;
            case '*':
                return 24;
            case '+':
                return 25;
            case ',':
                return 26;
            case '-':
                return 27;
            case '/':
                return 28;
            case ';':
                return 29;
            case '<':
                return 30;
            case '=':
                return 31;
            case '>':
                return 32;
            case ')':
                return 55;
        }
        return 145;
    }

    private int yys44() {
        switch (yytok) {
            case THEN:
            case END:
            case ELSE:
            case IN:
            case ENDINPUT:
            case DO:
            case error:
            case LAMDA:
                return 145;
            case CONS:
                return 34;
            case ',':
                return 56;
        }
        return yyr2();
    }

    private int yys45() {
        switch (yytok) {
            case error:
            case LAMDA:
                return 145;
            case AND:
                return 21;
            case CONS:
                return 22;
            case OR:
                return 23;
            case '*':
                return 24;
            case '+':
                return 25;
            case ',':
                return 26;
            case '-':
                return 27;
            case '/':
                return 28;
            case ';':
                return 29;
            case '<':
                return 30;
            case '=':
                return 31;
            case '>':
                return 32;
        }
        return yyr4();
    }

    private int yys46() {
        switch (yytok) {
            case error:
            case LAMDA:
                return 145;
            case AND:
                return 21;
            case CONS:
                return 22;
            case OR:
                return 23;
            case '*':
                return 24;
            case '+':
                return 25;
            case ',':
                return 26;
            case '-':
                return 27;
            case '/':
                return 28;
            case ';':
                return 29;
            case '<':
                return 30;
            case '=':
                return 31;
            case '>':
                return 32;
        }
        return yyr9();
    }

    private int yys47() {
        switch (yytok) {
            case error:
            case LAMDA:
                return 145;
            case AND:
                return 21;
            case CONS:
                return 22;
            case OR:
                return 23;
            case '*':
                return 24;
            case '+':
                return 25;
            case ',':
                return 26;
            case '-':
                return 27;
            case '/':
                return 28;
            case ';':
                return 29;
            case '<':
                return 30;
            case '=':
                return 31;
            case '>':
                return 32;
        }
        return yyr8();
    }

    private int yys49() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FUN:
                return 6;
            case INTEGER:
                return 10;
            case NIL:
                return 12;
            case SKIP:
                return 14;
            case '(':
                return 49;
        }
        return 145;
    }

    private int yys50() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FST:
                return 5;
            case FUN:
                return 6;
            case HEAD:
                return 7;
            case ID:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case SKIP:
                return 14;
            case SND:
                return 15;
            case TAIL:
                return 16;
            case WHILE:
                return 17;
            case '(':
                return 18;
            case '~':
                return 19;
        }
        return 145;
    }

    private int yys51() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FST:
                return 5;
            case FUN:
                return 6;
            case HEAD:
                return 7;
            case ID:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case SKIP:
                return 14;
            case SND:
                return 15;
            case TAIL:
                return 16;
            case WHILE:
                return 17;
            case '(':
                return 18;
            case '~':
                return 19;
        }
        return 145;
    }

    private int yys52() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FST:
                return 5;
            case FUN:
                return 6;
            case HEAD:
                return 7;
            case ID:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case SKIP:
                return 14;
            case SND:
                return 15;
            case TAIL:
                return 16;
            case WHILE:
                return 17;
            case '(':
                return 18;
            case '~':
                return 19;
        }
        return 145;
    }

    private int yys53() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FST:
                return 5;
            case FUN:
                return 6;
            case HEAD:
                return 7;
            case ID:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case SKIP:
                return 14;
            case SND:
                return 15;
            case TAIL:
                return 16;
            case WHILE:
                return 17;
            case '(':
                return 18;
            case '~':
                return 19;
        }
        return 145;
    }

    private int yys54() {
        switch (yytok) {
            case AND:
                return 21;
            case CONS:
                return 22;
            case OR:
                return 23;
            case '*':
                return 24;
            case '+':
                return 25;
            case ',':
                return 26;
            case '-':
                return 27;
            case '/':
                return 28;
            case ';':
                return 29;
            case '<':
                return 30;
            case '=':
                return 31;
            case '>':
                return 32;
            case ')':
                return 62;
        }
        return 145;
    }

    private int yys56() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FUN:
                return 6;
            case INTEGER:
                return 10;
            case NIL:
                return 12;
            case SKIP:
                return 14;
            case '(':
                return 49;
        }
        return 145;
    }

    private int yys58() {
        switch (yytok) {
            case error:
            case LAMDA:
                return 145;
            case AND:
                return 21;
            case CONS:
                return 22;
            case OR:
                return 23;
            case '*':
                return 24;
            case '+':
                return 25;
            case ',':
                return 26;
            case '-':
                return 27;
            case '/':
                return 28;
            case ';':
                return 29;
            case '<':
                return 30;
            case '=':
                return 31;
            case '>':
                return 32;
        }
        return yyr20();
    }

    private int yys59() {
        switch (yytok) {
            case AND:
                return 21;
            case CONS:
                return 22;
            case OR:
                return 23;
            case '*':
                return 24;
            case '+':
                return 25;
            case ',':
                return 26;
            case '-':
                return 27;
            case '/':
                return 28;
            case ';':
                return 29;
            case '<':
                return 30;
            case '=':
                return 31;
            case '>':
                return 32;
            case ELSE:
                return 64;
        }
        return 145;
    }

    private int yys60() {
        switch (yytok) {
            case AND:
                return 21;
            case CONS:
                return 22;
            case OR:
                return 23;
            case '*':
                return 24;
            case '+':
                return 25;
            case ',':
                return 26;
            case '-':
                return 27;
            case '/':
                return 28;
            case ';':
                return 29;
            case '<':
                return 30;
            case '=':
                return 31;
            case '>':
                return 32;
            case IN:
                return 65;
        }
        return 145;
    }

    private int yys61() {
        switch (yytok) {
            case AND:
                return 21;
            case CONS:
                return 22;
            case OR:
                return 23;
            case '*':
                return 24;
            case '+':
                return 25;
            case ',':
                return 26;
            case '-':
                return 27;
            case '/':
                return 28;
            case ';':
                return 29;
            case '<':
                return 30;
            case '=':
                return 31;
            case '>':
                return 32;
            case END:
                return 66;
        }
        return 145;
    }

    private int yys64() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FST:
                return 5;
            case FUN:
                return 6;
            case HEAD:
                return 7;
            case ID:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case SKIP:
                return 14;
            case SND:
                return 15;
            case TAIL:
                return 16;
            case WHILE:
                return 17;
            case '(':
                return 18;
            case '~':
                return 19;
        }
        return 145;
    }

    private int yys65() {
        switch (yytok) {
            case BOOLEAN:
                return 4;
            case FST:
                return 5;
            case FUN:
                return 6;
            case HEAD:
                return 7;
            case ID:
                return 8;
            case IF:
                return 9;
            case INTEGER:
                return 10;
            case LET:
                return 11;
            case NIL:
                return 12;
            case NOT:
                return 13;
            case SKIP:
                return 14;
            case SND:
                return 15;
            case TAIL:
                return 16;
            case WHILE:
                return 17;
            case '(':
                return 18;
            case '~':
                return 19;
        }
        return 145;
    }

    private int yys68() {
        switch (yytok) {
            case error:
            case LAMDA:
                return 145;
            case AND:
                return 21;
            case CONS:
                return 22;
            case OR:
                return 23;
            case '*':
                return 24;
            case '+':
                return 25;
            case ',':
                return 26;
            case '-':
                return 27;
            case '/':
                return 28;
            case ';':
                return 29;
            case '<':
                return 30;
            case '=':
                return 31;
            case '>':
                return 32;
        }
        return yyr7();
    }

    private int yys69() {
        switch (yytok) {
            case AND:
                return 21;
            case CONS:
                return 22;
            case OR:
                return 23;
            case '*':
                return 24;
            case '+':
                return 25;
            case ',':
                return 26;
            case '-':
                return 27;
            case '/':
                return 28;
            case ';':
                return 29;
            case '<':
                return 30;
            case '=':
                return 31;
            case '>':
                return 32;
            case END:
                return 70;
        }
        return 145;
    }

    private int yyr1() { // e : ID
        yysp -= 1;
        return yype();
    }

    private int yyr2() { // e : v
        yysp -= 1;
        return yype();
    }

    private int yyr3() { // e : '(' e e ')'
        yysp -= 4;
        return yype();
    }

    private int yyr4() { // e : e bop e
        yysp -= 3;
        return yype();
    }

    private int yyr5() { // e : uop e
        yysp -= 2;
        return yype();
    }

    private int yyr6() { // e : LET ID '=' e IN e END
        yysp -= 7;
        return yype();
    }

    private int yyr7() { // e : IF e THEN e ELSE e
        yysp -= 6;
        return yype();
    }

    private int yyr8() { // e : e '=' e
        yysp -= 3;
        return yype();
    }

    private int yyr9() { // e : e ';' e
        yysp -= 3;
        return yype();
    }

    private int yyr10() { // e : WHILE e DO e END
        yysp -= 5;
        return yype();
    }

    private int yyr11() { // e : FST e
        yysp -= 2;
        return yype();
    }

    private int yyr12() { // e : SND e
        yysp -= 2;
        return yype();
    }

    private int yyr13() { // e : HEAD e
        yysp -= 2;
        return yype();
    }

    private int yyr14() { // e : TAIL e
        yysp -= 2;
        return yype();
    }

    private int yyr15() { // e : '(' e ')'
        yysp -= 3;
        return yype();
    }

    private int yype() {
        switch (yyst[yysp-1]) {
            case 64: return 68;
            case 53: return 61;
            case 52: return 60;
            case 51: return 59;
            case 50: return 58;
            case 43: return 54;
            case 31: return 47;
            case 29: return 46;
            case 20: return 45;
            case 18: return 43;
            case 17: return 42;
            case 16: return 41;
            case 15: return 40;
            case 9: return 38;
            case 7: return 37;
            case 5: return 35;
            case 2: return 33;
            case 0: return 1;
            default: return 69;
        }
    }

    private int yyr23() { // bop : '+'
        yysp -= 1;
        return 20;
    }

    private int yyr24() { // bop : '-'
        yysp -= 1;
        return 20;
    }

    private int yyr25() { // bop : '*'
        yysp -= 1;
        return 20;
    }

    private int yyr26() { // bop : '/'
        yysp -= 1;
        return 20;
    }

    private int yyr27() { // bop : '='
        yysp -= 1;
        return 20;
    }

    private int yyr28() { // bop : '>'
        yysp -= 1;
        return 20;
    }

    private int yyr29() { // bop : '<'
        yysp -= 1;
        return 20;
    }

    private int yyr30() { // bop : AND
        yysp -= 1;
        return 20;
    }

    private int yyr31() { // bop : OR
        yysp -= 1;
        return 20;
    }

    private int yyr32() { // bop : CONS
        yysp -= 1;
        return 20;
    }

    private int yyr33() { // bop : ','
        yysp -= 1;
        return 20;
    }

    private int yyr34() { // uop : '~'
        yysp -= 1;
        return 2;
    }

    private int yyr35() { // uop : NOT
        yysp -= 1;
        return 2;
    }

    private int yyr16() { // v : INTEGER
        yysp -= 1;
        return yypv();
    }

    private int yyr17() { // v : BOOLEAN
        yysp -= 1;
        return yypv();
    }

    private int yyr18() { // v : NIL
        yysp -= 1;
        return yypv();
    }

    private int yyr19() { // v : SKIP
        yysp -= 1;
        return yypv();
    }

    private int yyr20() { // v : FUN ID LAMDA e
        yysp -= 4;
        return yypv();
    }

    private int yyr21() { // v : '(' v ',' v ')'
        yysp -= 5;
        return yypv();
    }

    private int yyr22() { // v : v CONS v
        yysp -= 3;
        return yypv();
    }

    private int yypv() {
        switch (yyst[yysp-1]) {
            case 56: return 63;
            case 49: return 57;
            case 34: return 48;
            case 18: return 44;
            default: return 3;
        }
    }

    protected String[] yyerrmsgs = {
    };


  private void yyerror(String msg) {
    System.out.println("ERROR: " + msg);
    System.exit(1);
  }

  private int c;

  /** Read a single input character from standard input.
   */
  private void nextChar() {
    if (c>=0) {
      try {
        c = System.in.read();
      } catch (Exception e) {
        c = (-1);
      }
    }
  }

  int token;
  int yylval;

  /** Read the next token and return the
   *  corresponding integer code.
   */
  int yylex() {
    for (;;) {
      // Skip whitespace
      while (c==' ' || c=='\n' || c=='\t' || c=='\r') {
        nextChar();
      }
      if (c<0) {
        return (token=ENDINPUT);
      }
      switch (c) {
        case '+' : nextChar();
                   return token='+';
        case '-' : nextChar();
                   return token='-';
        case '*' : nextChar();
                   return token='*';
        case '/' : nextChar();
                   return token='/';
        case '(' : nextChar();
                   return token='(';
        case ')' : nextChar();
                   return token=')';
        case ';' : nextChar();
                   return token=';';
        default  : if (Character.isDigit((char)c)) {
                     int n = 0;
                       do {
                         n = 10*n + (c - '0');
                         nextChar();
                       } while (Character.isDigit((char)c));
                       yylval = n;
                       return token=INTEGER;
                     } else {
                       yyerror("Illegal character "+c);
                       nextChar();
                     }
      }
    }
  }

  public static void main(String[] args) {
    Calc calc = new Calc();
    calc.nextChar(); // prime the character input stream
    calc.yylex();    // prime the token input stream
    calc.parse();    // parse the input
  }

}
