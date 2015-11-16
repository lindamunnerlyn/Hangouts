// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ilo extends Enum
    implements kxx
{

    public static final ilo a;
    private static final ilo b[];

    private ilo(String s)
    {
        super(s, 0);
    }

    public static kxx b()
    {
        return a;
    }

    public static ilo valueOf(String s)
    {
        return (ilo)Enum.valueOf(ilo, s);
    }

    public static ilo[] values()
    {
        return (ilo[])b.clone();
    }

    public Object a()
    {
        jsl jsl = ili.b();
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
        a = new ilo("INSTANCE");
        b = (new ilo[] {
            a
        });
    }
}
