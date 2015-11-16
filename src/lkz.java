// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lkz
{

    private final String a;
    private final lla b = new lla();
    private final llh c;

    public lkz(String s, llh llh1)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Name may not be null");
        }
        if (llh1 == null)
        {
            throw new IllegalArgumentException("Body may not be null");
        }
        a = s;
        c = llh1;
        s = new StringBuilder();
        s.append("form-data; name=\"");
        s.append(a);
        s.append("\"");
        if (llh1.e() != null)
        {
            s.append("; filename=\"");
            s.append(llh1.e());
            s.append("\"");
        }
        a("Content-Disposition", s.toString());
        s = new StringBuilder();
        s.append(llh1.a());
        if (llh1.b() != null)
        {
            s.append("; charset=");
            s.append(llh1.b());
        }
        a("Content-Type", s.toString());
        a("Content-Transfer-Encoding", llh1.c());
    }

    private void a(String s, String s1)
    {
        b.a(new llf(s, s1));
    }

    public llh a()
    {
        return c;
    }

    public lla b()
    {
        return b;
    }
}
