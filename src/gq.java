// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gq
{

    public static final gp a = new gu(null, false);
    public static final gp b = new gu(null, true);
    public static final gp c;
    public static final gp d;
    public static final gp e;
    public static final gp f;

    static int a(int i)
    {
        switch (i)
        {
        default:
            return 2;

        case 0: // '\0'
        case 14: // '\016'
        case 15: // '\017'
            return 1;

        case 1: // '\001'
        case 2: // '\002'
        case 16: // '\020'
        case 17: // '\021'
            return 0;
        }
    }

    static int b(int i)
    {
        switch (i)
        {
        default:
            return 2;

        case 0: // '\0'
            return 1;

        case 1: // '\001'
        case 2: // '\002'
            return 0;
        }
    }

    static 
    {
        c = new gu(gs.a, false);
        d = new gu(gs.a, true);
        e = new gu(gr.a, false);
        f = gv.b;
    }
}
