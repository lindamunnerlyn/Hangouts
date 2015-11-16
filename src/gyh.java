// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import android.util.SparseIntArray;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.TreeMap;

final class gyh
{

    private static final Charset a = Charset.forName("US-ASCII");
    private static final short t;
    private static final short u;
    private static final short v;
    private static final short w;
    private static final short x;
    private static final short y;
    private static final short z;
    private final TreeMap A = new TreeMap();
    private final gya b;
    private final int c;
    private int d;
    private int e;
    private int f;
    private gym g;
    private gyk h;
    private gym i;
    private gym j;
    private boolean k;
    private boolean l;
    private int m;
    private int n;
    private int o;
    private byte p[];
    private int q;
    private int r;
    private final gyb s;

    private gyh(InputStream inputstream, int i1, gyb gyb1)
    {
        d = 0;
        e = 0;
        l = false;
        n = 0;
        if (inputstream == null)
        {
            throw new IOException("Null argument inputStream to ExifParser");
        }
        s = gyb1;
        l = a(inputstream);
        b = new gya(inputstream);
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
                throw new gyd("Invalid TIFF header");
            }
            if (b.c() != 42)
            {
                throw new gyd("Invalid TIFF header");
            }
            long l1 = b.f();
            if (l1 > 0x7fffffffL)
            {
                throw new gyd((new StringBuilder(35)).append("Invalid offset ").append(l1).toString());
            }
            q = (int)l1;
            f = 0;
            if (a(0) || m())
            {
                a(0, l1);
                i1 = (int)l1 - 8;
                if (i1 < 0)
                {
                    throw new gyd((new StringBuilder(35)).append("Invalid offset ").append(l1).toString());
                }
                if (i1 > 0)
                {
                    p = new byte[i1];
                    a(p);
                    return;
                }
            }
        }
    }

    private int a(byte abyte0[], int i1)
    {
        return b.read(abyte0, 0, i1);
    }

    protected static gyh a(InputStream inputstream, int i1, gyb gyb1)
    {
        return new gyh(inputstream, i1, gyb1);
    }

    protected static gyh a(InputStream inputstream, gyb gyb1)
    {
        return new gyh(inputstream, 63, gyb1);
    }

    private void a(int i1, long l1)
    {
        A.put(Integer.valueOf((int)l1), new gyj(i1, a(i1)));
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
        j1 = s.a().get(j1);
        if (j1 == 0)
        {
            return false;
        } else
        {
            return gyb.a(j1, i1);
        }
    }

    private boolean a(InputStream inputstream)
    {
        short word0;
        boolean flag1;
        flag1 = false;
        inputstream = new gya(inputstream);
        if (inputstream.c() != -40)
        {
            throw new gyd("Invalid JPEG format");
        }
        word0 = inputstream.c();
_L11:
        boolean flag = flag1;
        if (word0 == -39) goto _L2; else goto _L1
_L1:
        flag = flag1;
        if (gyo.a(word0)) goto _L2; else goto _L3
_L3:
        int i1;
        int j1;
        j1 = inputstream.d();
        i1 = j1;
        if (word0 != -31) goto _L5; else goto _L4
_L4:
        i1 = j1;
        if (j1 < gyo.a.length + 2) goto _L5; else goto _L6
_L6:
        byte abyte0[];
        abyte0 = new byte[gyo.a.length];
        inputstream.read(abyte0, 0, gyo.a.length);
        j1 -= gyo.a.length;
        i1 = j1;
        if (!Arrays.equals(abyte0, gyo.a)) goto _L5; else goto _L7
_L7:
        r = inputstream.a();
        m = j1;
        n = r + m;
        flag = true;
_L2:
        return flag;
_L5:
        flag = flag1;
        if (i1 < 2) goto _L2; else goto _L8
_L8:
        flag = flag1;
        if ((long)(i1 - 2) != inputstream.skip(i1 - 2)) goto _L2; else goto _L9
_L9:
        word0 = inputstream.c();
        if (true) goto _L11; else goto _L10
_L10:
    }

    private void b(int i1)
    {
        b.a(i1);
        for (; !A.isEmpty() && ((Integer)A.firstKey()).intValue() < i1; A.pollFirstEntry()) { }
    }

    private void c(gym gym1)
    {
        int i1 = 0;
        if (gym1.e() != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        short word0;
        int j1;
        word0 = gym1.b();
        j1 = gym1.a();
        if (word0 == t && a(j1, gyb.C))
        {
            if (a(2) || a(3))
            {
                a(2, gym1.e(0));
                return;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (word0 == u && a(j1, gyb.D))
        {
            if (a(4))
            {
                a(4, gym1.e(0));
                return;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (word0 == v && a(j1, gyb.am))
        {
            if (a(3))
            {
                a(3, gym1.e(0));
                return;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (word0 == w && a(j1, gyb.E))
        {
            if (l())
            {
                long l1 = gym1.e(0);
                A.put(Integer.valueOf((int)l1), new gyk());
                return;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (word0 == x && a(j1, gyb.F))
        {
            if (l())
            {
                j = gym1;
                return;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (word0 != y || !a(j1, gyb.i))
        {
            break; /* Loop/switch isn't completed */
        }
        if (l())
        {
            if (gym1.f())
            {
                while (i1 < gym1.e()) 
                {
                    gym1.c();
                    long l2 = gym1.e(i1);
                    A.put(Integer.valueOf((int)l2), new gyk(i1));
                    i1++;
                }
            } else
            {
                A.put(Integer.valueOf(gym1.j()), new gyi(gym1, false));
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (word0 != z || !a(j1, gyb.m) || !l() || !gym1.f()) goto _L1; else goto _L4
_L4:
        i = gym1;
        return;
    }

    private boolean l()
    {
        return (c & 0x20) != 0;
    }

    private boolean m()
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
        return l();
_L4:
        return a(3);
    }

    private gym n()
    {
        boolean flag = true;
        short word0 = b.c();
        short word1 = b.c();
        long l1 = b.f();
        if (l1 > 0x7fffffffL)
        {
            throw new gyd("Number of component is larger then Integer.MAX_VALUE");
        }
        if (!gym.a(word1))
        {
            if (Log.isLoggable("ExifParser", 5))
            {
                String.format("Tag %04x: Invalid data type %d", new Object[] {
                    Short.valueOf(word0), Short.valueOf(word1)
                });
            }
            b.skip(4L);
            return null;
        }
        int i1 = (int)l1;
        int j1 = f;
        gym gym1;
        if ((int)l1 == 0)
        {
            flag = false;
        }
        gym1 = new gym(word0, word1, i1, j1, flag);
        i1 = gym1.d();
        if (i1 > 4)
        {
            long l2 = b.f();
            if (l2 > 0x7fffffffL)
            {
                throw new gyd("offset is larger then Integer.MAX_VALUE");
            }
            if (p != null && l2 < (long)q && word1 == 7)
            {
                byte abyte0[] = new byte[(int)l1];
                System.arraycopy(p, (int)l2 - 8, abyte0, 0, (int)l1);
                gym1.a(abyte0);
                return gym1;
            } else
            {
                gym1.g((int)l2);
                return gym1;
            }
        } else
        {
            boolean flag1 = gym1.k();
            gym1.a(false);
            b(gym1);
            gym1.a(flag1);
            b.skip(4 - i1);
            gym1.g(b.a() - 4);
            return gym1;
        }
    }

    private boolean o()
    {
        int i1 = m - b.a() - 2;
        if (i1 <= 0 || b.skip(i1) == (long)i1) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        b.a(ByteOrder.BIG_ENDIAN);
        short word0;
        byte abyte0[];
        int j1;
        int k1;
        try
        {
            word0 = b.c();
        }
        catch (EOFException eofexception)
        {
            return false;
        }
_L7:
        if (word0 == -39) goto _L1; else goto _L3
_L3:
        if (gyo.a(word0)) goto _L1; else goto _L4
_L4:
        k1 = b.d();
        j1 = k1;
        if (word0 != -31)
        {
            continue; /* Loop/switch isn't completed */
        }
        j1 = k1;
        if (k1 < gyo.b.length + 2)
        {
            continue; /* Loop/switch isn't completed */
        }
        abyte0 = new byte[gyo.b.length];
        a(abyte0, gyo.b.length);
        k1 -= gyo.b.length;
        j1 = k1;
        if (!Arrays.equals(abyte0, gyo.b))
        {
            continue; /* Loop/switch isn't completed */
        }
        o = k1 - 2;
        return true;
        if (j1 < 2) goto _L1; else goto _L5
_L5:
        if ((long)(j1 - 2) != b.skip(j1 - 2)) goto _L1; else goto _L6
_L6:
        word0 = b.c();
          goto _L7
    }

    private long p()
    {
        return (long)b.e() & 0xffffffffL;
    }

    protected int a()
    {
        byte byte0 = 1;
        if (l) goto _L2; else goto _L1
_L1:
        byte0 = 6;
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
        g = n();
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
                long l2 = p();
                if ((a(1) || l()) && l2 != 0L)
                {
                    a(1, l2);
                }
            } else
            {
                gyi gyi1;
                String s1;
                IOException ioexception;
                int j1;
                if (!A.isEmpty())
                {
                    j1 = ((Integer)A.firstEntry().getKey()).intValue() - b.a();
                } else
                {
                    j1 = 4;
                }
                if (j1 < 4)
                {
                    if (Log.isLoggable("ExifParser", 5))
                    {
                        (new StringBuilder(45)).append("Invalid size of link to next IFD: ").append(j1);
                    }
                } else
                {
                    long l3 = p();
                    if (l3 != 0L && Log.isLoggable("ExifParser", 5))
                    {
                        (new StringBuilder(46)).append("Invalid link to next IFD: ").append(l3);
                    }
                }
            }
        }
        do
        {
            if (A.isEmpty())
            {
                break;
            }
            java.util.Map.Entry entry = A.pollFirstEntry();
            Object obj = entry.getValue();
            try
            {
                b(((Integer)entry.getKey()).intValue());
            }
            // Misplaced declaration of an exception variable
            catch (IOException ioexception)
            {
                if (Log.isLoggable("ExifParser", 5))
                {
                    s1 = String.valueOf(entry.getKey());
                    obj = String.valueOf(obj.getClass().getName());
                    (new StringBuilder(String.valueOf(s1).length() + 57 + String.valueOf(obj).length())).append("Failed to skip to data at: ").append(s1).append(" for ").append(((String) (obj))).append(", the file may be broken.");
                }
                continue;
            }
            if (obj instanceof gyj)
            {
                f = ((gyj)obj).a;
                e = b.d();
                d = ((Integer)entry.getKey()).intValue();
                if (e * 12 + d + 2 > m)
                {
                    if (Log.isLoggable("ExifParser", 5))
                    {
                        int i1 = f;
                        (new StringBuilder(31)).append("Invalid size of IFD ").append(i1);
                    }
                    return 6;
                }
                k = m();
                if (((gyj)obj).b)
                {
                    return 0;
                }
                b();
            } else
            {
                if (obj instanceof gyk)
                {
                    h = (gyk)obj;
                    return h.b;
                }
                gyi1 = (gyi)obj;
                g = gyi1.a;
                if (g.c() != 7)
                {
                    b(g);
                    c(g);
                }
                if (gyi1.b)
                {
                    return 2;
                }
            }
        } while (true);
        return o != 0 || !o() ? 6 : 5;
    }

    protected int a(byte abyte0[])
    {
        return b.read(abyte0);
    }

    protected void a(gym gym1)
    {
        if (gym1.j() >= b.a())
        {
            A.put(Integer.valueOf(gym1.j()), new gyi(gym1, true));
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
                    g = n();
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
            long l1 = p();
            if (f == 0 && (a(1) || l()) && l1 > 0L)
            {
                a(1, l1);
                return;
            }
        }
    }

    protected void b(gym gym1)
    {
        int i1;
        int j2;
        int j3;
        boolean flag;
        j2 = 0;
        j3 = 0;
        flag = false;
        i1 = 0;
        short word0 = gym1.c();
        if (word0 == 2 || word0 == 7 || word0 == 1)
        {
            int i4 = gym1.e();
            if (!A.isEmpty() && ((Integer)A.firstEntry().getKey()).intValue() < i4 + b.a())
            {
                Object obj = A.firstEntry().getValue();
                if (obj instanceof gyk)
                {
                    if (Log.isLoggable("ExifParser", 5))
                    {
                        obj = String.valueOf(gym1);
                        (new StringBuilder(String.valueOf(obj).length() + 35)).append("Thumbnail overlaps value for tag: \n").append(((String) (obj)));
                    }
                    obj = A.pollFirstEntry();
                    if (Log.isLoggable("ExifParser", 5))
                    {
                        obj = String.valueOf(((java.util.Map.Entry) (obj)).getKey());
                        (new StringBuilder(String.valueOf(obj).length() + 26)).append("Invalid thumbnail offset: ").append(((String) (obj)));
                    }
                } else
                {
                    int k4;
                    if (obj instanceof gyj)
                    {
                        if (Log.isLoggable("ExifParser", 5))
                        {
                            int j4 = ((gyj)obj).a;
                            obj = String.valueOf(gym1);
                            (new StringBuilder(String.valueOf(obj).length() + 41)).append("Ifd ").append(j4).append(" overlaps value for tag: \n").append(((String) (obj)));
                        }
                    } else
                    if ((obj instanceof gyi) && Log.isLoggable("ExifParser", 5))
                    {
                        obj = String.valueOf(((gyi)obj).a);
                        String s1 = String.valueOf(gym1);
                        (new StringBuilder(String.valueOf(obj).length() + 46 + String.valueOf(s1).length())).append("Tag value for tag: \n").append(((String) (obj))).append(" overlaps value for tag: \n").append(s1);
                    }
                    k4 = ((Integer)A.firstEntry().getKey()).intValue() - b.a();
                    if (Log.isLoggable("ExifParser", 5))
                    {
                        obj = String.valueOf(gym1);
                        (new StringBuilder(String.valueOf(obj).length() + 52)).append("Invalid size of tag: \n").append(((String) (obj))).append(" setting count to: ").append(k4);
                    }
                    gym1.c(k4);
                }
            }
        }
        gym1.c();
        JVM INSTR tableswitch 1 10: default 260
    //                   1 546
    //                   2 568
    //                   3 714
    //                   4 610
    //                   5 654
    //                   6 260
    //                   7 546
    //                   8 260
    //                   9 769
    //                   10 820;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L1 _L2 _L1 _L7 _L8
_L1:
        if (Log.isLoggable("ExifParser", 2))
        {
            gym1 = String.valueOf(gym1);
            (new StringBuilder(String.valueOf(gym1).length() + 1)).append("\n").append(gym1);
        }
        return;
_L2:
        byte abyte0[] = new byte[gym1.e()];
        a(abyte0);
        gym1.a(abyte0);
        continue; /* Loop/switch isn't completed */
_L3:
        i1 = gym1.e();
        Object obj1 = a;
        if (i1 > 0)
        {
            obj1 = b.a(i1, ((Charset) (obj1)));
        } else
        {
            obj1 = "";
        }
        gym1.a(((String) (obj1)));
        continue; /* Loop/switch isn't completed */
_L5:
        long al[] = new long[gym1.e()];
        for (j2 = al.length; i1 < j2; i1++)
        {
            al[i1] = p();
        }

        gym1.a(al);
        continue; /* Loop/switch isn't completed */
_L6:
        gyq agyq[] = new gyq[gym1.e()];
        j3 = agyq.length;
        for (int j1 = j2; j1 < j3; j1++)
        {
            agyq[j1] = new gyq(p(), p());
        }

        gym1.a(agyq);
        continue; /* Loop/switch isn't completed */
_L4:
        int ai[] = new int[gym1.e()];
        int k2 = ai.length;
        for (int k1 = j3; k1 < k2; k1++)
        {
            ai[k1] = b.c() & 0xffff;
        }

        gym1.a(ai);
        continue; /* Loop/switch isn't completed */
_L7:
        int ai1[] = new int[gym1.e()];
        int l2 = ai1.length;
        for (int l1 = ((flag) ? 1 : 0); l1 < l2; l1++)
        {
            ai1[l1] = b.e();
        }

        gym1.a(ai1);
        continue; /* Loop/switch isn't completed */
_L8:
        gyq agyq1[] = new gyq[gym1.e()];
        int i3 = agyq1.length;
        for (int i2 = 0; i2 < i3; i2++)
        {
            int k3 = b.e();
            int l3 = b.e();
            agyq1[i2] = new gyq(k3, l3);
        }

        gym1.a(agyq1);
        if (true) goto _L1; else goto _L9
_L9:
    }

    protected gym c()
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

    byte[] h()
    {
        byte abyte0[] = new byte[o];
        a(abyte0, o);
        return abyte0;
    }

    protected int i()
    {
        return n;
    }

    protected int j()
    {
        return r;
    }

    protected ByteOrder k()
    {
        return b.b();
    }

    static 
    {
        t = gyb.a(gyb.C);
        u = gyb.a(gyb.D);
        v = gyb.a(gyb.am);
        w = gyb.a(gyb.E);
        x = gyb.a(gyb.F);
        y = gyb.a(gyb.i);
        z = gyb.a(gyb.m);
    }
}
