// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cel extends Enum
{

    public static final cel a;
    public static final cel b;
    public static final cel c;
    public static final cel d;
    private static final cel e[];

    private cel(String s, int i)
    {
        super(s, i);
    }

    public static cel valueOf(String s)
    {
        return (cel)Enum.valueOf(cel, s);
    }

    public static cel[] values()
    {
        return (cel[])e.clone();
    }

    static 
    {
        a = new cel("LOCAL_SMS", 0);
        b = new cel("MESSAGE", 1);
        c = new cel("GV_SMS", 2);
        d = new cel("GV_VOICEMAIL", 3);
        e = (new cel[] {
            a, b, c, d
        });
    }
}
