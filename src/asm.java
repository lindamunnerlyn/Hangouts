// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class asm
    implements arw
{

    final ask a;

    asm(ask ask1)
    {
        a = ask1;
        super();
    }

    public void a()
    {
        ebw.c("Babel_ConvCreator", "Contact detail selection cancelled");
        a.g = null;
        ((ary)a.c.a(ary)).a(false);
    }

    public void a(arv arv1)
    {
        Object obj;
        boolean flag;
        boolean flag1;
        flag = false;
        flag1 = false;
        obj = String.valueOf(arv1.toString());
        boolean flag2;
        if (((String) (obj)).length() != 0)
        {
            obj = "Selected ".concat(((String) (obj)));
        } else
        {
            obj = new String("Selected ");
        }
        ebw.c("Babel_ConvCreator", ((String) (obj)));
        if (!bwn.a(a.g, a.e)) goto _L2; else goto _L1
_L1:
        ebw.c("Babel_ConvCreator", "Contact not added; invite needed");
        if (arv1.b != null)
        {
            a.f.a();
            obj = arv1.b.b();
            flag2 = ebz.j(((String) (obj)));
            if (!flag2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj = new daw(flag, flag2, ((String) (obj)));
            if (((daw) (obj)).a)
            {
                ask.a(a, arv1.b.b());
                flag = flag1;
            } else
            {
                ebw.c("Babel_ConvCreator", "Invite not sent because contact is unreachable");
                ((daw) (obj)).a(a.a, true);
                flag = flag1;
            }
        } else
        {
            ask.a(a, arv1.c.b());
            flag = flag1;
        }
_L4:
        a.g = null;
        ((ary)a.c.a(ary)).a(flag);
        return;
_L2:
        if (a.e != atd.b)
        {
            break; /* Loop/switch isn't completed */
        }
        gbh.b("Can't add contact for SMS conversation without phone number", arv1.b);
_L5:
        ebw.c("Babel_ConvCreator", "Contact added successfully");
        if (!g.a(dbf.e(a.f.a()), apk.g))
        {
            a.d.f();
        }
        a.d.a(ask.a(a.g, arv1));
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
        if (a.e == atd.c)
        {
            if (arv1.a != null || arv1.b != null)
            {
                flag = true;
            }
            gbh.a("Can't add contact for audio call without Gaia or phone number", flag);
        } else
        {
            gbh.b("Can't add contact for video call/Hangouts conversation without Gaia", arv1.a);
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }
}
