// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gka
{

    final gjz a;
    private final ejx b;
    private final eik c;
    private final kuf d;

    gka(gjz gjz1)
    {
        a = gjz1;
        super();
        gjl gjl1 = gjz1.b.b().a();
        Object obj1 = (new ejy(gjz1.a)).a(eik.c);
        Object obj;
        if (gjl1 == null)
        {
            obj = null;
        } else
        {
            obj = gjl1.n();
        }
        b = ((ejy) (obj1)).a(((String) (obj))).a();
        c = gjz1.a();
        obj1 = gjz1.a;
        if (gjl1 == null)
        {
            gjz1 = null;
        } else
        {
            gjz1 = gjl1.d();
        }
        obj = gjz1;
        if (gjz1 == null)
        {
            obj = new kuf();
            obj.b = Integer.valueOf(407);
            obj.c = Integer.valueOf(2);
            byte byte0;
            if (g.L(((android.content.Context) (obj1))))
            {
                byte0 = 3;
            } else
            {
                byte0 = 2;
            }
            obj.a = Integer.valueOf(byte0);
        }
        d = ((kuf) (obj));
    }

    void a()
    {
        c.a(b);
    }

    void a(int i)
    {
        jfe jfe1;
        gjo gjo1;
        gjl gjl1;
        gjq gjq1;
        jfe1 = new jfe();
        jfe1.e = d;
        jfe1.a = new jew();
        jfe1.a.j = new jex();
        jfe1.a.j.a = Integer.valueOf(i);
        gjo1 = a.b.b();
        gjl1 = gjo1.a();
        gjq1 = gjo1.b();
        jfe1.a.a = new jev();
        if (gjq1 == null) goto _L2; else goto _L1
_L1:
        jfe1.a.a.c = gjq1.a();
        jfe1.a.a.d = gjq1.b();
_L4:
        if (gjl1 != null)
        {
            jfe1.a.a.a = gjl1.p();
        }
        jfe1.a.a.k = gjo1.c();
        jfe1.a.a.b = gjo1.d();
        jfe1.a.a.e = gjo1.e();
        c.a(kop.toByteArray(jfe1)).a(b);
        gkc.b("vclib", "Logging to clearcut: \n%s", new Object[] {
            jfe1
        });
        return;
_L2:
        if (gjl1 != null)
        {
            jfe1.a.a.c = gjl1.f();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
