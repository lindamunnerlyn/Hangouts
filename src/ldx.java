// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ldx extends Enum
    implements kur
{

    public static final ldx a;
    public static final ldx b;
    public static final ldx c;
    public static final ldx d;
    private static final kus f = new kus();
    private static final ldx g[];
    final int e;

    private ldx(String s, int i, int j)
    {
        super(s, i);
        e = j;
    }

    public static ldx a(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 0: // '\0'
            return a;

        case 1: // '\001'
            return b;

        case 2: // '\002'
            return c;

        case 3: // '\003'
            return d;
        }
    }

    public static ldx valueOf(String s)
    {
        return (ldx)Enum.valueOf(ldx, s);
    }

    public static ldx[] values()
    {
        return (ldx[])g.clone();
    }

    public final int a()
    {
        return e;
    }

    static 
    {
        a = new ldx("SPAN_UNKNOWN", 0, 0);
        b = new ldx("SPAN_LOCAL", 1, 1);
        c = new ldx("SPAN_CLIENT_HALF", 2, 2);
        d = new ldx("SPAN_SERVER_HALF", 3, 3);
        g = (new ldx[] {
            a, b, c, d
        });
    }
}
