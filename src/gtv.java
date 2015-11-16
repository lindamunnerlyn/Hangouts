// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseIntArray;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.TreeMap;

final class gtv
{

    private static final Charset a = Charset.forName("US-ASCII");
    private static final short s;
    private static final short t;
    private static final short u;
    private static final short v;
    private static final short w;
    private static final short x;
    private static final short y;
    private final gto b;
    private final int c;
    private int d;
    private int e;
    private int f;
    private gua g;
    private gty h;
    private gua i;
    private gua j;
    private boolean k;
    private boolean l;
    private int m;
    private int n;
    private byte o[];
    private int p;
    private int q;
    private final gtp r;
    private final TreeMap z = new TreeMap();

    private gtv(InputStream inputstream, int i1, gtp gtp1)
    {
        d = 0;
        e = 0;
        l = false;
        n = 0;
        if (inputstream == null)
        {
            throw new IOException("Null argument inputStream to ExifParser");
        }
        r = gtp1;
        l = a(inputstream);
        b = new gto(inputstream);
        c = i1;
        if (l)
        {
            i1 = b.c();
            if (18761 == i1)
            {
                b.a(ByteOrder.LITTLE_ENDIAN);
            } else
            if (19789 == i1)
            {
                b.a(ByteOrder.BIG_ENDIAN);
            } else
            {
                throw new gtr("Invalid TIFF header");
            }
            if (b.c() != 42)
            {
                throw new gtr("Invalid TIFF header");
            }
            long l1 = b.f();
            if (l1 > 0x7fffffffL)
            {
                throw new gtr((new StringBuilder(35)).append("Invalid offset ").append(l1).toString());
            }
            p = (int)l1;
            f = 0;
            if (a(0) || l())
            {
                a(0, l1);
                if (l1 != 8L)
                {
                    o = new byte[(int)l1 - 8];
                    a(o);
                    return;
                }
            }
        }
    }

    protected static gtv a(InputStream inputstream, int i1, gtp gtp1)
    {
        return new gtv(inputstream, i1, gtp1);
    }

    protected static gtv a(InputStream inputstream, gtp gtp1)
    {
        return new gtv(inputstream, 63, gtp1);
    }

    private void a(int i1, long l1)
    {
        z.put(Integer.valueOf((int)l1), new gtx(i1, a(i1)));
    }

    private boolean a(int i1)
    {
        boolean flag = true;
        i1;
        JVM INSTR tableswitch 0 4: default 36
    //                   0 40
    //                   1 51
    //                   2 62
    //                   3 85
    //                   4 73;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        flag = false;
_L8:
        return flag;
_L2:
        if ((c & 1) == 0)
        {
            return false;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if ((c & 2) == 0)
        {
            return false;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if ((c & 4) == 0)
        {
            return false;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if ((c & 8) == 0)
        {
            return false;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if ((c & 0x10) == 0)
        {
            return false;
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    private boolean a(int i1, int j1)
    {
        j1 = r.a().get(j1);
        if (j1 == 0)
        {
            return false;
        } else
        {
            return gtp.a(j1, i1);
        }
    }

    private boolean a(InputStream inputstream)
    {
        short word0;
        boolean flag1;
        flag1 = false;
        inputstream = new gto(inputstream);
        if (inputstream.c() != -40)
        {
            throw new gtr("Invalid JPEG format");
        }
        word0 = inputstream.c();
_L12:
        boolean flag = flag1;
        if (word0 == -39) goto _L2; else goto _L1
_L1:
        flag = flag1;
        if (g.a(word0)) goto _L2; else goto _L3
_L3:
        int i1;
        int j1;
        j1 = inputstream.d();
        i1 = j1;
        if (word0 != -31) goto _L5; else goto _L4
_L4:
        i1 = j1;
        if (j1 < 8) goto _L5; else goto _L6
_L6:
        int k1;
        short word1;
        k1 = inputstream.e();
        word1 = inputstream.c();
        j1 -= 6;
        i1 = j1;
        if (k1 != 0x45786966) goto _L5; else goto _L7
_L7:
        i1 = j1;
        if (word1 != 0) goto _L5; else goto _L8
_L8:
        q = inputstream.a();
        m = j1;
        n = q + m;
        flag = true;
_L2:
        return flag;
_L5:
        flag = flag1;
        if (i1 < 2) goto _L2; else goto _L9
_L9:
        flag = flag1;
        if ((long)(i1 - 2) != inputstream.skip(i1 - 2)) goto _L2; else goto _L10
_L10:
        word0 = inputstream.c();
        if (true) goto _L12; else goto _L11
_L11:
    }

    private void b(int i1)
    {
        b.a(i1);
        for (; !z.isEmpty() && ((Integer)z.firstKey()).intValue() < i1; z.pollFirstEntry()) { }
    }

    private void c(gua gua1)
    {
        int i1 = 0;
        if (gua1.e() != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        short word0;
        int j1;
        word0 = gua1.b();
        j1 = gua1.a();
        if (word0 == s && a(j1, gtp.C))
        {
            if (a(2) || a(3))
            {
                a(2, gua1.e(0));
                return;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (word0 == t && a(j1, gtp.D))
        {
            if (a(4))
            {
                a(4, gua1.e(0));
                return;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (word0 == u && a(j1, gtp.am))
        {
            if (a(3))
            {
                a(3, gua1.e(0));
                return;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (word0 == v && a(j1, gtp.E))
        {
            if (k())
            {
                long l1 = gua1.e(0);
                z.put(Integer.valueOf((int)l1), new gty());
                return;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (word0 == w && a(j1, gtp.F))
        {
            if (k())
            {
                j = gua1;
                return;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (word0 != x || !a(j1, gtp.i))
        {
            break; /* Loop/switch isn't completed */
        }
        if (k())
        {
            if (gua1.f())
            {
                while (i1 < gua1.e()) 
                {
                    gua1.c();
                    long l2 = gua1.e(i1);
                    z.put(Integer.valueOf((int)l2), new gty(i1));
                    i1++;
                }
            } else
            {
                z.put(Integer.valueOf(gua1.j()), new gtw(gua1, false));
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (word0 != y || !a(j1, gtp.m) || !k() || !gua1.f()) goto _L1; else goto _L4
_L4:
        i = gua1;
        return;
    }

    private boolean k()
    {
        return (c & 0x20) != 0;
    }

    private boolean l()
    {
        f;
        JVM INSTR tableswitch 0 2: default 32
    //                   0 34
    //                   1 68
    //                   2 73;
           goto _L1 _L2 _L3 _L4
_L1:
        return false;
_L2:
        if (a(2) || a(4) || a(3) || a(1))
        {
            return true;
        }
          goto _L1
_L3:
        return k();
_L4:
        return a(3);
    }

    private gua m()
    {
        boolean flag = true;
        short word0 = b.c();
        short word1 = b.c();
        long l1 = b.f();
        if (l1 > 0x7fffffffL)
        {
            throw new gtr("Number of component is larger then Integer.MAX_VALUE");
        }
        if (!gua.a(word1))
        {
            String.format("Tag %04x: Invalid data type %d", new Object[] {
                Short.valueOf(word0), Short.valueOf(word1)
            });
            b.skip(4L);
            return null;
        }
        int i1 = (int)l1;
        int j1 = f;
        gua gua1;
        if ((int)l1 == 0)
        {
            flag = false;
        }
        gua1 = new gua(word0, word1, i1, j1, flag);
        i1 = gua1.d();
        if (i1 > 4)
        {
            long l2 = b.f();
            if (l2 > 0x7fffffffL)
            {
                throw new gtr("offset is larger then Integer.MAX_VALUE");
            }
            if (o != null && l2 < (long)p && word1 == 7)
            {
                byte abyte0[] = new byte[(int)l1];
                System.arraycopy(o, (int)l2 - 8, abyte0, 0, (int)l1);
                gua1.a(abyte0);
                return gua1;
            } else
            {
                gua1.g((int)l2);
                return gua1;
            }
        } else
        {
            boolean flag1 = gua1.k();
            gua1.a(false);
            b(gua1);
            gua1.a(flag1);
            b.skip(4 - i1);
            gua1.g(b.a() - 4);
            return gua1;
        }
    }

    private long n()
    {
        return (long)b.e() & 0xffffffffL;
    }

    protected int a()
    {
        byte byte0 = 1;
        if (l) goto _L2; else goto _L1
_L1:
        byte0 = 5;
_L4:
        return byte0;
_L2:
        int k1;
        int l1;
        k1 = b.a();
        l1 = d + 2 + e * 12;
        if (k1 >= l1)
        {
            break; /* Loop/switch isn't completed */
        }
        g = m();
        if (g == null)
        {
            return a();
        }
        if (k)
        {
            c(g);
            return 1;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (k1 == l1)
        {
            if (f == 0)
            {
                long l2 = n();
                if ((a(1) || k()) && l2 != 0L)
                {
                    a(1, l2);
                }
            } else
            {
                gtw gtw1;
                String s1;
                IOException ioexception;
                int j1;
                if (!z.isEmpty())
                {
                    j1 = ((Integer)z.firstEntry().getKey()).intValue() - b.a();
                } else
                {
                    j1 = 4;
                }
                if (j1 < 4)
                {
                    (new StringBuilder(45)).append("Invalid size of link to next IFD: ").append(j1);
                } else
                {
                    long l3 = n();
                    if (l3 != 0L)
                    {
                        (new StringBuilder(46)).append("Invalid link to next IFD: ").append(l3);
                    }
                }
            }
        }
        do
        {
            if (z.isEmpty())
            {
                break;
            }
            java.util.Map.Entry entry = z.pollFirstEntry();
            Object obj = entry.getValue();
            try
            {
                b(((Integer)entry.getKey()).intValue());
            }
            // Misplaced declaration of an exception variable
            catch (IOException ioexception)
            {
                s1 = String.valueOf(entry.getKey());
                obj = String.valueOf(obj.getClass().getName());
                (new StringBuilder(String.valueOf(s1).length() + 57 + String.valueOf(obj).length())).append("Failed to skip to data at: ").append(s1).append(" for ").append(((String) (obj))).append(", the file may be broken.");
                continue;
            }
            if (obj instanceof gtx)
            {
                f = ((gtx)obj).a;
                e = b.d();
                d = ((Integer)entry.getKey()).intValue();
                if (e * 12 + d + 2 > m)
                {
                    int i1 = f;
                    (new StringBuilder(31)).append("Invalid size of IFD ").append(i1);
                    return 5;
                }
                k = l();
                if (((gtx)obj).b)
                {
                    return 0;
                }
                b();
            } else
            {
                if (obj instanceof gty)
                {
                    h = (gty)obj;
                    return h.b;
                }
                gtw1 = (gtw)obj;
                g = gtw1.a;
                if (g.c() != 7)
                {
                    b(g);
                    c(g);
                }
                if (gtw1.b)
                {
                    return 2;
                }
            }
        } while (true);
        return 5;
    }

    protected int a(byte abyte0[])
    {
        return b.read(abyte0);
    }

    protected void a(gua gua1)
    {
        if (gua1.j() >= b.a())
        {
            z.put(Integer.valueOf(gua1.j()), new gtw(gua1, true));
        }
    }

    protected void b()
    {
        int i1 = d;
        int k1 = e * 12 + (i1 + 2);
        i1 = b.a();
        if (i1 <= k1)
        {
            if (k)
            {
                do
                {
                    if (i1 >= k1)
                    {
                        break;
                    }
                    g = m();
                    int j1 = i1 + 12;
                    i1 = j1;
                    if (g != null)
                    {
                        c(g);
                        i1 = j1;
                    }
                } while (true);
            } else
            {
                b(k1);
            }
            long l1 = n();
            if (f == 0 && (a(1) || k()) && l1 > 0L)
            {
                a(1, l1);
                return;
            }
        }
    }

    protected void b(gua gua1)
    {
        int j1 = 0;
        int k1 = 0;
        boolean flag = false;
        int i1 = 0;
        short word0 = gua1.c();
        if (word0 == 2 || word0 == 7 || word0 == 1)
        {
            int j2 = gua1.e();
            if (!z.isEmpty() && ((Integer)z.firstEntry().getKey()).intValue() < j2 + b.a())
            {
                Object obj = z.firstEntry().getValue();
                if (obj instanceof gty)
                {
                    obj = String.valueOf(gua1);
                    (new StringBuilder(String.valueOf(obj).length() + 35)).append("Thumbnail overlaps value for tag: \n").append(((String) (obj)));
                    obj = String.valueOf(z.pollFirstEntry().getKey());
                    (new StringBuilder(String.valueOf(obj).length() + 26)).append("Invalid thumbnail offset: ").append(((String) (obj)));
                } else
                {
                    int l2;
                    if (obj instanceof gtx)
                    {
                        int k2 = ((gtx)obj).a;
                        obj = String.valueOf(gua1);
                        (new StringBuilder(String.valueOf(obj).length() + 41)).append("Ifd ").append(k2).append(" overlaps value for tag: \n").append(((String) (obj)));
                    } else
                    if (obj instanceof gtw)
                    {
                        obj = String.valueOf(((gtw)obj).a);
                        String s1 = String.valueOf(gua1);
                        (new StringBuilder(String.valueOf(obj).length() + 46 + String.valueOf(s1).length())).append("Tag value for tag: \n").append(((String) (obj))).append(" overlaps value for tag: \n").append(s1);
                    }
                    l2 = ((Integer)z.firstEntry().getKey()).intValue() - b.a();
                    obj = String.valueOf(gua1);
                    (new StringBuilder(String.valueOf(obj).length() + 52)).append("Invalid size of tag: \n").append(((String) (obj))).append(" setting count to: ").append(l2);
                    gua1.c(l2);
                }
            }
        }
        gud agud1[];
        switch (gua1.c())
        {
        case 6: // '\006'
        case 8: // '\b'
        default:
            return;

        case 1: // '\001'
        case 7: // '\007'
            byte abyte0[] = new byte[gua1.e()];
            a(abyte0);
            gua1.a(abyte0);
            return;

        case 2: // '\002'
            i1 = gua1.e();
            Object obj1 = a;
            if (i1 > 0)
            {
                obj1 = b.a(i1, ((Charset) (obj1)));
            } else
            {
                obj1 = "";
            }
            gua1.a(((String) (obj1)));
            return;

        case 4: // '\004'
            long al[] = new long[gua1.e()];
            for (j1 = al.length; i1 < j1; i1++)
            {
                al[i1] = n();
            }

            gua1.a(al);
            return;

        case 5: // '\005'
            gud agud[] = new gud[gua1.e()];
            k1 = agud.length;
            for (i1 = j1; i1 < k1; i1++)
            {
                agud[i1] = new gud(n(), n());
            }

            gua1.a(agud);
            return;

        case 3: // '\003'
            int ai[] = new int[gua1.e()];
            j1 = ai.length;
            for (i1 = k1; i1 < j1; i1++)
            {
                ai[i1] = b.c() & 0xffff;
            }

            gua1.a(ai);
            return;

        case 9: // '\t'
            int ai1[] = new int[gua1.e()];
            j1 = ai1.length;
            for (i1 = ((flag) ? 1 : 0); i1 < j1; i1++)
            {
                ai1[i1] = b.e();
            }

            gua1.a(ai1);
            return;

        case 10: // '\n'
            agud1 = new gud[gua1.e()];
            j1 = agud1.length;
            i1 = 0;
            break;
        }
        for (; i1 < j1; i1++)
        {
            int l1 = b.e();
            int i2 = b.e();
            agud1[i1] = new gud(l1, i2);
        }

        gua1.a(agud1);
    }

    protected gua c()
    {
        return g;
    }

    protected int d()
    {
        return f;
    }

    protected int e()
    {
        return h.a;
    }

    protected int f()
    {
        if (i == null)
        {
            return 0;
        } else
        {
            return (int)i.e(0);
        }
    }

    protected int g()
    {
        if (j == null)
        {
            return 0;
        } else
        {
            return (int)j.e(0);
        }
    }

    protected int h()
    {
        return n;
    }

    protected int i()
    {
        return q;
    }

    protected ByteOrder j()
    {
        return b.b();
    }

    static 
    {
        s = gtp.a(gtp.C);
        t = gtp.a(gtp.D);
        u = gtp.a(gtp.am);
        v = gtp.a(gtp.E);
        w = gtp.a(gtp.F);
        x = gtp.a(gtp.i);
        y = gtp.a(gtp.m);
    }
}
