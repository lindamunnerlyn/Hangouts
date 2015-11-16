// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gh
{

    private static final byte a[];
    private final String b;
    private final boolean c = false;
    private final int d;
    private int e;
    private char f;

    gh(String s)
    {
        b = s;
        d = s.length();
    }

    private static byte a(char c1)
    {
        if (c1 < '\u0700')
        {
            return a[c1];
        } else
        {
            return Character.getDirectionality(c1);
        }
    }

    private byte c()
    {
        byte byte1;
        byte1 = 12;
        f = b.charAt(e - 1);
        if (!Character.isLowSurrogate(f)) goto _L2; else goto _L1
_L1:
        byte byte0;
        int i = Character.codePointBefore(b, e);
        e = e - Character.charCount(i);
        byte0 = Character.getDirectionality(i);
_L4:
        return byte0;
_L2:
        int j;
        e = e - 1;
        byte0 = a(f);
        if (!c)
        {
            break MISSING_BLOCK_LABEL_339;
        }
        if (f != '>')
        {
            break MISSING_BLOCK_LABEL_251;
        }
        j = e;
_L5:
        if (e <= 0)
        {
            break MISSING_BLOCK_LABEL_236;
        }
        String s = b;
        int k = e - 1;
        e = k;
        f = s.charAt(k);
        byte0 = byte1;
        if (f == '<') goto _L4; else goto _L3
_L3:
        if (f == '>')
        {
            break MISSING_BLOCK_LABEL_236;
        }
        if (f != '"' && f != '\'')
        {
            break;
        }
        char c2 = f;
        char c1;
        do
        {
            if (e <= 0)
            {
                break;
            }
            String s1 = b;
            int i1 = e - 1;
            e = i1;
            c1 = s1.charAt(i1);
            f = c1;
        } while (c1 != c2);
          goto _L5
        e = j;
        f = '>';
        return 13;
        if (f != ';')
        {
            break MISSING_BLOCK_LABEL_339;
        }
        j = e;
_L8:
        if (e <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        String s2 = b;
        int l = e - 1;
        e = l;
        f = s2.charAt(l);
        byte0 = byte1;
        if (f == '&') goto _L4; else goto _L6
_L6:
        if (f != ';') goto _L8; else goto _L7
_L7:
        e = j;
        f = ';';
        return 13;
        return byte0;
    }

    int a()
    {
        int i;
        int k;
        byte byte0;
        e = 0;
        k = 0;
        byte0 = 0;
        i = 0;
_L8:
        if (e >= d || k != 0) goto _L2; else goto _L1
_L1:
        f = b.charAt(e);
        if (!Character.isHighSurrogate(f)) goto _L4; else goto _L3
_L3:
        int j;
        j = Character.codePointAt(b, e);
        e = e + Character.charCount(j);
        j = Character.getDirectionality(j);
_L13:
        j;
        JVM INSTR tableswitch 0 18: default 180
    //                   0 479
    //                   1 491
    //                   2 491
    //                   3 180
    //                   4 180
    //                   5 180
    //                   6 180
    //                   7 180
    //                   8 180
    //                   9 13
    //                   10 180
    //                   11 180
    //                   12 180
    //                   13 180
    //                   14 449
    //                   15 449
    //                   16 459
    //                   17 459
    //                   18 469;
           goto _L5 _L6 _L7 _L7 _L5 _L5 _L5 _L5 _L5 _L5 _L8 _L5 _L5 _L5 _L5 _L9 _L9 _L10 _L10 _L11
_L5:
        k = i;
          goto _L8
_L4:
        int l;
        e = e + 1;
        l = a(f);
        j = l;
        if (!c) goto _L13; else goto _L12
_L12:
        if (f != '<') goto _L15; else goto _L14
_L14:
        j = e;
_L18:
        if (e < d)
        {
            String s = b;
            l = e;
            e = l + 1;
            f = s.charAt(l);
            if (f != '>')
            {
                continue; /* Loop/switch isn't completed */
            }
            j = 12;
        } else
        {
            e = j;
            f = '<';
            j = 13;
        }
          goto _L13
        if (f != '"' && f != '\'') goto _L17; else goto _L16
_L17:
        break;
_L16:
        l = f;
        char c1;
        do
        {
            if (e >= d)
            {
                break;
            }
            String s1 = b;
            int i1 = e;
            e = i1 + 1;
            c1 = s1.charAt(i1);
            f = c1;
        } while (c1 != l);
          goto _L18
_L15:
        j = l;
        if (f == '&')
        {
            char c2;
            do
            {
                if (e >= d)
                {
                    break;
                }
                String s2 = b;
                j = e;
                e = j + 1;
                c2 = s2.charAt(j);
                f = c2;
            } while (c2 != ';');
            j = 12;
        }
          goto _L13
_L9:
        i++;
        byte0 = -1;
          goto _L8
_L10:
        i++;
        byte0 = 1;
          goto _L8
_L11:
        i--;
        byte0 = 0;
          goto _L8
_L6:
        if (i != 0) goto _L20; else goto _L19
_L19:
        return -1;
_L20:
        k = i;
          goto _L8
_L7:
        if (i == 0)
        {
            return 1;
        }
        k = i;
          goto _L8
_L2:
        if (k == 0)
        {
            return 0;
        }
        if (byte0 != 0)
        {
            return byte0;
        }
_L23:
        if (e <= 0) goto _L22; else goto _L21
_L21:
        c();
        JVM INSTR tableswitch 14 18: default 564
    //                   14 567
    //                   15 567
    //                   16 580
    //                   17 580
    //                   18 595;
           goto _L23 _L24 _L24 _L25 _L25 _L26
_L24:
        if (k == i) goto _L19; else goto _L27
_L27:
        i--;
          goto _L23
_L25:
        if (k == i)
        {
            return 1;
        }
        i--;
          goto _L23
_L26:
        i++;
          goto _L23
_L22:
        return 0;
    }

    int b()
    {
        boolean flag = false;
        e = d;
        int j = 0;
        int i = 0;
        do
        {
label0:
            {
label1:
                {
label2:
                    {
label3:
                        {
label4:
                            {
                                byte byte0 = flag;
                                if (e > 0)
                                {
                                    switch (c())
                                    {
                                    case 3: // '\003'
                                    case 4: // '\004'
                                    case 5: // '\005'
                                    case 6: // '\006'
                                    case 7: // '\007'
                                    case 8: // '\b'
                                    case 10: // '\n'
                                    case 11: // '\013'
                                    case 12: // '\f'
                                    case 13: // '\r'
                                    default:
                                        if (j == 0)
                                        {
                                            j = i;
                                        }
                                        continue;

                                    case 1: // '\001'
                                    case 2: // '\002'
                                        break label2;

                                    case 9: // '\t'
                                        continue;

                                    case 14: // '\016'
                                    case 15: // '\017'
                                        break label3;

                                    case 16: // '\020'
                                    case 17: // '\021'
                                        break label1;

                                    case 18: // '\022'
                                        break label0;

                                    case 0: // '\0'
                                        break;
                                    }
                                    if (i != 0)
                                    {
                                        break label4;
                                    }
                                    byte0 = -1;
                                }
                                return byte0;
                            }
                            if (j == 0)
                            {
                                j = i;
                            }
                            continue;
                        }
                        if (j == i)
                        {
                            return -1;
                        }
                        i--;
                        continue;
                    }
                    if (i == 0)
                    {
                        return 1;
                    }
                    if (j == 0)
                    {
                        j = i;
                    }
                    continue;
                }
                if (j == i)
                {
                    return 1;
                }
                i--;
                continue;
            }
            i++;
        } while (true);
    }

    static 
    {
        a = new byte[1792];
        for (int i = 0; i < 1792; i++)
        {
            a[i] = Character.getDirectionality(i);
        }

    }
}
