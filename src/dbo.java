// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.io.Serializable;

public final class dbo extends IOException
    implements Serializable
{

    public static final dbo a = new dbo(120);
    public static final dbo b = new dbo(121);
    private static final long serialVersionUID = 1L;
    private final boolean c;
    private final int d;
    private final String e;
    private final long f;
    private final dzf g;

    public dbo(int i)
    {
        this(i, null, 0L, false, null);
    }

    public dbo(int i, long l, String s)
    {
        this(i, null, l, false, s);
    }

    public dbo(int i, Exception exception)
    {
        this(i, exception, 0L, false, null);
    }

    public dbo(int i, Exception exception, long l, boolean flag, String s)
    {
        if (i < 100 || i > 139)
        {
            throw new IllegalArgumentException((new StringBuilder(36)).append("error code out of range: ").append(i).toString());
        }
        c = flag;
        d = i;
        if (exception != null)
        {
            String s3 = String.valueOf(exception.getMessage());
            String s1;
            if (c)
            {
                s1 = "[INJECTED] -- ";
            } else
            {
                s1 = "";
            }
            s = (new StringBuilder(String.valueOf(s3).length() + 4 + String.valueOf(s1).length() + String.valueOf(s).length())).append(s3).append(" -- ").append(s1).append(s).toString();
        } else
        {
            String s2;
            if (c)
            {
                s2 = "[INJECTED] -- ";
            } else
            {
                s2 = "";
            }
            s2 = String.valueOf(s2);
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = s2.concat(s);
            } else
            {
                s = new String(s2);
            }
        }
        e = s;
        if (i == 100 && (exception instanceof dzf))
        {
            g = (dzf)exception;
        } else
        {
            g = null;
        }
        f = l;
    }

    public dbo(int i, String s)
    {
        this(i, null, 0L, false, s);
    }

    public static dbo a(int i, Exception exception, String s)
    {
        switch (i)
        {
        default:
            if (i >= 400 && i < 500)
            {
                return new dbo(111, exception, 0L, false, s);
            }
            break;

        case 400: 
            return new dbo(111, exception, 0L, false, s);

        case 401: 
            return new dbo(104, exception, 0L, false, s);

        case 403: 
            return new dbo(111, exception, 0L, false, s);

        case 404: 
            return new dbo(113, exception, 0L, false, s);

        case 409: 
            return new dbo(108, exception, 0L, false, s);

        case 416: 
            return new dbo(111, exception, 0L, false, s);

        case 418: 
            return new dbo(111, exception, 0L, false, s);

        case 429: 
            return new dbo(109, exception, 0L, false, s);

        case 499: 
            return new dbo(121, exception, 0L, false, s);

        case 501: 
            return new dbo(111, exception, 0L, false, s);

        case 503: 
        case 504: 
            return new dbo(108, exception, 0L, false, s);
        }
        if (i >= 500 && i < 600)
        {
            return new dbo(108, exception, 0L, false, s);
        } else
        {
            ebw.f("Babel_RequestWriter", (new StringBuilder(38)).append("Unknown HTTP response code ").append(i).toString());
            return new dbo(106, exception, 0L, false, s);
        }
    }

    public long a()
    {
        return f;
    }

    public dzf b()
    {
        return g;
    }

    public int c()
    {
        return d;
    }

    public String getMessage()
    {
        return e;
    }

}
