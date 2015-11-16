// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dav extends cvt
{

    private final int a;
    private final String b;
    private final boolean r;
    private final int s;

    public dav(aoa aoa1, String s1, boolean flag, int i)
    {
        super(hio.newBuilder().a(aoa1.a()).b(aoa1.ab()).a(true).a(), null, "conversations/setfocus", dmi.a, new jeh(), new jei());
        b = s1;
        r = flag;
        if (i <= 0)
        {
            i = 300;
        }
        s = i;
        a = aoa1.h();
    }

    protected cxr a(kws kws)
    {
        return dag.parseFrom((jei)kws);
    }

    protected void b(kws kws)
    {
        kws = (jeh)kws;
        kws.requestHeader = a((new ctx()).a(a).b());
        kws.a = cvu.a(b);
        int i;
        if (r)
        {
            i = 1;
        } else
        {
            i = 2;
        }
        kws.b = Integer.valueOf(i);
        kws.d = Boolean.valueOf(true);
        kws.c = Integer.valueOf(s);
    }
}
