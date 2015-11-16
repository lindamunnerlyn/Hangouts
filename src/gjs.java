// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gjs
{

    private final gjt a;

    public gjs(int i)
    {
        switch (i)
        {
        default:
            a = gjt.a;
            return;

        case 0: // '\0'
            a = gjt.b;
            return;

        case 1: // '\001'
            a = gjt.c;
            break;
        }
    }

    public gjt a()
    {
        return a;
    }
}
