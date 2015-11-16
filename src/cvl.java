// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cvl extends cui
{

    private static final long serialVersionUID = 2L;
    public final cvm a[];
    public final int b;

    public cvl(cvm acvm[], int i)
    {
        a = acvm;
        b = i;
    }

    public String a()
    {
        return "background_queue";
    }

    public kop a(String s, int i, int j)
    {
        int k = 0;
        if (ctr.e)
        {
            ebw.b("Babel_RequestWriter", "Build proto for UploadAnalyticsRequest");
        }
        iws iws1 = new iws();
        iws1.requestHeader = ctq.a(null, true, s, i, j, h);
        if (a != null && b > 0)
        {
            iws1.b = new iuh[b];
            j = 0;
            for (i = k; i < a.length && j < b; j = k)
            {
                k = j;
                if (a[i].b() > 0L)
                {
                    iws1.b[j] = a[i].c();
                    k = j + 1;
                }
                i++;
            }

        }
        return iws1;
    }

    public void a(ani ani1, dbo dbo)
    {
        dbo = djh.b(ani1.h());
        if (dbo.g())
        {
            String s = String.valueOf(getClass().getSimpleName());
            ani1 = String.valueOf(ebw.b(ani1.a()));
            ebw.f("Babel_RequestWriter", (new StringBuilder(String.valueOf(s).length() + 9 + String.valueOf(ani1).length())).append(s).append(" failed: ").append(ani1).toString());
            dbo.a(0);
        }
    }

    public String g()
    {
        return "analytics/recordanalyticsevents";
    }
}
