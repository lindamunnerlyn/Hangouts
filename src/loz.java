// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.ConcurrentHashMap;

public final class loz extends log
{

    private static final loz k;
    private static final ConcurrentHashMap l;
    private static final long serialVersionUID = 0xa9c8116671375027L;

    private loz(lng lng1)
    {
        super(lng1, null);
    }

    public static loz L()
    {
        return k;
    }

    public static loz M()
    {
        return b(lnn.a());
    }

    public static loz b(lnn lnn1)
    {
        loz loz1;
label0:
        {
            lnn lnn2 = lnn1;
            if (lnn1 == null)
            {
                lnn2 = lnn.a();
            }
            loz1 = (loz)l.get(lnn2);
            lnn1 = loz1;
            if (loz1 == null)
            {
                loz1 = new loz(lpc.a(k, lnn2));
                lnn1 = (loz)l.putIfAbsent(lnn2, loz1);
                if (lnn1 == null)
                {
                    break label0;
                }
            }
            return lnn1;
        }
        return loz1;
    }

    private Object writeReplace()
    {
        return new lpa(a());
    }

    public lng a(lnn lnn1)
    {
        lnn lnn2 = lnn1;
        if (lnn1 == null)
        {
            lnn2 = lnn.a();
        }
        if (lnn2 == a())
        {
            return this;
        } else
        {
            return b(lnn2);
        }
    }

    protected void a(loh loh1)
    {
        if (super.a.a() == lnn.a)
        {
            loh1.H = new lpk(lpb.a, lnj.v());
            loh1.G = new lps((lpk)loh1.H, lnj.u());
            loh1.C = new lps((lpk)loh1.H, lnj.q());
            loh1.k = loh1.H.d();
        }
    }

    public lng b()
    {
        return k;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj instanceof loz)
        {
            obj = (loz)obj;
            return a().equals(((loz) (obj)).a());
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
        lnn lnn1 = a();
        if (lnn1 != null)
        {
            s = String.valueOf(lnn1.b);
            s = (new StringBuilder(String.valueOf("ISOChronology").length() + 2 + String.valueOf(s).length())).append("ISOChronology").append("[").append(s).append("]").toString();
        }
        return s;
    }

    static 
    {
        l = new ConcurrentHashMap();
        k = new loz(loy.V());
        l.put(lnn.a, k);
    }
}
