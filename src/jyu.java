// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

public final class jyu
    implements Closeable
{

    private static final jyx b;
    final jyx a;
    private final Deque c = new ArrayDeque(4);
    private Throwable d;

    private jyu(jyx jyx1)
    {
        a = (jyx)n.b(jyx1);
    }

    public static jyu a()
    {
        return new jyu(b);
    }

    public Closeable a(Closeable closeable)
    {
        if (closeable != null)
        {
            c.addFirst(closeable);
        }
        return closeable;
    }

    public RuntimeException a(Throwable throwable)
    {
        n.b(throwable);
        d = throwable;
        jok.a(throwable, java/io/IOException);
        throw new RuntimeException(throwable);
    }

    public void close()
    {
        Throwable throwable = d;
        while (!c.isEmpty()) 
        {
            Closeable closeable = (Closeable)c.removeFirst();
            try
            {
                closeable.close();
            }
            catch (Throwable throwable1)
            {
                if (throwable == null)
                {
                    throwable = throwable1;
                } else
                {
                    a.a(closeable, throwable, throwable1);
                }
            }
        }
        if (d == null && throwable != null)
        {
            jok.a(throwable, java/io/IOException);
            throw new AssertionError(throwable);
        } else
        {
            return;
        }
    }

    static 
    {
        Object obj;
        if (jyw.a())
        {
            obj = jyw.a;
        } else
        {
            obj = jyv.a;
        }
        b = ((jyx) (obj));
    }
}
