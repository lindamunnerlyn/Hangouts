// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class daw extends cvt
{

    private final int a;
    private final String b;
    private final int r;

    public daw(aoa aoa1, String s, int i)
    {
        super(hio.newBuilder().a(aoa1.a()).b(aoa1.ab()).a(true).a(), null, "conversations/settyping", dmi.a, new jeq(), new jer());
        b = s;
        r = i;
        a = aoa1.h();
    }

    protected cxr a(kws kws)
    {
        return dal.parseFrom((jer)kws);
    }

    protected void b(kws kws)
    {
        kws = (jeq)kws;
        kws.requestHeader = a((new ctx()).a(a).b());
        kws.a = cvu.a(b);
        kws.b = Integer.valueOf(r);
    }
}
