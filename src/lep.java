// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.ConcurrentHashMap;

public final class lep extends ldw
{

    private static final lep k;
    private static final ConcurrentHashMap l;
    private static final long serialVersionUID = 0xa9c8116671375027L;

    private lep(lcw lcw1)
    {
        super(lcw1, null);
    }

    public static lep L()
    {
        return k;
    }

    public static lep M()
    {
        return b(ldd.a());
    }

    public static lep b(ldd ldd1)
    {
        lep lep1;
label0:
        {
            ldd ldd2 = ldd1;
            if (ldd1 == null)
            {
                ldd2 = ldd.a();
            }
            lep1 = (lep)l.get(ldd2);
            ldd1 = lep1;
            if (lep1 == null)
            {
                lep1 = new lep(les.a(k, ldd2));
                ldd1 = (lep)l.putIfAbsent(ldd2, lep1);
                if (ldd1 == null)
                {
                    break label0;
                }
            }
            return ldd1;
        }
        return lep1;
    }

    private Object writeReplace()
    {
        return new leq(a());
    }

    public lcw a(ldd ldd1)
    {
        ldd ldd2 = ldd1;
        if (ldd1 == null)
        {
            ldd2 = ldd.a();
        }
        if (ldd2 == a())
        {
            return this;
        } else
        {
            return b(ldd2);
        }
    }

    protected void a(ldx ldx1)
    {
        if (super.a.a() == ldd.a)
        {
            ldx1.H = new lfa(ler.a, lcz.v());
            ldx1.G = new lfi((lfa)ldx1.H, lcz.u());
            ldx1.C = new lfi((lfa)ldx1.H, lcz.q());
            ldx1.k = ldx1.H.d();
        }
    }

    public lcw b()
    {
        return k;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj instanceof lep)
        {
            obj = (lep)obj;
            return a().equals(((lep) (obj)).a());
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return "ISO".hashCode() * 11 + a().hashCode();
    }

    public String toString()
    {
        String s = "ISOChronology";
        ldd ldd1 = a();
        if (ldd1 != null)
        {
            s = ldd1.b;
            s = (new StringBuilder(String.valueOf("ISOChronology").length() + 2 + String.valueOf(s).length())).append("ISOChronology").append("[").append(s).append("]").toString();
        }
        return s;
    }

    static 
    {
        l = new ConcurrentHashMap();
        k = new lep(leo.V());
        l.put(ldd.a, k);
    }
}
