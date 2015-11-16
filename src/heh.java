// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.nio.ByteBuffer;

public class heh extends hdp
{

    private final String a;
    private final String b;
    private boolean c;
    public final kop p;

    protected heh(Context context, hdx hdx1, String s, String s1, kop kop1, String s2, String s3)
    {
        hdi hdi = hdx1.d();
        if (hdi != null)
        {
            s3 = new hej(context, hdx1.b(), s3, hdi);
        } else
        if (hdx1.a())
        {
            s3 = new hee(context, hdx1.b(), hdx1.c(), s3);
        } else
        {
            s3 = new hee(context, hdx1.b(), s3);
        }
        super(context, hdx1, s, s3);
        a = s1;
        p = kop1;
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

    protected kop b(ByteBuffer bytebuffer)
    {
        if (p != null)
        {
            if (bytebuffer.hasArray())
            {
                bytebuffer = kog.a(bytebuffer.array(), bytebuffer.arrayOffset(), bytebuffer.limit());
            } else
            {
                bytebuffer = g.a(bytebuffer);
                bytebuffer = kog.a(bytebuffer, 0, bytebuffer.length);
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

    public void c(kop kop1)
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
