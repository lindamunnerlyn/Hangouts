// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class glr
    implements gds
{

    final glo a;

    glr(glo glo)
    {
        a = glo;
        super();
    }

    public void a(kws kws)
    {
        gne.a(3, "vclib", "Successfully updated media source");
    }

    public void b(kws kws)
    {
        kws = String.valueOf((jjg)kws);
        gne.a(6, "vclib", (new StringBuilder(String.valueOf(kws).length() + 31)).append("Failed to update media source: ").append(kws).toString());
    }
}
