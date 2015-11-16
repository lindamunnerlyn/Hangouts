// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;

public final class lca extends kui
    implements kvd
{

    private static volatile kve e = null;
    private static final lca g;
    private static volatile kvf h;
    private static final long serialVersionUID = 0L;
    private byte f;

    private lca(ktu ktu1, kty kty1)
    {
        boolean flag;
        f = -1;
        flag = false;
_L4:
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        int i = ktu1.a();
        i;
        JVM INSTR tableswitch 0 0: default 119
    //                   0 64;
           goto _L1 _L2
_L1:
        boolean flag1 = a(d(), ktu1, kty1, i);
        if (!flag1)
        {
            flag = true;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
        f();
        return;
        ktu1;
        throw new RuntimeException(ktu1.a(this));
        ktu1;
        f();
        throw ktu1;
        ktu1;
        throw new RuntimeException((new kuu(ktu1.getMessage())).a(this));
    }

    public static lcc newBuilder()
    {
        return (lcc)g.h();
    }

    public static lcc newBuilder(lca lca1)
    {
        return (lcc)((lcc)g.h()).a(lca1);
    }

    public static lca o()
    {
        return g;
    }

    static lca p()
    {
        return g;
    }

    protected final Object a(int i, Object obj, Object obj1)
    {
        lcb.a[i - 1];
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
        obj1 = new lca((ktu)obj, (kty)obj1);
_L11:
        return obj1;
_L3:
        return new lca(kuq.e, kty.a());
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
        if (!k())
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
        return new lcc();
_L7:
        obj1 = this;
        if (obj == g) goto _L11; else goto _L10
_L10:
        obj = (lca)obj;
        if (super.d.c())
        {
            super.d = super.d.d();
        }
        super.d.a(((kui) (obj)).d);
        a(((lca) (obj)).b);
        return this;
_L8:
        return g;
_L9:
        if (h != null) goto _L13; else goto _L12
_L12:
        lca;
        JVM INSTR monitorenter ;
        if (h == null)
        {
            h = new kug(g);
        }
        lca;
        JVM INSTR monitorexit ;
_L13:
        return h;
        obj;
        lca;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public void a(ktv ktv)
    {
        l().a(ktv);
        b.a(ktv);
    }

    public int n()
    {
        int i = c;
        if (i != -1)
        {
            return i;
        } else
        {
            int j = m() + 0 + b.d();
            c = j;
            return j;
        }
    }

    static 
    {
        g = new lca(kuq.e, kty.a());
    }
}
