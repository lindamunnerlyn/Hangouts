// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

public final class crp extends crn
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    public final double i;
    public final double j;
    public final String k;

    protected crp(koz koz1, kpv kpv1)
    {
        super(koz1, kpv1.e, kpv1.f, a(kpv1.w), kpv1.c, "hangouts/location");
        if (crm.d())
        {
            koz1 = String.valueOf(d);
            if (koz1.length() != 0)
            {
                koz1 = "Received location: ".concat(koz1);
            } else
            {
                koz1 = new String("Received location: ");
            }
            ebw.b("Babel", koz1);
        }
        if (kpv1.n == null) goto _L2; else goto _L1
_L1:
        koz1 = (kqq)kpv1.n.getExtension(kqq.a);
        if (koz1 == null) goto _L2; else goto _L3
_L3:
        koz1 = ((kqq) (koz1)).s;
_L5:
        k = koz1;
        koz1 = (kpo)kpv1.o.getExtension(kpo.a);
        if (koz1 == null)
        {
            i = 0.0D;
            j = 0.0D;
            return;
        } else
        {
            i = ((kpo) (koz1)).n.doubleValue();
            j = ((kpo) (koz1)).o.doubleValue();
            return;
        }
_L2:
        koz1 = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public crp(int ai[], String s, double d, double d1, String s1, 
            String s2, String s3)
    {
        super(ai, null, null, s, null, s2, s3, "hangouts/location");
        i = d;
        j = d1;
        k = s1;
    }

    public String toString()
    {
        String s = b;
        String s1 = this.d;
        double d = i;
        double d1 = j;
        String s2 = k;
        String s3 = f;
        return (new StringBuilder(String.valueOf(s).length() + 107 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length())).append("id: ").append(s).append(" name: ").append(s1).append(" latitude: ").append(d).append(" longitude: ").append(d1).append(" address: ").append(s2).append(" staticMapUrl: ").append(s3).toString();
    }
}
