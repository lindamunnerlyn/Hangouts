// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gvx
    implements gvp
{

    gvx()
    {
    }

    public int a(gvo gvo1)
    {
        long l = gvo1.c;
        return (int)(l ^ l >>> 32) + 527;
    }

    public boolean a(gvo gvo1, gvo gvo2)
    {
        return gvo1.c == gvo2.c;
    }
}
