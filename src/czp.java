// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class czp extends ctp
{

    private final int a;
    private final String b;
    private final boolean r;
    private final int s;

    public czp(ani ani1, String s1, boolean flag, int i)
    {
        super(hdx.newBuilder().a(ani1.a()).b(ani1.ae()).a().b(), null, "conversations/setfocus", "hangouts", new iyc(), new iyd());
        b = s1;
        r = flag;
        if (i <= 0)
        {
            i = 300;
        }
        s = i;
        a = ani1.h();
    }

    protected cvn a(kop kop)
    {
        return cyc.parseFrom((iyd)kop);
    }

    protected void b(kop kop)
    {
        kop = (iyc)kop;
        kop.requestHeader = a((new cru()).a(a).b());
        kop.a = ctq.a(b);
        int i;
        if (r)
        {
            i = 1;
        } else
        {
            i = 2;
        }
        kop.b = Integer.valueOf(i);
        kop.d = Boolean.valueOf(true);
        kop.c = Integer.valueOf(s);
    }
}
