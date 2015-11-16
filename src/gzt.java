// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.RectF;

final class gzt
{

    private static final char a[] = "http://".toCharArray();
    private static final char b[] = "https://".toCharArray();
    private static final char c[] = "lh".toCharArray();
    private static final char d[] = "ap".toCharArray();
    private static final char e[] = "sp".toCharArray();
    private static final char f[] = "bp".toCharArray();
    private static final char g[] = ".googleusercontent.com/".toCharArray();
    private static final char h[] = "www.google.com/visualsearch/lh/".toCharArray();
    private static final char i[] = ".google.com/".toCharArray();
    private static final char j[] = ".blogger.com/".toCharArray();
    private static final char k[] = ".ggpht.com/".toCharArray();
    private static final char l[] = "public".toCharArray();
    private static final char m[] = "proxy".toCharArray();
    private static final char n[] = "image".toCharArray();
    private static final char o[] = "%3D".toCharArray();
    private static final char p[] = "%3d".toCharArray();
    private static final char q[][] = {
        {
            'O'
        }, {
            'J'
        }, {
            'U', 't'
        }, {
            'U'
        }, {
            'I'
        }
    };
    private boolean A;
    private boolean B;
    private boolean C;
    private int D;
    private int E;
    private int F;
    private int G[];
    private int H[];
    private char r[];
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private boolean x;
    private boolean y;
    private boolean z;

    gzt()
    {
        r = new char[2000];
        C = true;
        G = new int[8];
        H = new int[8];
    }

    private static String a(float f1)
    {
        if (f1 < 0.0F || f1 > 1.0F)
        {
            throw new IllegalArgumentException("Cropping requires values between 0 and 1");
        }
        String s1 = String.valueOf(Integer.toHexString((int)Math.floor(65535F * f1)));
        if (s1.length() != 0)
        {
            s1 = "0000".concat(s1);
        } else
        {
            s1 = new String("0000");
        }
        return s1.substring(s1.length() - 4, s1.length());
    }

    private void a(StringBuilder stringbuilder)
    {
        int i1;
        int k2;
        i1 = v;
        k2 = v + D;
_L10:
        if (i1 >= k2) goto _L2; else goto _L1
_L1:
        int l1 = 0;
_L9:
        int j1 = i1;
        if (l1 >= q.length) goto _L4; else goto _L3
_L3:
        char ac[];
        int k1;
        ac = q[l1];
        k1 = 0;
        j1 = i1;
_L11:
        char ac1[];
        int i2;
        int j2;
        if (k1 >= ac.length || j1 >= k2)
        {
            break MISSING_BLOCK_LABEL_236;
        }
        i2 = k1 + 1;
        j2 = ac[k1];
        ac1 = r;
        k1 = j1 + 1;
        if (j2 == ac1[j1]) goto _L6; else goto _L5
_L5:
        j1 = k1;
        k1 = 0;
_L12:
label0:
        {
            j2 = k1;
            if (k1 == 0)
            {
                break label0;
            }
            if (i2 == ac.length)
            {
                j2 = k1;
                if (j1 == k2)
                {
                    break label0;
                }
                j2 = k1;
                if (r[j1] == '-')
                {
                    break label0;
                }
            }
            j2 = 0;
        }
        if (j2 == 0) goto _L8; else goto _L7
_L7:
        stringbuilder.append(q[l1]).append('-');
          goto _L4
_L8:
        l1++;
          goto _L9
_L4:
        for (j1 = i1; j1 < k2 && r[j1] != '-'; j1++) { }
        i1 = j1 + 1;
          goto _L10
_L2:
        return;
_L6:
        j1 = k1;
        k1 = i2;
          goto _L11
        i2 = k1;
        k1 = 1;
          goto _L12
    }

    private boolean a(int i1, char ac[])
    {
        int k1 = ac.length;
        if (i1 + k1 <= s) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int j1 = 0;
label0:
        do
        {
label1:
            {
                if (j1 >= k1)
                {
                    break label1;
                }
                if (r[i1 + j1] != ac[j1])
                {
                    break label0;
                }
                j1++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    private boolean a(char ac[])
    {
        int i1;
        int k1;
        i1 = t;
        k1 = ac.length;
        if (i1 + k1 <= s) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int j1 = 0;
label0:
        do
        {
label1:
            {
                if (j1 >= k1)
                {
                    break label1;
                }
                if (r[i1] != ac[j1])
                {
                    break label0;
                }
                j1++;
                i1++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        t = i1;
        return true;
    }

    private int b(int i1, char ac[])
    {
        int k1;
label0:
        {
            int l1 = ac.length;
label1:
            for (int i2 = s; i1 <= i2 - l1; i1++)
            {
                int j1 = 0;
                do
                {
                    k1 = i1;
                    if (j1 >= l1)
                    {
                        break label0;
                    }
                    if (r[i1 + j1] != ac[j1])
                    {
                        continue label1;
                    }
                    j1++;
                } while (true);
            }

            k1 = -1;
        }
        return k1;
    }

    private void b(StringBuilder stringbuilder)
    {
        int i1 = v;
        int j1 = v;
        for (int k1 = D + j1; i1 < k1; i1++)
        {
            boolean flag;
            if (r[i1] == 'f')
            {
                flag = true;
            } else
            {
                flag = false;
            }
            for (; i1 < k1 && r[i1] != '-'; i1++)
            {
                if (flag)
                {
                    stringbuilder.append(r[i1]);
                }
            }

            if (flag)
            {
                stringbuilder.append('-');
            }
        }

    }

    String a(String s1, int i1, int j1, int k1, int l1, int i2, int j2, 
            RectF rectf, int k2, int l2)
    {
        this;
        JVM INSTR monitorenter ;
        s = s1.length();
        if (s >= 2000) goto _L2; else goto _L1
_L1:
        s1.getChars(0, s, r, 0);
        t = 0;
        z = false;
        A = false;
        B = false;
        if (a(a) || a(b)) goto _L4; else goto _L3
_L3:
        boolean flag1 = false;
_L25:
        x = flag1;
        if (!x) goto _L2; else goto _L5
_L5:
        int i3;
        int j3;
        i3 = t;
        j3 = t;
        F = 0;
_L14:
        if (i3 == s) goto _L7; else goto _L6
_L6:
        l2 = j3;
        if (r[i3] != '/') goto _L8; else goto _L7
_L7:
        if (i3 != j3) goto _L10; else goto _L9
_L9:
        if (i3 == s) goto _L10; else goto _L11
_L11:
        l2 = i3 + 1;
_L8:
        if (i3 == s) goto _L13; else goto _L12
_L12:
        i3++;
        j3 = l2;
          goto _L14
_L4:
        u = t;
        if (!a(c)) goto _L16; else goto _L15
_L15:
        z = true;
        if (r[t] < '3' || r[t] > '6') goto _L18; else goto _L17
_L17:
        t = t + 1;
        if (r[t] != '-' || r[t + 1] != 'd') goto _L20; else goto _L19
_L19:
        y = true;
        t = t + 2;
        if ((r[t] < 'a' || r[t] > 'g') && r[t] != 'z') goto _L22; else goto _L21
_L21:
        t = t + 1;
        if (a(g)) goto _L24; else goto _L23
_L23:
        flag1 = false;
          goto _L25
_L20:
        if (r[t] != '-' || r[t + 1] != 't' || r[t + 2] != 't') goto _L27; else goto _L26
_L26:
        y = true;
        t = t + 3;
        if (a(g)) goto _L24; else goto _L28
_L28:
        flag1 = false;
          goto _L25
_L27:
        if (!a(i)) goto _L30; else goto _L29
_L29:
        A = true;
_L24:
        E = t - 1;
        flag1 = true;
          goto _L25
_L30:
        if (a(g) || a(k)) goto _L24; else goto _L31
_L31:
        flag1 = false;
          goto _L25
_L16:
        if (!a(e)) goto _L33; else goto _L32
_L32:
        z = true;
        if (r[t] < '1' || r[t] > '3') goto _L35; else goto _L34
_L34:
        t = t + 1;
        if (a(g) || a(k)) goto _L24; else goto _L36
_L36:
        flag1 = false;
          goto _L25
_L33:
        if (!a(d)) goto _L38; else goto _L37
_L37:
        z = true;
        if (r[t] != '2') goto _L40; else goto _L39
_L39:
        t = t + 1;
        if (a(g) || a(k)) goto _L24; else goto _L41
_L41:
        flag1 = false;
          goto _L25
_L38:
        z = false;
        if (!a(f))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (r[t] < '0' || r[t] > '3') goto _L43; else goto _L42
_L42:
        t = t + 1;
        if (a(j)) goto _L24; else goto _L44
_L44:
        flag1 = false;
          goto _L25
        if (a(h)) goto _L24; else goto _L45
_L45:
        flag1 = false;
          goto _L25
_L10:
        if (F >= 8) goto _L2; else goto _L46
_L46:
        G[F] = j3;
        H[F] = i3 - j3;
        l2 = i3 + 1;
        F = F + 1;
          goto _L8
        s1;
        throw s1;
_L13:
        i3 = 0;
        l2 = i3;
        if (F <= 1)
        {
            break MISSING_BLOCK_LABEL_826;
        }
        l2 = i3;
        if (H[0] != n.length)
        {
            break MISSING_BLOCK_LABEL_826;
        }
        l2 = i3;
        if (a(G[0], n))
        {
            l2 = 1;
        }
        if (l2 != 0) goto _L48; else goto _L47
_L47:
        if (F != 5) goto _L48; else goto _L49
_L49:
        v = G[4];
        D = 0;
          goto _L50
_L103:
        if (l2 == 0) goto _L52; else goto _L51
_L51:
        B = true;
        C = true;
_L83:
        flag1 = C;
        if (flag1) goto _L54; else goto _L53
_L53:
        s1 = null;
_L99:
        this;
        JVM INSTR monitorexit ;
        return s1;
_L48:
        if (l2 == 0) goto _L56; else goto _L55
_L55:
        if (F != 6) goto _L56; else goto _L57
_L57:
        v = G[5];
        D = 0;
          goto _L50
_L56:
        if (l2 != 0) goto _L59; else goto _L58
_L58:
        if (F != 6) goto _L59; else goto _L60
_L60:
        v = G[4];
        D = H[4];
          goto _L50
_L59:
        if (l2 == 0) goto _L62; else goto _L61
_L61:
        if (F != 7) goto _L62; else goto _L63
_L63:
        v = G[5];
        D = H[5];
          goto _L50
_L52:
        i3 = 0;
        l2 = i3;
        if (F <= 1) goto _L65; else goto _L64
_L64:
        if (H[0] == l.length && a(G[0], l)) goto _L67; else goto _L66
_L66:
        l2 = i3;
        if (H[0] != m.length) goto _L65; else goto _L68
_L68:
        l2 = i3;
        if (!a(G[0], m)) goto _L65; else goto _L67
_L65:
        if (l2 != 0) goto _L70; else goto _L69
_L69:
        if (F != 1) goto _L70; else goto _L71
_L71:
        l2 = G[0];
        j3 = H[0];
          goto _L72
_L104:
        if (i3 >= s) goto _L74; else goto _L73
_L73:
        if (r[i3] != '=') goto _L76; else goto _L75
_L75:
        w = i3;
        if (w == -1) goto _L78; else goto _L77
_L77:
        v = w + 1;
_L87:
        if (w == -1) goto _L80; else goto _L79
_L79:
        D = j3 - (v - l2);
          goto _L81
_L105:
        if (l2 == 0) goto _L2; else goto _L82
_L82:
        B = false;
        C = true;
          goto _L83
_L70:
        if (l2 == 0) goto _L85; else goto _L84
_L84:
        if (F != 2) goto _L85; else goto _L86
_L86:
        l2 = G[1];
        j3 = H[1];
          goto _L72
_L78:
        w = b(l2, o);
        if (w == -1)
        {
            w = b(l2, p);
        }
        if (w != -1)
        {
            v = w + 3;
        }
          goto _L87
_L80:
        w = j3 + l2;
        v = w;
        D = 0;
          goto _L81
_L2:
        C = false;
          goto _L83
_L54:
        s1 = new StringBuilder(s + 50);
        boolean flag = false;
        int k3;
        if ((i1 & 0x2000) != 0)
        {
            l2 = 1;
        } else
        {
            l2 = 0;
        }
        if ((i1 & 0x80) != 0)
        {
            i3 = 1;
        } else
        {
            i3 = 0;
        }
        k3 = ((flag) ? 1 : 0);
        if (!z) goto _L89; else goto _L88
_L88:
        if (k2 > 0 || l2 != 0) goto _L91; else goto _L90
_L90:
        k3 = ((flag) ? 1 : 0);
        if (i3 == 0) goto _L89; else goto _L91
_L91:
        s1.append(r, 0, u);
        if (A || i3 == 0) goto _L93; else goto _L92
_L92:
        if (y) goto _L93; else goto _L94
_L94:
        s1.append(e);
        s1.append((char)(k2 % 3 + 49));
_L100:
        k2 = u + 3;
        s1.append(r, k2, E - k2);
        k3 = E;
_L89:
        if (!B) goto _L96; else goto _L95
_L95:
        s1.append(r, k3, v - k3);
_L101:
        k2 = s1.length();
        if (j1 == 0 && (k1 != 0 || l1 != 0))
        {
            break MISSING_BLOCK_LABEL_1528;
        }
        s1.append('s').append(j1).append('-');
        if (k1 == 0)
        {
            break MISSING_BLOCK_LABEL_1550;
        }
        s1.append('w').append(k1).append('-');
        if (l1 == 0)
        {
            break MISSING_BLOCK_LABEL_1572;
        }
        s1.append('h').append(l1).append('-');
        if ((i1 & 0x20) == 0)
        {
            break MISSING_BLOCK_LABEL_1586;
        }
        s1.append("rw-");
        if ((i1 & 0x4000) == 0)
        {
            break MISSING_BLOCK_LABEL_1601;
        }
        s1.append("rwa-");
        if ((i1 & 1) == 0)
        {
            break MISSING_BLOCK_LABEL_1614;
        }
        s1.append("c-");
        if ((i1 & 2) == 0)
        {
            break MISSING_BLOCK_LABEL_1627;
        }
        s1.append("d-");
        if ((i1 & 0x10) == 0)
        {
            break MISSING_BLOCK_LABEL_1641;
        }
        s1.append("k-");
        if ((i1 & 4) == 0)
        {
            break MISSING_BLOCK_LABEL_1654;
        }
        s1.append("no-");
        if ((i1 & 0x40) == 0)
        {
            break MISSING_BLOCK_LABEL_1668;
        }
        s1.append("nu-");
        if ((i1 & 8) == 0)
        {
            break MISSING_BLOCK_LABEL_1682;
        }
        s1.append("p-");
        if ((i1 & 0x1000) == 0)
        {
            break MISSING_BLOCK_LABEL_1697;
        }
        s1.append("lf-");
        if ((i1 & 0x100) == 0)
        {
            break MISSING_BLOCK_LABEL_1712;
        }
        s1.append("fSoften=0,25,0-");
        if ((i1 & 0x200) == 0)
        {
            break MISSING_BLOCK_LABEL_1728;
        }
        s1.append("ip-");
        if ((i1 & 0x800) == 0)
        {
            break MISSING_BLOCK_LABEL_1744;
        }
        s1.append("rj-");
        if ((0x8000 & i1) == 0) goto _L98; else goto _L97
_L97:
        s1.append("fBoxBlur=2,24,24-");
          goto _L98
_L102:
        s1.append(j2).append('-');
_L107:
        if ((i1 & 0x400) == 0 || rectf == null)
        {
            break MISSING_BLOCK_LABEL_1855;
        }
        s1.append("fcrop64=1,");
        s1.append(a(rectf.left));
        s1.append(a(rectf.top));
        s1.append(a(rectf.right));
        s1.append(a(rectf.bottom));
        s1.append('-');
        a(((StringBuilder) (s1)));
        b(s1);
        if (s1.length() > k2)
        {
            s1.setLength(s1.length() - 1);
        }
        if (B && D == 0)
        {
            s1.append('/');
        }
        s1.append(r, v + D, s - (v + D));
        s1 = s1.toString();
          goto _L99
_L93:
        if (l2 == 0)
        {
            break MISSING_BLOCK_LABEL_1973;
        }
        if (y)
        {
            break MISSING_BLOCK_LABEL_1973;
        }
        s1.append(d).append('2');
          goto _L100
        s1.append(c);
        s1.append((char)(k2 % 4 + 51));
          goto _L100
_L96:
        s1.append(r, k3, w - k3);
        s1.append('=');
          goto _L101
_L108:
        s1.append('v');
          goto _L102
_L109:
        s1.append('l');
          goto _L102
_L22:
        flag1 = false;
          goto _L25
_L18:
        flag1 = false;
          goto _L25
_L35:
        flag1 = false;
          goto _L25
_L40:
        flag1 = false;
          goto _L25
_L43:
        flag1 = false;
          goto _L25
_L50:
        l2 = 1;
          goto _L103
_L62:
        l2 = 0;
          goto _L103
_L67:
        l2 = 1;
          goto _L65
_L72:
        i3 = l2;
          goto _L104
_L81:
        l2 = 1;
          goto _L105
_L85:
        l2 = 0;
          goto _L105
_L76:
        i3++;
          goto _L104
_L74:
        i3 = -1;
          goto _L75
_L98:
        if (i2 == -1 || j2 == -1) goto _L107; else goto _L106
_L106:
        i2;
        JVM INSTR tableswitch 0 1: default 2176
    //                   0 2025
    //                   1 2035;
           goto _L102 _L108 _L109
    }

}
