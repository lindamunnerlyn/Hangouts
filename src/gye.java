// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class gye
{

    private final ByteBuffer a;
    private final gyc b;
    private final List c;
    private final gyb d;
    private int e;

    protected gye(ByteBuffer bytebuffer, gyb gyb1)
    {
        c = new ArrayList();
        a = bytebuffer;
        e = bytebuffer.position();
        d = gyb1;
        gyb1 = new gxz(bytebuffer);
        bytebuffer = gyh.a(gyb1, d);
        b = new gyc(bytebuffer.k());
        int i = e;
        e = bytebuffer.j() + i;
        a.position(0);
        gyb.a(gyb1);
        return;
        bytebuffer;
        gyb1 = null;
_L2:
        gyb.a(gyb1);
        throw bytebuffer;
        bytebuffer;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void a(gym gym1)
    {
        b.a(gym1);
    }

    protected boolean a()
    {
        gxz gxz1 = new gxz(a);
        Object obj2;
        obj2 = new gyn[5];
        obj2[0] = b.b(0);
        obj2[1] = b.b(1);
        obj2[2] = b.b(2);
        obj2[3] = b.b(3);
        obj2[4] = b.b(4);
        break MISSING_BLOCK_LABEL_78;
_L22:
        int i;
        gyh1 = gyh.a(gxz1, j, d);
        i = gyh1.a();
        Object obj1 = null;
          goto _L1
_L3:
        i = gyh1.a();
        Object obj;
        obj1 = obj;
          goto _L1
_L26:
        obj1 = obj2[gyh1.d()];
        obj = obj1;
        if (obj1 != null) goto _L3; else goto _L2
_L2:
        gyh1.b();
        obj = obj1;
          goto _L3
        obj;
        obj1 = gxz1;
_L21:
        gyb.a(((java.io.Closeable) (obj1)));
        throw obj;
_L27:
        gym1 = gyh1.c();
        gym2 = ((gyn) (obj1)).a(gym1.b());
        obj = obj1;
        if (gym2 == null) goto _L3; else goto _L4
_L4:
        if (gym2.e() != gym1.e())
        {
            break MISSING_BLOCK_LABEL_220;
        }
        i = gym2.c();
        j = gym1.c();
        if (i == j)
        {
            break MISSING_BLOCK_LABEL_226;
        }
        gyb.a(gxz1);
        return false;
        c.add(new gyf(gym2, gym1.j()));
        ((gyn) (obj1)).b(gym1.b());
        obj = obj1;
        if (((gyn) (obj1)).d() != 0) goto _L3; else goto _L5
_L5:
        gyh1.b();
        obj = obj1;
          goto _L3
_L6:
        if (i >= 5)
        {
            break MISSING_BLOCK_LABEL_320;
        }
        obj = obj2[i];
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_311;
        }
        j = ((gyn) (obj)).d();
        if (j > 0)
        {
            gyb.a(gxz1);
            return false;
        }
        i++;
          goto _L6
        a.order(b.g());
        obj = c.iterator();
_L20:
        if (!((Iterator) (obj)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = (gyf)((Iterator) (obj)).next();
        obj1 = ((gyf) (obj2)).b;
        i = ((gyf) (obj2)).a;
        if (!((gym) (obj1)).f())
        {
            continue; /* Loop/switch isn't completed */
        }
        if (Log.isLoggable("ExifModifier", 2))
        {
            obj2 = String.valueOf(obj1);
            (new StringBuilder(String.valueOf(obj2).length() + 19)).append("modifying tag to: \n").append(((String) (obj2)));
            (new StringBuilder(22)).append("at offset: ").append(i);
        }
        a.position(i + e);
        ((gym) (obj1)).c();
        JVM INSTR tableswitch 1 10: default 883
    //                   1 524
    //                   2 551
    //                   3 712
    //                   4 611
    //                   5 651
    //                   6 883
    //                   7 524
    //                   8 883
    //                   9 611
    //                   10 651;
           goto _L7 _L8 _L9 _L10 _L11 _L12 _L7 _L8 _L7 _L11 _L12
_L7:
        break; /* Loop/switch isn't completed */
_L8:
        obj2 = new byte[((gym) (obj1)).e()];
        ((gym) (obj1)).b(((byte []) (obj2)));
        a.put(((byte []) (obj2)));
        break; /* Loop/switch isn't completed */
_L9:
        obj2 = ((gym) (obj1)).i();
        if (obj2.length == ((gym) (obj1)).e())
        {
            obj2[obj2.length - 1] = 0;
            a.put(((byte []) (obj2)));
            break; /* Loop/switch isn't completed */
        }
        a.put(((byte []) (obj2)));
        a.put((byte)0);
        break; /* Loop/switch isn't completed */
_L11:
        j = ((gym) (obj1)).e();
        i = 0;
_L14:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        a.putInt((int)((gym) (obj1)).e(i));
        i++;
        if (true) goto _L14; else goto _L13
_L13:
        break; /* Loop/switch isn't completed */
_L12:
        j = ((gym) (obj1)).e();
        i = 0;
_L16:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = ((gym) (obj1)).f(i);
        a.putInt((int)((gyq) (obj2)).a());
        a.putInt((int)((gyq) (obj2)).b());
        i++;
        if (true) goto _L16; else goto _L15
_L15:
        break; /* Loop/switch isn't completed */
_L10:
        j = ((gym) (obj1)).e();
        i = 0;
_L18:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        a.putShort((short)(int)((gym) (obj1)).e(i));
        i++;
        if (true) goto _L18; else goto _L17
_L17:
        if (true) goto _L20; else goto _L19
_L19:
        gyb.a(gxz1);
        return true;
        obj;
        obj1 = null;
          goto _L21
        gyh gyh1;
        gym gym1;
        gym gym2;
        int j;
        if (obj2[0] != null)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        i = j;
        if (obj2[1] != null)
        {
            i = j | 2;
        }
        j = i;
        if (obj2[2] != null)
        {
            j = i | 4;
        }
        i = j;
        if (obj2[4] != null)
        {
            i = j | 8;
        }
        j = i;
        if (obj2[3] != null)
        {
            j = i | 0x10;
        }
          goto _L22
_L1:
        if (i == 6) goto _L24; else goto _L23
_L23:
        i;
        JVM INSTR tableswitch 0 1: default 872
    //                   0 127
    //                   1 161;
           goto _L25 _L26 _L27
_L25:
        obj = obj1;
          goto _L3
_L24:
        i = 0;
          goto _L6
    }
}
