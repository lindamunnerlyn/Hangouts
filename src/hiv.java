// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import org.chromium.net.UserAgent;

public class hiv
    implements hik
{

    static final hnb a = new hnb("debug.allowBackendOverride");
    private static String g;
    private final Context b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;

    public hiv(Context context, String s, String s1)
    {
        this(context, s, s1, (byte)0);
    }

    private hiv(Context context, String s, String s1, byte byte0)
    {
        this(context, s, null, s1, null);
    }

    public hiv(Context context, String s, String s1, String s2, String s3)
    {
        b = context;
        c = s;
        d = s2;
        f = s1;
        e = s3;
    }

    protected String a(Context context)
    {
        if (g == null)
        {
            g = String.valueOf(UserAgent.a(context)).concat(" (gzip)");
        }
        return g;
    }

    public Map a(String s)
    {
        gz gz1 = new gz();
        gz1.put("Accept-Encoding", "gzip");
        gz1.put("Accept-Language", Locale.getDefault().toString());
        gz1.put("User-Agent", a(b));
        if (c != null)
        {
            Object obj;
            try
            {
                obj = ((his)hlp.a(b, his)).a(d);
                s = ((hit) (obj)).a(b, c);
                obj = Long.toString(((hit) (obj)).c(b, s).longValue());
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                new hkz(c);
                hlp.a(b, guj);
                throw new IOException("Cannot obtain authentication token", s);
            }
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = "Bearer ".concat(s);
            } else
            {
                s = new String("Bearer ");
            }
            gz1.put("Authorization", s);
            gz1.put("X-Auth-Time", obj);
            if (f != null)
            {
                gz1.put("X-Goog-PageId", f);
            }
        }
        if ("PUT".equals(e))
        {
            gz1.put("X-HTTP-Method-Override", "PUT");
        }
        return gz1;
    }

    public void a()
    {
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        ((his)hlp.a(b, his)).a(d).b(b, c);
        return;
        Exception exception;
        exception;
        throw new IOException("Cannot invalidate authentication token", exception);
    }

}
