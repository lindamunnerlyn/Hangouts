// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public final class ggg extends ggh
{

    private final gbg i;
    private final Context j;

    ggg(long l, String s, byte abyte0[], int k, gbg gbg1, String s1, 
            long l1, String s2, gfx gfx, Context context)
    {
        super(l, s, abyte0, k, s1, l1, null, s2, gfx);
        gbh.b(gbg1);
        j = context;
        i = gbg1;
    }

    public volatile void a()
    {
        super.a();
    }

    public volatile void a(Object obj)
    {
        a((byte[])obj);
    }

    public void a(byte abyte0[])
    {
        super.a(abyte0);
    }

    public Object b()
    {
        return c();
    }

    public byte[] c()
    {
        Object obj;
        try
        {
            gbg gbg1 = i;
            Context context = j;
            String s = String.valueOf(f);
            obj = String.valueOf(b);
            HashMap hashmap;
            if (((String) (obj)).length() != 0)
            {
                s = s.concat(((String) (obj)));
            } else
            {
                s = new String(s);
            }
            hashmap = new HashMap();
            hashmap.put("Accept-Encoding", "gzip");
            obj = String.valueOf(e);
        }
        catch (IOException ioexception)
        {
            obj = f;
            String s1 = b;
            gkc.a("vclib", (new StringBuilder(String.valueOf(obj).length() + 29 + String.valueOf(s1).length())).append("Error sending cronet request ").append(((String) (obj))).append(s1).toString(), ioexception);
            return null;
        }
        if (((String) (obj)).length() == 0)
        {
            break MISSING_BLOCK_LABEL_246;
        }
        obj = "Bearer ".concat(((String) (obj)));
_L1:
        hashmap.put("Authorization", obj);
        hashmap.put("X-Auth-Time", h);
        obj = new StringBuilder("HangoutsApiaryClient");
        ((StringBuilder) (obj)).append("; G+ SDK/");
        ((StringBuilder) (obj)).append(gfr.a);
        ((StringBuilder) (obj)).append(";");
        hashmap.put("User-Agent", ((StringBuilder) (obj)).toString());
        return gbg1.a(context, s, hashmap, c, d);
        obj = new String("Bearer ");
          goto _L1
    }
}
