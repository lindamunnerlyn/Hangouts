// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class gts
{

    private final ByteBuffer a;
    private final gtq b;
    private final List c;
    private final gtp d;
    private int e;

    protected gts(ByteBuffer bytebuffer, gtp gtp1)
    {
        c = new ArrayList();
        a = bytebuffer;
        e = bytebuffer.position();
        d = gtp1;
        gtp1 = new gtn(bytebuffer);
        bytebuffer = gtv.a(gtp1, d);
        b = new gtq(bytebuffer.j());
        int i = e;
        e = bytebuffer.i() + i;
        a.position(0);
        gtp.a(gtp1);
        return;
        bytebuffer;
        gtp1 = null;
_L2:
        gtp.a(gtp1);
        throw bytebuffer;
        bytebuffer;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void a(gua gua1)
    {
        b.a(gua1);
    }

    protected boolean a()
    {
        gtn gtn1 = new gtn(a);
        Object obj2;
        obj2 = new gub[5];
        obj2[0] = b.b(0);
        obj2[1] = b.b(1);
        obj2[2] = b.b(2);
        obj2[3] = b.b(3);
        obj2[4] = b.b(4);
        break MISSING_BLOCK_LABEL_78;
_L22:
        int i;
        gtv1 = gtv.a(gtn1, j, d);
        i = gtv1.a();
        Object obj1 = null;
          goto _L1
_L3:
        i = gtv1.a();
        Object obj;
        obj1 = obj;
          goto _L1
_L26:
        obj1 = obj2[gtv1.d()];
        obj = obj1;
        if (obj1 != null) goto _L3; else goto _L2
_L2:
        gtv1.b();
        obj = obj1;
          goto _L3
        obj;
        obj1 = gtn1;
_L21:
        gtp.a(((java.io.Closeable) (obj1)));
        throw obj;
_L27:
        gua1 = gtv1.c();
        gua2 = ((gub) (obj1)).a(gua1.b());
        obj = obj1;
        if (gua2 == null) goto _L3; else goto _L4
_L4:
        if (gua2.e() != gua1.e())
        {
            break MISSING_BLOCK_LABEL_220;
        }
        i = gua2.c();
        j = gua1.c();
        if (i == j)
        {
            break MISSING_BLOCK_LABEL_226;
        }
        gtp.a(gtn1);
        return false;
        c.add(new gtt(gua2, gua1.j()));
        ((gub) (obj1)).b(gua1.b());
        obj = obj1;
        if (((gub) (obj1)).d() != 0) goto _L3; else goto _L5
_L5:
        gtv1.b();
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
        j = ((gub) (obj)).d();
        if (j > 0)
        {
            gtp.a(gtn1);
            return false;
        }
        i++;
          goto _L6
        a.order(b.e());
        obj = c.iterator();
_L20:
        if (!((Iterator) (obj)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = (gtt)((Iterator) (obj)).next();
        obj1 = ((gtt) (obj2)).b;
        i = ((gtt) (obj2)).a;
        if (!((gua) (obj1)).f())
        {
            continue; /* Loop/switch isn't completed */
        }
        a.position(i + e);
        ((gua) (obj1)).c();
        JVM INSTR tableswitch 1 10: default 819
    //                   1 460
    //                   2 487
    //                   3 648
    //                   4 547
    //                   5 587
    //                   6 819
    //                   7 460
    //                   8 819
    //                   9 547
    //                   10 587;
           goto _L7 _L8 _L9 _L10 _L11 _L12 _L7 _L8 _L7 _L11 _L12
_L7:
        break; /* Loop/switch isn't completed */
_L8:
        obj2 = new byte[((gua) (obj1)).e()];
        ((gua) (obj1)).b(((byte []) (obj2)));
        a.put(((byte []) (obj2)));
        break; /* Loop/switch isn't completed */
_L9:
        obj2 = ((gua) (obj1)).i();
        if (obj2.length == ((gua) (obj1)).e())
        {
            obj2[obj2.length - 1] = 0;
            a.put(((byte []) (obj2)));
            break; /* Loop/switch isn't completed */
        }
        a.put(((byte []) (obj2)));
        a.put((byte)0);
        break; /* Loop/switch isn't completed */
_L11:
        j = ((gua) (obj1)).e();
        i = 0;
_L14:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        a.putInt((int)((gua) (obj1)).e(i));
        i++;
        if (true) goto _L14; else goto _L13
_L13:
        break; /* Loop/switch isn't completed */
_L12:
        j = ((gua) (obj1)).e();
        i = 0;
_L16:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = ((gua) (obj1)).f(i);
        a.putInt((int)((gud) (obj2)).a());
        a.putInt((int)((gud) (obj2)).b());
        i++;
        if (true) goto _L16; else goto _L15
_L15:
        break; /* Loop/switch isn't completed */
_L10:
        j = ((gua) (obj1)).e();
        i = 0;
_L18:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        a.putShort((short)(int)((gua) (obj1)).e(i));
        i++;
        if (true) goto _L18; else goto _L17
_L17:
        if (true) goto _L20; else goto _L19
_L19:
        gtp.a(gtn1);
        return true;
        obj;
        obj1 = null;
          goto _L21
        gtv gtv1;
        gua gua1;
        gua gua2;
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
        if (i == 5) goto _L24; else goto _L23
_L23:
        i;
        JVM INSTR tableswitch 0 1: default 808
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
