// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class czq extends ctp
{

    private final int a;
    private final String b;
    private final int r;

    public czq(ani ani1, String s, int i)
    {
        super(hdx.newBuilder().a(ani1.a()).b(ani1.ae()).a().b(), null, "conversations/settyping", "hangouts", new iyl(), new iym());
        b = s;
        r = i;
        a = ani1.h();
    }

    protected cvn a(kop kop)
    {
        return cyh.parseFrom((iym)kop);
    }

    protected void b(kop kop)
    {
        kop = (iyl)kop;
        kop.requestHeader = a((new cru()).a(a).b());
        kop.a = ctq.a(b);
        kop.b = Integer.valueOf(r);
    }
}
