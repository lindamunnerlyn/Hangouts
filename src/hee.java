// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import org.chromium.net.UserAgent;

public class hee
    implements hdt
{

    static final hij a = new hij("debug.allowBackendOverride");
    private static String f;
    private final Context b;
    private final String c;
    private final String d;
    private final String e;

    public hee(Context context, String s, String s1)
    {
        this(context, s, null, s1);
    }

    public hee(Context context, String s, String s1, String s2)
    {
        b = context;
        c = s;
        d = s2;
        e = s1;
    }

    protected String a(Context context)
    {
        if (f == null)
        {
            f = String.valueOf(UserAgent.a(context)).concat(" (gzip)");
        }
        return f;
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
                obj = ((heb)hgx.a(b, heb)).a(d);
                s = ((hec) (obj)).a(b, c);
                obj = Long.toString(((hec) (obj)).c(b, s).longValue());
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                new hgh(c);
                hgx.a(b, gpy);
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
            if (e != null)
            {
                gz1.put("X-Goog-PageId", e);
            }
        }
        return gz1;
    }

    public void a()
    {
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        ((heb)hgx.a(b, heb)).a(d).b(b, c);
        return;
        Exception exception;
        exception;
        throw new IOException("Cannot invalidate authentication token", exception);
    }

}
