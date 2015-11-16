// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class cfm extends cfk
{

    final cfi b;

    cfm(cfi cfi1)
    {
        b = cfi1;
        super(cfi1);
    }

    public void a(eef eef1, edf edf, boolean flag, aqn aqn, boolean flag1)
    {
        gdv.a("Expected null", edf);
        if (flag)
        {
            b.u.a(eef1.d());
        }
        super.a(eef1, edf, flag, aqn, flag1);
    }
}
