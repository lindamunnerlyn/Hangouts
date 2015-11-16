// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gpi extends gpd
{

    gpi(String s)
    {
        super(s, 3);
    }

    boolean a(gpw gpw, String s, gpb gpb1)
    {
        if (!gpb1.b(gpw) || !goy.a(gpw, s, gpb1) || goy.a(gpw, s) || !goy.a(gpw, gpb1))
        {
            return false;
        } else
        {
            return goy.a(gpw, s, gpb1, new gpj(this));
        }
    }
}
