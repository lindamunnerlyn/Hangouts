// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class hkx
{

    private StringBuilder a;
    private int b;

    hkx()
    {
        a = new StringBuilder(256);
        b = 0;
    }

    public StringBuilder a()
    {
        b = b + 1;
        if (b == 1)
        {
            return a;
        } else
        {
            return new StringBuilder(256);
        }
    }

    public void a(StringBuilder stringbuilder)
    {
        if (b <= 0)
        {
            throw new IllegalStateException("Cannot release more StringBuilders than have been acquired");
        }
        if (b == 1 && stringbuilder != a)
        {
            throw new IllegalArgumentException("Tried to release wrong StringBuilder instance");
        } else
        {
            stringbuilder.setLength(0);
            b = b - 1;
            return;
        }
    }
}
