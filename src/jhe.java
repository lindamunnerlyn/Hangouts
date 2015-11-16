// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;

public final class jhe
{

    private static final jgu a = new jgu(",");

    public static jhd a(Object obj)
    {
        if (obj == null)
        {
            return jhh.c.a();
        } else
        {
            return new jhg(obj);
        }
    }

    public static jhd a(Collection collection)
    {
        return new jhf(collection);
    }

}
