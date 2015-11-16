// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dim extends dfa
{

    private final String a;
    private final String d;
    private final int e;

    public dim(ani ani1, String s, String s1, int i)
    {
        super(ani1);
        a = s;
        d = s1;
        e = i;
    }

    public void a()
    {
        Object obj;
        obj = a;
        String s = d;
        int i = e;
        ebw.b("Babel", (new StringBuilder(String.valueOf(obj).length() + 40 + String.valueOf(s).length())).append("SetMessageFailedOperation: ").append(((String) (obj))).append(" ").append(s).append(" ").append(i).toString());
        obj = new aoe(g.nS, b.h());
        ((aoe) (obj)).a();
        any.a(((aoe) (obj)), a, d, dqb.d, e);
        ((aoe) (obj)).a(a, d);
        ((aoe) (obj)).b();
        ((aoe) (obj)).c();
        return;
        Exception exception;
        exception;
        ((aoe) (obj)).c();
        throw exception;
    }
}
