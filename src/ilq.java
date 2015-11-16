// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ilq extends Enum
    implements kxx
{

    public static final ilq a;
    private static final ilq b[];

    private ilq(String s)
    {
        super(s, 0);
    }

    public static kxx b()
    {
        return a;
    }

    public static ilq valueOf(String s)
    {
        return (ilq)Enum.valueOf(ilq, s);
    }

    public static ilq[] values()
    {
        return (ilq[])b.clone();
    }

    public Object a()
    {
        jsl jsl = ili.a();
        if (jsl == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return jsl;
        }
    }

    static 
    {
        a = new ilq("INSTANCE");
        b = (new ilq[] {
            a
        });
    }
}
