// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lcl
{

    private final String a;
    private final lcm b = new lcm();
    private final lct c;

    public lcl(String s, lct lct1)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Name may not be null");
        }
        if (lct1 == null)
        {
            throw new IllegalArgumentException("Body may not be null");
        }
        a = s;
        c = lct1;
        s = new StringBuilder();
        s.append("form-data; name=\"");
        s.append(a);
        s.append("\"");
        if (lct1.e() != null)
        {
            s.append("; filename=\"");
            s.append(lct1.e());
            s.append("\"");
        }
        a("Content-Disposition", s.toString());
        s = new StringBuilder();
        s.append(lct1.a());
        if (lct1.b() != null)
        {
            s.append("; charset=");
            s.append(lct1.b());
        }
        a("Content-Type", s.toString());
        a("Content-Transfer-Encoding", lct1.c());
    }

    private void a(String s, String s1)
    {
        b.a(new lcr(s, s1));
    }

    public lct a()
    {
        return c;
    }

    public lcm b()
    {
        return b;
    }
}
