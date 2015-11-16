// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gmu
{

    private final gmv a;
    private itu b;

    public gmu(int i)
    {
        switch (i)
        {
        default:
            a = gmv.a;
            return;

        case 0: // '\0'
            a = gmv.b;
            return;

        case 1: // '\001'
            a = gmv.c;
            break;
        }
    }

    public gmu(itu itu)
    {
        b = itu;
        a = gmv.a;
    }

    public gmv a()
    {
        return a;
    }

    public itu b()
    {
        return b;
    }
}
