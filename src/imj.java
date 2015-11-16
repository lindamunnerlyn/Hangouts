// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;

public final class imj extends Enum
    implements kxx
{

    public static final imj a;
    private static final imj b[];

    private imj(String s)
    {
        super(s, 0);
    }

    public static kxx b()
    {
        return a;
    }

    public static imj valueOf(String s)
    {
        return (imj)Enum.valueOf(imj, s);
    }

    public static imj[] values()
    {
        return (imj[])b.clone();
    }

    public Object a()
    {
        return Collections.singleton(Boolean.valueOf(true));
    }

    static 
    {
        a = new imj("INSTANCE");
        b = (new imj[] {
            a
        });
    }
}
