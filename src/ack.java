// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public final class ack
{

    private static hm g;
    public ByteArrayOutputStream a;
    public int b;
    private acf c;
    private acl d;
    private final ContentResolver e;
    private acp f;

    public ack(Context context, acf acf1)
    {
        a = null;
        c = null;
        b = 0;
        d = null;
        f = null;
        c = acf1;
        e = context.getContentResolver();
        f = acf1.a();
        d = new acl(this);
        a = new ByteArrayOutputStream();
        b = 0;
    }

    static acl a(ack ack1)
    {
        return ack1.d;
    }

    private void a(int i)
    {
        a.write(i);
        b = b + 1;
    }

    private void a(long l)
    {
        int j = 0;
        long l1 = l;
        int i;
        for (i = 0; l1 != 0L && i < 8; i++)
        {
            l1 >>>= 8;
        }

        d(i);
        int k = i - 1 << 3;
        for (; j < i; j++)
        {
            a((int)(l >>> k & 255L));
            k -= 8;
        }

    }

    private void a(ace ace1)
    {
        int i = ace1.a();
        ace1 = ace1.b();
        d.a();
        acn acn1 = d.d();
        b(i);
        a(((byte []) (ace1)));
        i = acn1.a();
        d.b();
        d(i);
        d.c();
    }

    private void a(String s)
    {
        a(s.getBytes());
    }

    private void a(byte abyte0[])
    {
        if ((abyte0[0] & 0xff) > 127)
        {
            a(127);
        }
        a(abyte0, abyte0.length);
        a(0);
    }

    private int b()
    {
        Object obj;
        acj acj1;
        d.a();
        obj = d.d();
        Object obj1 = new String(f.b(132));
        obj1 = (Integer)g.get(obj1);
        if (obj1 == null)
        {
            return 1;
        }
        b(((Integer) (obj1)).intValue());
        acj1 = ((acz)c).d();
        if (acj1 == null || acj1.b() == 0)
        {
            b(0L);
            d.b();
            d.c();
            return 0;
        }
        Object obj2;
        Object obj4;
        obj2 = acj1.a(0);
        obj4 = ((acr) (obj2)).c();
        if (obj4 == null) goto _L2; else goto _L1
_L1:
        c(138);
        if (60 != obj4[0]) goto _L4; else goto _L3
_L3:
        if (62 != obj4[obj4.length - 1]) goto _L4; else goto _L5
_L5:
        a(((byte []) (obj4)));
_L2:
        c(137);
        a(((acr) (obj2)).g());
_L8:
        int l;
        int j1;
        int i = ((acn) (obj)).a();
        d.b();
        d(i);
        d.c();
        j1 = acj1.b();
        b(j1);
        l = 0;
_L15:
        acr acr1;
        if (l >= j1) goto _L7; else goto _L6
_L4:
        obj4 = new String(((byte []) (obj4)));
        a((new StringBuilder(String.valueOf(obj4).length() + 2)).append("<").append(((String) (obj4))).append(">").toString());
          goto _L2
        arrayindexoutofboundsexception;
        arrayindexoutofboundsexception.printStackTrace();
          goto _L8
_L6:
        int i1;
        int k1;
        acr1 = acj1.a(l);
        d.a();
        obj4 = d.d();
        d.a();
        acn acn1 = d.d();
        byte abyte0[] = acr1.g();
        ArrayIndexOutOfBoundsException arrayindexoutofboundsexception;
        if (abyte0 == null)
        {
            return 1;
        }
        arrayindexoutofboundsexception = (Integer)g.get(new String(abyte0));
        int j;
        if (arrayindexoutofboundsexception == null)
        {
            a(abyte0);
        } else
        {
            b(arrayindexoutofboundsexception.intValue());
        }
        arrayindexoutofboundsexception = acr1.i();
        abyte0 = arrayindexoutofboundsexception;
        if (arrayindexoutofboundsexception == null)
        {
            arrayindexoutofboundsexception = acr1.j();
            abyte0 = arrayindexoutofboundsexception;
            if (arrayindexoutofboundsexception == null)
            {
                arrayindexoutofboundsexception = acr1.e();
                abyte0 = arrayindexoutofboundsexception;
                if (arrayindexoutofboundsexception == null)
                {
                    abyte0 = "smil.xml".getBytes();
                }
            }
        }
        c(133);
        a(abyte0);
        j = acr1.d();
        if (j != 0)
        {
            c(129);
            b(j);
        }
        j = acn1.a();
        d.b();
        d(j);
        d.c();
        abyte0 = acr1.c();
        if (abyte0 != null)
        {
            c(192);
            if (60 == abyte0[0] && 62 == abyte0[abyte0.length - 1])
            {
                b(abyte0);
            } else
            {
                abyte0 = new String(abyte0);
                b((new StringBuilder(String.valueOf(abyte0).length() + 2)).append("<").append(abyte0).append(">").toString());
            }
        }
        abyte0 = acr1.e();
        if (abyte0 != null)
        {
            c(142);
            a(abyte0);
        }
        k1 = ((acn) (obj4)).a();
        abyte0 = acr1.a();
        if (abyte0 == null) goto _L10; else goto _L9
_L9:
        a(abyte0, abyte0.length);
        i1 = abyte0.length;
_L14:
        if (i1 != ((acn) (obj4)).a() - k1)
        {
            throw new RuntimeException("BUG: Length sanity check failed");
        }
        break; /* Loop/switch isn't completed */
_L10:
        abyte0 = null;
        byte abyte1[];
        abyte1 = new byte[1024];
        arrayindexoutofboundsexception = e.openInputStream(acr1.b());
        int k;
        abyte0 = arrayindexoutofboundsexception;
        k = 0;
_L12:
        i1 = abyte0.read(abyte1);
        if (i1 == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        a.write(abyte1, 0, i1);
        b = b + i1;
        k += i1;
        if (true) goto _L12; else goto _L11
_L11:
        i1 = k;
        if (abyte0 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        abyte0.close();
        i1 = k;
        continue; /* Loop/switch isn't completed */
        abyte0;
        i1 = k;
        if (true) goto _L14; else goto _L13
        Object obj3;
        obj3;
_L19:
        if (abyte0 != null)
        {
            try
            {
                abyte0.close();
            }
            catch (IOException ioexception) { }
        }
        return 1;
        abyte0;
        abyte0 = null;
_L18:
        if (abyte0 != null)
        {
            try
            {
                abyte0.close();
            }
            catch (IOException ioexception1) { }
        }
        return 1;
        abyte0;
        abyte0 = null;
_L17:
        if (abyte0 != null)
        {
            try
            {
                abyte0.close();
            }
            catch (IOException ioexception2) { }
        }
        return 1;
        obj3;
        abyte0 = null;
_L16:
        if (abyte0 != null)
        {
            try
            {
                abyte0.close();
            }
            catch (IOException ioexception3) { }
        }
        throw obj3;
_L13:
        d.b();
        b(k1);
        b(i1);
        d.c();
        l++;
          goto _L15
_L7:
        return 0;
        obj3;
          goto _L16
        obj3;
          goto _L17
        obj3;
          goto _L18
        obj3;
          goto _L19
    }

    private static ace b(ace ace1)
    {
        String s = ace1.c();
        if (!s.matches("[0-9]{1,3}\\.{1}[0-9]{1,3}\\.{1}[0-9]{1,3}\\.{1}[0-9]{1,3}")) goto _L2; else goto _L1
_L1:
        byte byte0 = 3;
          goto _L3
_L2:
        if (!s.matches("\\+?[0-9|\\.|\\-]+")) goto _L5; else goto _L4
_L4:
        byte0 = 1;
          goto _L3
_L5:
        if (!s.matches("[a-zA-Z| ]*\\<{0,1}[a-zA-Z| ]+@{1}[a-zA-Z| ]+\\.{1}[a-zA-Z| ]+\\>{0,1}")) goto _L7; else goto _L6
_L6:
        byte0 = 2;
          goto _L3
_L7:
        if (s.matches("[a-fA-F]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}"))
        {
            byte0 = 4;
        } else
        {
            byte0 = 5;
        }
          goto _L3
_L9:
        ace1 = new ace(ace1.a, ace1.b);
_L10:
        if (1 == byte0)
        {
            try
            {
                ace1.b("/TYPE=PLMN".getBytes());
            }
            // Misplaced declaration of an exception variable
            catch (ace ace1)
            {
                return null;
            }
            return ace1;
        }
        if (3 != byte0)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        ace1.b("/TYPE=IPV4".getBytes());
        return ace1;
        if (4 != byte0)
        {
            break MISSING_BLOCK_LABEL_142;
        }
        ace1.b("/TYPE=IPV6".getBytes());
        return ace1;
_L3:
        if (ace1 != null) goto _L9; else goto _L8
_L8:
        ace1 = null;
          goto _L10
        return ace1;
    }

    private void b(int i)
    {
        a((i | 0x80) & 0xff);
    }

    private void b(long l)
    {
        int i = 0;
        long l1 = 127L;
        int j;
        do
        {
            j = i;
            if (i >= 5)
            {
                break;
            }
            j = i;
            if (l < l1)
            {
                break;
            }
            l1 = l1 << 7 | 127L;
            i++;
        } while (true);
        for (; j > 0; j--)
        {
            a((int)((l >>> j * 7 & 127L | 128L) & 255L));
        }

        a((int)(l & 127L));
    }

    private void b(String s)
    {
        b(s.getBytes());
    }

    private void b(byte abyte0[])
    {
        a(34);
        a(abyte0, abyte0.length);
        a(0);
    }

    private void c(int i)
    {
        a(i);
    }

    private void c(long l)
    {
        a(l);
    }

    private void d(int i)
    {
        a(i);
    }

    private void d(long l)
    {
        if (l < 31L)
        {
            d((int)l);
            return;
        } else
        {
            a(31);
            b(l);
            return;
        }
    }

    private int e(int i)
    {
        boolean flag = false;
        i;
        JVM INSTR tableswitch 129 155: default 128
    //                   129 194
    //                   130 194
    //                   131 128
    //                   132 128
    //                   133 413
    //                   134 383
    //                   135 128
    //                   136 589
    //                   137 256
    //                   138 474
    //                   139 167
    //                   140 128
    //                   141 134
    //                   142 128
    //                   143 383
    //                   144 383
    //                   145 383
    //                   146 128
    //                   147 128
    //                   148 128
    //                   149 383
    //                   150 447
    //                   151 194
    //                   152 167
    //                   153 128
    //                   154 128
    //                   155 383;
           goto _L1 _L2 _L2 _L1 _L1 _L3 _L4 _L1 _L5 _L6 _L7 _L8 _L1 _L9 _L1 _L4 _L4 _L4 _L1 _L1 _L1 _L4 _L10 _L2 _L8 _L1 _L1 _L4
_L1:
        byte byte0 = 3;
_L12:
        return byte0;
_L9:
        c(i);
        i = f.a(i);
        if (i == 0)
        {
            b(18);
            return 0;
        } else
        {
            b(i);
            return 0;
        }
_L8:
        byte abyte0[] = f.b(i);
        if (abyte0 == null)
        {
            return 2;
        } else
        {
            c(i);
            a(abyte0);
            return 0;
        }
_L2:
        ace aace[];
        int k;
        aace = f.d(i);
        if (aace == null)
        {
            return 2;
        }
        k = 0;
_L13:
        byte0 = flag;
        if (k >= aace.length) goto _L12; else goto _L11
_L11:
        ace ace2 = b(aace[k]);
        if (ace2 == null)
        {
            return 1;
        }
        c(i);
        a(ace2);
        k++;
          goto _L13
          goto _L12
_L6:
        c(i);
        ace ace3 = f.c(i);
        if (ace3 == null || TextUtils.isEmpty(ace3.c()) || (new String(ace3.b())).equals("insert-address-token"))
        {
            a(1);
            a(129);
            return 0;
        }
        d.a();
        acn acn1 = d.d();
        a(128);
        ace3 = b(ace3);
        if (ace3 == null)
        {
            return 1;
        } else
        {
            a(ace3);
            i = acn1.a();
            d.b();
            d(i);
            d.c();
            return 0;
        }
_L4:
        int j = f.a(i);
        if (j == 0)
        {
            return 2;
        } else
        {
            c(i);
            c(j);
            return 0;
        }
_L3:
        long l = f.e(i);
        if (-1L == l)
        {
            return 2;
        } else
        {
            c(i);
            c(l);
            return 0;
        }
_L10:
        ace ace1 = f.c(i);
        if (ace1 == null)
        {
            return 2;
        } else
        {
            c(i);
            a(ace1);
            return 0;
        }
_L7:
        byte abyte1[] = f.b(i);
        if (abyte1 == null)
        {
            return 2;
        }
        c(i);
        if (Arrays.equals(abyte1, "advertisement".getBytes()))
        {
            c(129);
            return 0;
        }
        if (Arrays.equals(abyte1, "auto".getBytes()))
        {
            c(131);
            return 0;
        }
        if (Arrays.equals(abyte1, "personal".getBytes()))
        {
            c(128);
            return 0;
        }
        if (Arrays.equals(abyte1, "informational".getBytes()))
        {
            c(130);
            return 0;
        } else
        {
            a(abyte1);
            return 0;
        }
_L5:
        long l1 = f.e(i);
        if (-1L == l1)
        {
            return 2;
        } else
        {
            c(i);
            d.a();
            acn acn2 = d.d();
            a(129);
            a(l1);
            i = acn2.a();
            d.b();
            d(i);
            d.c();
            return 0;
        }
    }

    protected void a(byte abyte0[], int i)
    {
        a.write(abyte0, 0, i);
        b = b + i;
    }

    public byte[] a()
    {
        int i;
        int j;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        j = 0;
        flag2 = true;
        i = 1;
        flag3 = true;
        flag1 = true;
        c.b();
        JVM INSTR tableswitch 128 135: default 68
    //                   128 70
    //                   129 68
    //                   130 68
    //                   131 298
    //                   132 68
    //                   133 385
    //                   134 68
    //                   135 461;
           goto _L1 _L2 _L1 _L1 _L3 _L1 _L4 _L1 _L5
_L1:
        return null;
_L2:
        if (a == null)
        {
            a = new ByteArrayOutputStream();
            b = 0;
        }
        c(140);
        c(128);
        c(152);
        byte abyte0[] = f.b(152);
        if (abyte0 == null)
        {
            throw new IllegalArgumentException("Transaction-ID is null.");
        }
        a(abyte0);
        if (e(141) == 0) goto _L7; else goto _L6
_L6:
        i = ((flag1) ? 1 : 0);
_L9:
        if (i != 0)
        {
            return null;
        }
        break; /* Loop/switch isn't completed */
_L7:
        e(133);
        i = ((flag1) ? 1 : 0);
        if (e(137) == 0)
        {
            i = j;
            if (e(151) != 1)
            {
                i = 1;
            }
            if (e(130) != 1)
            {
                i = 1;
            }
            j = i;
            if (e(129) != 1)
            {
                j = 1;
            }
            i = ((flag1) ? 1 : 0);
            if (j != 0)
            {
                e(150);
                e(138);
                e(136);
                e(143);
                e(134);
                e(144);
                c(132);
                i = b();
            }
        }
        if (true) goto _L9; else goto _L8
_L8:
        break; /* Loop/switch isn't completed */
_L3:
        if (a == null)
        {
            a = new ByteArrayOutputStream();
            b = 0;
        }
        c(140);
        c(131);
        if (e(152) == 0) goto _L11; else goto _L10
_L10:
        i = ((flag2) ? 1 : 0);
_L13:
        if (i != 0)
        {
            return null;
        }
        break; /* Loop/switch isn't completed */
_L11:
        i = ((flag2) ? 1 : 0);
        if (e(141) == 0)
        {
            i = ((flag2) ? 1 : 0);
            if (e(149) == 0)
            {
                i = 0;
            }
        }
        if (true) goto _L13; else goto _L12
_L12:
        break; /* Loop/switch isn't completed */
_L4:
        if (a == null)
        {
            a = new ByteArrayOutputStream();
            b = 0;
        }
        c(140);
        c(133);
        if (e(152) == 0 && e(141) == 0)
        {
            e(145);
            i = 0;
        }
        if (i != 0)
        {
            return null;
        }
        break; /* Loop/switch isn't completed */
_L5:
        if (a == null)
        {
            a = new ByteArrayOutputStream();
            b = 0;
        }
        c(140);
        c(135);
        if (e(141) == 0) goto _L15; else goto _L14
_L14:
        boolean flag = flag3;
_L17:
        if (flag)
        {
            return null;
        }
        break; /* Loop/switch isn't completed */
_L15:
        flag = flag3;
        if (e(139) == 0)
        {
            flag = flag3;
            if (e(151) == 0)
            {
                flag = flag3;
                if (e(137) == 0)
                {
                    e(133);
                    flag = flag3;
                    if (e(155) == 0)
                    {
                        flag = false;
                    }
                }
            }
        }
        if (true) goto _L17; else goto _L16
_L16:
        return a.toByteArray();
    }

    static 
    {
        g = null;
        g = new hm();
        for (int i = 0; i < aco.a.length; i++)
        {
            g.put(aco.a[i], Integer.valueOf(i));
        }

    }
}
