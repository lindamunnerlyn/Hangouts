// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cxp extends cwm
{

    private static final long serialVersionUID = 2L;
    public final cxq a[];
    public final int b;

    public cxp(cxq acxq[], int i)
    {
        a = acxq;
        b = i;
    }

    public String a()
    {
        return "background_queue";
    }

    public kws a(String s, int i, int j)
    {
        int k = 0;
        if (cvv.e)
        {
            eev.b("Babel_RequestWriter", "Build proto for UploadAnalyticsRequest");
        }
        jcx jcx1 = new jcx();
        jcx1.requestHeader = cvu.a(null, true, s, i, j, h);
        if (a != null && b > 0)
        {
            jcx1.b = new jam[b];
            j = 0;
            for (i = k; i < a.length && j < b; j = k)
            {
                k = j;
                if (a[i].b() > 0L)
                {
                    jcx1.b[j] = a[i].c();
                    k = j + 1;
                }
                i++;
            }

        }
        return jcx1;
    }

    public void a(aoa aoa1, dcx dcx)
    {
        dcx = dku.b(aoa1.h());
        if (dcx.g())
        {
            String s = String.valueOf(getClass().getSimpleName());
            aoa1 = String.valueOf(eev.b(aoa1.a()));
            eev.f("Babel_RequestWriter", (new StringBuilder(String.valueOf(s).length() + 9 + String.valueOf(aoa1).length())).append(s).append(" failed: ").append(aoa1).toString());
            dcx.a(0);
        }
    }

    public String f()
    {
        return "analytics/recordanalyticsevents";
    }
}
