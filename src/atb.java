// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class atb
    implements asl
{

    final asz a;

    atb(asz asz1)
    {
        a = asz1;
        super();
    }

    public void a()
    {
        eev.c("Babel_ConvCreator", "Contact detail selection cancelled");
        a.a(false);
    }

    public void a(ask ask1)
    {
        Object obj;
        boolean flag;
        boolean flag1;
        flag = false;
        flag1 = false;
        obj = String.valueOf(ask1.toString());
        boolean flag2;
        if (((String) (obj)).length() != 0)
        {
            obj = "Selected ".concat(((String) (obj)));
        } else
        {
            obj = new String("Selected ");
        }
        eev.c("Babel_ConvCreator", ((String) (obj)));
        if (!g.a(a.g, a.e)) goto _L2; else goto _L1
_L1:
        eev.c("Babel_ConvCreator", "Contact not added; invite needed");
        if (ask1.b != null)
        {
            a.f.a();
            obj = ask1.b.b();
            flag2 = eey.j(((String) (obj)));
            if (!flag2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj = new dcc(flag, flag2, ((String) (obj)));
            if (((dcc) (obj)).a)
            {
                asz.a(a, ask1.b.b());
                flag = flag1;
            } else
            {
                eev.c("Babel_ConvCreator", "Invite not sent because contact is unreachable");
                ((dcc) (obj)).a(a.a, true);
                flag = flag1;
            }
        } else
        {
            asz.a(a, ask1.c.b());
            flag = flag1;
        }
_L4:
        a.a(flag);
        return;
_L2:
        if (a.e != atu.b)
        {
            break; /* Loop/switch isn't completed */
        }
        gdv.b("Can't add contact for SMS conversation without phone number", ask1.b);
_L5:
        eev.c("Babel_ConvCreator", "Contact added successfully");
        if (!g.a(dcn.e(a.f.a()), aqc.g))
        {
            a.d.f();
        }
        a.d.a(asz.a(a.g, ask1));
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
        if (a.e == atu.c)
        {
            if (ask1.a != null || ask1.b != null)
            {
                flag = true;
            }
            gdv.a("Can't add contact for audio call without Gaia or phone number", flag);
        } else
        {
            gdv.b("Can't add contact for video call/Hangouts conversation without Gaia", ask1.a);
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }
}
