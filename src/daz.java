// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class daz extends cvt
{

    private final int a;
    private final String b;
    private final long r;

    public daz(aoa aoa1, String s, long l)
    {
        super(hio.newBuilder().a(aoa1.a()).b(aoa1.ab()).a(true).a(), null, "conversations/updatewatermark", dmi.a, new jft(), new jfu());
        b = s;
        r = l;
        a = aoa1.h();
    }

    protected cxr a(kws kws)
    {
        return das.parseFrom((jfu)kws);
    }

    protected void b(kws kws)
    {
        kws = (jft)kws;
        kws.requestHeader = a((new ctx()).a(a).b());
        kws.a = cvu.a(b);
        kws.b = Long.valueOf(r);
    }
}
