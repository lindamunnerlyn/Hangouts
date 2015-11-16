// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;

public final class jkm
{

    static final jgu a = jgu.a(", ").b("null");

    static StringBuilder a(int i)
    {
        g.c(i, "size");
        return new StringBuilder((int)Math.min((long)i << 3, 0x40000000L));
    }

    public static Collection a(Iterable iterable)
    {
        return (Collection)iterable;
    }

    static boolean a(Collection collection, Object obj)
    {
        n.b(collection);
        boolean flag;
        try
        {
            flag = collection.contains(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Collection collection)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (Collection collection)
        {
            return false;
        }
        return flag;
    }

}
