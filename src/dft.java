// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dft extends dgj
{

    private final int a;
    private final String e;

    public dft(aoa aoa1, String s, int i)
    {
        super(aoa1);
        e = s;
        a = i;
    }

    public void a()
    {
        Object obj;
        if (eev.a("Babel", 3))
        {
            obj = String.valueOf(e);
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
            eev.c("Babel", ((String) (obj)));
        }
        s = aow.g();
        obj = new aow(g.nU, super.b.a);
        ((aow) (obj)).a();
        i = ((aow) (obj)).A(e);
        l = ((aow) (obj)).O(e);
        (new dkt(e, super.b.b.b(), l, -1L, s, null, a, dsu.b)).c(((aow) (obj)));
        ((aow) (obj)).b();
        ((aow) (obj)).c();
        if (!aow.a(e))
        {
            a(((dmf) (new cwo(s, e, a, i))));
        }
        aoq.d(((aow) (obj)), e);
        return;
        Exception exception;
        exception;
        ((aow) (obj)).c();
        throw exception;
    }
}
