// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class czt extends ctp
{

    private final int a;
    private final String b;
    private final long r;

    public czt(ani ani1, String s, long l)
    {
        super(hdx.newBuilder().a(ani1.a()).b(ani1.ae()).a().b(), null, "conversations/updatewatermark", "hangouts", new izo(), new izp());
        b = s;
        r = l;
        a = ani1.h();
    }

    protected cvn a(kop kop)
    {
        return cyo.parseFrom((izp)kop);
    }

    protected void b(kop kop)
    {
        kop = (izo)kop;
        kop.requestHeader = a((new cru()).a(a).b());
        kop.a = ctq.a(b);
        kop.b = Long.valueOf(r);
    }
}
