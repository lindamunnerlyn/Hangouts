// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.util.Locale;

final class lqd
    implements lqo, lqs
{

    public int a;
    public int b;
    private final lnj c;

    protected lqd(lnj lnj1, int i, int j)
    {
        c = lnj1;
        int k = j;
        if (j > 18)
        {
            k = 18;
        }
        a = i;
        b = k;
    }

    public int a()
    {
        return b;
    }

    public int a(lqp lqp1, String s, int i)
    {
        lni lni1 = c.a(lqp1.a());
        int k = Math.min(b, s.length() - i);
        long l = 0L;
        long l1 = lni1.d().d() * 10L;
        int j = 0;
        do
        {
            if (j >= k)
            {
                break;
            }
            char c1 = s.charAt(i + j);
            if (c1 < '0' || c1 > '9')
            {
                break;
            }
            j++;
            l1 /= 10L;
            l += (long)(c1 - 48) * l1;
        } while (true);
        l /= 10L;
        if (j == 0)
        {
            return ~i;
        }
        if (l > 0x7fffffffL)
        {
            return ~i;
        } else
        {
            lqp1.a(new lpp(lnj.a(), lpn.a, lni1.d()), (int)l);
            return j + i;
        }
    }

    public void a(StringBuffer stringbuffer, long l, lng lng, int i, lnn lnn, Locale locale)
    {
        lng = c.a(lng);
        i = a;
        long l2 = lng.i(l);
        if (l2 != 0L) goto _L2; else goto _L1
_L1:
        int j = i;
        if (stringbuffer == null) goto _L4; else goto _L3
_L3:
        i--;
        if (i < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        stringbuffer.append('0');
        if (true) goto _L3; else goto _L5
        lng;
        j = i;
        if (stringbuffer == null) goto _L7; else goto _L6
_L6:
        int k;
        int i1;
        long l1;
        try
        {
            lpz.a(stringbuffer, i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (StringBuffer stringbuffer) { }
          goto _L5
_L7:
        i = j - 1;
        if (i < 0) goto _L5; else goto _L8
_L8:
        throw new NullPointerException();
_L4:
        i = j - 1;
        if (i < 0) goto _L5; else goto _L9
_L9:
        throw new NullPointerException();
_L2:
        l1 = lng.d().d();
        j = b;
          goto _L10
_L48:
        if ((l1 * l) / l == l1) goto _L12; else goto _L11
_L11:
        j--;
          goto _L10
_L12:
        lng = new long[2];
        lng[0] = (l * l2) / l1;
        lng[1] = j;
        l = lng[0];
        k = (int)lng[1];
        if ((0x7fffffffL & l) != l) goto _L14; else goto _L13
_L13:
        lng = Integer.toString((int)l);
_L20:
        i1 = lng.length();
        j = i;
        i = k;
_L95:
        if (i1 >= i) goto _L16; else goto _L15
_L15:
        if (stringbuffer == null) goto _L18; else goto _L17
_L17:
        stringbuffer.append('0');
          goto _L19
_L14:
        lng = Long.toString(l);
          goto _L20
_L18:
        throw new NullPointerException();
_L21:
        if (j >= k || i <= 1)
        {
            break MISSING_BLOCK_LABEL_303;
        }
        if (lng.charAt(i - 1) != '0')
        {
            break MISSING_BLOCK_LABEL_303;
        }
        k--;
        i--;
          goto _L21
        if (i >= lng.length()) goto _L23; else goto _L22
_L22:
        if (stringbuffer == null) goto _L25; else goto _L24
_L24:
        j = 0;
_L26:
        if (j >= i)
        {
            break; /* Loop/switch isn't completed */
        }
        stringbuffer.append(lng.charAt(j));
        j++;
        if (true) goto _L26; else goto _L5
_L25:
        if (i >= 0) goto _L5; else goto _L27
_L27:
        lng.charAt(0);
        throw new NullPointerException();
_L23:
        if (stringbuffer == null)
        {
            break MISSING_BLOCK_LABEL_380;
        }
        stringbuffer.append(lng);
        return;
        throw new NullPointerException();
_L5:
        return;
_L10:
        j;
        JVM INSTR tableswitch 1 18: default 480
    //                   1 485
    //                   2 492
    //                   3 499
    //                   4 506
    //                   5 513
    //                   6 520
    //                   7 527
    //                   8 534
    //                   9 541
    //                   10 548
    //                   11 555
    //                   12 562
    //                   13 569
    //                   14 576
    //                   15 583
    //                   16 590
    //                   17 597
    //                   18 604;
           goto _L28 _L29 _L30 _L31 _L32 _L33 _L34 _L35 _L36 _L37 _L38 _L39 _L40 _L41 _L42 _L43 _L44 _L45 _L46
_L50:
        if (true) goto _L48; else goto _L47
_L47:
_L52:
        if (true) goto _L50; else goto _L49
_L49:
_L54:
        if (true) goto _L52; else goto _L51
_L51:
_L56:
        if (true) goto _L54; else goto _L53
_L53:
_L58:
        if (true) goto _L56; else goto _L55
_L55:
_L60:
        if (true) goto _L58; else goto _L57
_L57:
_L62:
        if (true) goto _L60; else goto _L59
_L59:
_L64:
        if (true) goto _L62; else goto _L61
_L61:
_L66:
        if (true) goto _L64; else goto _L63
_L63:
_L68:
        if (true) goto _L66; else goto _L65
_L65:
_L70:
        if (true) goto _L68; else goto _L67
_L67:
_L72:
        if (true) goto _L70; else goto _L69
_L69:
_L74:
        if (true) goto _L72; else goto _L71
_L71:
_L76:
        if (true) goto _L74; else goto _L73
_L73:
_L78:
        if (true) goto _L76; else goto _L75
_L75:
_L80:
        if (true) goto _L78; else goto _L77
_L77:
_L82:
        if (true) goto _L80; else goto _L79
_L79:
_L84:
        if (true) goto _L82; else goto _L81
_L81:
_L86:
        if (true) goto _L84; else goto _L83
_L83:
_L88:
        if (true) goto _L86; else goto _L85
_L85:
_L90:
        if (true) goto _L88; else goto _L87
_L87:
_L92:
        if (true) goto _L90; else goto _L89
_L89:
_L94:
        if (true) goto _L92; else goto _L91
_L91:
        if (true) goto _L94; else goto _L93
_L93:
_L28:
        l = 1L;
          goto _L48
_L29:
        l = 10L;
          goto _L48
_L30:
        l = 100L;
          goto _L48
_L31:
        l = 1000L;
          goto _L48
_L32:
        l = 10000L;
          goto _L48
_L33:
        l = 0x186a0L;
          goto _L48
_L34:
        l = 0xf4240L;
          goto _L48
_L35:
        l = 0x989680L;
          goto _L48
_L36:
        l = 0x5f5e100L;
          goto _L48
_L37:
        l = 0x3b9aca00L;
          goto _L48
_L38:
        l = 0x2540be400L;
          goto _L48
_L39:
        l = 0x174876e800L;
          goto _L48
_L40:
        l = 0xe8d4a51000L;
          goto _L48
_L41:
        l = 0x9184e72a000L;
          goto _L48
_L42:
        l = 0x5af3107a4000L;
          goto _L48
_L43:
        l = 0x38d7ea4c68000L;
          goto _L48
_L44:
        l = 0x2386f26fc10000L;
          goto _L48
_L45:
        l = 0x16345785d8a0000L;
          goto _L48
_L46:
        l = 0xde0b6b3a7640000L;
          goto _L48
_L19:
        j--;
        i--;
          goto _L95
_L16:
        if (j >= i) goto _L23; else goto _L96
_L96:
        k = i;
        i = i1;
          goto _L21
    }

    public int b()
    {
        return b;
    }
}
