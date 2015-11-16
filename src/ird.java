// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ird extends Enum
    implements joj
{

    public static final ird a;
    private static final ird b[];

    private ird(String s)
    {
        super(s, 0);
    }

    public static joj b()
    {
        return a;
    }

    public static ird valueOf(String s)
    {
        return (ird)Enum.valueOf(ird, s);
    }

    public static ird[] values()
    {
        return (ird[])b.clone();
    }

    public Object a()
    {
        kam kam = iqv.a();
        if (kam == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return kam;
        }
    }

    static 
    {
        a = new ird("INSTANCE");
        b = (new ird[] {
            a
        });
    }
}
