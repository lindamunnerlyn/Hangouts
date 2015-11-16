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

public final class aci
{

    private static hm g;
    public ByteArrayOutputStream a;
    public int b;
    private acd c;
    private acj d;
    private final ContentResolver e;
    private acn f;

    public aci(Context context, acd acd1)
    {
        a = null;
        c = null;
        b = 0;
        d = null;
        f = null;
        c = acd1;
        e = context.getContentResolver();
        f = acd1.a();
        d = new acj(this);
        a = new ByteArrayOutputStream();
        b = 0;
    }

    static acj a(aci aci1)
    {
        return aci1.d;
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

    private void a(acc acc1)
    {
        int i = acc1.a();
        acc1 = acc1.b();
        d.a();
        acl acl1 = d.d();
        b(i);
        a(((byte []) (acc1)));
        i = acl1.a();
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
        ach ach1;
        d.a();
        obj = d.d();
        Object obj1 = new String(f.b(132));
        obj1 = (Integer)g.get(obj1);
        if (obj1 == null)
        {
            return 1;
        }
        b(((Integer) (obj1)).intValue());
        ach1 = ((acx)c).d();
        if (ach1 == null || ach1.b() == 0)
        {
            b(0L);
            d.b();
            d.c();
            return 0;
        }
        Object obj2;
        Object obj4;
        obj2 = ach1.a(0);
        obj4 = ((acp) (obj2)).c();
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
        a(((acp) (obj2)).g());
_L8:
        int l;
        int j1;
        int i = ((acl) (obj)).a();
        d.b();
        d(i);
        d.c();
        j1 = ach1.b();
        b(j1);
        l = 0;
_L15:
        acp acp1;
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
        acp1 = ach1.a(l);
        d.a();
        obj4 = d.d();
        d.a();
        acl acl1 = d.d();
        byte abyte0[] = acp1.g();
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
        arrayindexoutofboundsexception = acp1.i();
        abyte0 = arrayindexoutofboundsexception;
        if (arrayindexoutofboundsexception == null)
        {
            arrayindexoutofboundsexception = acp1.j();
            abyte0 = arrayindexoutofboundsexception;
            if (arrayindexoutofboundsexception == null)
            {
                arrayindexoutofboundsexception = acp1.e();
                abyte0 = arrayindexoutofboundsexception;
                if (arrayindexoutofboundsexception == null)
                {
                    abyte0 = "smil.xml".getBytes();
                }
            }
        }
        c(133);
        a(abyte0);
        j = acp1.d();
        if (j != 0)
        {
            c(129);
            b(j);
        }
        j = acl1.a();
        d.b();
        d(j);
        d.c();
        abyte0 = acp1.c();
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
        abyte0 = acp1.e();
        if (abyte0 != null)
        {
            c(142);
            a(abyte0);
        }
        k1 = ((acl) (obj4)).a();
        abyte0 = acp1.a();
        if (abyte0 == null) goto _L10; else goto _L9
_L9:
        a(abyte0, abyte0.length);
        i1 = abyte0.length;
_L14:
        if (i1 != ((acl) (obj4)).a() - k1)
        {
            throw new RuntimeException("BUG: Length sanity check failed");
        }
        break; /* Loop/switch isn't completed */
_L10:
        abyte0 = null;
        byte abyte1[];
        abyte1 = new byte[1024];
        arrayindexoutofboundsexception = e.openInputStream(acp1.b());
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

    private static acc b(acc acc1)
    {
        String s = acc1.c();
        if (!s.matches("[0-9]{1,3}\\.{1}[0-9]{1,3}\\.{1}[0-9]{1,3}\\.{1}[0-9]{1,3}")) goto _L2; else goto _L1
_L1:
        byte byte0 = 3;
_L3:
        try
        {
            acc1 = acc.a(acc1);
        }
        // Misplaced declaration of an exception variable
        catch (acc acc1)
        {
            return null;
        }
        if (1 != byte0)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        acc1.b("/TYPE=PLMN".getBytes());
        return acc1;
_L2:
        if (!s.matches("\\+?[0-9|\\.|\\-]+"))
        {
            break MISSING_BLOCK_LABEL_52;
        }
        byte0 = 1;
          goto _L3
        if (!s.matches("[a-zA-Z| ]*\\<{0,1}[a-zA-Z| ]+@{1}[a-zA-Z| ]+\\.{1}[a-zA-Z| ]+\\>{0,1}"))
        {
            break MISSING_BLOCK_LABEL_67;
        }
        byte0 = 2;
          goto _L3
        if (s.matches("[a-fA-F]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}"))
        {
            byte0 = 4;
        } else
        {
            byte0 = 5;
        }
          goto _L3
        if (3 != byte0)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        acc1.b("/TYPE=IPV4".getBytes());
        return acc1;
        if (4 != byte0)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        acc1.b("/TYPE=IPV6".getBytes());
        return acc1;
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
        acc aacc[];
        int k;
        aacc = f.d(i);
        if (aacc == null)
        {
            return 2;
        }
        k = 0;
_L13:
        byte0 = flag;
        if (k >= aacc.length) goto _L12; else goto _L11
_L11:
        acc acc2 = b(aacc[k]);
        if (acc2 == null)
        {
            return 1;
        }
        c(i);
        a(acc2);
        k++;
          goto _L13
          goto _L12
_L6:
        c(i);
        acc acc3 = f.c(i);
        if (acc3 == null || TextUtils.isEmpty(acc3.c()) || (new String(acc3.b())).equals("insert-address-token"))
        {
            a(1);
            a(129);
            return 0;
        }
        d.a();
        acl acl1 = d.d();
        a(128);
        acc3 = b(acc3);
        if (acc3 == null)
        {
            return 1;
        } else
        {
            a(acc3);
            i = acl1.a();
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
        acc acc1 = f.c(i);
        if (acc1 == null)
        {
            return 2;
        } else
        {
            c(i);
            a(acc1);
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
            acl acl2 = d.d();
            a(129);
            a(l1);
            i = acl2.a();
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
        for (int i = 0; i < acm.a.length; i++)
        {
            g.put(acm.a[i], Integer.valueOf(i));
        }

    }
}
