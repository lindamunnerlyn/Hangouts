// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public final class arh
{

    private final aoa a;
    private final gz b = new gz();
    private final eec c = new eec();

    arh(aoa aoa1)
    {
        a = aoa1;
    }

    public cfz a(cgd cgd1, boolean flag)
    {
        gz gz1 = b;
        gz1;
        JVM INSTR monitorenter ;
        Object obj = (String)c.get(cgd1);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        obj = (ari)b.get(obj);
_L1:
        gz1;
        JVM INSTR monitorexit ;
        if (obj == null)
        {
            if (flag)
            {
                gdv.b();
                cgd1 = g.a(cgd1);
                return (new aow(g.nU, a.h())).a(cgd1);
            } else
            {
                dny.a(cgd1, a);
                return null;
            }
        } else
        {
            return ((ari) (obj)).a;
        }
        cgd1;
        gz1;
        JVM INSTR monitorexit ;
        throw cgd1;
        obj = null;
          goto _L1
    }

    public cfz a(String s, boolean flag)
    {
        ari ari1;
        synchronized (b)
        {
            ari1 = (ari)b.get(s);
        }
        if (ari1 == null)
        {
            if (flag)
            {
                gdv.b();
                return (new aow(g.nU, a.h())).H(s);
            } else
            {
                dny.a(s, a);
                return null;
            }
        } else
        {
            return ari1.a;
        }
        s;
        gz1;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void a(cfz cfz1, String s)
    {
        if (s != null)
        {
            boolean flag;
            if (cfz1.j() == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a(s, cfz1, flag);
        }
    }

    public boolean a(String s, cfz cfz1, boolean flag)
    {
        if (cfz1 == null || s == null) goto _L2; else goto _L1
_L1:
        gz gz1 = b;
        gz1;
        JVM INSTR monitorenter ;
        Object obj = (ari)b.get(s);
        if (obj == null) goto _L4; else goto _L3
_L3:
        if (((ari) (obj)).a.b == null) goto _L6; else goto _L5
_L5:
        if (!((ari) (obj)).a.b.a(cfz1.b)) goto _L4; else goto _L7
_L7:
        obj = ((ari) (obj)).a;
_L17:
        if (obj != null) goto _L9; else goto _L8
_L8:
        if (cfz1.b != null) goto _L11; else goto _L10
_L10:
        obj = null;
_L14:
        if (cfz1.b != null) goto _L13; else goto _L12
_L12:
        Object obj1 = null;
_L15:
        obj = g.a(((String) (obj)), ((String) (obj1)), cfz1.d, cfz1.c, cfz1.e, cfz1.f, cfz1.g, cfz1.h, cfz1.r, cfz1.i);
        ((cfz) (obj)).b(cfz1.j());
        obj1 = new ari(((cfz) (obj)));
        b.put(s, obj1);
        c.put(((cfz) (obj)).b, s);
        boolean flag1;
        flag1 = true;
        s = ((String) (obj));
_L16:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_204;
        }
        if (s.j() != null)
        {
            s.b(null);
        }
        gz1;
        JVM INSTR monitorexit ;
        boolean flag2 = flag1;
        if (!flag1)
        {
            flag = flag1;
            if (!TextUtils.isEmpty(cfz1.f))
            {
                flag = flag1;
                if (!TextUtils.equals(cfz1.f, ((cfz) (s)).f))
                {
                    flag = true;
                    s.f = cfz1.f;
                }
            }
            flag1 = flag;
            if (!TextUtils.isEmpty(cfz1.e))
            {
                flag1 = flag;
                if (!TextUtils.equals(cfz1.e, ((cfz) (s)).e))
                {
                    flag1 = true;
                    s.e = cfz1.e;
                }
            }
            flag = flag1;
            if (!TextUtils.isEmpty(cfz1.g))
            {
                flag = flag1;
                if (!TextUtils.equals(cfz1.g, ((cfz) (s)).g))
                {
                    flag = true;
                    s.c(cfz1.g);
                }
            }
            flag1 = flag;
            if (!TextUtils.isEmpty(cfz1.r))
            {
                flag1 = flag;
                if (!TextUtils.equals(cfz1.r, ((cfz) (s)).r))
                {
                    flag1 = true;
                    s.r = cfz1.r;
                }
            }
            flag = flag1;
            if (!TextUtils.isEmpty(cfz1.h))
            {
                flag = flag1;
                if (!TextUtils.equals(cfz1.h, ((cfz) (s)).h))
                {
                    flag = true;
                    s.h = cfz1.h;
                }
            }
            flag2 = flag;
            if (cfz1.i != null)
            {
                flag2 = flag;
                if (cfz1.i != ((cfz) (s)).i)
                {
                    flag2 = true;
                    s.i = cfz1.i;
                }
            }
        }
        return flag2;
_L6:
        if (((ari) (obj)).a.d != null && ((ari) (obj)).a.d.equals(cfz1.d))
        {
            obj = ((ari) (obj)).a;
            continue; /* Loop/switch isn't completed */
        }
          goto _L4
_L11:
        obj = cfz1.b.a;
          goto _L14
_L13:
        obj1 = cfz1.b.b;
          goto _L15
        s;
        gz1;
        JVM INSTR monitorexit ;
        throw s;
_L9:
        flag1 = false;
        s = ((String) (obj));
          goto _L16
_L4:
        obj = null;
        if (true) goto _L17; else goto _L2
_L2:
        return false;
    }
}
