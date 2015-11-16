// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.LinkedList;

final class jwq extends Enum
    implements joj
{

    public static final jwq a;
    private static final jwq b[];

    private jwq(String s)
    {
        super(s, 0);
    }

    public static joj b()
    {
        return a;
    }

    public static jwq valueOf(String s)
    {
        return (jwq)Enum.valueOf(jwq, s);
    }

    public static jwq[] values()
    {
        return (jwq[])b.clone();
    }

    public Object a()
    {
        return new LinkedList();
    }

    static 
    {
        a = new jwq("INSTANCE");
        b = (new jwq[] {
            a
        });
    }
}
