// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class aqp
    implements agb
{

    final dpw a;
    final aqn b;

    aqp(aqn aqn, dpw dpw)
    {
        b = aqn;
        a = dpw;
        super();
    }

    public void a(agh agh)
    {
        agh = String.valueOf(agh);
        eev.f("Babel_medialoader", (new StringBuilder(String.valueOf(agh).length() + 29)).append("downloadUseVolley: got error ").append(agh).toString());
        ((dpn)hlp.a(g.nU, dpn)).b(a);
    }
}
