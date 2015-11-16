// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public final class aqq
{

    private final ani a;
    private final gz b = new gz();
    private final eay c = new eay();

    aqq(ani ani1)
    {
        a = ani1;
    }

    public ceu a(cey cey1, boolean flag)
    {
        gz gz1 = b;
        gz1;
        JVM INSTR monitorenter ;
        Object obj = (String)c.get(cey1);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        obj = (aqr)b.get(obj);
_L1:
        gz1;
        JVM INSTR monitorexit ;
        if (obj == null)
        {
            if (flag)
            {
                gbh.b();
                cey1 = g.a(cey1);
                return (new aoe(g.nS, a.h())).a(cey1);
            } else
            {
                dlb.a(cey1, a);
                return null;
            }
        } else
        {
            return ((aqr) (obj)).a;
        }
        cey1;
        gz1;
        JVM INSTR monitorexit ;
        throw cey1;
        obj = null;
          goto _L1
    }

    public ceu a(String s, boolean flag)
    {
        aqr aqr1;
        synchronized (b)
        {
            aqr1 = (aqr)b.get(s);
        }
        if (aqr1 == null)
        {
            if (flag)
            {
                gbh.b();
                return (new aoe(g.nS, a.h())).H(s);
            } else
            {
                dlb.a(s, a);
                return null;
            }
        } else
        {
            return aqr1.a;
        }
        s;
        gz1;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void a(ceu ceu1, String s)
    {
        if (s != null)
        {
            boolean flag;
            if (ceu1.j() == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a(s, ceu1, flag);
        }
    }

    public boolean a(String s, ceu ceu1, boolean flag)
    {
        if (ceu1 == null || s == null) goto _L2; else goto _L1
_L1:
        gz gz1 = b;
        gz1;
        JVM INSTR monitorenter ;
        Object obj = (aqr)b.get(s);
        if (obj == null) goto _L4; else goto _L3
_L3:
        if (((aqr) (obj)).a.b == null) goto _L6; else goto _L5
_L5:
        if (!((aqr) (obj)).a.b.a(ceu1.b)) goto _L4; else goto _L7
_L7:
        obj = ((aqr) (obj)).a;
_L17:
        if (obj != null) goto _L9; else goto _L8
_L8:
        if (ceu1.b != null) goto _L11; else goto _L10
_L10:
        obj = null;
_L14:
        if (ceu1.b != null) goto _L13; else goto _L12
_L12:
        Object obj1 = null;
_L15:
        obj = g.a(((String) (obj)), ((String) (obj1)), ceu1.d, ceu1.c, ceu1.e, ceu1.f, ceu1.g, ceu1.h, ceu1.r, ceu1.i);
        ((ceu) (obj)).b(ceu1.j());
        obj1 = new aqr(((ceu) (obj)));
        b.put(s, obj1);
        c.put(((ceu) (obj)).b, s);
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
            if (!TextUtils.isEmpty(ceu1.f))
            {
                flag = flag1;
                if (!TextUtils.equals(ceu1.f, ((ceu) (s)).f))
                {
                    flag = true;
                    s.f = ceu1.f;
                }
            }
            flag1 = flag;
            if (!TextUtils.isEmpty(ceu1.e))
            {
                flag1 = flag;
                if (!TextUtils.equals(ceu1.e, ((ceu) (s)).e))
                {
                    flag1 = true;
                    s.e = ceu1.e;
                }
            }
            flag = flag1;
            if (!TextUtils.isEmpty(ceu1.g))
            {
                flag = flag1;
                if (!TextUtils.equals(ceu1.g, ((ceu) (s)).g))
                {
                    flag = true;
                    s.c(ceu1.g);
                }
            }
            flag1 = flag;
            if (!TextUtils.isEmpty(ceu1.r))
            {
                flag1 = flag;
                if (!TextUtils.equals(ceu1.r, ((ceu) (s)).r))
                {
                    flag1 = true;
                    s.r = ceu1.r;
                }
            }
            flag = flag1;
            if (!TextUtils.isEmpty(ceu1.h))
            {
                flag = flag1;
                if (!TextUtils.equals(ceu1.h, ((ceu) (s)).h))
                {
                    flag = true;
                    s.h = ceu1.h;
                }
            }
            flag2 = flag;
            if (ceu1.i != null)
            {
                flag2 = flag;
                if (ceu1.i != ((ceu) (s)).i)
                {
                    flag2 = true;
                    s.i = ceu1.i;
                }
            }
        }
        return flag2;
_L6:
        if (((aqr) (obj)).a.d != null && ((aqr) (obj)).a.d.equals(ceu1.d))
        {
            obj = ((aqr) (obj)).a;
            continue; /* Loop/switch isn't completed */
        }
          goto _L4
_L11:
        obj = ceu1.b.a;
          goto _L14
_L13:
        obj1 = ceu1.b.b;
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
