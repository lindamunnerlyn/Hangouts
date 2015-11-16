// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gip
    implements gbe
{

    final gim a;

    gip(gim gim)
    {
        a = gim;
        super();
    }

    public void a(kop kop)
    {
        gkc.b("vclib", "Successfully updated media source");
    }

    public void b(kop kop)
    {
        kop = String.valueOf((jcw)kop);
        gkc.e("vclib", (new StringBuilder(String.valueOf(kop).length() + 31)).append("Failed to update media source: ").append(kop).toString());
    }
}
