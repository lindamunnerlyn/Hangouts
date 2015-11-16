// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class djy extends dgj
{

    private final String a;
    private final String e;
    private final int f;

    public djy(aoa aoa, String s, String s1, int i)
    {
        super(aoa);
        a = s;
        e = s1;
        f = i;
    }

    public void a()
    {
        Object obj;
        obj = a;
        String s = e;
        int i = f;
        eev.b("Babel", (new StringBuilder(String.valueOf(obj).length() + 40 + String.valueOf(s).length())).append("SetMessageFailedOperation: ").append(((String) (obj))).append(" ").append(s).append(" ").append(i).toString());
        obj = new aow(g.nU, super.b.a);
        ((aow) (obj)).a();
        aoq.a(((aow) (obj)), a, e, dsu.d, f);
        ((aow) (obj)).a(a, e);
        ((aow) (obj)).b();
        ((aow) (obj)).c();
        return;
        Exception exception;
        exception;
        ((aow) (obj)).c();
        throw exception;
    }
}
