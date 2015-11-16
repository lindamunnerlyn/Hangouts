// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dek extends dfa
{

    private final int a;
    private final String d;

    public dek(ani ani1, String s, int i)
    {
        super(ani1);
        d = s;
        a = i;
    }

    public void a()
    {
        Object obj;
        if (ebw.a("Babel", 3))
        {
            obj = String.valueOf(d);
            String s;
            int i;
            long l;
            if (((String) (obj)).length() != 0)
            {
                obj = "executeModifyOtrStatusOperation conversationId: ".concat(((String) (obj)));
            } else
            {
                obj = new String("executeModifyOtrStatusOperation conversationId: ");
            }
            ebw.c("Babel", ((String) (obj)));
        }
        s = aoe.g();
        obj = new aoe(g.nS, b.h());
        ((aoe) (obj)).a();
        i = ((aoe) (obj)).A(d);
        l = ((aoe) (obj)).P(d);
        (new djg(d, b.b(), l, -1L, s, null, a, dqb.b)).c(((aoe) (obj)));
        ((aoe) (obj)).b();
        ((aoe) (obj)).c();
        if (!aoe.a(d))
        {
            c.a(new cuk(s, d, a, i));
        }
        any.d(((aoe) (obj)), d);
        return;
        Exception exception;
        exception;
        ((aoe) (obj)).c();
        throw exception;
    }
}
