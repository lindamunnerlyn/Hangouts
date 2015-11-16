// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;

public final class ktx extends kmf
    implements kna
{

    private static volatile knb e = null;
    private static final ktx g;
    private static volatile knc h;
    private static final long serialVersionUID = 0L;
    private byte f;

    private ktx(klr klr1, klv klv1)
    {
        kns kns1;
        boolean flag;
        f = -1;
        kns1 = knr.newBuilder();
        flag = false;
_L33:
        if (flag) goto _L2; else goto _L1
_L1:
        int l = klr1.a();
        l;
        JVM INSTR tableswitch 0 0: default 627
    //                   0 641;
           goto _L3 _L4
_L3:
        klx klx1;
        kmi kmi1;
        int i;
        int k;
        klx1 = d;
        kma kma = d();
        i = knu.a(l);
        k = knu.b(l);
        kmi1 = klv1.a(kma, k);
        if (kmi1 == null) goto _L6; else goto _L5
_L5:
        if (i != klx.a(kmi1.d.b(), false)) goto _L8; else goto _L7
_L7:
        int j;
        i = 0;
        j = 0;
_L13:
        if (j == 0) goto _L10; else goto _L9
_L9:
        boolean flag1 = kns1.a(l, klr1);
          goto _L11
_L8:
        if (!kmi1.d.d || !kmi1.d.c.c() || i != klx.a(kmi1.d.b(), true)) goto _L6; else goto _L12
_L12:
        i = 1;
        j = 0;
          goto _L13
_L10:
        if (i == 0) goto _L15; else goto _L14
_L14:
        i = klr1.b(klr1.s());
        if (kmi1.d.b() != knw.n) goto _L17; else goto _L16
_L16:
        Object obj;
        if (klr1.t() <= 0)
        {
            break MISSING_BLOCK_LABEL_349;
        }
        j = klr1.n();
        obj = kmi1.d.f().a(j);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_656;
        }
        klx1.b(kmi1.d, kmi1.a(obj));
          goto _L16
        klr1;
        throw new RuntimeException(klr1.a(this));
        klr1;
        b = kns1.a();
        d.b();
        throw klr1;
_L17:
        for (; klr1.t() > 0; klx1.b(kmi1.d, obj))
        {
            obj = klx.a(klr1, kmi1.d.b());
        }

        break MISSING_BLOCK_LABEL_349;
        klr1;
        throw new RuntimeException((new kmr(klr1.getMessage())).a(this));
        klr1.c(i);
        break MISSING_BLOCK_LABEL_656;
_L15:
        kmb.a[kmi1.d.c().ordinal()];
        JVM INSTR tableswitch 1 2: default 662
    //                   1 439
    //                   2 541;
           goto _L18 _L19 _L20
_L18:
        obj = klx.a(klr1, kmi1.d.b());
_L29:
        if (kmi1.d.d())
        {
            klx1.b(kmi1.d, kmi1.a(obj));
            break MISSING_BLOCK_LABEL_656;
        }
          goto _L21
_L19:
        if (kmi1.d.d()) goto _L23; else goto _L22
_L22:
        obj = (kmy)klx1.a(kmi1.d);
        if (obj == null) goto _L23; else goto _L24
_L24:
        obj = ((kmy) (obj)).h();
_L32:
        Object obj1 = obj;
        if (obj != null) goto _L26; else goto _L25
_L25:
        obj1 = kmi1.b().i();
_L26:
        if (kmi1.d.b() != knw.j) goto _L28; else goto _L27
_L27:
        klr1.a(kmi1.a(), ((kmz) (obj1)), klv1);
_L30:
        obj = ((kmz) (obj1)).i();
          goto _L29
_L28:
        klr1.a(((kmz) (obj1)), klv1);
          goto _L30
_L20:
        i = klr1.n();
        obj1 = kmi1.d.f().a(i);
        obj = obj1;
        if (obj1 != null) goto _L29; else goto _L31
_L31:
        kns1.a(k, i);
        break MISSING_BLOCK_LABEL_656;
_L21:
        klx1.a(kmi1.d, kmi1.a(obj));
        break MISSING_BLOCK_LABEL_656;
_L2:
        b = kns1.a();
        d.b();
        return;
_L23:
        obj = null;
          goto _L32
_L11:
        if (!flag1)
        {
            flag = true;
        }
          goto _L33
_L4:
        flag = true;
          goto _L33
_L6:
        i = 0;
        j = 1;
          goto _L13
        flag1 = true;
          goto _L11
    }

    public static ktx n()
    {
        return g;
    }

    public static ktz newBuilder()
    {
        return (ktz)g.g();
    }

    public static ktz newBuilder(ktx ktx1)
    {
        return (ktz)((ktz)g.g()).a(ktx1);
    }

    static ktx o()
    {
        return g;
    }

    protected final Object a(int i, Object obj, Object obj1)
    {
        kty.a[i - 1];
        JVM INSTR tableswitch 1 8: default 52
    //                   1 60
    //                   2 78
    //                   3 92
    //                   4 154
    //                   5 156
    //                   6 164
    //                   7 220
    //                   8 224;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        throw new UnsupportedOperationException();
_L2:
        obj1 = new ktx((klr)obj, (klv)obj1);
_L11:
        return obj1;
_L3:
        return new ktx(kmn.e, klv.a());
_L4:
        i = f;
        if (i == 1)
        {
            return g;
        }
        if (i == 0)
        {
            return null;
        }
        boolean flag = ((Boolean)obj).booleanValue();
        if (!j())
        {
            if (flag)
            {
                f = 0;
            }
            return null;
        }
        if (flag)
        {
            f = 1;
        }
        return g;
_L5:
        return null;
_L6:
        return new ktz();
_L7:
        obj1 = this;
        if (obj == g) goto _L11; else goto _L10
_L10:
        obj = (ktx)obj;
        if (super.d.c())
        {
            super.d = super.d.d();
        }
        super.d.a(((kmf) (obj)).d);
        a(((ktx) (obj)).b);
        return this;
_L8:
        return g;
_L9:
        if (h != null) goto _L13; else goto _L12
_L12:
        ktx;
        JVM INSTR monitorenter ;
        if (h == null)
        {
            h = new kmd(g);
        }
        ktx;
        JVM INSTR monitorexit ;
_L13:
        return h;
        obj;
        ktx;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public void a(kls kls)
    {
        k().a(kls);
        b.a(kls);
    }

    public int m()
    {
        int i = c;
        if (i != -1)
        {
            return i;
        } else
        {
            int j = l() + 0 + b.b();
            c = j;
            return j;
        }
    }

    static 
    {
        g = new ktx(kmn.e, klv.a());
    }
}
