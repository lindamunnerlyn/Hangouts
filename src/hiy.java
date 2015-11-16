// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.nio.ByteBuffer;

public class hiy extends hig
{

    private final String a;
    private final String b;
    private boolean c;
    public final kws p;

    protected hiy(Context context, hio hio1, String s, String s1, kws kws1, String s2, String s3)
    {
        hhz hhz = hio1.d();
        if (hhz != null)
        {
            s3 = new hja(context, hio1.b(), s3, hhz);
        } else
        {
            String s4;
            if (hio1.a())
            {
                s4 = hio1.c();
            } else
            {
                s4 = null;
            }
            s3 = new hiv(context, hio1.b(), s4, s3, s);
        }
        super(context, hio1, s, s3);
        a = s1;
        p = kws1;
        b = s2;
    }

    public String a()
    {
        return "application/x-protobuf";
    }

    public void a(ByteBuffer bytebuffer)
    {
        b(bytebuffer);
        if (t())
        {
            b(bytebuffer, g.a(p));
        }
        c(p);
    }

    public void a(ByteBuffer bytebuffer, String s)
    {
label0:
        {
            super.a(bytebuffer, s);
            if (Log.isLoggable("HttpOperation", 5))
            {
                bytebuffer = String.valueOf(new String(g.a(bytebuffer), "UTF-8"));
                if (bytebuffer.length() == 0)
                {
                    break label0;
                }
                "HttpOperation error: Response follows: \n".concat(bytebuffer);
            }
            return;
        }
        new String("HttpOperation error: Response follows: \n");
    }

    protected kws b(ByteBuffer bytebuffer)
    {
        if (p != null)
        {
            if (bytebuffer.hasArray())
            {
                bytebuffer = kwj.a(bytebuffer.array(), bytebuffer.arrayOffset(), bytebuffer.limit());
            } else
            {
                bytebuffer = g.a(bytebuffer);
                bytebuffer = kwj.a(bytebuffer, 0, bytebuffer.length);
            }
            p.mergeFrom(bytebuffer);
            c = true;
            return p;
        } else
        {
            return null;
        }
    }

    public Bundle c()
    {
        return null;
    }

    public void c(kws kws1)
    {
    }

    public String i()
    {
        return a;
    }

    public String j()
    {
        return g.a(g, b, u(), false, c());
    }

    public String u()
    {
        return a;
    }
}
