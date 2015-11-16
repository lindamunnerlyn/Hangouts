// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class gyg extends FilterOutputStream
{

    private gyc a;
    private int b;
    private int c;
    private int d;
    private byte e[];
    private ByteBuffer f;
    private final gyb g;

    protected gyg(OutputStream outputstream, gyb gyb1)
    {
        super(new BufferedOutputStream(outputstream, 0x10000));
        b = 0;
        e = new byte[1];
        f = ByteBuffer.allocate(4);
        g = gyb1;
    }

    private int a(int i, byte abyte0[], int j, int k)
    {
        i = Math.min(i - f.position(), k);
        f.put(abyte0, j, i);
        return i;
    }

    private static int a(gyn gyn1, int i)
    {
        int j = gyn1.d();
        gyn1 = gyn1.b();
        int l = gyn1.length;
        j = i + (j * 12 + 2 + 4);
        for (i = 0; i < l;)
        {
            gym gym1 = gyn1[i];
            int k = j;
            if (gym1.d() > 4)
            {
                gym1.g(j);
                k = j + gym1.d();
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
            Object obj2 = ((gyc) (obj1)).h();
            if (obj2 != null)
            {
                for (int i = 0; i < ((List) (obj2)).size(); i++)
                {
                    gym gym2 = (gym)((gyc) (obj1)).h().get(0);
                    if (gym2.h() == null && !gyb.a(gym2.b()))
                    {
                        ((gyc) (obj1)).b(gym2.b(), gym2.a());
                        ((ArrayList) (obj)).add(gym2);
                    }
                }

            }
            b();
            int j = c();
            if (j + 8 > 65535)
            {
                throw new IOException("Exif header is too large (>64Kb)");
            }
            obj1 = new gyp(out);
            ((gyp) (obj1)).a(ByteOrder.BIG_ENDIAN);
            ((gyp) (obj1)).a((short)-31);
            ((gyp) (obj1)).a((short)(j + 2 + gyo.a.length));
            ((gyp) (obj1)).write(gyo.a);
            if (a.g() == ByteOrder.BIG_ENDIAN)
            {
                ((gyp) (obj1)).a((short)19789);
            } else
            {
                ((gyp) (obj1)).a((short)18761);
            }
            ((gyp) (obj1)).a(a.g());
            ((gyp) (obj1)).a((short)42);
            ((gyp) (obj1)).a(8);
            a(a.b(0), ((gyp) (obj1)));
            a(a.b(2), ((gyp) (obj1)));
            obj2 = a.b(3);
            if (obj2 != null)
            {
                a(((gyn) (obj2)), ((gyp) (obj1)));
            }
            obj2 = a.b(4);
            if (obj2 != null)
            {
                a(((gyn) (obj2)), ((gyp) (obj1)));
            }
            if (a.b(1) != null)
            {
                a(a.b(1), ((gyp) (obj1)));
            }
            a(((gyp) (obj1)));
            gym gym1;
            for (obj = ((ArrayList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); a.a(gym1))
            {
                gym1 = (gym)((Iterator) (obj)).next();
            }

            if (a.b())
            {
                byte abyte0[] = a.a();
                ((gyp) (obj1)).a(ByteOrder.BIG_ENDIAN);
                ((gyp) (obj1)).a((short)-31);
                ((gyp) (obj1)).a((short)(abyte0.length + 2 + gyo.b.length));
                ((gyp) (obj1)).write(gyo.b);
                ((gyp) (obj1)).write(abyte0);
                return;
            }
        }
    }

    private static void a(gym gym1, gyp gyp1)
    {
        int i;
        int j;
        int k;
        j = 0;
        k = 0;
        i = 0;
        if (gym1.f()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        switch (gym1.c())
        {
        case 6: // '\006'
        case 8: // '\b'
        default:
            return;

        case 1: // '\001'
        case 7: // '\007'
            byte abyte0[] = new byte[gym1.e()];
            gym1.b(abyte0);
            gyp1.write(abyte0);
            return;

        case 2: // '\002'
            byte abyte1[] = gym1.i();
            if (abyte1.length == gym1.e())
            {
                abyte1[abyte1.length - 1] = 0;
                gyp1.write(abyte1);
                return;
            } else
            {
                gyp1.write(abyte1);
                gyp1.write(0);
                return;
            }

        case 4: // '\004'
        case 9: // '\t'
            j = gym1.e();
            while (i < j) 
            {
                gyp1.a((int)gym1.e(i));
                i++;
            }
            break;

        case 5: // '\005'
        case 10: // '\n'
            k = gym1.e();
            i = j;
            while (i < k) 
            {
                gyp1.a(gym1.f(i));
                i++;
            }
            break;

        case 3: // '\003'
            j = gym1.e();
            i = k;
            break; /* Loop/switch isn't completed */
        }
        if (true) goto _L1; else goto _L3
_L3:
        while (i < j) 
        {
            gyp1.a((short)(int)gym1.e(i));
            i++;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private static void a(gyn gyn1, gyp gyp1)
    {
        boolean flag = false;
        gym agym[] = gyn1.b();
        gyp1.a((short)agym.length);
        int i1 = agym.length;
        int i = 0;
        while (i < i1) 
        {
            gym gym1 = agym[i];
            gyp1.a(gym1.b());
            gyp1.a(gym1.c());
            gyp1.a(gym1.e());
            if (Log.isLoggable("ExifOutputStream", 2))
            {
                String s = String.valueOf(gym1);
                (new StringBuilder(String.valueOf(s).length() + 1)).append("\n").append(s);
            }
            if (gym1.d() > 4)
            {
                gyp1.a(gym1.j());
            } else
            {
                a(gym1, gyp1);
                int j1 = gym1.d();
                int k = 0;
                while (k < 4 - j1) 
                {
                    gyp1.write(0);
                    k++;
                }
            }
            i++;
        }
        gyp1.a(gyn1.e());
        int l = agym.length;
        for (int j = ((flag) ? 1 : 0); j < l; j++)
        {
            gyn1 = agym[j];
            if (gyn1.d() > 4)
            {
                a(((gym) (gyn1)), gyp1);
            }
        }

    }

    private void a(gyp gyp1)
    {
        if (!a.d()) goto _L2; else goto _L1
_L1:
        gyp1.write(a.c());
_L4:
        return;
_L2:
        if (a.f())
        {
            int i = 0;
            while (i < a.e()) 
            {
                gyp1.write(a.a(i));
                i++;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void b()
    {
        Object obj2 = a.b(0);
        gyn gyn1 = ((gyn) (obj2));
        if (obj2 == null)
        {
            gyn1 = new gyn(0);
            a.a(gyn1);
        }
        obj2 = g.c(gyb.C);
        if (obj2 == null)
        {
            int i = gyb.C;
            throw new IOException((new StringBuilder(47)).append("No definition for crucial exif tag: ").append(i).toString());
        }
        gyn1.a(((gym) (obj2)));
        gyn gyn2 = a.b(2);
        obj2 = gyn2;
        if (gyn2 == null)
        {
            obj2 = new gyn(2);
            a.a(((gyn) (obj2)));
        }
        if (a.b(4) != null)
        {
            gym gym2 = g.c(gyb.D);
            if (gym2 == null)
            {
                int j = gyb.D;
                throw new IOException((new StringBuilder(47)).append("No definition for crucial exif tag: ").append(j).toString());
            }
            gyn1.a(gym2);
        }
        if (a.b(3) != null)
        {
            gym gym1 = g.c(gyb.am);
            if (gym1 == null)
            {
                int k = gyb.am;
                throw new IOException((new StringBuilder(47)).append("No definition for crucial exif tag: ").append(k).toString());
            }
            ((gyn) (obj2)).a(gym1);
        }
        obj2 = a.b(1);
        if (a.d())
        {
            Object obj = obj2;
            if (obj2 == null)
            {
                obj = new gyn(1);
                a.a(((gyn) (obj)));
            }
            obj2 = g.c(gyb.E);
            if (obj2 == null)
            {
                int l = gyb.E;
                throw new IOException((new StringBuilder(47)).append("No definition for crucial exif tag: ").append(l).toString());
            }
            ((gyn) (obj)).a(((gym) (obj2)));
            obj2 = g.c(gyb.F);
            if (obj2 == null)
            {
                int i1 = gyb.F;
                throw new IOException((new StringBuilder(47)).append("No definition for crucial exif tag: ").append(i1).toString());
            }
            ((gym) (obj2)).d(a.c().length);
            ((gyn) (obj)).a(((gym) (obj2)));
            ((gyn) (obj)).b(gyb.a(gyb.i));
            ((gyn) (obj)).b(gyb.a(gyb.m));
        } else
        {
            if (a.f())
            {
                Object obj1 = obj2;
                if (obj2 == null)
                {
                    obj1 = new gyn(1);
                    a.a(((gyn) (obj1)));
                }
                int j1 = a.e();
                obj2 = g.c(gyb.i);
                if (obj2 == null)
                {
                    j1 = gyb.i;
                    throw new IOException((new StringBuilder(47)).append("No definition for crucial exif tag: ").append(j1).toString());
                }
                gym gym3 = g.c(gyb.m);
                if (gym3 == null)
                {
                    j1 = gyb.m;
                    throw new IOException((new StringBuilder(47)).append("No definition for crucial exif tag: ").append(j1).toString());
                }
                long al[] = new long[j1];
                for (int k1 = 0; k1 < a.e(); k1++)
                {
                    al[k1] = a.a(k1).length;
                }

                gym3.a(al);
                ((gyn) (obj1)).a(((gym) (obj2)));
                ((gyn) (obj1)).a(gym3);
                ((gyn) (obj1)).b(gyb.a(gyb.E));
                ((gyn) (obj1)).b(gyb.a(gyb.F));
                return;
            }
            if (obj2 != null)
            {
                ((gyn) (obj2)).b(gyb.a(gyb.i));
                ((gyn) (obj2)).b(gyb.a(gyb.m));
                ((gyn) (obj2)).b(gyb.a(gyb.E));
                ((gyn) (obj2)).b(gyb.a(gyb.F));
                return;
            }
        }
    }

    private int c()
    {
        gyn gyn1 = a.b(0);
        int i = a(gyn1, 8);
        gyn1.a(gyb.a(gyb.C)).d(i);
        gyn gyn2 = a.b(2);
        int j = a(gyn2, i);
        gyn gyn3 = a.b(3);
        i = j;
        if (gyn3 != null)
        {
            gyn2.a(gyb.a(gyb.am)).d(j);
            i = a(gyn3, j);
        }
        gyn2 = a.b(4);
        j = i;
        if (gyn2 != null)
        {
            gyn1.a(gyb.a(gyb.D)).d(i);
            j = a(gyn2, i);
        }
        gyn2 = a.b(1);
        i = j;
        if (gyn2 != null)
        {
            gyn1.a(j);
            i = a(gyn2, j);
        }
        if (a.d())
        {
            gyn2.a(gyb.a(gyb.E)).d(i);
            return a.c().length + i;
        }
        if (a.f())
        {
            long al[] = new long[a.e()];
            boolean flag = false;
            int k = i;
            for (i = ((flag) ? 1 : 0); i < a.e(); i++)
            {
                al[i] = k;
                k += a.a(i).length;
            }

            gyn2.a(gyb.a(gyb.i)).a(al);
            return k;
        } else
        {
            return i;
        }
    }

    protected void a(gyc gyc1)
    {
        a = gyc1;
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
        if (!gyo.a(word0))
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
