// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;

public final class imh extends Enum
    implements kxx
{

    public static final imh a;
    private static final imh b[];

    private imh(String s)
    {
        super(s, 0);
    }

    public static kxx b()
    {
        return a;
    }

    public static imh valueOf(String s)
    {
        return (imh)Enum.valueOf(imh, s);
    }

    public static imh[] values()
    {
        return (imh[])b.clone();
    }

    public Object a()
    {
        return Collections.singleton(new img());
    }

    static 
    {
        a = new imh("INSTANCE");
        b = (new imh[] {
            a
        });
    }
}
