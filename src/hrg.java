// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.util.Iterator;

public final class hrg
{

    private final String a;

    public hrg(String s)
    {
        a = (String)h.a(s);
    }

    private static CharSequence a(Object obj)
    {
        h.a(obj);
        if (obj instanceof CharSequence)
        {
            return (CharSequence)obj;
        } else
        {
            return obj.toString();
        }
    }

    public final StringBuilder a(StringBuilder stringbuilder, Iterator iterator)
    {
        try
        {
            h.a(stringbuilder);
            if (iterator.hasNext())
            {
                stringbuilder.append(a(iterator.next()));
                for (; iterator.hasNext(); stringbuilder.append(a(iterator.next())))
                {
                    stringbuilder.append(a);
                }

            }
        }
        // Misplaced declaration of an exception variable
        catch (StringBuilder stringbuilder)
        {
            throw new AssertionError(stringbuilder);
        }
        return stringbuilder;
    }
}
