// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class irb extends Enum
    implements joj
{

    public static final irb a;
    private static final irb b[];

    private irb(String s)
    {
        super(s, 0);
    }

    public static joj b()
    {
        return a;
    }

    public static irb valueOf(String s)
    {
        return (irb)Enum.valueOf(irb, s);
    }

    public static irb[] values()
    {
        return (irb[])b.clone();
    }

    public Object a()
    {
        kal kal = iqv.b();
        if (kal == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return kal;
        }
    }

    static 
    {
        a = new irb("INSTANCE");
        b = (new irb[] {
            a
        });
    }
}
