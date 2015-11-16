// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class gtu extends FilterOutputStream
{

    private gtq a;
    private int b;
    private int c;
    private int d;
    private byte e[];
    private ByteBuffer f;
    private final gtp g;

    protected gtu(OutputStream outputstream, gtp gtp1)
    {
        super(new BufferedOutputStream(outputstream, 0x10000));
        b = 0;
        e = new byte[1];
        f = ByteBuffer.allocate(4);
        g = gtp1;
    }

    private int a(int i, byte abyte0[], int j, int k)
    {
        i = Math.min(i - f.position(), k);
        f.put(abyte0, j, i);
        return i;
    }

    private static int a(gub gub1, int i)
    {
        int j = gub1.d();
        gub1 = gub1.b();
        int l = gub1.length;
        j = i + (j * 12 + 2 + 4);
        for (i = 0; i < l;)
        {
            gua gua1 = gub1[i];
            int k = j;
            if (gua1.d() > 4)
            {
                gua1.g(j);
                k = j + gua1.d();
            }
            i++;
            j = k;
        }

        return j;
    }

    private void a()
    {
        if (a != null)
        {
            Object obj1 = a;
            Object obj = new ArrayList();
            Object obj2 = ((gtq) (obj1)).f();
            if (obj2 != null)
            {
                for (int i = 0; i < ((List) (obj2)).size(); i++)
                {
                    gua gua1 = (gua)((gtq) (obj1)).f().get(0);
                    if (gua1.h() == null && !gtp.a(gua1.b()))
                    {
                        ((gtq) (obj1)).b(gua1.b(), gua1.a());
                        ((ArrayList) (obj)).add(gua1);
                    }
                }

            }
            b();
            int j = c();
            if (j + 8 > 65535)
            {
                throw new IOException("Exif header is too large (>64Kb)");
            }
            obj1 = new guc(out);
            ((guc) (obj1)).a(ByteOrder.BIG_ENDIAN);
            ((guc) (obj1)).a((short)-31);
            ((guc) (obj1)).a((short)(j + 8));
            ((guc) (obj1)).a(0x45786966);
            ((guc) (obj1)).a((short)0);
            if (a.e() == ByteOrder.BIG_ENDIAN)
            {
                ((guc) (obj1)).a((short)19789);
            } else
            {
                ((guc) (obj1)).a((short)18761);
            }
            ((guc) (obj1)).a(a.e());
            ((guc) (obj1)).a((short)42);
            ((guc) (obj1)).a(8);
            a(a.b(0), ((guc) (obj1)));
            a(a.b(2), ((guc) (obj1)));
            obj2 = a.b(3);
            if (obj2 != null)
            {
                a(((gub) (obj2)), ((guc) (obj1)));
            }
            obj2 = a.b(4);
            if (obj2 != null)
            {
                a(((gub) (obj2)), ((guc) (obj1)));
            }
            if (a.b(1) != null)
            {
                a(a.b(1), ((guc) (obj1)));
            }
            a(((guc) (obj1)));
            obj = ((ArrayList) (obj)).iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                obj1 = (gua)((Iterator) (obj)).next();
                a.a(((gua) (obj1)));
            }
        }
    }

    private static void a(gua gua1, guc guc1)
    {
        int i;
        int j;
        int k;
        j = 0;
        k = 0;
        i = 0;
        if (gua1.f()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        switch (gua1.c())
        {
        case 6: // '\006'
        case 8: // '\b'
        default:
            return;

        case 1: // '\001'
        case 7: // '\007'
            byte abyte0[] = new byte[gua1.e()];
            gua1.b(abyte0);
            guc1.write(abyte0);
            return;

        case 2: // '\002'
            byte abyte1[] = gua1.i();
            if (abyte1.length == gua1.e())
            {
                abyte1[abyte1.length - 1] = 0;
                guc1.write(abyte1);
                return;
            } else
            {
                guc1.write(abyte1);
                guc1.write(0);
                return;
            }

        case 4: // '\004'
        case 9: // '\t'
            j = gua1.e();
            while (i < j) 
            {
                guc1.a((int)gua1.e(i));
                i++;
            }
            break;

        case 5: // '\005'
        case 10: // '\n'
            k = gua1.e();
            i = j;
            while (i < k) 
            {
                guc1.a(gua1.f(i));
                i++;
            }
            break;

        case 3: // '\003'
            j = gua1.e();
            i = k;
            break; /* Loop/switch isn't completed */
        }
        if (true) goto _L1; else goto _L3
_L3:
        while (i < j) 
        {
            guc1.a((short)(int)gua1.e(i));
            i++;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private static void a(gub gub1, guc guc1)
    {
        boolean flag = false;
        gua agua[] = gub1.b();
        guc1.a((short)agua.length);
        int i1 = agua.length;
        int i = 0;
        while (i < i1) 
        {
            gua gua1 = agua[i];
            guc1.a(gua1.b());
            guc1.a(gua1.c());
            guc1.a(gua1.e());
            if (gua1.d() > 4)
            {
                guc1.a(gua1.j());
            } else
            {
                a(gua1, guc1);
                int j1 = gua1.d();
                int k = 0;
                while (k < 4 - j1) 
                {
                    guc1.write(0);
                    k++;
                }
            }
            i++;
        }
        guc1.a(gub1.e());
        int l = agua.length;
        for (int j = ((flag) ? 1 : 0); j < l; j++)
        {
            gub1 = agua[j];
            if (gub1.d() > 4)
            {
                a(((gua) (gub1)), guc1);
            }
        }

    }

    private void a(guc guc1)
    {
        if (!a.b()) goto _L2; else goto _L1
_L1:
        guc1.write(a.a());
_L4:
        return;
_L2:
        if (a.d())
        {
            int i = 0;
            while (i < a.c()) 
            {
                guc1.write(a.a(i));
                i++;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void b()
    {
        Object obj2 = a.b(0);
        gub gub1 = ((gub) (obj2));
        if (obj2 == null)
        {
            gub1 = new gub(0);
            a.a(gub1);
        }
        obj2 = g.c(gtp.C);
        if (obj2 == null)
        {
            int i = gtp.C;
            throw new IOException((new StringBuilder(47)).append("No definition for crucial exif tag: ").append(i).toString());
        }
        gub1.a(((gua) (obj2)));
        gub gub2 = a.b(2);
        obj2 = gub2;
        if (gub2 == null)
        {
            obj2 = new gub(2);
            a.a(((gub) (obj2)));
        }
        if (a.b(4) != null)
        {
            gua gua2 = g.c(gtp.D);
            if (gua2 == null)
            {
                int j = gtp.D;
                throw new IOException((new StringBuilder(47)).append("No definition for crucial exif tag: ").append(j).toString());
            }
            gub1.a(gua2);
        }
        if (a.b(3) != null)
        {
            gua gua1 = g.c(gtp.am);
            if (gua1 == null)
            {
                int k = gtp.am;
                throw new IOException((new StringBuilder(47)).append("No definition for crucial exif tag: ").append(k).toString());
            }
            ((gub) (obj2)).a(gua1);
        }
        obj2 = a.b(1);
        if (a.b())
        {
            Object obj = obj2;
            if (obj2 == null)
            {
                obj = new gub(1);
                a.a(((gub) (obj)));
            }
            obj2 = g.c(gtp.E);
            if (obj2 == null)
            {
                int l = gtp.E;
                throw new IOException((new StringBuilder(47)).append("No definition for crucial exif tag: ").append(l).toString());
            }
            ((gub) (obj)).a(((gua) (obj2)));
            obj2 = g.c(gtp.F);
            if (obj2 == null)
            {
                int i1 = gtp.F;
                throw new IOException((new StringBuilder(47)).append("No definition for crucial exif tag: ").append(i1).toString());
            }
            ((gua) (obj2)).d(a.a().length);
            ((gub) (obj)).a(((gua) (obj2)));
            ((gub) (obj)).b(gtp.a(gtp.i));
            ((gub) (obj)).b(gtp.a(gtp.m));
        } else
        {
            if (a.d())
            {
                Object obj1 = obj2;
                if (obj2 == null)
                {
                    obj1 = new gub(1);
                    a.a(((gub) (obj1)));
                }
                int j1 = a.c();
                obj2 = g.c(gtp.i);
                if (obj2 == null)
                {
                    j1 = gtp.i;
                    throw new IOException((new StringBuilder(47)).append("No definition for crucial exif tag: ").append(j1).toString());
                }
                gua gua3 = g.c(gtp.m);
                if (gua3 == null)
                {
                    j1 = gtp.m;
                    throw new IOException((new StringBuilder(47)).append("No definition for crucial exif tag: ").append(j1).toString());
                }
                long al[] = new long[j1];
                for (int k1 = 0; k1 < a.c(); k1++)
                {
                    al[k1] = a.a(k1).length;
                }

                gua3.a(al);
                ((gub) (obj1)).a(((gua) (obj2)));
                ((gub) (obj1)).a(gua3);
                ((gub) (obj1)).b(gtp.a(gtp.E));
                ((gub) (obj1)).b(gtp.a(gtp.F));
                return;
            }
            if (obj2 != null)
            {
                ((gub) (obj2)).b(gtp.a(gtp.i));
                ((gub) (obj2)).b(gtp.a(gtp.m));
                ((gub) (obj2)).b(gtp.a(gtp.E));
                ((gub) (obj2)).b(gtp.a(gtp.F));
                return;
            }
        }
    }

    private int c()
    {
        gub gub1 = a.b(0);
        int i = a(gub1, 8);
        gub1.a(gtp.a(gtp.C)).d(i);
        gub gub2 = a.b(2);
        int j = a(gub2, i);
        gub gub3 = a.b(3);
        i = j;
        if (gub3 != null)
        {
            gub2.a(gtp.a(gtp.am)).d(j);
            i = a(gub3, j);
        }
        gub2 = a.b(4);
        j = i;
        if (gub2 != null)
        {
            gub1.a(gtp.a(gtp.D)).d(i);
            j = a(gub2, i);
        }
        gub2 = a.b(1);
        i = j;
        if (gub2 != null)
        {
            gub1.a(j);
            i = a(gub2, j);
        }
        if (a.b())
        {
            gub2.a(gtp.a(gtp.E)).d(i);
            return a.a().length + i;
        }
        if (a.d())
        {
            long al[] = new long[a.c()];
            boolean flag = false;
            int k = i;
            for (i = ((flag) ? 1 : 0); i < a.c(); i++)
            {
                al[i] = k;
                k += a.a(i).length;
            }

            gub2.a(gtp.a(gtp.i)).a(al);
            return k;
        } else
        {
            return i;
        }
    }

    protected void a(gtq gtq1)
    {
        a = gtq1;
    }

    public void write(int i)
    {
        e[0] = (byte)(i & 0xff);
        write(e);
    }

    public void write(byte abyte0[])
    {
        write(abyte0, 0, abyte0.length);
    }

    public void write(byte abyte0[], int i, int j)
    {
_L5:
        if (c <= 0 && d <= 0 && b == 2 || j <= 0) goto _L2; else goto _L1
_L1:
        int k = i;
        int j1 = j;
        if (c > 0)
        {
            k = Math.min(c, j);
            j1 = j - k;
            c = c - k;
            k = i + k;
        }
        i = k;
        j = j1;
        if (d > 0)
        {
            i = Math.min(d, j1);
            out.write(abyte0, k, i);
            j = j1 - i;
            d = d - i;
            i = k + i;
        }
        if (j != 0) goto _L4; else goto _L3
_L3:
        return;
_L4:
        b;
        JVM INSTR tableswitch 0 1: default 156
    //                   0 159
    //                   1 257;
           goto _L5 _L6 _L7
_L6:
        int l = a(2, abyte0, i, j);
        i += l;
        j -= l;
        if (f.position() < 2) goto _L3; else goto _L8
_L8:
        f.rewind();
        if (f.getShort() != -40)
        {
            throw new IOException("Not a valid jpeg image, cannot write exif");
        }
        out.write(f.array(), 0, 2);
        b = 1;
        f.rewind();
        a();
          goto _L5
_L7:
        int i1 = a(4, abyte0, i, j);
        i += i1;
        j -= i1;
        if (f.position() == 2 && f.getShort() == -39)
        {
            out.write(f.array(), 0, 2);
            f.rewind();
        }
        if (f.position() < 4) goto _L3; else goto _L9
_L9:
        f.rewind();
        short word0 = f.getShort();
        if (word0 == -31)
        {
            c = (f.getShort() & 0xffff) - 2;
            b = 2;
        } else
        if (!g.a(word0))
        {
            out.write(f.array(), 0, 4);
            d = (f.getShort() & 0xffff) - 2;
        } else
        {
            out.write(f.array(), 0, 4);
            b = 2;
        }
        f.rewind();
          goto _L5
_L2:
        if (j > 0)
        {
            out.write(abyte0, i, j);
            return;
        }
          goto _L3
    }
}
